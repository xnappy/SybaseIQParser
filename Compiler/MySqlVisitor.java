package de.analysis.compiler;

import de.analysis.parser.sybaseiqBaseVisitor;
import de.analysis.parser.sybaseiqParser;

public class MySqlVisitor extends sybaseiqBaseVisitor<String>{
    ////////////// variables
    private String createTable_tablename="";
    private String createIndex_indexname="";
    private String createIndex_tablename="";
    private String createView_viewname="";
    private String createStatistic_statistcname="";
    private String createStatistic_tablename="";
    private String createProc_procname="";
    
    private String alterTable_tablename="";
    private String alterDatabase_database="";
            
    private String dropTable_tablename="";
    private String dropProc_procname="";
    private String dropIndex_indexname="";
    private String dropStatistic_statisticsname="";
    private String dropView_viewname="";
    
    private String tunrcate_tablename="";
    
    private String grantRights_permissionList="";
    
    /////////////// getter
    public String getCreateTable_tablename() {return createTable_tablename;}
    public String getCreateProc_procname() {return createProc_procname;}
    public String getCreateIndex_indexname() {return createIndex_indexname;}    
    public String getCreateIndex_tablename() {return createIndex_tablename;}
    public String getCreateView_viewname() {return createView_viewname;}
    public String getCreateStatistic_statistcname() {return createStatistic_statistcname;}
    public String getCreateStatistic_tablename() {return createStatistic_tablename;}

    public String getAlterTable_tablename() {return alterTable_tablename;}
    public String getAlterDatabase_database() {return alterDatabase_database;}
    
    public String getDropTable_tablename() {return dropTable_tablename;}
    public String getDropProc_procname() {return dropProc_procname;}
    public String getDropIndex_indexname() {return dropIndex_indexname;}
    public String getDropStatistic_statisticsname() {return dropStatistic_statisticsname;}
    public String getDropView_viewname() {return dropView_viewname;}
    
    public String getTunrcate_tablename() {return tunrcate_tablename;}
    
    public String getGrantRights_permissionList(){return grantRights_permissionList;}  
    /////////////// dml-rules

    
    /////////////// ddl-rules
    @Override
    public String visitCreate_table(sybaseiqParser.Create_tableContext ctx) {
        createTable_tablename = ctx.tablename.getText();
        return null;
    }

    @Override
    public String visitCreate_procedure(sybaseiqParser.Create_procedureContext ctx) {
        createProc_procname = ctx.procedurename.getText();
        return null;
    }

    @Override
    public String visitCreate_index(sybaseiqParser.Create_indexContext ctx) {
        createIndex_indexname = ctx.indexname.getText();
        createIndex_tablename = ctx.tablename.getText();
        return null;
    }

    @Override
    public String visitCreate_statistics(sybaseiqParser.Create_statisticsContext ctx) {
        createStatistic_statistcname = ctx.statisticname.getText();
        createStatistic_tablename = ctx.tablename.getText();
        return null;
    }

    @Override
    public String visitCreate_view(sybaseiqParser.Create_viewContext ctx) {
        createView_viewname = ctx.viewname.getText();
        return null;
    }

    @Override
    public String visitGrant_rights(sybaseiqParser.Grant_rightsContext ctx) {
        try {
            grantRights_permissionList = ctx.permission_list().getText();
        } catch (Exception e) {
        }
        
        return null;
    }

    @Override
    public String visitAlter_database(sybaseiqParser.Alter_databaseContext ctx) {
        alterDatabase_database = ctx.database.getText();
        return null;
    }

    @Override
    public String visitAlter_table(sybaseiqParser.Alter_tableContext ctx) {
        alterTable_tablename = ctx.tablename.getText();
        return null;
    }

    @Override
    public String visitDrop_view(sybaseiqParser.Drop_viewContext ctx) {
        dropView_viewname = ctx.viewname.getText();
        return null;
    }

    @Override
    public String visitDrop_index(sybaseiqParser.Drop_indexContext ctx) {
        dropIndex_indexname = ctx.indexname.getText();
        return null;
    }

    @Override
    public String visitDrop_statistics(sybaseiqParser.Drop_statisticsContext ctx) {
        dropStatistic_statisticsname = ctx.statisticname.getText();
        return null;
    }
    
    @Override
    public String visitDrop_table(sybaseiqParser.Drop_tableContext ctx) {
        dropTable_tablename = ctx.table_name().getText();
        return null;
    }
    
    @Override
    public String visitDrop_procedure(sybaseiqParser.Drop_procedureContext ctx) {
        dropProc_procname = ctx.procedurename.getText();
        return null;
    }

    @Override
    public String visitTruncate_statement(sybaseiqParser.Truncate_statementContext ctx) {
        tunrcate_tablename = ctx.tablename.getText();
        return null;
    }
    
    /////////////// cfl rules
    
    
    /////////////// another rules

    
    /////////////// aggregate
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
