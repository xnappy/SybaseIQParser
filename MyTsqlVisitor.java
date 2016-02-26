package de.einsundeins.analysis.compiler;

import de.einsundeins.analysis.parser.tsqlBaseVisitor;
import de.einsundeins.analysis.parser.tsqlParser;

public class MyTsqlVisitor extends tsqlBaseVisitor<String>{

    @Override
    public String visitCreate_table(tsqlParser.Create_tableContext ctx) {
        String tablename = visitChildren(ctx) + ctx.table_name().getText();
        
        return tablename;
    }

    @Override
    public String visitDrop_table(tsqlParser.Drop_tableContext ctx) {
        String tablename = visitChildren(ctx) + ctx.table_name().getText();
        
        return tablename;
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null){
            return nextResult;
        }
        if (nextResult == null){
            return aggregate;
        }
        return aggregate + nextResult;
    }
}
