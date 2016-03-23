package de.analysis.compiler;

import de.analysis.parser.sybaseiqLexer;
import de.analysis.parser.sybaseiqParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MainVisitor {
    private String sql;
    private String result;
    private MySqlVisitor mySqlVisitor;
    
    public void setSqlAndResult(String sql){
        this.sql = "";
        this.result = "";
        this.sql = sql;
        
        runAntlr(this.sql);
    }
    
    public String getResult(){
        return this.result;
    }
    
    private void runAntlr(String sql){
        ANTLRInputStream input;
        mySqlVisitor = new MySqlVisitor();
        
        try {
            input = new ANTLRInputStream(sql);
        } catch (Exception e) {
            this.result = e.toString();
            return;
        }

        sybaseiqLexer lexer = new sybaseiqLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        sybaseiqParser parser = new sybaseiqParser(tokens);
        
        MyAntlrErrorListener.INSTANCE.setErrorMsg();
        lexer.removeErrorListeners();
        lexer.addErrorListener(MyAntlrErrorListener.INSTANCE);
        parser.removeErrorListeners(); 
        parser.addErrorListener(MyAntlrErrorListener.INSTANCE);
        
        ParseTree tree = parser.sybaseiq_file();
        mySqlVisitor.visit(tree);
 
        this.result = MyAntlrErrorListener.INSTANCE.toString();
        
        if(this.result.equals("")){
            this.result = "Sytaxcheck finished! No errors detected.";
            runSemanticCheck();
        }
    }
    
    private void runSemanticCheck(){
        String semantic_result = "";
        int rule_type_id;
        
        if (!mySqlVisitor.getCreateTable_tablename().equals("")) {
            rule_type_id = 0;
        } else if (!mySqlVisitor.getCreateProc_procname().equals("")) {
            rule_type_id = 1;
        } else if (!mySqlVisitor.getCreateIndex_indexname().equals("")) {
            rule_type_id = 2;
        } else if (!mySqlVisitor.getCreateView_viewname().equals("")) {
            rule_type_id = 3;
        } else {
            rule_type_id = 4;
        }
        
        
        switch (rule_type_id) {
            case 0:
                //Create table file
                if (!mySqlVisitor.getCreateTable_tablename().equals(mySqlVisitor.getDropTable_tablename())) {
                    semantic_result = semantic_result + "\ndropped table doesn't equal the created table";
                }   
                break;
            case 1:
                //Create procedure file
                
                break;
            case 2:
                //Create index file
                if (true) {
                    
                }   
                break;
            case 3:
                //Create view file
                if (true) {
                    
                }   
                break;
            case 4:
                //other file
                if (true) {
                    
                }   
                break;
        }
        
        if (semantic_result.equals("")){
            this.result = this.result + "\nSemanticcheck finished! No errors detected.";
            //here enable DEV Button
            runTopicalityCheck();
        } else {
            this.result = this.result + semantic_result + "\nSemanticcheck finished! Some errors detected.";
        }

        
    }
    
    private void runTopicalityCheck(){
        boolean showWarnings = true; //option, if false analysis will not show warings, like "this is an old method"

        if (showWarnings=true) {
            if (!mySqlVisitor.getGrantRights_permissionList().equals("")) {
                this.result = this.result + "\nYou should not use this method to grant rights!";
            }
            
        }
    }   
}
