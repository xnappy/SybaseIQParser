package de.einsundeins.analysis.compiler;

import de.einsundeins.analysis.parser.tsqlLexer;
import de.einsundeins.analysis.parser.tsqlParser;
import de.einsundeins.analysis.compiler.MyTsqlVisitor;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MainVisitor {
    private String sql;
    private String result;
    
    public void setSql(String sql){
        this.sql = sql;
        
        runAntlr(sql);
    }
    
    public String getSql(){
        return this.sql;
    }
    
    public String getResult(){
        return result;
    }
    
    private void runAntlr(String sql){
        ANTLRInputStream input;
        
        try {
            input = new ANTLRInputStream(sql);
        } catch (Exception e) {
            result = e.toString();
            return;
        }

        tsqlLexer lexer = new tsqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tsqlParser parser = new tsqlParser(tokens);
        
        lexer.removeErrorListeners();
        lexer.addErrorListener(MyAntlrErrorListener.INSTANCE);
        parser.removeErrorListeners(); 
        parser.addErrorListener(MyAntlrErrorListener.INSTANCE);
        
        ParseTree tree = parser.tsql_file();
        new MyTsqlVisitor().visit(tree);

        result = MyAntlrErrorListener.INSTANCE.toString();
    
        if(result.equals("")){
            result = "Sytaxcheck successful!";
            runSemanticCheck(tree);
        }
    }
    
    private void runSemanticCheck(ParseTree tree){
        MyTsqlVisitor myVisitor = new MyTsqlVisitor();
        
        myVisitor.visitCreate_table(ctx)
    }
}
