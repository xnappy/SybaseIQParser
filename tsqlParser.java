// Generated from C:\datawarehouse\branches\projects\TECPLTBI.050\02_source\BIDeploy\src\de\einsundeins\analysis\grammar\tsql.g4 by ANTLR 4.1
package de.einsundeins.analysis.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tsqlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ADD=2, ALL=3, ALTER=4, AND=5, ANY=6, AS=7, ASC=8, AUTHORIZATION=9, 
		AUTOINCREMENT=10, BACKUP=11, BEGIN=12, BETWEEN=13, BIGINT=14, BIGINTN=15, 
		BIT=16, BLOB=17, BOOLEAN=18, BREAK=19, BROWSE=20, BULK=21, BY=22, CALL=23, 
		CASCADE=24, CASE=25, CHANGETABLE=26, CHANGES=27, CHAR=28, CHARACTER=29, 
		CHECK=30, CHECKPOINT=31, CLOB=32, CLOSE=33, CLUSTERED=34, CMP=35, COALESCE=36, 
		COLLATE=37, COLUMN=38, COMMENT=39, COMMIT=40, COMPUTE=41, CONSTRAINT=42, 
		CONTAINS=43, CONTAINSTABLE=44, CONTINUE=45, CONVERT=46, CREATE=47, CROSS=48, 
		CURRENT=49, CURRENT_DATE=50, CURRENT_TIME=51, CURRENT_TIMESTAMP=52, CURRENT_USER=53, 
		CURSOR=54, DATABASE=55, DATE=56, DATETIME=57, DATETIME2=58, DATETIMEN=59, 
		DATETIMEOFFSET=60, DBCC=61, DEALLOCATE=62, DECIMALN=63, DECLARE=64, DECRYPT=65, 
		DEFAULT=66, DEFINER=67, DELETE=68, DENY=69, DESC=70, DISK=71, DISTINCT=72, 
		DISTRIBUTED=73, DOUBLE=74, DROP=75, DTTM=76, DUMP=77, ELSE=78, ELSEIF=79, 
		END=80, ENDIF=81, ERRLVL=82, ESCAPE=83, EXCEPT=84, EXCEPTION=85, EXEC=86, 
		EXECUTE=87, EXISTING=88, EXISTS=89, EXIT=90, EXTERNAL=91, FETCH=92, FILE=93, 
		FILLFACTOR=94, FLOATN=95, FOR=96, FORCESEEK=97, FOREIGN=98, FREETEXT=99, 
		FREETEXTTABLE=100, FROM=101, FULL=102, FUNCTION=103, GOTO=104, GRANT=105, 
		GROUP=106, HAVING=107, HG=108, HNG=109, IDENTITY=110, IDENTITYCOL=111, 
		IDENTITY_INSERT=112, IF=113, IMAGE=114, IMMEDIATE=115, IN=116, INOUT=117, 
		INDEX=118, INNER=119, INSERT=120, INT=121, INTN=122, INTEGER=123, INTERSECT=124, 
		INTO=125, INVOKER=126, IQ=127, IS=128, JOIN=129, KEY=130, KILL=131, LEFT=132, 
		LF=133, LIKE=134, LINENO=135, LOAD=136, MERGE=137, MONEY=138, MONEYN=139, 
		NATIONAL=140, NCHAR=141, NO=142, NOCHECK=143, NONCLUSTERED=144, NOT=145, 
		NTEXT=146, NUMERIC=147, NUMERICN=148, NULL=149, NULLIF=150, NVARCHAR=151, 
		OF=152, OFF=153, OFFSETS=154, ON=155, OPEN=156, OPENDATASOURCE=157, OPENQUERY=158, 
		OPENROWSET=159, OPENXML=160, OPTION=161, OR=162, ORDER=163, OTHERS=164, 
		OUTER=165, OVER=166, PERCENT=167, PIVOT=168, PLAN=169, PRECISION=170, 
		PRESERVE=171, PRIMARY=172, PRINT=173, PROC=174, PROCEDURE=175, PUBLIC=176, 
		RAISERROR=177, READ=178, READTEXT=179, RECONFIGURE=180, REFERENCES=181, 
		REPLACE=182, REPLICATION=183, RESIGNAL=184, RESTORE=185, RESTRICT=186, 
		RESULT=187, RESUME=188, RETURN=189, REVERT=190, REVOKE=191, RIGHT=192, 
		ROLE=193, ROLLBACK=194, ROWCOUNT=195, ROWGUIDCOL=196, RULE=197, SAVE=198, 
		SCHEMA=199, SECURITY=200, SECURITYAUDIT=201, SELECT=202, SEMANTICKEYPHRASETABLE=203, 
		SEMANTICSIMILARITYDETAILSTABLE=204, SEMANTICSIMILARITYTABLE=205, SESSION_USER=206, 
		SET=207, SETUSER=208, SHUTDOWN=209, SMALLINT=210, SMALLINTN=211, SMALLMONEY=212, 
		SMALLDATETIME=213, SYSNAME=214, SOME=215, SQL=216, STATISTICS=217, SYSTEM_USER=218, 
		TABLE=219, TABLESAMPLE=220, TEMPORARY=221, TEXT=222, TEXTSIZE=223, THEN=224, 
		TINYINT=225, TO=226, TOP=227, TRAN=228, TRANSACTION=229, TRANSACTIONAL=230, 
		TRIGGER=231, TRUNCATE=232, TRY_CONVERT=233, TSEQUAL=234, TYP_MONEY=235, 
		TYP_VERBRAUCH=236, TYP_ZEITDIMENSION=237, TYP_ZEITWERT=238, UNION=239, 
		UNIQUE=240, UNIQUEIDENTIFIER=241, UNPIVOT=242, UNSIGNED=243, UPDATE=244, 
		UPDATETEXT=245, USE=246, USER=247, VALUES=248, VARBINARY=249, VARCHAR=250, 
		VARYING=251, VIEW=252, WAITFOR=253, WHEN=254, WHERE=255, WHILE=256, WITH=257, 
		WITHIN=258, WRITETEXT=259, ABSOLUTE=260, APPLY=261, AUTO=262, AVG=263, 
		BASE64=264, BINARY_CHECKSUM=265, CALLER=266, CAST=267, CATCH=268, CHECKSUM=269, 
		CHECKSUM_AGG=270, COMMITTED=271, CONCAT=272, COOKIE=273, COUNT=274, COUNT_BIG=275, 
		DATEADD=276, DATEDIFF=277, DATENAME=278, DATEPART=279, DELAY=280, DELETED=281, 
		DENSE_RANK=282, DISABLE=283, DYNAMIC=284, ENCRYPTION=285, FAST=286, FAST_FORWARD=287, 
		FIRST=288, FOLLOWING=289, FORWARD_ONLY=290, FULLSCAN=291, GLOBAL=292, 
		GO=293, GROUPING=294, GROUPING_ID=295, HASH=296, INSENSITIVE=297, INSERTED=298, 
		ISOLATION=299, KEEPFIXED=300, KEYSET=301, LAST=302, LEVEL=303, LOCAL=304, 
		LOCK_ESCALATION=305, LOGIN=306, LOOP=307, MARK=308, MAX=309, MIN=310, 
		MIN_ACTIVE_ROWVERSION=311, MOD=312, MODIFY=313, NEXT=314, NAME=315, NOCOUNT=316, 
		NOEXPAND=317, NORECOMPUTE=318, NTILE=319, NUMBER=320, OFFSET=321, ONLY=322, 
		OPTIMISTIC=323, OPTIMIZE=324, OUT=325, OUTPUT=326, OWNER=327, PARTITION=328, 
		PATH=329, PRECEDING=330, PRIOR=331, RANGE=332, RANK=333, READONLY=334, 
		READ_ONLY=335, RECOMPILE=336, RELATIVE=337, REMOTE=338, REPEATABLE=339, 
		ROOT=340, ROW=341, ROWGUID=342, ROWS=343, ROW_NUMBER=344, SAMPLE=345, 
		SCHEMABINDING=346, SCROLL=347, SCROLL_LOCKS=348, SELF=349, SERIALIZABLE=350, 
		SNAPSHOT=351, SPATIAL_WINDOW_MAX_CELLS=352, STATIC=353, STATS_STREAM=354, 
		STDEV=355, STDEVP=356, SUM=357, THROW=358, TIES=359, TIME=360, TIMESTAMP=361, 
		TRY=362, TYPE=363, TYPE_WARNING=364, UNBOUNDED=365, UNCOMMITTED=366, UNKNOWN=367, 
		USING=368, VAR=369, VARP=370, VIEW_METADATA=371, WORK=372, XML=373, XMLNAMESPACES=374, 
		DOLLAR_ACTION=375, SPACE=376, BLOCK_COMMENT=377, LINE_COMMENT=378, STRING_COMMENT=379, 
		DOUBLE_QUOTE_ID=380, SQUARE_BRACKET_ID=381, LOCAL_ID=382, DECIMAL=383, 
		ID=384, STRING=385, BINARY=386, FLOAT=387, REAL=388, EQUAL=389, GREATER=390, 
		LESS=391, EXCLAMATION=392, PLUS_ASSIGN=393, MINUS_ASSIGN=394, MULT_ASSIGN=395, 
		DIV_ASSIGN=396, MOD_ASSIGN=397, AND_ASSIGN=398, XOR_ASSIGN=399, OR_ASSIGN=400, 
		DOT=401, UNDERLINE=402, AT=403, SHARP=404, DOLLAR=405, LR_BRACKET=406, 
		RR_BRACKET=407, COMMA=408, SEMI=409, COLON=410, STAR=411, DIVIDE=412, 
		MODULE=413, PLUS=414, MINUS=415, BIT_NOT=416, BIT_OR=417, BIT_AND=418, 
		BIT_XOR=419, DATETIMN=420;
	public static final String[] tokenNames = {
		"<INVALID>", "'||'", "ADD", "ALL", "ALTER", "AND", "ANY", "AS", "ASC", 
		"AUTHORIZATION", "AUTOINCREMENT", "BACKUP", "BEGIN", "BETWEEN", "BIGINT", 
		"BIGINTN", "BIT", "BLOB", "BOOLEAN", "BREAK", "BROWSE", "BULK", "BY", 
		"CALL", "CASCADE", "CASE", "CHANGETABLE", "CHANGES", "CHAR", "CHARACTER", 
		"CHECK", "CHECKPOINT", "CLOB", "CLOSE", "CLUSTERED", "CMP", "COALESCE", 
		"COLLATE", "COLUMN", "COMMENT", "COMMIT", "COMPUTE", "CONSTRAINT", "CONTAINS", 
		"CONTAINSTABLE", "CONTINUE", "CONVERT", "CREATE", "CROSS", "CURRENT", 
		"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "CURSOR", 
		"DATABASE", "DATE", "DATETIME", "DATETIME2", "DATETIMEN", "DATETIMEOFFSET", 
		"DBCC", "DEALLOCATE", "DECIMALN", "DECLARE", "DECRYPT", "DEFAULT", "DEFINER", 
		"DELETE", "DENY", "DESC", "DISK", "DISTINCT", "DISTRIBUTED", "DOUBLE", 
		"DROP", "DTTM", "DUMP", "ELSE", "ELSEIF", "END", "ENDIF", "ERRLVL", "ESCAPE", 
		"EXCEPT", "EXCEPTION", "EXEC", "EXECUTE", "EXISTING", "EXISTS", "EXIT", 
		"EXTERNAL", "FETCH", "FILE", "FILLFACTOR", "FLOATN", "FOR", "FORCESEEK", 
		"FOREIGN", "FREETEXT", "FREETEXTTABLE", "FROM", "FULL", "FUNCTION", "GOTO", 
		"GRANT", "GROUP", "HAVING", "HG", "HNG", "IDENTITY", "IDENTITYCOL", "IDENTITY_INSERT", 
		"IF", "IMAGE", "IMMEDIATE", "IN", "INOUT", "INDEX", "INNER", "INSERT", 
		"INT", "INTN", "INTEGER", "INTERSECT", "INTO", "INVOKER", "IQ", "IS", 
		"JOIN", "KEY", "KILL", "LEFT", "LF", "LIKE", "LINENO", "LOAD", "MERGE", 
		"MONEY", "MONEYN", "NATIONAL", "NCHAR", "NO", "NOCHECK", "NONCLUSTERED", 
		"NOT", "NTEXT", "NUMERIC", "NUMERICN", "NULL", "NULLIF", "NVARCHAR", "OF", 
		"OFF", "OFFSETS", "ON", "OPEN", "OPENDATASOURCE", "OPENQUERY", "OPENROWSET", 
		"OPENXML", "OPTION", "OR", "ORDER", "OTHERS", "OUTER", "OVER", "PERCENT", 
		"PIVOT", "PLAN", "PRECISION", "PRESERVE", "PRIMARY", "PRINT", "PROC", 
		"PROCEDURE", "PUBLIC", "RAISERROR", "READ", "READTEXT", "RECONFIGURE", 
		"REFERENCES", "REPLACE", "REPLICATION", "RESIGNAL", "RESTORE", "RESTRICT", 
		"RESULT", "RESUME", "RETURN", "REVERT", "REVOKE", "RIGHT", "ROLE", "ROLLBACK", 
		"ROWCOUNT", "ROWGUIDCOL", "RULE", "SAVE", "SCHEMA", "SECURITY", "SECURITYAUDIT", 
		"SELECT", "SEMANTICKEYPHRASETABLE", "SEMANTICSIMILARITYDETAILSTABLE", 
		"SEMANTICSIMILARITYTABLE", "SESSION_USER", "SET", "SETUSER", "SHUTDOWN", 
		"SMALLINT", "SMALLINTN", "SMALLMONEY", "SMALLDATETIME", "SYSNAME", "SOME", 
		"SQL", "STATISTICS", "SYSTEM_USER", "TABLE", "TABLESAMPLE", "TEMPORARY", 
		"TEXT", "TEXTSIZE", "THEN", "TINYINT", "TO", "TOP", "TRAN", "TRANSACTION", 
		"TRANSACTIONAL", "TRIGGER", "TRUNCATE", "TRY_CONVERT", "TSEQUAL", "TYP_MONEY", 
		"TYP_VERBRAUCH", "TYP_ZEITDIMENSION", "TYP_ZEITWERT", "UNION", "UNIQUE", 
		"UNIQUEIDENTIFIER", "UNPIVOT", "UNSIGNED", "UPDATE", "UPDATETEXT", "USE", 
		"USER", "VALUES", "VARBINARY", "VARCHAR", "VARYING", "VIEW", "WAITFOR", 
		"WHEN", "WHERE", "WHILE", "WITH", "WITHIN", "WRITETEXT", "ABSOLUTE", "APPLY", 
		"AUTO", "AVG", "BASE64", "BINARY_CHECKSUM", "CALLER", "CAST", "CATCH", 
		"CHECKSUM", "CHECKSUM_AGG", "COMMITTED", "CONCAT", "COOKIE", "COUNT", 
		"COUNT_BIG", "DATEADD", "DATEDIFF", "DATENAME", "DATEPART", "DELAY", "DELETED", 
		"DENSE_RANK", "DISABLE", "DYNAMIC", "ENCRYPTION", "FAST", "FAST_FORWARD", 
		"FIRST", "FOLLOWING", "FORWARD_ONLY", "FULLSCAN", "GLOBAL", "GO", "GROUPING", 
		"GROUPING_ID", "HASH", "INSENSITIVE", "INSERTED", "ISOLATION", "KEEPFIXED", 
		"KEYSET", "LAST", "LEVEL", "LOCAL", "LOCK_ESCALATION", "LOGIN", "LOOP", 
		"MARK", "MAX", "MIN", "MIN_ACTIVE_ROWVERSION", "MOD", "MODIFY", "NEXT", 
		"NAME", "NOCOUNT", "NOEXPAND", "NORECOMPUTE", "NTILE", "NUMBER", "OFFSET", 
		"ONLY", "OPTIMISTIC", "OPTIMIZE", "OUT", "OUTPUT", "OWNER", "PARTITION", 
		"PATH", "PRECEDING", "PRIOR", "RANGE", "RANK", "READONLY", "READ_ONLY", 
		"RECOMPILE", "RELATIVE", "REMOTE", "REPEATABLE", "ROOT", "ROW", "ROWGUID", 
		"ROWS", "ROW_NUMBER", "SAMPLE", "SCHEMABINDING", "SCROLL", "SCROLL_LOCKS", 
		"SELF", "SERIALIZABLE", "SNAPSHOT", "SPATIAL_WINDOW_MAX_CELLS", "STATIC", 
		"STATS_STREAM", "STDEV", "STDEVP", "SUM", "THROW", "TIES", "TIME", "TIMESTAMP", 
		"TRY", "TYPE", "TYPE_WARNING", "UNBOUNDED", "UNCOMMITTED", "UNKNOWN", 
		"USING", "VAR", "VARP", "VIEW_METADATA", "WORK", "XML", "XMLNAMESPACES", 
		"DOLLAR_ACTION", "SPACE", "BLOCK_COMMENT", "LINE_COMMENT", "STRING_COMMENT", 
		"DOUBLE_QUOTE_ID", "SQUARE_BRACKET_ID", "LOCAL_ID", "DECIMAL", "ID", "STRING", 
		"BINARY", "FLOAT", "REAL", "'='", "'>'", "'<'", "'!'", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'&='", "'^='", "'|='", "'.'", "'_'", "'@'", "'#'", 
		"'$'", "'('", "')'", "','", "';'", "':'", "'*'", "'/'", "'%'", "'+'", 
		"'-'", "'~'", "'|'", "'&'", "'^'", "DATETIMN"
	};
	public static final int
		RULE_tsql_file = 0, RULE_sql_clause = 1, RULE_dml_clause = 2, RULE_ddl_clause = 3, 
		RULE_cfl_statement = 4, RULE_another_statement = 5, RULE_delete_statement = 6, 
		RULE_insert_statement = 7, RULE_select_statement = 8, RULE_update_statement = 9, 
		RULE_output_clause = 10, RULE_output_dml_list_elem = 11, RULE_output_column_name = 12, 
		RULE_create_index = 13, RULE_index_type = 14, RULE_create_procedure = 15, 
		RULE_procedure_param = 16, RULE_result_column = 17, RULE_create_statistics = 18, 
		RULE_create_table = 19, RULE_create_view = 20, RULE_view_attribute = 21, 
		RULE_alter_table = 22, RULE_add_list = 23, RULE_alter_database = 24, RULE_database_option = 25, 
		RULE_drop_index = 26, RULE_drop_procedure = 27, RULE_drop_statistics = 28, 
		RULE_drop_table = 29, RULE_drop_view = 30, RULE_truncate_statement = 31, 
		RULE_rowset_function_limited = 32, RULE_openquery = 33, RULE_opendatasource = 34, 
		RULE_declare_statement = 35, RULE_declare_local_temporary_table = 36, 
		RULE_cursor_statement = 37, RULE_execute_statement = 38, RULE_execute_statement_arg = 39, 
		RULE_execute_var_string = 40, RULE_security_statement = 41, RULE_set_statement = 42, 
		RULE_transaction_statement = 43, RULE_go_statement = 44, RULE_use_statement = 45, 
		RULE_execute_clause = 46, RULE_declare_type = 47, RULE_unsigned_zusatz = 48, 
		RULE_declare_local = 49, RULE_table_type_definition = 50, RULE_column_def_table_constraint = 51, 
		RULE_column_definition = 52, RULE_column_constraint = 53, RULE_table_constraint = 54, 
		RULE_index_options = 55, RULE_wot_statement = 56, RULE_call_statement = 57, 
		RULE_grant_statement = 58, RULE_comment_on_statement = 59, RULE_replace_statement = 60, 
		RULE_comment_on_object = 61, RULE_permission_list = 62, RULE_permission = 63, 
		RULE_index_option = 64, RULE_declare_cursor = 65, RULE_declare_set_cursor_common = 66, 
		RULE_fetch_cursor = 67, RULE_set_special = 68, RULE_expression = 69, RULE_constant_expression = 70, 
		RULE_subquery = 71, RULE_dml_table_source = 72, RULE_with_expression = 73, 
		RULE_common_table_expression = 74, RULE_update_elem = 75, RULE_then_condition_list = 76, 
		RULE_then_condition = 77, RULE_search_condition_list = 78, RULE_search_condition = 79, 
		RULE_search_condition_or = 80, RULE_search_condition_not = 81, RULE_predicate = 82, 
		RULE_query_expression = 83, RULE_union = 84, RULE_query_specification = 85, 
		RULE_order_by_clause = 86, RULE_for_clause = 87, RULE_xml_common_directives = 88, 
		RULE_order_by_expression = 89, RULE_group_by_item = 90, RULE_option_clause = 91, 
		RULE_option = 92, RULE_optimize_for_arg = 93, RULE_select_list = 94, RULE_select_list_elem = 95, 
		RULE_partition_by_clause = 96, RULE_table_source = 97, RULE_table_source_item_joined = 98, 
		RULE_table_source_item = 99, RULE_change_table = 100, RULE_join_part = 101, 
		RULE_table_name_with_hint = 102, RULE_rowset_function = 103, RULE_bulk_option = 104, 
		RULE_derived_table = 105, RULE_function_call = 106, RULE_datepart = 107, 
		RULE_as_table_alias = 108, RULE_table_alias = 109, RULE_with_table_hints = 110, 
		RULE_table_hint = 111, RULE_index_column_name = 112, RULE_index_value = 113, 
		RULE_column_alias_list = 114, RULE_column_alias = 115, RULE_table_value_constructor = 116, 
		RULE_expression_list = 117, RULE_case_expr = 118, RULE_ranking_windowed_function = 119, 
		RULE_aggregate_windowed_function = 120, RULE_all_distinct_expression = 121, 
		RULE_over_clause = 122, RULE_row_or_range_clause = 123, RULE_window_frame_extent = 124, 
		RULE_window_frame_bound = 125, RULE_window_frame_preceding = 126, RULE_window_frame_following = 127, 
		RULE_full_table_name = 128, RULE_table_name = 129, RULE_procedure_name = 130, 
		RULE_view_name = 131, RULE_func_proc_name = 132, RULE_ddl_object = 133, 
		RULE_full_column_name = 134, RULE_column_name_list = 135, RULE_column_name = 136, 
		RULE_cursor_name = 137, RULE_on_off = 138, RULE_clustered = 139, RULE_null_notnull = 140, 
		RULE_scalar_function_name = 141, RULE_default_value = 142, RULE_constant = 143, 
		RULE_number = 144, RULE_sign = 145, RULE_id = 146, RULE_simple_id = 147, 
		RULE_comparison_operator = 148, RULE_assignment_operator = 149;
	public static final String[] ruleNames = {
		"tsql_file", "sql_clause", "dml_clause", "ddl_clause", "cfl_statement", 
		"another_statement", "delete_statement", "insert_statement", "select_statement", 
		"update_statement", "output_clause", "output_dml_list_elem", "output_column_name", 
		"create_index", "index_type", "create_procedure", "procedure_param", "result_column", 
		"create_statistics", "create_table", "create_view", "view_attribute", 
		"alter_table", "add_list", "alter_database", "database_option", "drop_index", 
		"drop_procedure", "drop_statistics", "drop_table", "drop_view", "truncate_statement", 
		"rowset_function_limited", "openquery", "opendatasource", "declare_statement", 
		"declare_local_temporary_table", "cursor_statement", "execute_statement", 
		"execute_statement_arg", "execute_var_string", "security_statement", "set_statement", 
		"transaction_statement", "go_statement", "use_statement", "execute_clause", 
		"declare_type", "unsigned_zusatz", "declare_local", "table_type_definition", 
		"column_def_table_constraint", "column_definition", "column_constraint", 
		"table_constraint", "index_options", "wot_statement", "call_statement", 
		"grant_statement", "comment_on_statement", "replace_statement", "comment_on_object", 
		"permission_list", "permission", "index_option", "declare_cursor", "declare_set_cursor_common", 
		"fetch_cursor", "set_special", "expression", "constant_expression", "subquery", 
		"dml_table_source", "with_expression", "common_table_expression", "update_elem", 
		"then_condition_list", "then_condition", "search_condition_list", "search_condition", 
		"search_condition_or", "search_condition_not", "predicate", "query_expression", 
		"union", "query_specification", "order_by_clause", "for_clause", "xml_common_directives", 
		"order_by_expression", "group_by_item", "option_clause", "option", "optimize_for_arg", 
		"select_list", "select_list_elem", "partition_by_clause", "table_source", 
		"table_source_item_joined", "table_source_item", "change_table", "join_part", 
		"table_name_with_hint", "rowset_function", "bulk_option", "derived_table", 
		"function_call", "datepart", "as_table_alias", "table_alias", "with_table_hints", 
		"table_hint", "index_column_name", "index_value", "column_alias_list", 
		"column_alias", "table_value_constructor", "expression_list", "case_expr", 
		"ranking_windowed_function", "aggregate_windowed_function", "all_distinct_expression", 
		"over_clause", "row_or_range_clause", "window_frame_extent", "window_frame_bound", 
		"window_frame_preceding", "window_frame_following", "full_table_name", 
		"table_name", "procedure_name", "view_name", "func_proc_name", "ddl_object", 
		"full_column_name", "column_name_list", "column_name", "cursor_name", 
		"on_off", "clustered", "null_notnull", "scalar_function_name", "default_value", 
		"constant", "number", "sign", "id", "simple_id", "comparison_operator", 
		"assignment_operator"
	};

	@Override
	public String getGrammarFileName() { return "tsql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public tsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Tsql_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tsqlParser.EOF, 0); }
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Tsql_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsql_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTsql_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tsql_fileContext tsql_file() throws RecognitionException {
		Tsql_fileContext _localctx = new Tsql_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tsql_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CALL) | (1L << CLOSE) | (1L << COMMENT) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECLARE - 64)) | (1L << (DELETE - 64)) | (1L << (DROP - 64)) | (1L << (EXCEPTION - 64)) | (1L << (EXEC - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FORCESEEK - 64)) | (1L << (GOTO - 64)) | (1L << (GRANT - 64)) | (1L << (IF - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (OPEN - 156)) | (1L << (PRINT - 156)) | (1L << (RAISERROR - 156)) | (1L << (RETURN - 156)) | (1L << (REVERT - 156)) | (1L << (ROLLBACK - 156)) | (1L << (SAVE - 156)) | (1L << (SELECT - 156)) | (1L << (SET - 156)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (TRUNCATE - 232)) | (1L << (UPDATE - 232)) | (1L << (USE - 232)) | (1L << (WAITFOR - 232)) | (1L << (WHILE - 232)) | (1L << (WITH - 232)) | (1L << (ABSOLUTE - 232)) | (1L << (APPLY - 232)) | (1L << (AUTO - 232)) | (1L << (AVG - 232)) | (1L << (BASE64 - 232)) | (1L << (CALLER - 232)) | (1L << (CAST - 232)) | (1L << (CATCH - 232)) | (1L << (CHECKSUM_AGG - 232)) | (1L << (COMMITTED - 232)) | (1L << (CONCAT - 232)) | (1L << (COOKIE - 232)) | (1L << (COUNT - 232)) | (1L << (COUNT_BIG - 232)) | (1L << (DELAY - 232)) | (1L << (DELETED - 232)) | (1L << (DENSE_RANK - 232)) | (1L << (DISABLE - 232)) | (1L << (DYNAMIC - 232)) | (1L << (ENCRYPTION - 232)) | (1L << (FAST - 232)) | (1L << (FAST_FORWARD - 232)) | (1L << (FIRST - 232)) | (1L << (FOLLOWING - 232)) | (1L << (FORWARD_ONLY - 232)) | (1L << (FULLSCAN - 232)) | (1L << (GLOBAL - 232)) | (1L << (GO - 232)) | (1L << (GROUPING - 232)) | (1L << (GROUPING_ID - 232)))) != 0) || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (HASH - 296)) | (1L << (INSENSITIVE - 296)) | (1L << (INSERTED - 296)) | (1L << (ISOLATION - 296)) | (1L << (KEEPFIXED - 296)) | (1L << (KEYSET - 296)) | (1L << (LAST - 296)) | (1L << (LEVEL - 296)) | (1L << (LOCAL - 296)) | (1L << (LOCK_ESCALATION - 296)) | (1L << (LOGIN - 296)) | (1L << (LOOP - 296)) | (1L << (MARK - 296)) | (1L << (MAX - 296)) | (1L << (MIN - 296)) | (1L << (MODIFY - 296)) | (1L << (NEXT - 296)) | (1L << (NAME - 296)) | (1L << (NOCOUNT - 296)) | (1L << (NOEXPAND - 296)) | (1L << (NORECOMPUTE - 296)) | (1L << (NTILE - 296)) | (1L << (NUMBER - 296)) | (1L << (OFFSET - 296)) | (1L << (ONLY - 296)) | (1L << (OPTIMISTIC - 296)) | (1L << (OPTIMIZE - 296)) | (1L << (OUT - 296)) | (1L << (OUTPUT - 296)) | (1L << (OWNER - 296)) | (1L << (PARTITION - 296)) | (1L << (PATH - 296)) | (1L << (PRECEDING - 296)) | (1L << (PRIOR - 296)) | (1L << (RANGE - 296)) | (1L << (RANK - 296)) | (1L << (READONLY - 296)) | (1L << (READ_ONLY - 296)) | (1L << (RECOMPILE - 296)) | (1L << (RELATIVE - 296)) | (1L << (REMOTE - 296)) | (1L << (REPEATABLE - 296)) | (1L << (ROOT - 296)) | (1L << (ROW - 296)) | (1L << (ROWGUID - 296)) | (1L << (ROWS - 296)) | (1L << (ROW_NUMBER - 296)) | (1L << (SAMPLE - 296)) | (1L << (SCHEMABINDING - 296)) | (1L << (SCROLL - 296)) | (1L << (SCROLL_LOCKS - 296)) | (1L << (SELF - 296)) | (1L << (SERIALIZABLE - 296)) | (1L << (SNAPSHOT - 296)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 296)) | (1L << (STATIC - 296)) | (1L << (STATS_STREAM - 296)) | (1L << (STDEV - 296)) | (1L << (STDEVP - 296)) | (1L << (SUM - 296)) | (1L << (THROW - 296)) | (1L << (TIES - 296)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (TIME - 360)) | (1L << (TRY - 360)) | (1L << (TYPE - 360)) | (1L << (TYPE_WARNING - 360)) | (1L << (UNBOUNDED - 360)) | (1L << (UNCOMMITTED - 360)) | (1L << (UNKNOWN - 360)) | (1L << (USING - 360)) | (1L << (VAR - 360)) | (1L << (VARP - 360)) | (1L << (VIEW_METADATA - 360)) | (1L << (WORK - 360)) | (1L << (XML - 360)) | (1L << (XMLNAMESPACES - 360)) | (1L << (DOUBLE_QUOTE_ID - 360)) | (1L << (SQUARE_BRACKET_ID - 360)) | (1L << (ID - 360)) | (1L << (LR_BRACKET - 360)))) != 0)) {
				{
				{
				setState(300); sql_clause();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_clauseContext extends ParserRuleContext {
		public Ddl_clauseContext ddl_clause() {
			return getRuleContext(Ddl_clauseContext.class,0);
		}
		public Another_statementContext another_statement() {
			return getRuleContext(Another_statementContext.class,0);
		}
		public Dml_clauseContext dml_clause() {
			return getRuleContext(Dml_clauseContext.class,0);
		}
		public Cfl_statementContext cfl_statement() {
			return getRuleContext(Cfl_statementContext.class,0);
		}
		public Sql_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSql_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_clauseContext sql_clause() throws RecognitionException {
		Sql_clauseContext _localctx = new Sql_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_clause);
		try {
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308); dml_clause();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309); ddl_clause();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310); cfl_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311); another_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dml_clauseContext extends ParserRuleContext {
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Dml_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDml_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dml_clauseContext dml_clause() throws RecognitionException {
		Dml_clauseContext _localctx = new Dml_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dml_clause);
		try {
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); delete_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); insert_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316); select_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317); update_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_clauseContext extends ParserRuleContext {
		public Drop_procedureContext drop_procedure() {
			return getRuleContext(Drop_procedureContext.class,0);
		}
		public Create_viewContext create_view() {
			return getRuleContext(Create_viewContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Truncate_statementContext truncate_statement() {
			return getRuleContext(Truncate_statementContext.class,0);
		}
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Drop_statisticsContext drop_statistics() {
			return getRuleContext(Drop_statisticsContext.class,0);
		}
		public Create_indexContext create_index() {
			return getRuleContext(Create_indexContext.class,0);
		}
		public Drop_viewContext drop_view() {
			return getRuleContext(Drop_viewContext.class,0);
		}
		public Create_statisticsContext create_statistics() {
			return getRuleContext(Create_statisticsContext.class,0);
		}
		public Create_procedureContext create_procedure() {
			return getRuleContext(Create_procedureContext.class,0);
		}
		public Alter_databaseContext alter_database() {
			return getRuleContext(Alter_databaseContext.class,0);
		}
		public Drop_indexContext drop_index() {
			return getRuleContext(Drop_indexContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Ddl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDdl_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ddl_clauseContext ddl_clause() throws RecognitionException {
		Ddl_clauseContext _localctx = new Ddl_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ddl_clause);
		try {
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320); create_index();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); create_procedure();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322); create_statistics();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323); create_table();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(324); create_view();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(325); alter_table();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(326); alter_database();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(327); drop_index();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(328); drop_procedure();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(329); drop_statistics();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(330); drop_table();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(331); drop_view();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(332); truncate_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfl_statementContext extends ParserRuleContext {
		public Cfl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfl_statement; }
	 
		public Cfl_statementContext() { }
		public void copyFrom(Cfl_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Return_statementContext extends Cfl_statementContext {
		public TerminalNode RETURN() { return getToken(tsqlParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exception_statementContext extends Cfl_statementContext {
		public TerminalNode EXCEPTION() { return getToken(tsqlParser.EXCEPTION, 0); }
		public Wot_statementContext wot_statement() {
			return getRuleContext(Wot_statementContext.class,0);
		}
		public Exception_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitException_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_statementContext extends Cfl_statementContext {
		public List<TerminalNode> THEN() { return getTokens(tsqlParser.THEN); }
		public TerminalNode ELSEIF() { return getToken(tsqlParser.ELSEIF, 0); }
		public TerminalNode THEN(int i) {
			return getToken(tsqlParser.THEN, i);
		}
		public TerminalNode IF(int i) {
			return getToken(tsqlParser.IF, i);
		}
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<Then_condition_listContext> then_condition_list() {
			return getRuleContexts(Then_condition_listContext.class);
		}
		public Then_condition_listContext then_condition_list(int i) {
			return getRuleContext(Then_condition_listContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(tsqlParser.IF); }
		public TerminalNode ELSE() { return getToken(tsqlParser.ELSE, 0); }
		public Sql_clauseContext sql_clause() {
			return getRuleContext(Sql_clauseContext.class,0);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(tsqlParser.ENDIF, 0); }
		public TerminalNode END() { return getToken(tsqlParser.END, 0); }
		public If_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_statementContext extends Cfl_statementContext {
		public TerminalNode WHILE() { return getToken(tsqlParser.WHILE, 0); }
		public Sql_clauseContext sql_clause() {
			return getRuleContext(Sql_clauseContext.class,0);
		}
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(tsqlParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(tsqlParser.CONTINUE, 0); }
		public While_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue_statementContext extends Cfl_statementContext {
		public TerminalNode CONTINUE() { return getToken(tsqlParser.CONTINUE, 0); }
		public Continue_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Loop_statementContext extends Cfl_statementContext {
		public TerminalNode WHILE() { return getToken(tsqlParser.WHILE, 0); }
		public TerminalNode LOOP(int i) {
			return getToken(tsqlParser.LOOP, i);
		}
		public Sql_clauseContext sql_clause() {
			return getRuleContext(Sql_clauseContext.class,0);
		}
		public List<TerminalNode> LOOP() { return getTokens(tsqlParser.LOOP); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(tsqlParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(tsqlParser.CONTINUE, 0); }
		public TerminalNode END() { return getToken(tsqlParser.END, 0); }
		public Loop_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Break_statementContext extends Cfl_statementContext {
		public TerminalNode BREAK() { return getToken(tsqlParser.BREAK, 0); }
		public Break_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Try_catch_statementContext extends Cfl_statementContext {
		public TerminalNode CATCH(int i) {
			return getToken(tsqlParser.CATCH, i);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public List<TerminalNode> CATCH() { return getTokens(tsqlParser.CATCH); }
		public TerminalNode END(int i) {
			return getToken(tsqlParser.END, i);
		}
		public TerminalNode BEGIN(int i) {
			return getToken(tsqlParser.BEGIN, i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(tsqlParser.BEGIN); }
		public List<TerminalNode> END() { return getTokens(tsqlParser.END); }
		public TerminalNode TRY(int i) {
			return getToken(tsqlParser.TRY, i);
		}
		public List<TerminalNode> TRY() { return getTokens(tsqlParser.TRY); }
		public Try_catch_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTry_catch_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Raiseerror_statementContext extends Cfl_statementContext {
		public Token msg;
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode RAISERROR() { return getToken(tsqlParser.RAISERROR, 0); }
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Raiseerror_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitRaiseerror_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Print_statementContext extends Cfl_statementContext {
		public TerminalNode PRINT() { return getToken(tsqlParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Waitfor_statementContext extends Cfl_statementContext {
		public TerminalNode TIME() { return getToken(tsqlParser.TIME, 0); }
		public TerminalNode DELAY() { return getToken(tsqlParser.DELAY, 0); }
		public TerminalNode WAITFOR() { return getToken(tsqlParser.WAITFOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Waitfor_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitWaitfor_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Throw_statementContext extends Cfl_statementContext {
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public TerminalNode DECIMAL(int i) {
			return getToken(tsqlParser.DECIMAL, i);
		}
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(tsqlParser.DECIMAL); }
		public TerminalNode THROW() { return getToken(tsqlParser.THROW, 0); }
		public Throw_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitThrow_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Goto_statementContext extends Cfl_statementContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Goto_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitGoto_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Begin_statementContext extends Cfl_statementContext {
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public TerminalNode BEGIN() { return getToken(tsqlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(tsqlParser.END, 0); }
		public Begin_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitBegin_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cfl_statementContext cfl_statement() throws RecognitionException {
		Cfl_statementContext _localctx = new Cfl_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cfl_statement);
		int _la;
		try {
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new Begin_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(335); match(BEGIN);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CALL) | (1L << CLOSE) | (1L << COMMENT) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECLARE - 64)) | (1L << (DELETE - 64)) | (1L << (DROP - 64)) | (1L << (EXCEPTION - 64)) | (1L << (EXEC - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FORCESEEK - 64)) | (1L << (GOTO - 64)) | (1L << (GRANT - 64)) | (1L << (IF - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (OPEN - 156)) | (1L << (PRINT - 156)) | (1L << (RAISERROR - 156)) | (1L << (RETURN - 156)) | (1L << (REVERT - 156)) | (1L << (ROLLBACK - 156)) | (1L << (SAVE - 156)) | (1L << (SELECT - 156)) | (1L << (SET - 156)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (TRUNCATE - 232)) | (1L << (UPDATE - 232)) | (1L << (USE - 232)) | (1L << (WAITFOR - 232)) | (1L << (WHILE - 232)) | (1L << (WITH - 232)) | (1L << (ABSOLUTE - 232)) | (1L << (APPLY - 232)) | (1L << (AUTO - 232)) | (1L << (AVG - 232)) | (1L << (BASE64 - 232)) | (1L << (CALLER - 232)) | (1L << (CAST - 232)) | (1L << (CATCH - 232)) | (1L << (CHECKSUM_AGG - 232)) | (1L << (COMMITTED - 232)) | (1L << (CONCAT - 232)) | (1L << (COOKIE - 232)) | (1L << (COUNT - 232)) | (1L << (COUNT_BIG - 232)) | (1L << (DELAY - 232)) | (1L << (DELETED - 232)) | (1L << (DENSE_RANK - 232)) | (1L << (DISABLE - 232)) | (1L << (DYNAMIC - 232)) | (1L << (ENCRYPTION - 232)) | (1L << (FAST - 232)) | (1L << (FAST_FORWARD - 232)) | (1L << (FIRST - 232)) | (1L << (FOLLOWING - 232)) | (1L << (FORWARD_ONLY - 232)) | (1L << (FULLSCAN - 232)) | (1L << (GLOBAL - 232)) | (1L << (GO - 232)) | (1L << (GROUPING - 232)) | (1L << (GROUPING_ID - 232)))) != 0) || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (HASH - 296)) | (1L << (INSENSITIVE - 296)) | (1L << (INSERTED - 296)) | (1L << (ISOLATION - 296)) | (1L << (KEEPFIXED - 296)) | (1L << (KEYSET - 296)) | (1L << (LAST - 296)) | (1L << (LEVEL - 296)) | (1L << (LOCAL - 296)) | (1L << (LOCK_ESCALATION - 296)) | (1L << (LOGIN - 296)) | (1L << (LOOP - 296)) | (1L << (MARK - 296)) | (1L << (MAX - 296)) | (1L << (MIN - 296)) | (1L << (MODIFY - 296)) | (1L << (NEXT - 296)) | (1L << (NAME - 296)) | (1L << (NOCOUNT - 296)) | (1L << (NOEXPAND - 296)) | (1L << (NORECOMPUTE - 296)) | (1L << (NTILE - 296)) | (1L << (NUMBER - 296)) | (1L << (OFFSET - 296)) | (1L << (ONLY - 296)) | (1L << (OPTIMISTIC - 296)) | (1L << (OPTIMIZE - 296)) | (1L << (OUT - 296)) | (1L << (OUTPUT - 296)) | (1L << (OWNER - 296)) | (1L << (PARTITION - 296)) | (1L << (PATH - 296)) | (1L << (PRECEDING - 296)) | (1L << (PRIOR - 296)) | (1L << (RANGE - 296)) | (1L << (RANK - 296)) | (1L << (READONLY - 296)) | (1L << (READ_ONLY - 296)) | (1L << (RECOMPILE - 296)) | (1L << (RELATIVE - 296)) | (1L << (REMOTE - 296)) | (1L << (REPEATABLE - 296)) | (1L << (ROOT - 296)) | (1L << (ROW - 296)) | (1L << (ROWGUID - 296)) | (1L << (ROWS - 296)) | (1L << (ROW_NUMBER - 296)) | (1L << (SAMPLE - 296)) | (1L << (SCHEMABINDING - 296)) | (1L << (SCROLL - 296)) | (1L << (SCROLL_LOCKS - 296)) | (1L << (SELF - 296)) | (1L << (SERIALIZABLE - 296)) | (1L << (SNAPSHOT - 296)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 296)) | (1L << (STATIC - 296)) | (1L << (STATS_STREAM - 296)) | (1L << (STDEV - 296)) | (1L << (STDEVP - 296)) | (1L << (SUM - 296)) | (1L << (THROW - 296)) | (1L << (TIES - 296)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (TIME - 360)) | (1L << (TRY - 360)) | (1L << (TYPE - 360)) | (1L << (TYPE_WARNING - 360)) | (1L << (UNBOUNDED - 360)) | (1L << (UNCOMMITTED - 360)) | (1L << (UNKNOWN - 360)) | (1L << (USING - 360)) | (1L << (VAR - 360)) | (1L << (VARP - 360)) | (1L << (VIEW_METADATA - 360)) | (1L << (WORK - 360)) | (1L << (XML - 360)) | (1L << (XMLNAMESPACES - 360)) | (1L << (DOUBLE_QUOTE_ID - 360)) | (1L << (SQUARE_BRACKET_ID - 360)) | (1L << (ID - 360)) | (1L << (LR_BRACKET - 360)))) != 0)) {
					{
					{
					setState(336); sql_clause();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342); match(END);
				setState(344);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(343); match(SEMI);
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new Break_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(346); match(BREAK);
				setState(348);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(347); match(SEMI);
					}
					break;
				}
				}
				break;

			case 3:
				_localctx = new Continue_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(350); match(CONTINUE);
				setState(352);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(351); match(SEMI);
					}
					break;
				}
				}
				break;

			case 4:
				_localctx = new Exception_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(354); match(EXCEPTION);
				setState(355); wot_statement();
				}
				break;

			case 5:
				_localctx = new Goto_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(356); match(GOTO);
				setState(357); id();
				setState(359);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(358); match(SEMI);
					}
					break;
				}
				}
				break;

			case 6:
				_localctx = new Goto_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(361); id();
				setState(362); match(COLON);
				setState(364);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(363); match(SEMI);
					}
					break;
				}
				}
				break;

			case 7:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(366); match(IF);
				setState(367); search_condition();
				setState(368); match(THEN);
				setState(369); then_condition_list();
				setState(375);
				_la = _input.LA(1);
				if (_la==ELSEIF) {
					{
					setState(370); match(ELSEIF);
					setState(371); search_condition();
					setState(372); match(THEN);
					setState(373); then_condition_list();
					}
				}

				setState(392);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(377); match(ELSE);
					setState(390);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(381);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CALL) | (1L << CLOSE) | (1L << COMMENT) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECLARE - 64)) | (1L << (DELETE - 64)) | (1L << (DROP - 64)) | (1L << (EXCEPTION - 64)) | (1L << (EXEC - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FORCESEEK - 64)) | (1L << (GOTO - 64)) | (1L << (GRANT - 64)) | (1L << (IF - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (OPEN - 156)) | (1L << (PRINT - 156)) | (1L << (RAISERROR - 156)) | (1L << (RETURN - 156)) | (1L << (REVERT - 156)) | (1L << (ROLLBACK - 156)) | (1L << (SAVE - 156)) | (1L << (SELECT - 156)) | (1L << (SET - 156)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (TRUNCATE - 232)) | (1L << (UPDATE - 232)) | (1L << (USE - 232)) | (1L << (WAITFOR - 232)) | (1L << (WHILE - 232)) | (1L << (WITH - 232)) | (1L << (ABSOLUTE - 232)) | (1L << (APPLY - 232)) | (1L << (AUTO - 232)) | (1L << (AVG - 232)) | (1L << (BASE64 - 232)) | (1L << (CALLER - 232)) | (1L << (CAST - 232)) | (1L << (CATCH - 232)) | (1L << (CHECKSUM_AGG - 232)) | (1L << (COMMITTED - 232)) | (1L << (CONCAT - 232)) | (1L << (COOKIE - 232)) | (1L << (COUNT - 232)) | (1L << (COUNT_BIG - 232)) | (1L << (DELAY - 232)) | (1L << (DELETED - 232)) | (1L << (DENSE_RANK - 232)) | (1L << (DISABLE - 232)) | (1L << (DYNAMIC - 232)) | (1L << (ENCRYPTION - 232)) | (1L << (FAST - 232)) | (1L << (FAST_FORWARD - 232)) | (1L << (FIRST - 232)) | (1L << (FOLLOWING - 232)) | (1L << (FORWARD_ONLY - 232)) | (1L << (FULLSCAN - 232)) | (1L << (GLOBAL - 232)) | (1L << (GO - 232)) | (1L << (GROUPING - 232)) | (1L << (GROUPING_ID - 232)))) != 0) || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (HASH - 296)) | (1L << (INSENSITIVE - 296)) | (1L << (INSERTED - 296)) | (1L << (ISOLATION - 296)) | (1L << (KEEPFIXED - 296)) | (1L << (KEYSET - 296)) | (1L << (LAST - 296)) | (1L << (LEVEL - 296)) | (1L << (LOCAL - 296)) | (1L << (LOCK_ESCALATION - 296)) | (1L << (LOGIN - 296)) | (1L << (LOOP - 296)) | (1L << (MARK - 296)) | (1L << (MAX - 296)) | (1L << (MIN - 296)) | (1L << (MODIFY - 296)) | (1L << (NEXT - 296)) | (1L << (NAME - 296)) | (1L << (NOCOUNT - 296)) | (1L << (NOEXPAND - 296)) | (1L << (NORECOMPUTE - 296)) | (1L << (NTILE - 296)) | (1L << (NUMBER - 296)) | (1L << (OFFSET - 296)) | (1L << (ONLY - 296)) | (1L << (OPTIMISTIC - 296)) | (1L << (OPTIMIZE - 296)) | (1L << (OUT - 296)) | (1L << (OUTPUT - 296)) | (1L << (OWNER - 296)) | (1L << (PARTITION - 296)) | (1L << (PATH - 296)) | (1L << (PRECEDING - 296)) | (1L << (PRIOR - 296)) | (1L << (RANGE - 296)) | (1L << (RANK - 296)) | (1L << (READONLY - 296)) | (1L << (READ_ONLY - 296)) | (1L << (RECOMPILE - 296)) | (1L << (RELATIVE - 296)) | (1L << (REMOTE - 296)) | (1L << (REPEATABLE - 296)) | (1L << (ROOT - 296)) | (1L << (ROW - 296)) | (1L << (ROWGUID - 296)) | (1L << (ROWS - 296)) | (1L << (ROW_NUMBER - 296)) | (1L << (SAMPLE - 296)) | (1L << (SCHEMABINDING - 296)) | (1L << (SCROLL - 296)) | (1L << (SCROLL_LOCKS - 296)) | (1L << (SELF - 296)) | (1L << (SERIALIZABLE - 296)) | (1L << (SNAPSHOT - 296)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 296)) | (1L << (STATIC - 296)) | (1L << (STATS_STREAM - 296)) | (1L << (STDEV - 296)) | (1L << (STDEVP - 296)) | (1L << (SUM - 296)) | (1L << (THROW - 296)) | (1L << (TIES - 296)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (TIME - 360)) | (1L << (TRY - 360)) | (1L << (TYPE - 360)) | (1L << (TYPE_WARNING - 360)) | (1L << (UNBOUNDED - 360)) | (1L << (UNCOMMITTED - 360)) | (1L << (UNKNOWN - 360)) | (1L << (USING - 360)) | (1L << (VAR - 360)) | (1L << (VARP - 360)) | (1L << (VIEW_METADATA - 360)) | (1L << (WORK - 360)) | (1L << (XML - 360)) | (1L << (XMLNAMESPACES - 360)) | (1L << (DOUBLE_QUOTE_ID - 360)) | (1L << (SQUARE_BRACKET_ID - 360)) | (1L << (ID - 360)) | (1L << (LR_BRACKET - 360)))) != 0)) {
							{
							{
							setState(378); sql_clause();
							}
							}
							setState(383);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;

					case 2:
						{
						setState(387);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (CASE - 25)) | (1L << (COALESCE - 25)) | (1L << (CONVERT - 25)) | (1L << (CURRENT - 25)) | (1L << (CURRENT_TIMESTAMP - 25)) | (1L << (CURRENT_USER - 25)) | (1L << (DEFAULT - 25)))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (FORCESEEK - 97)) | (1L << (IDENTITY - 97)) | (1L << (LEFT - 97)) | (1L << (NULL - 97)) | (1L << (NULLIF - 97)))) != 0) || ((((_la - 182)) & ~0x3f) == 0 && ((1L << (_la - 182)) & ((1L << (REPLACE - 182)) | (1L << (RIGHT - 182)) | (1L << (SESSION_USER - 182)) | (1L << (SYSTEM_USER - 182)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (BINARY_CHECKSUM - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DATEADD - 260)) | (1L << (DATEDIFF - 260)) | (1L << (DATENAME - 260)) | (1L << (DATEPART - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MIN_ACTIVE_ROWVERSION - 260)) | (1L << (MOD - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (DOUBLE_QUOTE_ID - 324)) | (1L << (SQUARE_BRACKET_ID - 324)) | (1L << (LOCAL_ID - 324)) | (1L << (DECIMAL - 324)) | (1L << (ID - 324)) | (1L << (STRING - 324)) | (1L << (BINARY - 324)) | (1L << (FLOAT - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (REAL - 388)) | (1L << (DOLLAR - 388)) | (1L << (LR_BRACKET - 388)) | (1L << (PLUS - 388)) | (1L << (MINUS - 388)) | (1L << (BIT_NOT - 388)))) != 0)) {
							{
							{
							setState(384); expression(0);
							}
							}
							setState(389);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					}
					}
				}

				setState(397);
				switch (_input.LA(1)) {
				case END:
					{
					setState(394); match(END);
					setState(395); match(IF);
					}
					break;
				case ENDIF:
					{
					setState(396); match(ENDIF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(400);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(399); match(SEMI);
					}
					break;
				}
				}
				break;

			case 8:
				_localctx = new Return_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(402); match(RETURN);
				setState(404);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(403); expression(0);
					}
					break;
				}
				setState(407);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(406); match(SEMI);
					}
					break;
				}
				}
				break;

			case 9:
				_localctx = new Throw_statementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(409); match(THROW);
				setState(415);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(410);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==DECIMAL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(411); match(COMMA);
					setState(412);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==STRING) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(413); match(COMMA);
					setState(414);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==DECIMAL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(418);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(417); match(SEMI);
					}
					break;
				}
				}
				break;

			case 10:
				_localctx = new Try_catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(420); match(BEGIN);
				setState(421); match(TRY);
				setState(423);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(422); match(SEMI);
					}
				}

				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CALL) | (1L << CLOSE) | (1L << COMMENT) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECLARE - 64)) | (1L << (DELETE - 64)) | (1L << (DROP - 64)) | (1L << (EXCEPTION - 64)) | (1L << (EXEC - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FORCESEEK - 64)) | (1L << (GOTO - 64)) | (1L << (GRANT - 64)) | (1L << (IF - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (OPEN - 156)) | (1L << (PRINT - 156)) | (1L << (RAISERROR - 156)) | (1L << (RETURN - 156)) | (1L << (REVERT - 156)) | (1L << (ROLLBACK - 156)) | (1L << (SAVE - 156)) | (1L << (SELECT - 156)) | (1L << (SET - 156)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (TRUNCATE - 232)) | (1L << (UPDATE - 232)) | (1L << (USE - 232)) | (1L << (WAITFOR - 232)) | (1L << (WHILE - 232)) | (1L << (WITH - 232)) | (1L << (ABSOLUTE - 232)) | (1L << (APPLY - 232)) | (1L << (AUTO - 232)) | (1L << (AVG - 232)) | (1L << (BASE64 - 232)) | (1L << (CALLER - 232)) | (1L << (CAST - 232)) | (1L << (CATCH - 232)) | (1L << (CHECKSUM_AGG - 232)) | (1L << (COMMITTED - 232)) | (1L << (CONCAT - 232)) | (1L << (COOKIE - 232)) | (1L << (COUNT - 232)) | (1L << (COUNT_BIG - 232)) | (1L << (DELAY - 232)) | (1L << (DELETED - 232)) | (1L << (DENSE_RANK - 232)) | (1L << (DISABLE - 232)) | (1L << (DYNAMIC - 232)) | (1L << (ENCRYPTION - 232)) | (1L << (FAST - 232)) | (1L << (FAST_FORWARD - 232)) | (1L << (FIRST - 232)) | (1L << (FOLLOWING - 232)) | (1L << (FORWARD_ONLY - 232)) | (1L << (FULLSCAN - 232)) | (1L << (GLOBAL - 232)) | (1L << (GO - 232)) | (1L << (GROUPING - 232)) | (1L << (GROUPING_ID - 232)))) != 0) || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (HASH - 296)) | (1L << (INSENSITIVE - 296)) | (1L << (INSERTED - 296)) | (1L << (ISOLATION - 296)) | (1L << (KEEPFIXED - 296)) | (1L << (KEYSET - 296)) | (1L << (LAST - 296)) | (1L << (LEVEL - 296)) | (1L << (LOCAL - 296)) | (1L << (LOCK_ESCALATION - 296)) | (1L << (LOGIN - 296)) | (1L << (LOOP - 296)) | (1L << (MARK - 296)) | (1L << (MAX - 296)) | (1L << (MIN - 296)) | (1L << (MODIFY - 296)) | (1L << (NEXT - 296)) | (1L << (NAME - 296)) | (1L << (NOCOUNT - 296)) | (1L << (NOEXPAND - 296)) | (1L << (NORECOMPUTE - 296)) | (1L << (NTILE - 296)) | (1L << (NUMBER - 296)) | (1L << (OFFSET - 296)) | (1L << (ONLY - 296)) | (1L << (OPTIMISTIC - 296)) | (1L << (OPTIMIZE - 296)) | (1L << (OUT - 296)) | (1L << (OUTPUT - 296)) | (1L << (OWNER - 296)) | (1L << (PARTITION - 296)) | (1L << (PATH - 296)) | (1L << (PRECEDING - 296)) | (1L << (PRIOR - 296)) | (1L << (RANGE - 296)) | (1L << (RANK - 296)) | (1L << (READONLY - 296)) | (1L << (READ_ONLY - 296)) | (1L << (RECOMPILE - 296)) | (1L << (RELATIVE - 296)) | (1L << (REMOTE - 296)) | (1L << (REPEATABLE - 296)) | (1L << (ROOT - 296)) | (1L << (ROW - 296)) | (1L << (ROWGUID - 296)) | (1L << (ROWS - 296)) | (1L << (ROW_NUMBER - 296)) | (1L << (SAMPLE - 296)) | (1L << (SCHEMABINDING - 296)) | (1L << (SCROLL - 296)) | (1L << (SCROLL_LOCKS - 296)) | (1L << (SELF - 296)) | (1L << (SERIALIZABLE - 296)) | (1L << (SNAPSHOT - 296)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 296)) | (1L << (STATIC - 296)) | (1L << (STATS_STREAM - 296)) | (1L << (STDEV - 296)) | (1L << (STDEVP - 296)) | (1L << (SUM - 296)) | (1L << (THROW - 296)) | (1L << (TIES - 296)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (TIME - 360)) | (1L << (TRY - 360)) | (1L << (TYPE - 360)) | (1L << (TYPE_WARNING - 360)) | (1L << (UNBOUNDED - 360)) | (1L << (UNCOMMITTED - 360)) | (1L << (UNKNOWN - 360)) | (1L << (USING - 360)) | (1L << (VAR - 360)) | (1L << (VARP - 360)) | (1L << (VIEW_METADATA - 360)) | (1L << (WORK - 360)) | (1L << (XML - 360)) | (1L << (XMLNAMESPACES - 360)) | (1L << (DOUBLE_QUOTE_ID - 360)) | (1L << (SQUARE_BRACKET_ID - 360)) | (1L << (ID - 360)) | (1L << (LR_BRACKET - 360)))) != 0)) {
					{
					{
					setState(425); sql_clause();
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(431); match(END);
				setState(432); match(TRY);
				setState(434);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(433); match(SEMI);
					}
				}

				setState(436); match(BEGIN);
				setState(437); match(CATCH);
				setState(439);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(438); match(SEMI);
					}
				}

				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CALL) | (1L << CLOSE) | (1L << COMMENT) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECLARE - 64)) | (1L << (DELETE - 64)) | (1L << (DROP - 64)) | (1L << (EXCEPTION - 64)) | (1L << (EXEC - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FORCESEEK - 64)) | (1L << (GOTO - 64)) | (1L << (GRANT - 64)) | (1L << (IF - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (OPEN - 156)) | (1L << (PRINT - 156)) | (1L << (RAISERROR - 156)) | (1L << (RETURN - 156)) | (1L << (REVERT - 156)) | (1L << (ROLLBACK - 156)) | (1L << (SAVE - 156)) | (1L << (SELECT - 156)) | (1L << (SET - 156)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (TRUNCATE - 232)) | (1L << (UPDATE - 232)) | (1L << (USE - 232)) | (1L << (WAITFOR - 232)) | (1L << (WHILE - 232)) | (1L << (WITH - 232)) | (1L << (ABSOLUTE - 232)) | (1L << (APPLY - 232)) | (1L << (AUTO - 232)) | (1L << (AVG - 232)) | (1L << (BASE64 - 232)) | (1L << (CALLER - 232)) | (1L << (CAST - 232)) | (1L << (CATCH - 232)) | (1L << (CHECKSUM_AGG - 232)) | (1L << (COMMITTED - 232)) | (1L << (CONCAT - 232)) | (1L << (COOKIE - 232)) | (1L << (COUNT - 232)) | (1L << (COUNT_BIG - 232)) | (1L << (DELAY - 232)) | (1L << (DELETED - 232)) | (1L << (DENSE_RANK - 232)) | (1L << (DISABLE - 232)) | (1L << (DYNAMIC - 232)) | (1L << (ENCRYPTION - 232)) | (1L << (FAST - 232)) | (1L << (FAST_FORWARD - 232)) | (1L << (FIRST - 232)) | (1L << (FOLLOWING - 232)) | (1L << (FORWARD_ONLY - 232)) | (1L << (FULLSCAN - 232)) | (1L << (GLOBAL - 232)) | (1L << (GO - 232)) | (1L << (GROUPING - 232)) | (1L << (GROUPING_ID - 232)))) != 0) || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (HASH - 296)) | (1L << (INSENSITIVE - 296)) | (1L << (INSERTED - 296)) | (1L << (ISOLATION - 296)) | (1L << (KEEPFIXED - 296)) | (1L << (KEYSET - 296)) | (1L << (LAST - 296)) | (1L << (LEVEL - 296)) | (1L << (LOCAL - 296)) | (1L << (LOCK_ESCALATION - 296)) | (1L << (LOGIN - 296)) | (1L << (LOOP - 296)) | (1L << (MARK - 296)) | (1L << (MAX - 296)) | (1L << (MIN - 296)) | (1L << (MODIFY - 296)) | (1L << (NEXT - 296)) | (1L << (NAME - 296)) | (1L << (NOCOUNT - 296)) | (1L << (NOEXPAND - 296)) | (1L << (NORECOMPUTE - 296)) | (1L << (NTILE - 296)) | (1L << (NUMBER - 296)) | (1L << (OFFSET - 296)) | (1L << (ONLY - 296)) | (1L << (OPTIMISTIC - 296)) | (1L << (OPTIMIZE - 296)) | (1L << (OUT - 296)) | (1L << (OUTPUT - 296)) | (1L << (OWNER - 296)) | (1L << (PARTITION - 296)) | (1L << (PATH - 296)) | (1L << (PRECEDING - 296)) | (1L << (PRIOR - 296)) | (1L << (RANGE - 296)) | (1L << (RANK - 296)) | (1L << (READONLY - 296)) | (1L << (READ_ONLY - 296)) | (1L << (RECOMPILE - 296)) | (1L << (RELATIVE - 296)) | (1L << (REMOTE - 296)) | (1L << (REPEATABLE - 296)) | (1L << (ROOT - 296)) | (1L << (ROW - 296)) | (1L << (ROWGUID - 296)) | (1L << (ROWS - 296)) | (1L << (ROW_NUMBER - 296)) | (1L << (SAMPLE - 296)) | (1L << (SCHEMABINDING - 296)) | (1L << (SCROLL - 296)) | (1L << (SCROLL_LOCKS - 296)) | (1L << (SELF - 296)) | (1L << (SERIALIZABLE - 296)) | (1L << (SNAPSHOT - 296)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 296)) | (1L << (STATIC - 296)) | (1L << (STATS_STREAM - 296)) | (1L << (STDEV - 296)) | (1L << (STDEVP - 296)) | (1L << (SUM - 296)) | (1L << (THROW - 296)) | (1L << (TIES - 296)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (TIME - 360)) | (1L << (TRY - 360)) | (1L << (TYPE - 360)) | (1L << (TYPE_WARNING - 360)) | (1L << (UNBOUNDED - 360)) | (1L << (UNCOMMITTED - 360)) | (1L << (UNKNOWN - 360)) | (1L << (USING - 360)) | (1L << (VAR - 360)) | (1L << (VARP - 360)) | (1L << (VIEW_METADATA - 360)) | (1L << (WORK - 360)) | (1L << (XML - 360)) | (1L << (XMLNAMESPACES - 360)) | (1L << (DOUBLE_QUOTE_ID - 360)) | (1L << (SQUARE_BRACKET_ID - 360)) | (1L << (ID - 360)) | (1L << (LR_BRACKET - 360)))) != 0)) {
					{
					{
					setState(441); sql_clause();
					}
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(447); match(END);
				setState(448); match(CATCH);
				setState(450);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(449); match(SEMI);
					}
					break;
				}
				}
				break;

			case 11:
				_localctx = new Waitfor_statementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(452); match(WAITFOR);
				setState(453);
				_la = _input.LA(1);
				if ( !(_la==DELAY || _la==TIME) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(454); expression(0);
				setState(456);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(455); match(SEMI);
					}
					break;
				}
				}
				break;

			case 12:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(458); match(WHILE);
				setState(459); search_condition();
				setState(469);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(460); sql_clause();
					}
					break;

				case 2:
					{
					setState(461); match(BREAK);
					setState(463);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(462); match(SEMI);
						}
						break;
					}
					}
					break;

				case 3:
					{
					setState(465); match(CONTINUE);
					setState(467);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(466); match(SEMI);
						}
						break;
					}
					}
					break;
				}
				}
				break;

			case 13:
				_localctx = new Loop_statementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(471); match(WHILE);
				setState(472); search_condition();
				setState(473); match(LOOP);
				setState(488);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CALL) | (1L << CLOSE) | (1L << COMMENT) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECLARE - 64)) | (1L << (DELETE - 64)) | (1L << (DROP - 64)) | (1L << (EXCEPTION - 64)) | (1L << (EXEC - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FORCESEEK - 64)) | (1L << (GOTO - 64)) | (1L << (GRANT - 64)) | (1L << (IF - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (OPEN - 156)) | (1L << (PRINT - 156)) | (1L << (RAISERROR - 156)) | (1L << (RETURN - 156)) | (1L << (REVERT - 156)) | (1L << (ROLLBACK - 156)) | (1L << (SAVE - 156)) | (1L << (SELECT - 156)) | (1L << (SET - 156)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (TRUNCATE - 232)) | (1L << (UPDATE - 232)) | (1L << (USE - 232)) | (1L << (WAITFOR - 232)) | (1L << (WHILE - 232)) | (1L << (WITH - 232)) | (1L << (ABSOLUTE - 232)) | (1L << (APPLY - 232)) | (1L << (AUTO - 232)) | (1L << (AVG - 232)) | (1L << (BASE64 - 232)) | (1L << (CALLER - 232)) | (1L << (CAST - 232)) | (1L << (CATCH - 232)) | (1L << (CHECKSUM_AGG - 232)) | (1L << (COMMITTED - 232)) | (1L << (CONCAT - 232)) | (1L << (COOKIE - 232)) | (1L << (COUNT - 232)) | (1L << (COUNT_BIG - 232)) | (1L << (DELAY - 232)) | (1L << (DELETED - 232)) | (1L << (DENSE_RANK - 232)) | (1L << (DISABLE - 232)) | (1L << (DYNAMIC - 232)) | (1L << (ENCRYPTION - 232)) | (1L << (FAST - 232)) | (1L << (FAST_FORWARD - 232)) | (1L << (FIRST - 232)) | (1L << (FOLLOWING - 232)) | (1L << (FORWARD_ONLY - 232)) | (1L << (FULLSCAN - 232)) | (1L << (GLOBAL - 232)) | (1L << (GO - 232)) | (1L << (GROUPING - 232)) | (1L << (GROUPING_ID - 232)))) != 0) || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (HASH - 296)) | (1L << (INSENSITIVE - 296)) | (1L << (INSERTED - 296)) | (1L << (ISOLATION - 296)) | (1L << (KEEPFIXED - 296)) | (1L << (KEYSET - 296)) | (1L << (LAST - 296)) | (1L << (LEVEL - 296)) | (1L << (LOCAL - 296)) | (1L << (LOCK_ESCALATION - 296)) | (1L << (LOGIN - 296)) | (1L << (LOOP - 296)) | (1L << (MARK - 296)) | (1L << (MAX - 296)) | (1L << (MIN - 296)) | (1L << (MODIFY - 296)) | (1L << (NEXT - 296)) | (1L << (NAME - 296)) | (1L << (NOCOUNT - 296)) | (1L << (NOEXPAND - 296)) | (1L << (NORECOMPUTE - 296)) | (1L << (NTILE - 296)) | (1L << (NUMBER - 296)) | (1L << (OFFSET - 296)) | (1L << (ONLY - 296)) | (1L << (OPTIMISTIC - 296)) | (1L << (OPTIMIZE - 296)) | (1L << (OUT - 296)) | (1L << (OUTPUT - 296)) | (1L << (OWNER - 296)) | (1L << (PARTITION - 296)) | (1L << (PATH - 296)) | (1L << (PRECEDING - 296)) | (1L << (PRIOR - 296)) | (1L << (RANGE - 296)) | (1L << (RANK - 296)) | (1L << (READONLY - 296)) | (1L << (READ_ONLY - 296)) | (1L << (RECOMPILE - 296)) | (1L << (RELATIVE - 296)) | (1L << (REMOTE - 296)) | (1L << (REPEATABLE - 296)) | (1L << (ROOT - 296)) | (1L << (ROW - 296)) | (1L << (ROWGUID - 296)) | (1L << (ROWS - 296)) | (1L << (ROW_NUMBER - 296)) | (1L << (SAMPLE - 296)) | (1L << (SCHEMABINDING - 296)) | (1L << (SCROLL - 296)) | (1L << (SCROLL_LOCKS - 296)) | (1L << (SELF - 296)) | (1L << (SERIALIZABLE - 296)) | (1L << (SNAPSHOT - 296)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 296)) | (1L << (STATIC - 296)) | (1L << (STATS_STREAM - 296)) | (1L << (STDEV - 296)) | (1L << (STDEVP - 296)) | (1L << (SUM - 296)) | (1L << (THROW - 296)) | (1L << (TIES - 296)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (TIME - 360)) | (1L << (TRY - 360)) | (1L << (TYPE - 360)) | (1L << (TYPE_WARNING - 360)) | (1L << (UNBOUNDED - 360)) | (1L << (UNCOMMITTED - 360)) | (1L << (UNKNOWN - 360)) | (1L << (USING - 360)) | (1L << (VAR - 360)) | (1L << (VARP - 360)) | (1L << (VIEW_METADATA - 360)) | (1L << (WORK - 360)) | (1L << (XML - 360)) | (1L << (XMLNAMESPACES - 360)) | (1L << (DOUBLE_QUOTE_ID - 360)) | (1L << (SQUARE_BRACKET_ID - 360)) | (1L << (ID - 360)) | (1L << (LR_BRACKET - 360)))) != 0)) {
						{
						{
						setState(474); sql_clause();
						}
						}
						setState(479);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;

				case 2:
					{
					setState(480); match(BREAK);
					setState(482);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(481); match(SEMI);
						}
					}

					}
					break;

				case 3:
					{
					setState(484); match(CONTINUE);
					setState(486);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(485); match(SEMI);
						}
					}

					}
					break;
				}
				setState(490); match(END);
				setState(491); match(LOOP);
				setState(493);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(492); match(SEMI);
					}
					break;
				}
				}
				break;

			case 14:
				_localctx = new Print_statementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(495); match(PRINT);
				setState(496); expression(0);
				setState(498);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(497); match(SEMI);
					}
					break;
				}
				}
				break;

			case 15:
				_localctx = new Raiseerror_statementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(500); match(RAISERROR);
				setState(501); match(LR_BRACKET);
				setState(502);
				((Raiseerror_statementContext)_localctx).msg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 382)) & ~0x3f) == 0 && ((1L << (_la - 382)) & ((1L << (LOCAL_ID - 382)) | (1L << (DECIMAL - 382)) | (1L << (STRING - 382)))) != 0)) ) {
					((Raiseerror_statementContext)_localctx).msg = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(503); match(COMMA);
				setState(506);
				switch (_input.LA(1)) {
				case DECIMAL:
				case PLUS:
				case MINUS:
					{
					setState(504); number();
					}
					break;
				case LOCAL_ID:
					{
					setState(505); match(LOCAL_ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(508); match(COMMA);
				setState(511);
				switch (_input.LA(1)) {
				case DECIMAL:
				case PLUS:
				case MINUS:
					{
					setState(509); number();
					}
					break;
				case LOCAL_ID:
					{
					setState(510); match(LOCAL_ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(513); match(COMMA);
					setState(516);
					switch (_input.LA(1)) {
					case DECIMAL:
					case STRING:
					case BINARY:
					case FLOAT:
					case REAL:
					case DOLLAR:
					case PLUS:
					case MINUS:
						{
						setState(514); constant();
						}
						break;
					case LOCAL_ID:
						{
						setState(515); match(LOCAL_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(523); match(RR_BRACKET);
				setState(525);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(524); match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Another_statementContext extends ParserRuleContext {
		public Go_statementContext go_statement() {
			return getRuleContext(Go_statementContext.class,0);
		}
		public Cursor_statementContext cursor_statement() {
			return getRuleContext(Cursor_statementContext.class,0);
		}
		public Set_statementContext set_statement() {
			return getRuleContext(Set_statementContext.class,0);
		}
		public Comment_on_statementContext comment_on_statement() {
			return getRuleContext(Comment_on_statementContext.class,0);
		}
		public Call_statementContext call_statement() {
			return getRuleContext(Call_statementContext.class,0);
		}
		public Security_statementContext security_statement() {
			return getRuleContext(Security_statementContext.class,0);
		}
		public Execute_statementContext execute_statement() {
			return getRuleContext(Execute_statementContext.class,0);
		}
		public Grant_statementContext grant_statement() {
			return getRuleContext(Grant_statementContext.class,0);
		}
		public Declare_statementContext declare_statement() {
			return getRuleContext(Declare_statementContext.class,0);
		}
		public Use_statementContext use_statement() {
			return getRuleContext(Use_statementContext.class,0);
		}
		public Declare_local_temporary_tableContext declare_local_temporary_table() {
			return getRuleContext(Declare_local_temporary_tableContext.class,0);
		}
		public Transaction_statementContext transaction_statement() {
			return getRuleContext(Transaction_statementContext.class,0);
		}
		public Another_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_another_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitAnother_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Another_statementContext another_statement() throws RecognitionException {
		Another_statementContext _localctx = new Another_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_another_statement);
		try {
			setState(541);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529); declare_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530); declare_local_temporary_table();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531); cursor_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(532); execute_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(533); security_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(534); set_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(535); transaction_statement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(536); go_statement();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(537); use_statement();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(538); call_statement();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(539); grant_statement();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(540); comment_on_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementContext extends ParserRuleContext {
		public Token table_var;
		public Token cursor_var;
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public TerminalNode TOP() { return getToken(tsqlParser.TOP, 0); }
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public TerminalNode FROM(int i) {
			return getToken(tsqlParser.FROM, i);
		}
		public TerminalNode WHERE() { return getToken(tsqlParser.WHERE, 0); }
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public TerminalNode OF() { return getToken(tsqlParser.OF, 0); }
		public TerminalNode DELETE() { return getToken(tsqlParser.DELETE, 0); }
		public List<TerminalNode> FROM() { return getTokens(tsqlParser.FROM); }
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDelete_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delete_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(543); with_expression();
				}
			}

			setState(546); match(DELETE);
			setState(554);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(547); match(TOP);
				setState(548); match(LR_BRACKET);
				setState(549); expression(0);
				setState(550); match(RR_BRACKET);
				setState(552);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(551); match(PERCENT);
					}
				}

				}
			}

			setState(557);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(556); match(FROM);
				}
			}

			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(559); table_alias();
				}
				break;

			case 2:
				{
				setState(560); ddl_object();
				}
				break;

			case 3:
				{
				setState(561); rowset_function_limited();
				}
				break;

			case 4:
				{
				setState(562); ((Delete_statementContext)_localctx).table_var = match(LOCAL_ID);
				}
				break;
			}
			setState(566);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(565); with_table_hints();
				}
				break;
			}
			setState(569);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(568); output_clause();
				}
				break;
			}
			setState(580);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(571); match(FROM);
				setState(572); table_source();
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(573); match(COMMA);
						setState(574); table_source();
						}
						} 
					}
					setState(579);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			}
			setState(595);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(582); match(WHERE);
				setState(593);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(583); search_condition();
					}
					break;

				case 2:
					{
					setState(584); match(CURRENT);
					setState(585); match(OF);
					setState(591);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(587);
						switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
						case 1:
							{
							setState(586); match(GLOBAL);
							}
							break;
						}
						setState(589); cursor_name();
						}
						break;

					case 2:
						{
						setState(590); ((Delete_statementContext)_localctx).cursor_var = match(LOCAL_ID);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			}
			setState(598);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(597); for_clause();
				}
				break;
			}
			setState(601);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(600); option_clause();
				}
				break;
			}
			setState(604);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(603); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public TerminalNode INSERT() { return getToken(tsqlParser.INSERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TOP() { return getToken(tsqlParser.TOP, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public Dml_table_sourceContext dml_table_source() {
			return getRuleContext(Dml_table_sourceContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Execute_statementContext execute_statement() {
			return getRuleContext(Execute_statementContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(tsqlParser.VALUES, 0); }
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_insert_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(606); with_expression();
				}
			}

			setState(609); match(INSERT);
			setState(617);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(610); match(TOP);
				setState(611); match(LR_BRACKET);
				setState(612); expression(0);
				setState(613); match(RR_BRACKET);
				setState(615);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(614); match(PERCENT);
					}
				}

				}
			}

			setState(620);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(619); match(INTO);
				}
			}

			setState(624);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case ID:
				{
				setState(622); ddl_object();
				}
				break;
			case OPENDATASOURCE:
			case OPENQUERY:
				{
				setState(623); rowset_function_limited();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(627);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(626); with_table_hints();
				}
				break;
			}
			setState(633);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(629); match(LR_BRACKET);
				setState(630); column_name_list();
				setState(631); match(RR_BRACKET);
				}
				break;
			}
			setState(636);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(635); output_clause();
				}
			}

			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(638); match(VALUES);
				setState(639); match(LR_BRACKET);
				setState(640); expression_list();
				setState(641); match(RR_BRACKET);
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(642); match(COMMA);
						setState(643); match(LR_BRACKET);
						setState(644); expression_list();
						setState(645); match(RR_BRACKET);
						}
						} 
					}
					setState(651);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				}
				break;

			case 2:
				{
				setState(652); derived_table();
				}
				break;

			case 3:
				{
				setState(653); execute_statement();
				}
				break;

			case 4:
				{
				setState(654); dml_table_source();
				}
				break;

			case 5:
				{
				setState(655); match(DEFAULT);
				setState(656); match(VALUES);
				}
				break;
			}
			setState(660);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(659); for_clause();
				}
				break;
			}
			setState(663);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(662); option_clause();
				}
				break;
			}
			setState(666);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(665); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(668); with_expression();
				}
			}

			setState(671); query_expression();
			setState(673);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(672); order_by_clause();
				}
				break;
			}
			setState(676);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(675); for_clause();
				}
				break;
			}
			setState(679);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(678); option_clause();
				}
				break;
			}
			setState(682);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(681); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementContext extends ParserRuleContext {
		public Token cursor_var;
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public List<Update_elemContext> update_elem() {
			return getRuleContexts(Update_elemContext.class);
		}
		public As_table_aliasContext as_table_alias() {
			return getRuleContext(As_table_aliasContext.class,0);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TOP() { return getToken(tsqlParser.TOP, 0); }
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Search_condition_listContext search_condition_list() {
			return getRuleContext(Search_condition_listContext.class,0);
		}
		public TerminalNode OF() { return getToken(tsqlParser.OF, 0); }
		public TerminalNode UPDATE() { return getToken(tsqlParser.UPDATE, 0); }
		public TerminalNode FROM() { return getToken(tsqlParser.FROM, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public Update_elemContext update_elem(int i) {
			return getRuleContext(Update_elemContext.class,i);
		}
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(tsqlParser.WHERE, 0); }
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitUpdate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_update_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(684); with_expression();
				}
			}

			setState(687); match(UPDATE);
			setState(695);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(688); match(TOP);
				setState(689); match(LR_BRACKET);
				setState(690); expression(0);
				setState(691); match(RR_BRACKET);
				setState(693);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(692); match(PERCENT);
					}
				}

				}
			}

			setState(699);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case ID:
				{
				setState(697); ddl_object();
				}
				break;
			case OPENDATASOURCE:
			case OPENQUERY:
				{
				setState(698); rowset_function_limited();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(702);
			_la = _input.LA(1);
			if (_la==AS || _la==FORCESEEK || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (DOUBLE_QUOTE_ID - 324)) | (1L << (SQUARE_BRACKET_ID - 324)) | (1L << (ID - 324)))) != 0)) {
				{
				setState(701); as_table_alias();
				}
			}

			setState(705);
			_la = _input.LA(1);
			if (_la==WITH || _la==LR_BRACKET) {
				{
				setState(704); with_table_hints();
				}
			}

			setState(707); match(SET);
			setState(708); update_elem();
			setState(713);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(709); match(COMMA);
					setState(710); update_elem();
					}
					} 
				}
				setState(715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(717);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(716); output_clause();
				}
				break;
			}
			setState(728);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(719); match(FROM);
				setState(720); table_source();
				setState(725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(721); match(COMMA);
						setState(722); table_source();
						}
						} 
					}
					setState(727);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				break;
			}
			setState(743);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(730); match(WHERE);
				setState(741);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(731); search_condition_list();
					}
					break;

				case 2:
					{
					setState(732); match(CURRENT);
					setState(733); match(OF);
					setState(739);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(735);
						switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
						case 1:
							{
							setState(734); match(GLOBAL);
							}
							break;
						}
						setState(737); cursor_name();
						}
						break;

					case 2:
						{
						setState(738); ((Update_statementContext)_localctx).cursor_var = match(LOCAL_ID);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			}
			setState(746);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(745); for_clause();
				}
				break;
			}
			setState(749);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(748); option_clause();
				}
				break;
			}
			setState(752);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(751); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_clauseContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public TerminalNode OUTPUT() { return getToken(tsqlParser.OUTPUT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Output_dml_list_elemContext> output_dml_list_elem() {
			return getRuleContexts(Output_dml_list_elemContext.class);
		}
		public Output_dml_list_elemContext output_dml_list_elem(int i) {
			return getRuleContext(Output_dml_list_elemContext.class,i);
		}
		public Output_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOutput_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_clauseContext output_clause() throws RecognitionException {
		Output_clauseContext _localctx = new Output_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_output_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(754); match(OUTPUT);
			setState(755); output_dml_list_elem();
			setState(760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(756); match(COMMA);
					setState(757); output_dml_list_elem();
					}
					} 
				}
				setState(762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(774);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(763); match(INTO);
				setState(766);
				switch (_input.LA(1)) {
				case LOCAL_ID:
					{
					setState(764); match(LOCAL_ID);
					}
					break;
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(765); table_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(772);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(768); match(LR_BRACKET);
					setState(769); column_name_list();
					setState(770); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_dml_list_elemContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Output_column_nameContext output_column_name() {
			return getRuleContext(Output_column_nameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Output_dml_list_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_dml_list_elem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOutput_dml_list_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_dml_list_elemContext output_dml_list_elem() throws RecognitionException {
		Output_dml_list_elemContext _localctx = new Output_dml_list_elemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output_dml_list_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(776); output_column_name();
				}
				break;

			case 2:
				{
				setState(777); expression(0);
				}
				break;
			}
			setState(784);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(781);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(780); match(AS);
					}
				}

				setState(783); column_alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_column_nameContext extends ParserRuleContext {
		public TerminalNode DOLLAR_ACTION() { return getToken(tsqlParser.DOLLAR_ACTION, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode INSERTED() { return getToken(tsqlParser.INSERTED, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DELETED() { return getToken(tsqlParser.DELETED, 0); }
		public Output_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOutput_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_column_nameContext output_column_name() throws RecognitionException {
		Output_column_nameContext _localctx = new Output_column_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_output_column_name);
		try {
			setState(797);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(786); match(DELETED);
					}
					break;

				case 2:
					{
					setState(787); match(INSERTED);
					}
					break;

				case 3:
					{
					setState(788); table_name();
					}
					break;
				}
				setState(791); match(DOT);
				setState(794);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(792); match(STAR);
					}
					break;
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(793); column_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DOLLAR_ACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(796); match(DOLLAR_ACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_indexContext extends ParserRuleContext {
		public IdContext name;
		public Table_name_with_hintContext tablenamewithhint;
		public Simple_idContext simplename;
		public Table_nameContext tablename;
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(tsqlParser.UNIQUE, 0); }
		public TerminalNode INDEX() { return getToken(tsqlParser.INDEX, 0); }
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public Create_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitCreate_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_indexContext create_index() throws RecognitionException {
		Create_indexContext _localctx = new Create_indexContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_index);
		int _la;
		try {
			setState(833);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799); match(CREATE);
				setState(801);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(800); match(UNIQUE);
					}
				}

				setState(804);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(803); clustered();
					}
				}

				setState(806); match(INDEX);
				setState(807); ((Create_indexContext)_localctx).name = id();
				setState(808); match(ON);
				setState(809); ((Create_indexContext)_localctx).tablenamewithhint = table_name_with_hint();
				setState(810); match(LR_BRACKET);
				setState(811); column_name_list();
				setState(812); match(RR_BRACKET);
				setState(814);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(813); match(SEMI);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(816); match(CREATE);
				setState(818);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(817); match(UNIQUE);
					}
				}

				setState(821);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(820); index_type();
					}
					break;
				}
				setState(823); match(INDEX);
				setState(824); ((Create_indexContext)_localctx).simplename = simple_id();
				setState(825); match(ON);
				setState(826); ((Create_indexContext)_localctx).tablename = table_name();
				setState(827); match(LR_BRACKET);
				setState(828); column_name_list();
				setState(829); match(RR_BRACKET);
				setState(831);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(830); match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_typeContext extends ParserRuleContext {
		public TerminalNode DTTM() { return getToken(tsqlParser.DTTM, 0); }
		public TerminalNode LF() { return getToken(tsqlParser.LF, 0); }
		public TerminalNode DATE() { return getToken(tsqlParser.DATE, 0); }
		public TerminalNode CMP() { return getToken(tsqlParser.CMP, 0); }
		public TerminalNode TIME() { return getToken(tsqlParser.TIME, 0); }
		public TerminalNode HNG() { return getToken(tsqlParser.HNG, 0); }
		public TerminalNode HG() { return getToken(tsqlParser.HG, 0); }
		public Index_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitIndex_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_typeContext index_type() throws RecognitionException {
		Index_typeContext _localctx = new Index_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_index_type);
		try {
			setState(843);
			switch (_input.LA(1)) {
			case CMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(835); match(CMP);
				}
				break;
			case HG:
				enterOuterAlt(_localctx, 2);
				{
				setState(836); match(HG);
				}
				break;
			case HNG:
				enterOuterAlt(_localctx, 3);
				{
				setState(837); match(HNG);
				}
				break;
			case LF:
				enterOuterAlt(_localctx, 4);
				{
				setState(838); match(LF);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(840); match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 7);
				{
				setState(841); match(TIME);
				}
				break;
			case DTTM:
				enterOuterAlt(_localctx, 8);
				{
				setState(842); match(DTTM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_procedureContext extends ParserRuleContext {
		public Procedure_nameContext procedurename;
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public TerminalNode INVOKER() { return getToken(tsqlParser.INVOKER, 0); }
		public TerminalNode DEFINER() { return getToken(tsqlParser.DEFINER, 0); }
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public Result_columnContext result_column() {
			return getRuleContext(Result_columnContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(tsqlParser.TEMPORARY, 0); }
		public TerminalNode OR() { return getToken(tsqlParser.OR, 0); }
		public TerminalNode PROCEDURE() { return getToken(tsqlParser.PROCEDURE, 0); }
		public TerminalNode NO() { return getToken(tsqlParser.NO, 0); }
		public List<Procedure_paramContext> procedure_param() {
			return getRuleContexts(Procedure_paramContext.class);
		}
		public TerminalNode SQL() { return getToken(tsqlParser.SQL, 0); }
		public TerminalNode RESULT() { return getToken(tsqlParser.RESULT, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode EXCEPTION() { return getToken(tsqlParser.EXCEPTION, 0); }
		public Procedure_paramContext procedure_param(int i) {
			return getRuleContext(Procedure_paramContext.class,i);
		}
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public TerminalNode SECURITY() { return getToken(tsqlParser.SECURITY, 0); }
		public TerminalNode REPLACE() { return getToken(tsqlParser.REPLACE, 0); }
		public TerminalNode RESUME() { return getToken(tsqlParser.RESUME, 0); }
		public Create_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitCreate_procedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedureContext create_procedure() throws RecognitionException {
		Create_procedureContext _localctx = new Create_procedureContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_procedure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(845); match(CREATE);
			setState(849);
			switch (_input.LA(1)) {
			case OR:
				{
				{
				setState(846); match(OR);
				setState(847); match(REPLACE);
				}
				}
				break;
			case TEMPORARY:
				{
				{
				setState(848); match(TEMPORARY);
				}
				}
				break;
			case PROCEDURE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(851); match(PROCEDURE);
			setState(852); ((Create_procedureContext)_localctx).procedurename = procedure_name();
			setState(867);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(854);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(853); match(LR_BRACKET);
					}
				}

				setState(856); procedure_param();
				setState(861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(857); match(COMMA);
						setState(858); procedure_param();
						}
						} 
					}
					setState(863);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				setState(865);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(864); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			}
			setState(874);
			switch (_input.LA(1)) {
			case RESULT:
				{
				setState(869); match(RESULT);
				setState(870); result_column();
				}
				break;
			case NO:
				{
				setState(871); match(NO);
				setState(872); match(RESULT);
				setState(873); match(SET);
				}
				break;
			case EOF:
			case ALTER:
			case AS:
			case BEGIN:
			case BREAK:
			case CALL:
			case CASE:
			case CLOSE:
			case COALESCE:
			case COMMENT:
			case COMMIT:
			case CONTINUE:
			case CONVERT:
			case CREATE:
			case CROSS:
			case CURRENT:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DEALLOCATE:
			case DECLARE:
			case DEFAULT:
			case DELETE:
			case DROP:
			case ELSE:
			case ELSEIF:
			case END:
			case ENDIF:
			case EXCEPT:
			case EXCEPTION:
			case EXEC:
			case EXECUTE:
			case FETCH:
			case FOR:
			case FORCESEEK:
			case FROM:
			case FULL:
			case GOTO:
			case GRANT:
			case GROUP:
			case HAVING:
			case IDENTITY:
			case IF:
			case INNER:
			case INSERT:
			case INTERSECT:
			case INTO:
			case JOIN:
			case LEFT:
			case MERGE:
			case NULL:
			case NULLIF:
			case ON:
			case OPEN:
			case OPTION:
			case ORDER:
			case OUTER:
			case PRINT:
			case RAISERROR:
			case REPLACE:
			case RESIGNAL:
			case RETURN:
			case REVERT:
			case RIGHT:
			case ROLLBACK:
			case SAVE:
			case SELECT:
			case SESSION_USER:
			case SET:
			case SQL:
			case SYSTEM_USER:
			case TRUNCATE:
			case UNION:
			case UPDATE:
			case USE:
			case WAITFOR:
			case WHERE:
			case WHILE:
			case WITH:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case BINARY_CHECKSUM:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATEADD:
			case DATEDIFF:
			case DATENAME:
			case DATEPART:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MIN_ACTIVE_ROWVERSION:
			case MOD:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case DECIMAL:
			case ID:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case LR_BRACKET:
			case RR_BRACKET:
			case COMMA:
			case SEMI:
			case PLUS:
			case MINUS:
			case BIT_NOT:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(879);
			_la = _input.LA(1);
			if (_la==SQL) {
				{
				setState(876); match(SQL);
				setState(877); match(SECURITY);
				setState(878);
				_la = _input.LA(1);
				if ( !(_la==DEFINER || _la==INVOKER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(884);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(881); match(ON);
				setState(882); match(EXCEPTION);
				setState(883); match(RESUME);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_paramContext extends ParserRuleContext {
		public Column_nameContext columnname;
		public Declare_typeContext declaretype;
		public TerminalNode IN() { return getToken(tsqlParser.IN, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode OUT() { return getToken(tsqlParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(tsqlParser.INOUT, 0); }
		public Declare_typeContext declare_type() {
			return getRuleContext(Declare_typeContext.class,0);
		}
		public Procedure_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitProcedure_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_paramContext procedure_param() throws RecognitionException {
		Procedure_paramContext _localctx = new Procedure_paramContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_procedure_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==INOUT || _la==OUT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(887); ((Procedure_paramContext)_localctx).columnname = column_name();
			setState(888); ((Procedure_paramContext)_localctx).declaretype = declare_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public Column_nameContext columnname;
		public Declare_typeContext declaretype;
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Declare_typeContext> declare_type() {
			return getRuleContexts(Declare_typeContext.class);
		}
		public Declare_typeContext declare_type(int i) {
			return getRuleContext(Declare_typeContext.class,i);
		}
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_result_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890); match(LR_BRACKET);
			setState(891); ((Result_columnContext)_localctx).columnname = column_name();
			setState(892); ((Result_columnContext)_localctx).declaretype = declare_type();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(893); match(COMMA);
				setState(894); ((Result_columnContext)_localctx).columnname = column_name();
				setState(895); ((Result_columnContext)_localctx).declaretype = declare_type();
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902); match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_statisticsContext extends ParserRuleContext {
		public Table_name_with_hintContext tablename;
		public On_offContext INCREMENTAL;
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STATS_STREAM() { return getToken(tsqlParser.STATS_STREAM, 0); }
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode FULLSCAN() { return getToken(tsqlParser.FULLSCAN, 0); }
		public TerminalNode NORECOMPUTE() { return getToken(tsqlParser.NORECOMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(tsqlParser.STATISTICS, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public TerminalNode SAMPLE() { return getToken(tsqlParser.SAMPLE, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public Create_statisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statistics; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitCreate_statistics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_statisticsContext create_statistics() throws RecognitionException {
		Create_statisticsContext _localctx = new Create_statisticsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_create_statistics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904); match(CREATE);
			setState(905); match(STATISTICS);
			setState(906); id();
			setState(907); match(ON);
			setState(908); ((Create_statisticsContext)_localctx).tablename = table_name_with_hint();
			setState(909); match(LR_BRACKET);
			setState(910); column_name_list();
			setState(911); match(RR_BRACKET);
			setState(928);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(912); match(WITH);
				setState(918);
				switch (_input.LA(1)) {
				case FULLSCAN:
					{
					setState(913); match(FULLSCAN);
					}
					break;
				case SAMPLE:
					{
					setState(914); match(SAMPLE);
					setState(915); match(DECIMAL);
					setState(916);
					_la = _input.LA(1);
					if ( !(_la==PERCENT || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case STATS_STREAM:
					{
					setState(917); match(STATS_STREAM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(922);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(920); match(COMMA);
					setState(921); match(NORECOMPUTE);
					}
					break;
				}
				setState(926);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(924); match(COMMA);
					setState(925); ((Create_statisticsContext)_localctx).INCREMENTAL = on_off();
					}
					break;
				}
				}
				break;
			}
			setState(931);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(930); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tableContext extends ParserRuleContext {
		public Table_nameContext tablename;
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public List<Column_def_table_constraintContext> column_def_table_constraint() {
			return getRuleContexts(Column_def_table_constraintContext.class);
		}
		public Column_def_table_constraintContext column_def_table_constraint(int i) {
			return getRuleContext(Column_def_table_constraintContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_create_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(933); match(CREATE);
			setState(934); match(TABLE);
			setState(935); ((Create_tableContext)_localctx).tablename = table_name();
			setState(936); match(LR_BRACKET);
			setState(937); column_def_table_constraint();
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(939);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(938); match(COMMA);
						}
					}

					setState(941); column_def_table_constraint();
					}
					} 
				}
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			setState(948);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(947); match(COMMA);
				}
			}

			setState(950); match(RR_BRACKET);
			setState(954);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(951); match(ON);
				setState(952); id();
				}
				break;

			case 2:
				{
				setState(953); match(DEFAULT);
				}
				break;
			}
			setState(957);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(956); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_viewContext extends ParserRuleContext {
		public View_nameContext viewname;
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode CHECK() { return getToken(tsqlParser.CHECK, 0); }
		public TerminalNode VIEW() { return getToken(tsqlParser.VIEW, 0); }
		public TerminalNode CREATE() { return getToken(tsqlParser.CREATE, 0); }
		public List<View_attributeContext> view_attribute() {
			return getRuleContexts(View_attributeContext.class);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(tsqlParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(tsqlParser.WITH, i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public View_attributeContext view_attribute(int i) {
			return getRuleContext(View_attributeContext.class,i);
		}
		public TerminalNode OPTION() { return getToken(tsqlParser.OPTION, 0); }
		public Create_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitCreate_view(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_viewContext create_view() throws RecognitionException {
		Create_viewContext _localctx = new Create_viewContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_create_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959); match(CREATE);
			setState(960); match(VIEW);
			setState(961); ((Create_viewContext)_localctx).viewname = view_name();
			setState(973);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(962); match(LR_BRACKET);
				setState(963); column_name();
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(964); match(COMMA);
					setState(965); column_name();
					}
					}
					setState(970);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(971); match(RR_BRACKET);
				}
			}

			setState(984);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(975); match(WITH);
				setState(976); view_attribute();
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(977); match(COMMA);
					setState(978); view_attribute();
					}
					}
					setState(983);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(986); match(AS);
			setState(987); select_statement();
			setState(991);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(988); match(WITH);
				setState(989); match(CHECK);
				setState(990); match(OPTION);
				}
				break;
			}
			setState(994);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(993); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_attributeContext extends ParserRuleContext {
		public TerminalNode ENCRYPTION() { return getToken(tsqlParser.ENCRYPTION, 0); }
		public TerminalNode SCHEMABINDING() { return getToken(tsqlParser.SCHEMABINDING, 0); }
		public TerminalNode VIEW_METADATA() { return getToken(tsqlParser.VIEW_METADATA, 0); }
		public View_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitView_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_attributeContext view_attribute() throws RecognitionException {
		View_attributeContext _localctx = new View_attributeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_view_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_la = _input.LA(1);
			if ( !(_la==ENCRYPTION || _la==SCHEMABINDING || _la==VIEW_METADATA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_tableContext extends ParserRuleContext {
		public Table_nameContext tablename;
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public TerminalNode TABLE(int i) {
			return getToken(tsqlParser.TABLE, i);
		}
		public TerminalNode ALTER() { return getToken(tsqlParser.ALTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(tsqlParser.TABLE); }
		public TerminalNode LOCK_ESCALATION() { return getToken(tsqlParser.LOCK_ESCALATION, 0); }
		public TerminalNode DISABLE() { return getToken(tsqlParser.DISABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Add_listContext add_list() {
			return getRuleContext(Add_listContext.class,0);
		}
		public TerminalNode AUTO() { return getToken(tsqlParser.AUTO, 0); }
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitAlter_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alter_table);
		int _la;
		try {
			setState(1017);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998); match(ALTER);
				setState(999); match(TABLE);
				setState(1000); ((Alter_tableContext)_localctx).tablename = table_name();
				setState(1001); match(SET);
				setState(1002); match(LR_BRACKET);
				setState(1003); match(LOCK_ESCALATION);
				setState(1004); match(EQUAL);
				setState(1005);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==AUTO || _la==DISABLE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1006); match(RR_BRACKET);
				setState(1008);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1007); match(SEMI);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1010); match(ALTER);
				setState(1011); match(TABLE);
				setState(1012); ((Alter_tableContext)_localctx).tablename = table_name();
				setState(1013); add_list();
				setState(1015);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1014); match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_listContext extends ParserRuleContext {
		public List<Column_def_table_constraintContext> column_def_table_constraint() {
			return getRuleContexts(Column_def_table_constraintContext.class);
		}
		public TerminalNode ADD(int i) {
			return getToken(tsqlParser.ADD, i);
		}
		public Column_def_table_constraintContext column_def_table_constraint(int i) {
			return getRuleContext(Column_def_table_constraintContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(tsqlParser.ADD); }
		public Add_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitAdd_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_listContext add_list() throws RecognitionException {
		Add_listContext _localctx = new Add_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_add_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1019); match(ADD);
			setState(1020); column_def_table_constraint();
			setState(1026);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1021); match(COMMA);
					setState(1022); match(ADD);
					setState(1023); column_def_table_constraint();
					}
					} 
				}
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_databaseContext extends ParserRuleContext {
		public IdContext database;
		public IdContext new_name;
		public IdContext collation;
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode DATABASE() { return getToken(tsqlParser.DATABASE, 0); }
		public TerminalNode COLLATE() { return getToken(tsqlParser.COLLATE, 0); }
		public TerminalNode ALTER() { return getToken(tsqlParser.ALTER, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Database_optionContext database_option() {
			return getRuleContext(Database_optionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(tsqlParser.NAME, 0); }
		public TerminalNode MODIFY() { return getToken(tsqlParser.MODIFY, 0); }
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public Alter_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitAlter_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_databaseContext alter_database() throws RecognitionException {
		Alter_databaseContext _localctx = new Alter_databaseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alter_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029); match(ALTER);
			setState(1030); match(DATABASE);
			setState(1033);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				{
				setState(1031); ((Alter_databaseContext)_localctx).database = id();
				}
				break;
			case CURRENT:
				{
				setState(1032); match(CURRENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1043);
			switch (_input.LA(1)) {
			case MODIFY:
				{
				setState(1035); match(MODIFY);
				setState(1036); match(NAME);
				setState(1037); match(EQUAL);
				setState(1038); ((Alter_databaseContext)_localctx).new_name = id();
				}
				break;
			case COLLATE:
				{
				setState(1039); match(COLLATE);
				setState(1040); ((Alter_databaseContext)_localctx).collation = id();
				}
				break;
			case SET:
				{
				setState(1041); match(SET);
				setState(1042); database_option();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1046);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1045); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_optionContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode FULL() { return getToken(tsqlParser.FULL, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDatabase_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_optionContext database_option() throws RecognitionException {
		Database_optionContext _localctx = new Database_optionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_database_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048); id();
			setState(1051);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1049); id();
				}
				break;

			case 2:
				{
				setState(1050); match(FULL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_indexContext extends ParserRuleContext {
		public IdContext indexname;
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(tsqlParser.INDEX, 0); }
		public Drop_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDrop_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_indexContext drop_index() throws RecognitionException {
		Drop_indexContext _localctx = new Drop_indexContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_drop_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053); match(DROP);
			setState(1054); match(INDEX);
			setState(1057);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1055); match(IF);
				setState(1056); match(EXISTS);
				}
			}

			setState(1059); ((Drop_indexContext)_localctx).indexname = id();
			setState(1061);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1060); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_procedureContext extends ParserRuleContext {
		public Func_proc_nameContext procedurename;
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(tsqlParser.PROCEDURE, 0); }
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public Drop_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_procedure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDrop_procedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_procedureContext drop_procedure() throws RecognitionException {
		Drop_procedureContext _localctx = new Drop_procedureContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_drop_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063); match(DROP);
			setState(1064); match(PROCEDURE);
			setState(1067);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1065); match(IF);
				setState(1066); match(EXISTS);
				}
			}

			setState(1069); ((Drop_procedureContext)_localctx).procedurename = func_proc_name();
			setState(1071);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1070); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_statisticsContext extends ParserRuleContext {
		public IdContext statisticname;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public TerminalNode STATISTICS() { return getToken(tsqlParser.STATISTICS, 0); }
		public Drop_statisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statistics; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDrop_statistics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_statisticsContext drop_statistics() throws RecognitionException {
		Drop_statisticsContext _localctx = new Drop_statisticsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_drop_statistics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073); match(DROP);
			setState(1074); match(STATISTICS);
			setState(1078);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1075); table_name();
				setState(1076); match(DOT);
				}
				break;
			}
			setState(1080); ((Drop_statisticsContext)_localctx).statisticname = id();
			setState(1081); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_tableContext extends ParserRuleContext {
		public Table_nameContext tablename;
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDrop_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_drop_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083); match(DROP);
			setState(1084); match(TABLE);
			setState(1087);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1085); match(IF);
				setState(1086); match(EXISTS);
				}
			}

			setState(1089); ((Drop_tableContext)_localctx).tablename = table_name();
			setState(1091);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1090); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_viewContext extends ParserRuleContext {
		public View_nameContext viewname;
		public TerminalNode IF() { return getToken(tsqlParser.IF, 0); }
		public TerminalNode VIEW() { return getToken(tsqlParser.VIEW, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public View_nameContext view_name(int i) {
			return getRuleContext(View_nameContext.class,i);
		}
		public List<View_nameContext> view_name() {
			return getRuleContexts(View_nameContext.class);
		}
		public TerminalNode DROP() { return getToken(tsqlParser.DROP, 0); }
		public Drop_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDrop_view(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_viewContext drop_view() throws RecognitionException {
		Drop_viewContext _localctx = new Drop_viewContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_drop_view);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1093); match(DROP);
			setState(1094); match(VIEW);
			setState(1097);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1095); match(IF);
				setState(1096); match(EXISTS);
				}
			}

			setState(1099); ((Drop_viewContext)_localctx).viewname = view_name();
			setState(1104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1100); match(COMMA);
					setState(1101); ((Drop_viewContext)_localctx).viewname = view_name();
					}
					} 
				}
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			setState(1108);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1107); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truncate_statementContext extends ParserRuleContext {
		public Table_nameContext tablename;
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TRUNCATE() { return getToken(tsqlParser.TRUNCATE, 0); }
		public Truncate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTruncate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Truncate_statementContext truncate_statement() throws RecognitionException {
		Truncate_statementContext _localctx = new Truncate_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_truncate_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110); match(TRUNCATE);
			setState(1111); match(TABLE);
			setState(1112); ((Truncate_statementContext)_localctx).tablename = table_name();
			setState(1114);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1113); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rowset_function_limitedContext extends ParserRuleContext {
		public OpendatasourceContext opendatasource() {
			return getRuleContext(OpendatasourceContext.class,0);
		}
		public OpenqueryContext openquery() {
			return getRuleContext(OpenqueryContext.class,0);
		}
		public Rowset_function_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowset_function_limited; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitRowset_function_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rowset_function_limitedContext rowset_function_limited() throws RecognitionException {
		Rowset_function_limitedContext _localctx = new Rowset_function_limitedContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rowset_function_limited);
		try {
			setState(1118);
			switch (_input.LA(1)) {
			case OPENQUERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116); openquery();
				}
				break;
			case OPENDATASOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1117); opendatasource();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenqueryContext extends ParserRuleContext {
		public IdContext linked_server;
		public Token query;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode OPENQUERY() { return getToken(tsqlParser.OPENQUERY, 0); }
		public OpenqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOpenquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenqueryContext openquery() throws RecognitionException {
		OpenqueryContext _localctx = new OpenqueryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_openquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120); match(OPENQUERY);
			setState(1121); match(LR_BRACKET);
			setState(1122); ((OpenqueryContext)_localctx).linked_server = id();
			setState(1123); match(COMMA);
			setState(1124); ((OpenqueryContext)_localctx).query = match(STRING);
			setState(1125); match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpendatasourceContext extends ParserRuleContext {
		public Token provider;
		public Token init;
		public IdContext database;
		public IdContext scheme;
		public IdContext table;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode STRING(int i) {
			return getToken(tsqlParser.STRING, i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(tsqlParser.STRING); }
		public TerminalNode OPENDATASOURCE() { return getToken(tsqlParser.OPENDATASOURCE, 0); }
		public OpendatasourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opendatasource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOpendatasource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpendatasourceContext opendatasource() throws RecognitionException {
		OpendatasourceContext _localctx = new OpendatasourceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_opendatasource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127); match(OPENDATASOURCE);
			setState(1128); match(LR_BRACKET);
			setState(1129); ((OpendatasourceContext)_localctx).provider = match(STRING);
			setState(1130); match(COMMA);
			setState(1131); ((OpendatasourceContext)_localctx).init = match(STRING);
			setState(1132); match(RR_BRACKET);
			setState(1133); match(DOT);
			setState(1135);
			_la = _input.LA(1);
			if (_la==FORCESEEK || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (DOUBLE_QUOTE_ID - 324)) | (1L << (SQUARE_BRACKET_ID - 324)) | (1L << (ID - 324)))) != 0)) {
				{
				setState(1134); ((OpendatasourceContext)_localctx).database = id();
				}
			}

			setState(1137); match(DOT);
			setState(1139);
			_la = _input.LA(1);
			if (_la==FORCESEEK || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (DOUBLE_QUOTE_ID - 324)) | (1L << (SQUARE_BRACKET_ID - 324)) | (1L << (ID - 324)))) != 0)) {
				{
				setState(1138); ((OpendatasourceContext)_localctx).scheme = id();
				}
			}

			setState(1141); match(DOT);
			{
			setState(1142); ((OpendatasourceContext)_localctx).table = id();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_statementContext extends ParserRuleContext {
		public Simple_idContext name;
		public Declare_typeContext declaretype;
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public List<Declare_localContext> declare_local() {
			return getRuleContexts(Declare_localContext.class);
		}
		public TerminalNode DECLARE() { return getToken(tsqlParser.DECLARE, 0); }
		public Table_type_definitionContext table_type_definition() {
			return getRuleContext(Table_type_definitionContext.class,0);
		}
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public Declare_typeContext declare_type() {
			return getRuleContext(Declare_typeContext.class,0);
		}
		public Declare_localContext declare_local(int i) {
			return getRuleContext(Declare_localContext.class,i);
		}
		public Declare_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDeclare_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_statementContext declare_statement() throws RecognitionException {
		Declare_statementContext _localctx = new Declare_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declare_statement);
		int _la;
		try {
			int _alt;
			setState(1173);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144); match(DECLARE);
				setState(1145); declare_local();
				setState(1150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1146); match(COMMA);
						setState(1147); declare_local();
						}
						} 
					}
					setState(1152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1154);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1153); match(SEMI);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156); match(DECLARE);
				setState(1157); match(LOCAL_ID);
				setState(1159);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1158); match(AS);
					}
				}

				setState(1161); table_type_definition();
				setState(1163);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1162); match(SEMI);
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1165); match(DECLARE);
				setState(1166); ((Declare_statementContext)_localctx).name = simple_id();
				setState(1168);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1167); ((Declare_statementContext)_localctx).declaretype = declare_type();
					}
					break;
				}
				setState(1171);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1170); match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_local_temporary_tableContext extends ParserRuleContext {
		public Table_nameContext tablename;
		public List<Column_def_table_constraintContext> column_def_table_constraint() {
			return getRuleContexts(Column_def_table_constraintContext.class);
		}
		public TerminalNode DECLARE() { return getToken(tsqlParser.DECLARE, 0); }
		public TerminalNode TEMPORARY() { return getToken(tsqlParser.TEMPORARY, 0); }
		public TerminalNode PRESERVE() { return getToken(tsqlParser.PRESERVE, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public TerminalNode COMMIT() { return getToken(tsqlParser.COMMIT, 0); }
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public Column_def_table_constraintContext column_def_table_constraint(int i) {
			return getRuleContext(Column_def_table_constraintContext.class,i);
		}
		public TerminalNode DELETE() { return getToken(tsqlParser.DELETE, 0); }
		public TerminalNode LOCAL() { return getToken(tsqlParser.LOCAL, 0); }
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TRANSACTIONAL() { return getToken(tsqlParser.TRANSACTIONAL, 0); }
		public Declare_local_temporary_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_local_temporary_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDeclare_local_temporary_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_local_temporary_tableContext declare_local_temporary_table() throws RecognitionException {
		Declare_local_temporary_tableContext _localctx = new Declare_local_temporary_tableContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declare_local_temporary_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175); match(DECLARE);
			setState(1176); match(LOCAL);
			setState(1177); match(TEMPORARY);
			setState(1178); match(TABLE);
			setState(1179); ((Declare_local_temporary_tableContext)_localctx).tablename = table_name();
			setState(1180); match(LR_BRACKET);
			setState(1181); column_def_table_constraint();
			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1182); match(COMMA);
				setState(1183); column_def_table_constraint();
				}
				}
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1189); match(RR_BRACKET);
			setState(1194);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1190); match(ON);
				setState(1191); match(COMMIT);
				setState(1192);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1193); match(ROWS);
				}
				break;
			}
			setState(1198);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1196); match(NOT);
				setState(1197); match(TRANSACTIONAL);
				}
			}

			setState(1201);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1200); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_statementContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode OPEN() { return getToken(tsqlParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(tsqlParser.CLOSE, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public Fetch_cursorContext fetch_cursor() {
			return getRuleContext(Fetch_cursorContext.class,0);
		}
		public Declare_cursorContext declare_cursor() {
			return getRuleContext(Declare_cursorContext.class,0);
		}
		public TerminalNode DEALLOCATE() { return getToken(tsqlParser.DEALLOCATE, 0); }
		public Cursor_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitCursor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_statementContext cursor_statement() throws RecognitionException {
		Cursor_statementContext _localctx = new Cursor_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cursor_statement);
		try {
			setState(1229);
			switch (_input.LA(1)) {
			case CLOSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203); match(CLOSE);
				setState(1205);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1204); match(GLOBAL);
					}
					break;
				}
				setState(1207); cursor_name();
				setState(1209);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1208); match(SEMI);
					}
					break;
				}
				}
				break;
			case DEALLOCATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1211); match(DEALLOCATE);
				setState(1213);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1212); match(GLOBAL);
					}
					break;
				}
				setState(1215); cursor_name();
				setState(1217);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1216); match(SEMI);
					}
					break;
				}
				}
				break;
			case DECLARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1219); declare_cursor();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1220); fetch_cursor();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1221); match(OPEN);
				setState(1223);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1222); match(GLOBAL);
					}
					break;
				}
				setState(1225); cursor_name();
				setState(1227);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1226); match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_statementContext extends ParserRuleContext {
		public Token return_status;
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode EXEC() { return getToken(tsqlParser.EXEC, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public List<Execute_statement_argContext> execute_statement_arg() {
			return getRuleContexts(Execute_statement_argContext.class);
		}
		public TerminalNode EXECUTE() { return getToken(tsqlParser.EXECUTE, 0); }
		public Execute_var_stringContext execute_var_string(int i) {
			return getRuleContext(Execute_var_stringContext.class,i);
		}
		public Execute_statement_argContext execute_statement_arg(int i) {
			return getRuleContext(Execute_statement_argContext.class,i);
		}
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode USER() { return getToken(tsqlParser.USER, 0); }
		public TerminalNode LOGIN() { return getToken(tsqlParser.LOGIN, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode IMMEDIATE() { return getToken(tsqlParser.IMMEDIATE, 0); }
		public List<Execute_var_stringContext> execute_var_string() {
			return getRuleContexts(Execute_var_stringContext.class);
		}
		public Execute_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitExecute_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execute_statementContext execute_statement() throws RecognitionException {
		Execute_statementContext _localctx = new Execute_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_execute_statement);
		int _la;
		try {
			int _alt;
			setState(1278);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231);
				_la = _input.LA(1);
				if ( !(_la==EXEC || _la==EXECUTE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1233);
				_la = _input.LA(1);
				if (_la==IMMEDIATE) {
					{
					setState(1232); match(IMMEDIATE);
					}
				}

				setState(1237);
				_la = _input.LA(1);
				if (_la==LOCAL_ID) {
					{
					setState(1235); ((Execute_statementContext)_localctx).return_status = match(LOCAL_ID);
					setState(1236); match(EQUAL);
					}
				}

				setState(1239); func_proc_name();
				setState(1248);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1240); execute_statement_arg();
					setState(1245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(1241); match(COMMA);
							setState(1242); execute_statement_arg();
							}
							} 
						}
						setState(1247);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
					}
					}
					break;
				}
				setState(1251);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1250); match(SEMI);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				_la = _input.LA(1);
				if ( !(_la==EXEC || _la==EXECUTE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1255);
				_la = _input.LA(1);
				if (_la==IMMEDIATE) {
					{
					setState(1254); match(IMMEDIATE);
					}
				}

				setState(1257); match(LR_BRACKET);
				setState(1258); execute_var_string();
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(1259); match(PLUS);
					setState(1260); execute_var_string();
					}
					}
					setState(1265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1266); match(RR_BRACKET);
				setState(1273);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1268);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1267); match(AS);
						}
					}

					setState(1270);
					_la = _input.LA(1);
					if ( !(_la==USER || _la==LOGIN) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(1271); match(EQUAL);
					setState(1272); match(STRING);
					}
					break;
				}
				setState(1276);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1275); match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_statement_argContext extends ParserRuleContext {
		public Token parameter;
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public TerminalNode OUT() { return getToken(tsqlParser.OUT, 0); }
		public TerminalNode OUTPUT() { return getToken(tsqlParser.OUTPUT, 0); }
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Execute_statement_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_statement_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitExecute_statement_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execute_statement_argContext execute_statement_arg() throws RecognitionException {
		Execute_statement_argContext _localctx = new Execute_statement_argContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_execute_statement_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1280); ((Execute_statement_argContext)_localctx).parameter = match(LOCAL_ID);
				setState(1281); match(EQUAL);
				}
				break;
			}
			setState(1291);
			switch (_input.LA(1)) {
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				{
				setState(1284); constant();
				}
				break;
			case LOCAL_ID:
				{
				setState(1285); match(LOCAL_ID);
				setState(1287);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1286);
					_la = _input.LA(1);
					if ( !(_la==OUT || _la==OUTPUT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				}
				break;
			case DEFAULT:
				{
				setState(1289); match(DEFAULT);
				}
				break;
			case NULL:
				{
				setState(1290); match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_var_stringContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Execute_var_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_var_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitExecute_var_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execute_var_stringContext execute_var_string() throws RecognitionException {
		Execute_var_stringContext _localctx = new Execute_var_stringContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_execute_var_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			_la = _input.LA(1);
			if ( !(_la==LOCAL_ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Security_statementContext extends ParserRuleContext {
		public TerminalNode REVERT() { return getToken(tsqlParser.REVERT, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Execute_clauseContext execute_clause() {
			return getRuleContext(Execute_clauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode COOKIE() { return getToken(tsqlParser.COOKIE, 0); }
		public Security_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_security_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSecurity_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Security_statementContext security_statement() throws RecognitionException {
		Security_statementContext _localctx = new Security_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_security_statement);
		try {
			setState(1311);
			switch (_input.LA(1)) {
			case EXEC:
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295); execute_clause();
				setState(1297);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1296); match(SEMI);
					}
					break;
				}
				}
				break;
			case REVERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299); match(REVERT);
				setState(1306);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1300); match(LR_BRACKET);
					setState(1301); match(WITH);
					setState(1302); match(COOKIE);
					setState(1303); match(EQUAL);
					setState(1304); match(LOCAL_ID);
					setState(1305); match(RR_BRACKET);
					}
					break;
				}
				setState(1309);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1308); match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_statementContext extends ParserRuleContext {
		public IdContext member_name;
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Declare_set_cursor_commonContext declare_set_cursor_common() {
			return getRuleContext(Declare_set_cursor_commonContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_specialContext set_special() {
			return getRuleContext(Set_specialContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(tsqlParser.CURSOR, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode READ() { return getToken(tsqlParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode OF() { return getToken(tsqlParser.OF, 0); }
		public TerminalNode UPDATE() { return getToken(tsqlParser.UPDATE, 0); }
		public Set_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSet_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_statementContext set_statement() throws RecognitionException {
		Set_statementContext _localctx = new Set_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_set_statement);
		int _la;
		try {
			setState(1359);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313); match(SET);
				setState(1314); match(LOCAL_ID);
				setState(1317);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1315); match(DOT);
					setState(1316); ((Set_statementContext)_localctx).member_name = id();
					}
				}

				setState(1319); match(EQUAL);
				setState(1320); expression(0);
				setState(1322);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1321); match(SEMI);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324); match(SET);
				setState(1325); match(LOCAL_ID);
				setState(1326); assignment_operator();
				setState(1327); expression(0);
				setState(1329);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1328); match(SEMI);
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1331); match(SET);
				setState(1332); match(LOCAL_ID);
				setState(1333); match(EQUAL);
				setState(1334); match(CURSOR);
				setState(1335); declare_set_cursor_common();
				setState(1346);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1336); match(FOR);
					setState(1344);
					switch (_input.LA(1)) {
					case READ:
						{
						setState(1337); match(READ);
						setState(1338); match(ONLY);
						}
						break;
					case UPDATE:
						{
						setState(1339); match(UPDATE);
						setState(1342);
						_la = _input.LA(1);
						if (_la==OF) {
							{
							setState(1340); match(OF);
							setState(1341); column_name_list();
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				setState(1349);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1348); match(SEMI);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1351); match(SET);
				setState(1352); match(ID);
				setState(1353); match(EQUAL);
				setState(1354); expression(0);
				setState(1356);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1355); match(SEMI);
					}
					break;
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1358); set_special();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_statementContext extends ParserRuleContext {
		public Token DELAYED_DURABILITY;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SAVE() { return getToken(tsqlParser.SAVE, 0); }
		public TerminalNode TRAN() { return getToken(tsqlParser.TRAN, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode TRANSACTION() { return getToken(tsqlParser.TRANSACTION, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(tsqlParser.DISTRIBUTED, 0); }
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode MARK() { return getToken(tsqlParser.MARK, 0); }
		public TerminalNode WORK() { return getToken(tsqlParser.WORK, 0); }
		public TerminalNode ROLLBACK() { return getToken(tsqlParser.ROLLBACK, 0); }
		public TerminalNode COMMIT() { return getToken(tsqlParser.COMMIT, 0); }
		public TerminalNode BEGIN() { return getToken(tsqlParser.BEGIN, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Transaction_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTransaction_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_statementContext transaction_statement() throws RecognitionException {
		Transaction_statementContext _localctx = new Transaction_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_transaction_statement);
		int _la;
		try {
			setState(1436);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1361); match(BEGIN);
				setState(1362); match(DISTRIBUTED);
				setState(1363);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1366);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1364); id();
					}
					break;

				case 2:
					{
					setState(1365); match(LOCAL_ID);
					}
					break;
				}
				setState(1369);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1368); match(SEMI);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1371); match(BEGIN);
				setState(1372);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1382);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1375);
					switch (_input.LA(1)) {
					case FORCESEEK:
					case ABSOLUTE:
					case APPLY:
					case AUTO:
					case AVG:
					case BASE64:
					case CALLER:
					case CAST:
					case CATCH:
					case CHECKSUM_AGG:
					case COMMITTED:
					case CONCAT:
					case COOKIE:
					case COUNT:
					case COUNT_BIG:
					case DELAY:
					case DELETED:
					case DENSE_RANK:
					case DISABLE:
					case DYNAMIC:
					case ENCRYPTION:
					case FAST:
					case FAST_FORWARD:
					case FIRST:
					case FOLLOWING:
					case FORWARD_ONLY:
					case FULLSCAN:
					case GLOBAL:
					case GO:
					case GROUPING:
					case GROUPING_ID:
					case HASH:
					case INSENSITIVE:
					case INSERTED:
					case ISOLATION:
					case KEEPFIXED:
					case KEYSET:
					case LAST:
					case LEVEL:
					case LOCAL:
					case LOCK_ESCALATION:
					case LOGIN:
					case LOOP:
					case MARK:
					case MAX:
					case MIN:
					case MODIFY:
					case NEXT:
					case NAME:
					case NOCOUNT:
					case NOEXPAND:
					case NORECOMPUTE:
					case NTILE:
					case NUMBER:
					case OFFSET:
					case ONLY:
					case OPTIMISTIC:
					case OPTIMIZE:
					case OUT:
					case OUTPUT:
					case OWNER:
					case PARTITION:
					case PATH:
					case PRECEDING:
					case PRIOR:
					case RANGE:
					case RANK:
					case READONLY:
					case READ_ONLY:
					case RECOMPILE:
					case RELATIVE:
					case REMOTE:
					case REPEATABLE:
					case ROOT:
					case ROW:
					case ROWGUID:
					case ROWS:
					case ROW_NUMBER:
					case SAMPLE:
					case SCHEMABINDING:
					case SCROLL:
					case SCROLL_LOCKS:
					case SELF:
					case SERIALIZABLE:
					case SNAPSHOT:
					case SPATIAL_WINDOW_MAX_CELLS:
					case STATIC:
					case STATS_STREAM:
					case STDEV:
					case STDEVP:
					case SUM:
					case THROW:
					case TIES:
					case TIME:
					case TRY:
					case TYPE:
					case TYPE_WARNING:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNKNOWN:
					case USING:
					case VAR:
					case VARP:
					case VIEW_METADATA:
					case WORK:
					case XML:
					case XMLNAMESPACES:
					case DOUBLE_QUOTE_ID:
					case SQUARE_BRACKET_ID:
					case ID:
						{
						setState(1373); id();
						}
						break;
					case LOCAL_ID:
						{
						setState(1374); match(LOCAL_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1380);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						setState(1377); match(WITH);
						setState(1378); match(MARK);
						setState(1379); match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1385);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1384); match(SEMI);
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1387); match(COMMIT);
				setState(1388);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1399);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1391);
					switch (_input.LA(1)) {
					case FORCESEEK:
					case ABSOLUTE:
					case APPLY:
					case AUTO:
					case AVG:
					case BASE64:
					case CALLER:
					case CAST:
					case CATCH:
					case CHECKSUM_AGG:
					case COMMITTED:
					case CONCAT:
					case COOKIE:
					case COUNT:
					case COUNT_BIG:
					case DELAY:
					case DELETED:
					case DENSE_RANK:
					case DISABLE:
					case DYNAMIC:
					case ENCRYPTION:
					case FAST:
					case FAST_FORWARD:
					case FIRST:
					case FOLLOWING:
					case FORWARD_ONLY:
					case FULLSCAN:
					case GLOBAL:
					case GO:
					case GROUPING:
					case GROUPING_ID:
					case HASH:
					case INSENSITIVE:
					case INSERTED:
					case ISOLATION:
					case KEEPFIXED:
					case KEYSET:
					case LAST:
					case LEVEL:
					case LOCAL:
					case LOCK_ESCALATION:
					case LOGIN:
					case LOOP:
					case MARK:
					case MAX:
					case MIN:
					case MODIFY:
					case NEXT:
					case NAME:
					case NOCOUNT:
					case NOEXPAND:
					case NORECOMPUTE:
					case NTILE:
					case NUMBER:
					case OFFSET:
					case ONLY:
					case OPTIMISTIC:
					case OPTIMIZE:
					case OUT:
					case OUTPUT:
					case OWNER:
					case PARTITION:
					case PATH:
					case PRECEDING:
					case PRIOR:
					case RANGE:
					case RANK:
					case READONLY:
					case READ_ONLY:
					case RECOMPILE:
					case RELATIVE:
					case REMOTE:
					case REPEATABLE:
					case ROOT:
					case ROW:
					case ROWGUID:
					case ROWS:
					case ROW_NUMBER:
					case SAMPLE:
					case SCHEMABINDING:
					case SCROLL:
					case SCROLL_LOCKS:
					case SELF:
					case SERIALIZABLE:
					case SNAPSHOT:
					case SPATIAL_WINDOW_MAX_CELLS:
					case STATIC:
					case STATS_STREAM:
					case STDEV:
					case STDEVP:
					case SUM:
					case THROW:
					case TIES:
					case TIME:
					case TRY:
					case TYPE:
					case TYPE_WARNING:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNKNOWN:
					case USING:
					case VAR:
					case VARP:
					case VIEW_METADATA:
					case WORK:
					case XML:
					case XMLNAMESPACES:
					case DOUBLE_QUOTE_ID:
					case SQUARE_BRACKET_ID:
					case ID:
						{
						setState(1389); id();
						}
						break;
					case LOCAL_ID:
						{
						setState(1390); match(LOCAL_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1397);
					switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
					case 1:
						{
						setState(1393); match(WITH);
						setState(1394); match(LR_BRACKET);
						setState(1395);
						((Transaction_statementContext)_localctx).DELAYED_DURABILITY = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OFF || _la==ON) ) {
							((Transaction_statementContext)_localctx).DELAYED_DURABILITY = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1396); match(RR_BRACKET);
						}
						break;
					}
					}
					break;
				}
				setState(1402);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1401); match(SEMI);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1404); match(COMMIT);
				setState(1406);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1405); match(WORK);
					}
					break;
				}
				setState(1409);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1408); match(SEMI);
					}
					break;
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1411); match(ROLLBACK);
				setState(1412);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1415);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1413); id();
					}
					break;

				case 2:
					{
					setState(1414); match(LOCAL_ID);
					}
					break;
				}
				setState(1418);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1417); match(SEMI);
					}
					break;
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1420); match(ROLLBACK);
				setState(1422);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1421); match(WORK);
					}
					break;
				}
				setState(1425);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1424); match(SEMI);
					}
					break;
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1427); match(SAVE);
				setState(1428);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1431);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1429); id();
					}
					break;

				case 2:
					{
					setState(1430); match(LOCAL_ID);
					}
					break;
				}
				setState(1434);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1433); match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Go_statementContext extends ParserRuleContext {
		public Token count;
		public TerminalNode GO() { return getToken(tsqlParser.GO, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Go_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_go_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitGo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Go_statementContext go_statement() throws RecognitionException {
		Go_statementContext _localctx = new Go_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_go_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438); match(GO);
			setState(1440);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1439); ((Go_statementContext)_localctx).count = match(DECIMAL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_statementContext extends ParserRuleContext {
		public IdContext database;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode USE() { return getToken(tsqlParser.USE, 0); }
		public Use_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitUse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_statementContext use_statement() throws RecognitionException {
		Use_statementContext _localctx = new Use_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_use_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442); match(USE);
			setState(1443); ((Use_statementContext)_localctx).database = id();
			setState(1445);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1444); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_clauseContext extends ParserRuleContext {
		public Token clause;
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode EXEC() { return getToken(tsqlParser.EXEC, 0); }
		public TerminalNode EXECUTE() { return getToken(tsqlParser.EXECUTE, 0); }
		public TerminalNode SELF() { return getToken(tsqlParser.SELF, 0); }
		public TerminalNode CALLER() { return getToken(tsqlParser.CALLER, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode OWNER() { return getToken(tsqlParser.OWNER, 0); }
		public Execute_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitExecute_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execute_clauseContext execute_clause() throws RecognitionException {
		Execute_clauseContext _localctx = new Execute_clauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_execute_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			_la = _input.LA(1);
			if ( !(_la==EXEC || _la==EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1448); match(AS);
			setState(1449);
			((Execute_clauseContext)_localctx).clause = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CALLER || _la==OWNER || _la==SELF || _la==STRING) ) {
				((Execute_clauseContext)_localctx).clause = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_typeContext extends ParserRuleContext {
		public TerminalNode TIMESTAMP() { return getToken(tsqlParser.TIMESTAMP, 0); }
		public TerminalNode BIT() { return getToken(tsqlParser.BIT, 0); }
		public TerminalNode DATETIMN() { return getToken(tsqlParser.DATETIMN, 0); }
		public TerminalNode TIME() { return getToken(tsqlParser.TIME, 0); }
		public TerminalNode TEXT() { return getToken(tsqlParser.TEXT, 0); }
		public TerminalNode NUMERICN() { return getToken(tsqlParser.NUMERICN, 0); }
		public TerminalNode BLOB() { return getToken(tsqlParser.BLOB, 0); }
		public TerminalNode NVARCHAR() { return getToken(tsqlParser.NVARCHAR, 0); }
		public TerminalNode FLOATN() { return getToken(tsqlParser.FLOATN, 0); }
		public TerminalNode TYP_ZEITWERT() { return getToken(tsqlParser.TYP_ZEITWERT, 0); }
		public TerminalNode SMALLMONEY() { return getToken(tsqlParser.SMALLMONEY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(tsqlParser.DOUBLE, 0); }
		public TerminalNode TYP_ZEITDIMENSION() { return getToken(tsqlParser.TYP_ZEITDIMENSION, 0); }
		public TerminalNode UNSIGNED() { return getToken(tsqlParser.UNSIGNED, 0); }
		public TerminalNode CLOB() { return getToken(tsqlParser.CLOB, 0); }
		public TerminalNode BOOLEAN() { return getToken(tsqlParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(tsqlParser.CHARACTER, 0); }
		public TerminalNode DATETIMEOFFSET() { return getToken(tsqlParser.DATETIMEOFFSET, 0); }
		public TerminalNode REAL() { return getToken(tsqlParser.REAL, 0); }
		public TerminalNode CHAR() { return getToken(tsqlParser.CHAR, 0); }
		public TerminalNode BINARY() { return getToken(tsqlParser.BINARY, 0); }
		public TerminalNode VARBINARY() { return getToken(tsqlParser.VARBINARY, 0); }
		public TerminalNode SMALLDATETIME() { return getToken(tsqlParser.SMALLDATETIME, 0); }
		public TerminalNode DECIMALN() { return getToken(tsqlParser.DECIMALN, 0); }
		public TerminalNode TINYINT() { return getToken(tsqlParser.TINYINT, 0); }
		public TerminalNode FLOAT() { return getToken(tsqlParser.FLOAT, 0); }
		public TerminalNode MONEY() { return getToken(tsqlParser.MONEY, 0); }
		public TerminalNode VARCHAR() { return getToken(tsqlParser.VARCHAR, 0); }
		public TerminalNode NUMERIC() { return getToken(tsqlParser.NUMERIC, 0); }
		public TerminalNode DATE() { return getToken(tsqlParser.DATE, 0); }
		public TerminalNode IMAGE() { return getToken(tsqlParser.IMAGE, 0); }
		public Unsigned_zusatzContext unsigned_zusatz() {
			return getRuleContext(Unsigned_zusatzContext.class,0);
		}
		public TerminalNode DATETIME() { return getToken(tsqlParser.DATETIME, 0); }
		public TerminalNode TYP_MONEY() { return getToken(tsqlParser.TYP_MONEY, 0); }
		public TerminalNode SYSNAME() { return getToken(tsqlParser.SYSNAME, 0); }
		public TerminalNode NCHAR() { return getToken(tsqlParser.NCHAR, 0); }
		public TerminalNode TYP_VERBRAUCH() { return getToken(tsqlParser.TYP_VERBRAUCH, 0); }
		public TerminalNode DATETIME2() { return getToken(tsqlParser.DATETIME2, 0); }
		public TerminalNode MONEYN() { return getToken(tsqlParser.MONEYN, 0); }
		public TerminalNode UNIQUEIDENTIFIER() { return getToken(tsqlParser.UNIQUEIDENTIFIER, 0); }
		public TerminalNode NTEXT() { return getToken(tsqlParser.NTEXT, 0); }
		public TerminalNode INTEGER() { return getToken(tsqlParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Declare_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDeclare_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_typeContext declare_type() throws RecognitionException {
		Declare_typeContext _localctx = new Declare_typeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_declare_type);
		int _la;
		try {
			setState(1562);
			switch (_input.LA(1)) {
			case BIGINT:
			case BIGINTN:
			case INT:
			case INTN:
			case SMALLINT:
			case SMALLINTN:
			case UNSIGNED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1452);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1451); match(UNSIGNED);
					}
				}

				setState(1454); unsigned_zusatz();
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1455); match(BINARY);
				setState(1460);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1456); match(LR_BRACKET);
					setState(1457); expression(0);
					setState(1458); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1462); match(BIT);
				}
				break;
			case BLOB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1463); match(BLOB);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1464); match(BOOLEAN);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(1465); match(CHAR);
				setState(1470);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1466); match(LR_BRACKET);
					setState(1467); expression(0);
					setState(1468); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 7);
				{
				setState(1472); match(CHARACTER);
				setState(1477);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1473); match(LR_BRACKET);
					setState(1474); expression(0);
					setState(1475); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case CLOB:
				enterOuterAlt(_localctx, 8);
				{
				setState(1479); match(CLOB);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1480); match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 10);
				{
				setState(1481); match(DATETIME);
				}
				break;
			case DATETIMN:
				enterOuterAlt(_localctx, 11);
				{
				setState(1482); match(DATETIMN);
				}
				break;
			case DATETIME2:
				enterOuterAlt(_localctx, 12);
				{
				setState(1483); match(DATETIME2);
				}
				break;
			case DATETIMEOFFSET:
				enterOuterAlt(_localctx, 13);
				{
				setState(1484); match(DATETIMEOFFSET);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 14);
				{
				setState(1485); match(DECIMAL);
				}
				break;
			case DECIMALN:
				enterOuterAlt(_localctx, 15);
				{
				setState(1486); match(DECIMALN);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 16);
				{
				setState(1487); match(DOUBLE);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 17);
				{
				setState(1488); match(FLOAT);
				setState(1493);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1489); match(LR_BRACKET);
					setState(1490); expression(0);
					setState(1491); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case FLOATN:
				enterOuterAlt(_localctx, 18);
				{
				setState(1495); match(FLOATN);
				setState(1500);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1496); match(LR_BRACKET);
					setState(1497); expression(0);
					setState(1498); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 19);
				{
				setState(1502); match(IMAGE);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 20);
				{
				setState(1503); match(INTEGER);
				}
				break;
			case MONEY:
				enterOuterAlt(_localctx, 21);
				{
				setState(1504); match(MONEY);
				}
				break;
			case MONEYN:
				enterOuterAlt(_localctx, 22);
				{
				setState(1505); match(MONEYN);
				}
				break;
			case NCHAR:
				enterOuterAlt(_localctx, 23);
				{
				setState(1506); match(NCHAR);
				setState(1511);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1507); match(LR_BRACKET);
					setState(1508); expression(0);
					setState(1509); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case NVARCHAR:
				enterOuterAlt(_localctx, 24);
				{
				setState(1513); match(NVARCHAR);
				setState(1518);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1514); match(LR_BRACKET);
					setState(1515); expression(0);
					setState(1516); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case NTEXT:
				enterOuterAlt(_localctx, 25);
				{
				setState(1520); match(NTEXT);
				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 26);
				{
				setState(1521); match(NUMERIC);
				setState(1526);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1522); match(LR_BRACKET);
					setState(1523); expression(0);
					setState(1524); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case NUMERICN:
				enterOuterAlt(_localctx, 27);
				{
				setState(1528); match(NUMERICN);
				setState(1533);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1529); match(LR_BRACKET);
					setState(1530); expression(0);
					setState(1531); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 28);
				{
				setState(1535); match(REAL);
				}
				break;
			case SMALLMONEY:
				enterOuterAlt(_localctx, 29);
				{
				setState(1536); match(SMALLMONEY);
				}
				break;
			case SMALLDATETIME:
				enterOuterAlt(_localctx, 30);
				{
				setState(1537); match(SMALLDATETIME);
				}
				break;
			case SYSNAME:
				enterOuterAlt(_localctx, 31);
				{
				setState(1538); match(SYSNAME);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 32);
				{
				setState(1539); match(TEXT);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 33);
				{
				setState(1540); match(TIME);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 34);
				{
				setState(1541); match(TIMESTAMP);
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 35);
				{
				setState(1542); match(TINYINT);
				}
				break;
			case TYP_MONEY:
				enterOuterAlt(_localctx, 36);
				{
				setState(1543); match(TYP_MONEY);
				}
				break;
			case TYP_VERBRAUCH:
				enterOuterAlt(_localctx, 37);
				{
				setState(1544); match(TYP_VERBRAUCH);
				}
				break;
			case TYP_ZEITDIMENSION:
				enterOuterAlt(_localctx, 38);
				{
				setState(1545); match(TYP_ZEITDIMENSION);
				}
				break;
			case TYP_ZEITWERT:
				enterOuterAlt(_localctx, 39);
				{
				setState(1546); match(TYP_ZEITWERT);
				}
				break;
			case UNIQUEIDENTIFIER:
				enterOuterAlt(_localctx, 40);
				{
				setState(1547); match(UNIQUEIDENTIFIER);
				}
				break;
			case VARBINARY:
				enterOuterAlt(_localctx, 41);
				{
				setState(1548); match(VARBINARY);
				setState(1553);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1549); match(LR_BRACKET);
					setState(1550); expression(0);
					setState(1551); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 42);
				{
				setState(1555); match(VARCHAR);
				setState(1560);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1556); match(LR_BRACKET);
					setState(1557); expression(0);
					setState(1558); match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_zusatzContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(tsqlParser.INT, 0); }
		public TerminalNode SMALLINTN() { return getToken(tsqlParser.SMALLINTN, 0); }
		public TerminalNode BIGINTN() { return getToken(tsqlParser.BIGINTN, 0); }
		public TerminalNode INTN() { return getToken(tsqlParser.INTN, 0); }
		public TerminalNode BIGINT() { return getToken(tsqlParser.BIGINT, 0); }
		public TerminalNode SMALLINT() { return getToken(tsqlParser.SMALLINT, 0); }
		public Unsigned_zusatzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_zusatz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitUnsigned_zusatz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_zusatzContext unsigned_zusatz() throws RecognitionException {
		Unsigned_zusatzContext _localctx = new Unsigned_zusatzContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unsigned_zusatz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			_la = _input.LA(1);
			if ( !(_la==BIGINT || _la==BIGINTN || _la==INT || _la==INTN || _la==SMALLINT || _la==SMALLINTN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_localContext extends ParserRuleContext {
		public Declare_typeContext declaretype;
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declare_typeContext declare_type() {
			return getRuleContext(Declare_typeContext.class,0);
		}
		public Declare_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_local; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDeclare_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_localContext declare_local() throws RecognitionException {
		Declare_localContext _localctx = new Declare_localContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_declare_local);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566); match(LOCAL_ID);
			setState(1568);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1567); match(AS);
				}
			}

			setState(1570); ((Declare_localContext)_localctx).declaretype = declare_type();
			setState(1573);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1571); match(EQUAL);
				setState(1572); expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_type_definitionContext extends ParserRuleContext {
		public List<Column_def_table_constraintContext> column_def_table_constraint() {
			return getRuleContexts(Column_def_table_constraintContext.class);
		}
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(tsqlParser.TEMPORARY, 0); }
		public Column_def_table_constraintContext column_def_table_constraint(int i) {
			return getRuleContext(Column_def_table_constraintContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public Table_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_type_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTable_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_type_definitionContext table_type_definition() throws RecognitionException {
		Table_type_definitionContext _localctx = new Table_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_table_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575); match(TABLE);
			setState(1577);
			_la = _input.LA(1);
			if (_la==TEMPORARY || _la==GLOBAL) {
				{
				setState(1576);
				_la = _input.LA(1);
				if ( !(_la==TEMPORARY || _la==GLOBAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1579); match(LR_BRACKET);
			setState(1580); column_def_table_constraint();
			setState(1587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHECK || _la==CONSTRAINT || _la==FORCESEEK || _la==PRIMARY || ((((_la - 240)) & ~0x3f) == 0 && ((1L << (_la - 240)) & ((1L << (UNIQUE - 240)) | (1L << (ABSOLUTE - 240)) | (1L << (APPLY - 240)) | (1L << (AUTO - 240)) | (1L << (AVG - 240)) | (1L << (BASE64 - 240)) | (1L << (CALLER - 240)) | (1L << (CAST - 240)) | (1L << (CATCH - 240)) | (1L << (CHECKSUM_AGG - 240)) | (1L << (COMMITTED - 240)) | (1L << (CONCAT - 240)) | (1L << (COOKIE - 240)) | (1L << (COUNT - 240)) | (1L << (COUNT_BIG - 240)) | (1L << (DELAY - 240)) | (1L << (DELETED - 240)) | (1L << (DENSE_RANK - 240)) | (1L << (DISABLE - 240)) | (1L << (DYNAMIC - 240)) | (1L << (ENCRYPTION - 240)) | (1L << (FAST - 240)) | (1L << (FAST_FORWARD - 240)) | (1L << (FIRST - 240)) | (1L << (FOLLOWING - 240)) | (1L << (FORWARD_ONLY - 240)) | (1L << (FULLSCAN - 240)) | (1L << (GLOBAL - 240)) | (1L << (GO - 240)) | (1L << (GROUPING - 240)) | (1L << (GROUPING_ID - 240)) | (1L << (HASH - 240)) | (1L << (INSENSITIVE - 240)) | (1L << (INSERTED - 240)) | (1L << (ISOLATION - 240)) | (1L << (KEEPFIXED - 240)) | (1L << (KEYSET - 240)) | (1L << (LAST - 240)) | (1L << (LEVEL - 240)))) != 0) || ((((_la - 304)) & ~0x3f) == 0 && ((1L << (_la - 304)) & ((1L << (LOCAL - 304)) | (1L << (LOCK_ESCALATION - 304)) | (1L << (LOGIN - 304)) | (1L << (LOOP - 304)) | (1L << (MARK - 304)) | (1L << (MAX - 304)) | (1L << (MIN - 304)) | (1L << (MODIFY - 304)) | (1L << (NEXT - 304)) | (1L << (NAME - 304)) | (1L << (NOCOUNT - 304)) | (1L << (NOEXPAND - 304)) | (1L << (NORECOMPUTE - 304)) | (1L << (NTILE - 304)) | (1L << (NUMBER - 304)) | (1L << (OFFSET - 304)) | (1L << (ONLY - 304)) | (1L << (OPTIMISTIC - 304)) | (1L << (OPTIMIZE - 304)) | (1L << (OUT - 304)) | (1L << (OUTPUT - 304)) | (1L << (OWNER - 304)) | (1L << (PARTITION - 304)) | (1L << (PATH - 304)) | (1L << (PRECEDING - 304)) | (1L << (PRIOR - 304)) | (1L << (RANGE - 304)) | (1L << (RANK - 304)) | (1L << (READONLY - 304)) | (1L << (READ_ONLY - 304)) | (1L << (RECOMPILE - 304)) | (1L << (RELATIVE - 304)) | (1L << (REMOTE - 304)) | (1L << (REPEATABLE - 304)) | (1L << (ROOT - 304)) | (1L << (ROW - 304)) | (1L << (ROWGUID - 304)) | (1L << (ROWS - 304)) | (1L << (ROW_NUMBER - 304)) | (1L << (SAMPLE - 304)) | (1L << (SCHEMABINDING - 304)) | (1L << (SCROLL - 304)) | (1L << (SCROLL_LOCKS - 304)) | (1L << (SELF - 304)) | (1L << (SERIALIZABLE - 304)) | (1L << (SNAPSHOT - 304)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 304)) | (1L << (STATIC - 304)) | (1L << (STATS_STREAM - 304)) | (1L << (STDEV - 304)) | (1L << (STDEVP - 304)) | (1L << (SUM - 304)) | (1L << (THROW - 304)) | (1L << (TIES - 304)) | (1L << (TIME - 304)) | (1L << (TRY - 304)) | (1L << (TYPE - 304)) | (1L << (TYPE_WARNING - 304)) | (1L << (UNBOUNDED - 304)) | (1L << (UNCOMMITTED - 304)) | (1L << (UNKNOWN - 304)))) != 0) || ((((_la - 368)) & ~0x3f) == 0 && ((1L << (_la - 368)) & ((1L << (USING - 368)) | (1L << (VAR - 368)) | (1L << (VARP - 368)) | (1L << (VIEW_METADATA - 368)) | (1L << (WORK - 368)) | (1L << (XML - 368)) | (1L << (XMLNAMESPACES - 368)) | (1L << (DOUBLE_QUOTE_ID - 368)) | (1L << (SQUARE_BRACKET_ID - 368)) | (1L << (ID - 368)) | (1L << (COMMA - 368)))) != 0)) {
				{
				{
				setState(1582);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1581); match(COMMA);
					}
				}

				setState(1584); column_def_table_constraint();
				}
				}
				setState(1589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1590); match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_def_table_constraintContext extends ParserRuleContext {
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Column_def_table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def_table_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitColumn_def_table_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_def_table_constraintContext column_def_table_constraint() throws RecognitionException {
		Column_def_table_constraintContext _localctx = new Column_def_table_constraintContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_column_def_table_constraint);
		try {
			setState(1594);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1592); column_definition();
				}
				break;
			case CHECK:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593); table_constraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public Column_nameContext columnname;
		public Declare_typeContext declaretype;
		public IdContext constraint;
		public Token seed;
		public Token increment;
		public TerminalNode IDENTITY() { return getToken(tsqlParser.IDENTITY, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declare_typeContext declare_type() {
			return getRuleContext(Declare_typeContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public TerminalNode REPLICATION() { return getToken(tsqlParser.REPLICATION, 0); }
		public TerminalNode IN() { return getToken(tsqlParser.IN, 0); }
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(tsqlParser.ROWGUIDCOL, 0); }
		public TerminalNode DECIMAL(int i) {
			return getToken(tsqlParser.DECIMAL, i);
		}
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode CONSTRAINT() { return getToken(tsqlParser.CONSTRAINT, 0); }
		public TerminalNode VALUES() { return getToken(tsqlParser.VALUES, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(tsqlParser.DECIMAL); }
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_column_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1596); ((Column_definitionContext)_localctx).columnname = column_name();
			setState(1597); ((Column_definitionContext)_localctx).declaretype = declare_type();
			setState(1599);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1598); null_notnull();
				}
				break;
			}
			setState(1603);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(1601); match(IN);
				setState(1602); expression(0);
				}
			}

			setState(1628);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1607);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1605); match(CONSTRAINT);
					setState(1606); ((Column_definitionContext)_localctx).constraint = id();
					}
				}

				setState(1609); match(DEFAULT);
				setState(1610); constant_expression();
				setState(1613);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1611); match(WITH);
					setState(1612); match(VALUES);
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(1615); match(IDENTITY);
				setState(1621);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1616); match(LR_BRACKET);
					setState(1617); ((Column_definitionContext)_localctx).seed = match(DECIMAL);
					setState(1618); match(COMMA);
					setState(1619); ((Column_definitionContext)_localctx).increment = match(DECIMAL);
					setState(1620); match(RR_BRACKET);
					}
					break;
				}
				setState(1626);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1623); match(NOT);
					setState(1624); match(FOR);
					setState(1625); match(REPLICATION);
					}
					break;
				}
				}
				break;
			}
			setState(1631);
			_la = _input.LA(1);
			if (_la==ROWGUIDCOL) {
				{
				setState(1630); match(ROWGUIDCOL);
				}
			}

			setState(1636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1633); column_constraint();
					}
					} 
				}
				setState(1638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(tsqlParser.CHECK, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode KEY() { return getToken(tsqlParser.KEY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(tsqlParser.UNIQUE, 0); }
		public TerminalNode REPLICATION() { return getToken(tsqlParser.REPLICATION, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(tsqlParser.DEFAULT, 0); }
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode CONSTRAINT() { return getToken(tsqlParser.CONSTRAINT, 0); }
		public TerminalNode PRIMARY() { return getToken(tsqlParser.PRIMARY, 0); }
		public TerminalNode IQ() { return getToken(tsqlParser.IQ, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_column_constraint);
		int _la;
		try {
			setState(1678);
			switch (_input.LA(1)) {
			case CHECK:
			case CONSTRAINT:
			case NOT:
			case NULL:
			case PRIMARY:
			case UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1641);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1639); match(CONSTRAINT);
					setState(1640); id();
					}
				}

				setState(1644);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1643); null_notnull();
					}
				}

				setState(1667);
				switch (_input.LA(1)) {
				case PRIMARY:
				case UNIQUE:
					{
					setState(1649);
					switch (_input.LA(1)) {
					case PRIMARY:
						{
						setState(1646); match(PRIMARY);
						setState(1647); match(KEY);
						}
						break;
					case UNIQUE:
						{
						setState(1648); match(UNIQUE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1652);
					_la = _input.LA(1);
					if (_la==CLUSTERED || _la==NONCLUSTERED) {
						{
						setState(1651); clustered();
						}
					}

					setState(1655);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						setState(1654); index_options();
						}
						break;
					}
					}
					break;
				case CHECK:
					{
					setState(1657); match(CHECK);
					setState(1661);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(1658); match(NOT);
						setState(1659); match(FOR);
						setState(1660); match(REPLICATION);
						}
					}

					setState(1663); match(LR_BRACKET);
					setState(1664); search_condition();
					setState(1665); match(RR_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case IQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1669); match(IQ);
				setState(1670); match(UNIQUE);
				setState(1671); match(LR_BRACKET);
				setState(1672); number();
				setState(1673); match(RR_BRACKET);
				setState(1676);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(1674); match(DEFAULT);
					setState(1675); expression(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(tsqlParser.CHECK, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode KEY() { return getToken(tsqlParser.KEY, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode UNIQUE() { return getToken(tsqlParser.UNIQUE, 0); }
		public TerminalNode REPLICATION() { return getToken(tsqlParser.REPLICATION, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode CONSTRAINT() { return getToken(tsqlParser.CONSTRAINT, 0); }
		public TerminalNode PRIMARY() { return getToken(tsqlParser.PRIMARY, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1680); match(CONSTRAINT);
				setState(1681); id();
				}
			}

			setState(1712);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
				{
				setState(1687);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					setState(1684); match(PRIMARY);
					setState(1685); match(KEY);
					}
					break;
				case UNIQUE:
					{
					setState(1686); match(UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1690);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(1689); clustered();
					}
				}

				setState(1692); match(LR_BRACKET);
				setState(1693); column_name_list();
				setState(1694); match(RR_BRACKET);
				setState(1696);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(1695); index_options();
					}
					break;
				}
				setState(1700);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(1698); match(ON);
					setState(1699); id();
					}
					break;
				}
				}
				break;
			case CHECK:
				{
				setState(1702); match(CHECK);
				setState(1706);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1703); match(NOT);
					setState(1704); match(FOR);
					setState(1705); match(REPLICATION);
					}
				}

				setState(1708); match(LR_BRACKET);
				setState(1709); search_condition();
				setState(1710); match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionsContext extends ParserRuleContext {
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitIndex_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714); match(WITH);
			setState(1715); match(LR_BRACKET);
			setState(1716); index_option();
			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1717); match(COMMA);
				setState(1718); index_option();
				}
				}
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1724); match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wot_statementContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(tsqlParser.THEN, 0); }
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public TerminalNode OTHERS() { return getToken(tsqlParser.OTHERS, 0); }
		public TerminalNode RESIGNAL() { return getToken(tsqlParser.RESIGNAL, 0); }
		public TerminalNode WHEN() { return getToken(tsqlParser.WHEN, 0); }
		public Wot_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wot_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitWot_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wot_statementContext wot_statement() throws RecognitionException {
		Wot_statementContext _localctx = new Wot_statementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_wot_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726); match(WHEN);
			setState(1727); match(OTHERS);
			setState(1728); match(THEN);
			setState(1732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CALL) | (1L << CLOSE) | (1L << COMMENT) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECLARE - 64)) | (1L << (DELETE - 64)) | (1L << (DROP - 64)) | (1L << (EXCEPTION - 64)) | (1L << (EXEC - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FORCESEEK - 64)) | (1L << (GOTO - 64)) | (1L << (GRANT - 64)) | (1L << (IF - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (OPEN - 156)) | (1L << (PRINT - 156)) | (1L << (RAISERROR - 156)) | (1L << (RETURN - 156)) | (1L << (REVERT - 156)) | (1L << (ROLLBACK - 156)) | (1L << (SAVE - 156)) | (1L << (SELECT - 156)) | (1L << (SET - 156)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (TRUNCATE - 232)) | (1L << (UPDATE - 232)) | (1L << (USE - 232)) | (1L << (WAITFOR - 232)) | (1L << (WHILE - 232)) | (1L << (WITH - 232)) | (1L << (ABSOLUTE - 232)) | (1L << (APPLY - 232)) | (1L << (AUTO - 232)) | (1L << (AVG - 232)) | (1L << (BASE64 - 232)) | (1L << (CALLER - 232)) | (1L << (CAST - 232)) | (1L << (CATCH - 232)) | (1L << (CHECKSUM_AGG - 232)) | (1L << (COMMITTED - 232)) | (1L << (CONCAT - 232)) | (1L << (COOKIE - 232)) | (1L << (COUNT - 232)) | (1L << (COUNT_BIG - 232)) | (1L << (DELAY - 232)) | (1L << (DELETED - 232)) | (1L << (DENSE_RANK - 232)) | (1L << (DISABLE - 232)) | (1L << (DYNAMIC - 232)) | (1L << (ENCRYPTION - 232)) | (1L << (FAST - 232)) | (1L << (FAST_FORWARD - 232)) | (1L << (FIRST - 232)) | (1L << (FOLLOWING - 232)) | (1L << (FORWARD_ONLY - 232)) | (1L << (FULLSCAN - 232)) | (1L << (GLOBAL - 232)) | (1L << (GO - 232)) | (1L << (GROUPING - 232)) | (1L << (GROUPING_ID - 232)))) != 0) || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (HASH - 296)) | (1L << (INSENSITIVE - 296)) | (1L << (INSERTED - 296)) | (1L << (ISOLATION - 296)) | (1L << (KEEPFIXED - 296)) | (1L << (KEYSET - 296)) | (1L << (LAST - 296)) | (1L << (LEVEL - 296)) | (1L << (LOCAL - 296)) | (1L << (LOCK_ESCALATION - 296)) | (1L << (LOGIN - 296)) | (1L << (LOOP - 296)) | (1L << (MARK - 296)) | (1L << (MAX - 296)) | (1L << (MIN - 296)) | (1L << (MODIFY - 296)) | (1L << (NEXT - 296)) | (1L << (NAME - 296)) | (1L << (NOCOUNT - 296)) | (1L << (NOEXPAND - 296)) | (1L << (NORECOMPUTE - 296)) | (1L << (NTILE - 296)) | (1L << (NUMBER - 296)) | (1L << (OFFSET - 296)) | (1L << (ONLY - 296)) | (1L << (OPTIMISTIC - 296)) | (1L << (OPTIMIZE - 296)) | (1L << (OUT - 296)) | (1L << (OUTPUT - 296)) | (1L << (OWNER - 296)) | (1L << (PARTITION - 296)) | (1L << (PATH - 296)) | (1L << (PRECEDING - 296)) | (1L << (PRIOR - 296)) | (1L << (RANGE - 296)) | (1L << (RANK - 296)) | (1L << (READONLY - 296)) | (1L << (READ_ONLY - 296)) | (1L << (RECOMPILE - 296)) | (1L << (RELATIVE - 296)) | (1L << (REMOTE - 296)) | (1L << (REPEATABLE - 296)) | (1L << (ROOT - 296)) | (1L << (ROW - 296)) | (1L << (ROWGUID - 296)) | (1L << (ROWS - 296)) | (1L << (ROW_NUMBER - 296)) | (1L << (SAMPLE - 296)) | (1L << (SCHEMABINDING - 296)) | (1L << (SCROLL - 296)) | (1L << (SCROLL_LOCKS - 296)) | (1L << (SELF - 296)) | (1L << (SERIALIZABLE - 296)) | (1L << (SNAPSHOT - 296)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 296)) | (1L << (STATIC - 296)) | (1L << (STATS_STREAM - 296)) | (1L << (STDEV - 296)) | (1L << (STDEVP - 296)) | (1L << (SUM - 296)) | (1L << (THROW - 296)) | (1L << (TIES - 296)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (TIME - 360)) | (1L << (TRY - 360)) | (1L << (TYPE - 360)) | (1L << (TYPE_WARNING - 360)) | (1L << (UNBOUNDED - 360)) | (1L << (UNCOMMITTED - 360)) | (1L << (UNKNOWN - 360)) | (1L << (USING - 360)) | (1L << (VAR - 360)) | (1L << (VARP - 360)) | (1L << (VIEW_METADATA - 360)) | (1L << (WORK - 360)) | (1L << (XML - 360)) | (1L << (XMLNAMESPACES - 360)) | (1L << (DOUBLE_QUOTE_ID - 360)) | (1L << (SQUARE_BRACKET_ID - 360)) | (1L << (ID - 360)) | (1L << (LR_BRACKET - 360)))) != 0)) {
				{
				{
				setState(1729); sql_clause();
				}
				}
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1735); match(RESIGNAL);
			setState(1736); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_statementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CALL() { return getToken(tsqlParser.CALL, 0); }
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitCall_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_statementContext call_statement() throws RecognitionException {
		Call_statementContext _localctx = new Call_statementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738); match(CALL);
			setState(1739); procedure_name();
			setState(1740); match(LR_BRACKET);
			setState(1749);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (CASE - 25)) | (1L << (COALESCE - 25)) | (1L << (CONVERT - 25)) | (1L << (CURRENT - 25)) | (1L << (CURRENT_TIMESTAMP - 25)) | (1L << (CURRENT_USER - 25)) | (1L << (DEFAULT - 25)))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (FORCESEEK - 97)) | (1L << (IDENTITY - 97)) | (1L << (LEFT - 97)) | (1L << (NULL - 97)) | (1L << (NULLIF - 97)))) != 0) || ((((_la - 182)) & ~0x3f) == 0 && ((1L << (_la - 182)) & ((1L << (REPLACE - 182)) | (1L << (RIGHT - 182)) | (1L << (SESSION_USER - 182)) | (1L << (SYSTEM_USER - 182)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (BINARY_CHECKSUM - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DATEADD - 260)) | (1L << (DATEDIFF - 260)) | (1L << (DATENAME - 260)) | (1L << (DATEPART - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MIN_ACTIVE_ROWVERSION - 260)) | (1L << (MOD - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (DOUBLE_QUOTE_ID - 324)) | (1L << (SQUARE_BRACKET_ID - 324)) | (1L << (LOCAL_ID - 324)) | (1L << (DECIMAL - 324)) | (1L << (ID - 324)) | (1L << (STRING - 324)) | (1L << (BINARY - 324)) | (1L << (FLOAT - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (REAL - 388)) | (1L << (DOLLAR - 388)) | (1L << (LR_BRACKET - 388)) | (1L << (PLUS - 388)) | (1L << (MINUS - 388)) | (1L << (BIT_NOT - 388)))) != 0)) {
				{
				setState(1741); expression(0);
				setState(1746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1742); match(COMMA);
					setState(1743); expression(0);
					}
					}
					setState(1748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1751); match(RR_BRACKET);
			setState(1752); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_statementContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(tsqlParser.PUBLIC, 0); }
		public Permission_listContext permission_list() {
			return getRuleContext(Permission_listContext.class,0);
		}
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode GRANT() { return getToken(tsqlParser.GRANT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TO() { return getToken(tsqlParser.TO, 0); }
		public Grant_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitGrant_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_statementContext grant_statement() throws RecognitionException {
		Grant_statementContext _localctx = new Grant_statementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_grant_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754); match(GRANT);
			setState(1755); permission_list();
			setState(1756); match(ON);
			setState(1759);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(1757); table_name();
				}
				break;

			case 2:
				{
				setState(1758); view_name();
				}
				break;
			}
			setState(1761); match(TO);
			setState(1764);
			switch (_input.LA(1)) {
			case PUBLIC:
				{
				setState(1762); match(PUBLIC);
				}
				break;
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				{
				setState(1763); column_name_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1766); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comment_on_statementContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public Comment_on_objectContext comment_on_object() {
			return getRuleContext(Comment_on_objectContext.class,0);
		}
		public TerminalNode STRING_COMMENT() { return getToken(tsqlParser.STRING_COMMENT, 0); }
		public TerminalNode COMMENT() { return getToken(tsqlParser.COMMENT, 0); }
		public TerminalNode IS() { return getToken(tsqlParser.IS, 0); }
		public Comment_on_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_on_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitComment_on_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment_on_statementContext comment_on_statement() throws RecognitionException {
		Comment_on_statementContext _localctx = new Comment_on_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_comment_on_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768); match(COMMENT);
			setState(1769); match(ON);
			setState(1770); comment_on_object();
			setState(1771); match(IS);
			setState(1772); match(STRING_COMMENT);
			setState(1774);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(1773); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Replace_statementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode REPLACE() { return getToken(tsqlParser.REPLACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Replace_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replace_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitReplace_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Replace_statementContext replace_statement() throws RecognitionException {
		Replace_statementContext _localctx = new Replace_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_replace_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776); match(REPLACE);
			setState(1777); match(LR_BRACKET);
			setState(1778); expression(0);
			setState(1779); match(COMMA);
			setState(1780); expression(0);
			setState(1781); match(COMMA);
			setState(1782); expression(0);
			setState(1783); match(RR_BRACKET);
			setState(1785);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(1784); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comment_on_objectContext extends ParserRuleContext {
		public Table_nameContext tablename;
		public Column_nameContext columnname;
		public Index_column_nameContext indexname;
		public Procedure_nameContext procedurename;
		public IdContext rolename;
		public IdContext username;
		public View_nameContext viewname;
		public TerminalNode VIEW() { return getToken(tsqlParser.VIEW, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode USER() { return getToken(tsqlParser.USER, 0); }
		public TerminalNode PROCEDURE() { return getToken(tsqlParser.PROCEDURE, 0); }
		public TerminalNode KEY() { return getToken(tsqlParser.KEY, 0); }
		public TerminalNode COLUMN() { return getToken(tsqlParser.COLUMN, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public Index_column_nameContext index_column_name() {
			return getRuleContext(Index_column_nameContext.class,0);
		}
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(tsqlParser.TABLE, 0); }
		public TerminalNode PRIMARY() { return getToken(tsqlParser.PRIMARY, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode ROLE() { return getToken(tsqlParser.ROLE, 0); }
		public TerminalNode INDEX() { return getToken(tsqlParser.INDEX, 0); }
		public Comment_on_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_on_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitComment_on_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment_on_objectContext comment_on_object() throws RecognitionException {
		Comment_on_objectContext _localctx = new Comment_on_objectContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_comment_on_object);
		try {
			setState(1808);
			switch (_input.LA(1)) {
			case COLUMN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1787); match(COLUMN);
				setState(1788); ((Comment_on_objectContext)_localctx).tablename = table_name();
				setState(1789); match(DOT);
				setState(1790); ((Comment_on_objectContext)_localctx).columnname = column_name();
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(1792); match(INDEX);
				setState(1793); ((Comment_on_objectContext)_localctx).indexname = index_column_name();
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1794); match(PRIMARY);
				setState(1795); match(KEY);
				setState(1796); match(ON);
				setState(1797); ((Comment_on_objectContext)_localctx).tablename = table_name();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1798); match(PROCEDURE);
				setState(1799); ((Comment_on_objectContext)_localctx).procedurename = procedure_name();
				}
				break;
			case ROLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1800); match(ROLE);
				setState(1801); ((Comment_on_objectContext)_localctx).rolename = id();
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1802); match(TABLE);
				setState(1803); ((Comment_on_objectContext)_localctx).tablename = table_name();
				}
				break;
			case USER:
				enterOuterAlt(_localctx, 7);
				{
				setState(1804); match(USER);
				setState(1805); ((Comment_on_objectContext)_localctx).username = id();
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 8);
				{
				setState(1806); match(VIEW);
				setState(1807); ((Comment_on_objectContext)_localctx).viewname = view_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Permission_listContext extends ParserRuleContext {
		public List<PermissionContext> permission() {
			return getRuleContexts(PermissionContext.class);
		}
		public PermissionContext permission(int i) {
			return getRuleContext(PermissionContext.class,i);
		}
		public Permission_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permission_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitPermission_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Permission_listContext permission_list() throws RecognitionException {
		Permission_listContext _localctx = new Permission_listContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_permission_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810); permission();
			setState(1815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1811); match(COMMA);
				setState(1812); permission();
				}
				}
				setState(1817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PermissionContext extends ParserRuleContext {
		public TerminalNode EXECUTE() { return getToken(tsqlParser.EXECUTE, 0); }
		public TerminalNode DELETE() { return getToken(tsqlParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(tsqlParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(tsqlParser.UPDATE, 0); }
		public TerminalNode SELECT() { return getToken(tsqlParser.SELECT, 0); }
		public TerminalNode DECRYPT() { return getToken(tsqlParser.DECRYPT, 0); }
		public TerminalNode REFERENCES() { return getToken(tsqlParser.REFERENCES, 0); }
		public PermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermissionContext permission() throws RecognitionException {
		PermissionContext _localctx = new PermissionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_permission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DECRYPT - 65)) | (1L << (DELETE - 65)) | (1L << (EXECUTE - 65)) | (1L << (INSERT - 65)))) != 0) || ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (REFERENCES - 181)) | (1L << (SELECT - 181)) | (1L << (UPDATE - 181)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionContext extends ParserRuleContext {
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public Simple_idContext simple_id(int i) {
			return getRuleContext(Simple_idContext.class,i);
		}
		public List<Simple_idContext> simple_id() {
			return getRuleContexts(Simple_idContext.class);
		}
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Index_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitIndex_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_optionContext index_option() throws RecognitionException {
		Index_optionContext _localctx = new Index_optionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_index_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820); simple_id();
			setState(1821); match(EQUAL);
			setState(1825);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ID:
				{
				setState(1822); simple_id();
				}
				break;
			case OFF:
			case ON:
				{
				setState(1823); on_off();
				}
				break;
			case DECIMAL:
				{
				setState(1824); match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_cursorContext extends ParserRuleContext {
		public Declare_set_cursor_commonContext declare_set_cursor_common() {
			return getRuleContext(Declare_set_cursor_commonContext.class,0);
		}
		public TerminalNode INSENSITIVE() { return getToken(tsqlParser.INSENSITIVE, 0); }
		public TerminalNode DECLARE() { return getToken(tsqlParser.DECLARE, 0); }
		public TerminalNode FOR(int i) {
			return getToken(tsqlParser.FOR, i);
		}
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(tsqlParser.CURSOR, 0); }
		public TerminalNode SCROLL() { return getToken(tsqlParser.SCROLL, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public List<TerminalNode> FOR() { return getTokens(tsqlParser.FOR); }
		public TerminalNode READ() { return getToken(tsqlParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode OF() { return getToken(tsqlParser.OF, 0); }
		public TerminalNode UPDATE() { return getToken(tsqlParser.UPDATE, 0); }
		public Declare_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDeclare_cursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursorContext declare_cursor() throws RecognitionException {
		Declare_cursorContext _localctx = new Declare_cursorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_declare_cursor);
		int _la;
		try {
			setState(1872);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1827); match(DECLARE);
				setState(1828); cursor_name();
				setState(1829); match(CURSOR);
				setState(1831);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(1830); match(SEMI);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1833); match(DECLARE);
				setState(1834); cursor_name();
				setState(1836);
				_la = _input.LA(1);
				if (_la==INSENSITIVE) {
					{
					setState(1835); match(INSENSITIVE);
					}
				}

				setState(1839);
				_la = _input.LA(1);
				if (_la==SCROLL) {
					{
					setState(1838); match(SCROLL);
					}
				}

				setState(1841); match(CURSOR);
				setState(1842); match(FOR);
				setState(1843); select_statement();
				setState(1852);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(1844); match(FOR);
					setState(1850);
					switch (_input.LA(1)) {
					case READ:
						{
						setState(1845); match(READ);
						setState(1846); match(ONLY);
						}
						break;
					case UPDATE:
						{
						setState(1847); match(UPDATE);
						}
						break;
					case OF:
						{
						{
						setState(1848); match(OF);
						setState(1849); column_name_list();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				setState(1855);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(1854); match(SEMI);
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1857); match(DECLARE);
				setState(1858); cursor_name();
				setState(1859); match(CURSOR);
				setState(1860); declare_set_cursor_common();
				setState(1867);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(1861); match(FOR);
					setState(1862); match(UPDATE);
					setState(1865);
					_la = _input.LA(1);
					if (_la==OF) {
						{
						setState(1863); match(OF);
						setState(1864); column_name_list();
						}
					}

					}
					break;
				}
				setState(1870);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(1869); match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_set_cursor_commonContext extends ParserRuleContext {
		public TerminalNode KEYSET() { return getToken(tsqlParser.KEYSET, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode OPTIMISTIC() { return getToken(tsqlParser.OPTIMISTIC, 0); }
		public TerminalNode SCROLL_LOCKS() { return getToken(tsqlParser.SCROLL_LOCKS, 0); }
		public TerminalNode READ_ONLY() { return getToken(tsqlParser.READ_ONLY, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode SCROLL() { return getToken(tsqlParser.SCROLL, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode DYNAMIC() { return getToken(tsqlParser.DYNAMIC, 0); }
		public TerminalNode LOCAL() { return getToken(tsqlParser.LOCAL, 0); }
		public TerminalNode STATIC() { return getToken(tsqlParser.STATIC, 0); }
		public TerminalNode FAST_FORWARD() { return getToken(tsqlParser.FAST_FORWARD, 0); }
		public TerminalNode TYPE_WARNING() { return getToken(tsqlParser.TYPE_WARNING, 0); }
		public TerminalNode FORWARD_ONLY() { return getToken(tsqlParser.FORWARD_ONLY, 0); }
		public Declare_set_cursor_commonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_set_cursor_common; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDeclare_set_cursor_common(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_set_cursor_commonContext declare_set_cursor_common() throws RecognitionException {
		Declare_set_cursor_commonContext _localctx = new Declare_set_cursor_commonContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_declare_set_cursor_common);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			_la = _input.LA(1);
			if (_la==GLOBAL || _la==LOCAL) {
				{
				setState(1874);
				_la = _input.LA(1);
				if ( !(_la==GLOBAL || _la==LOCAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1878);
			_la = _input.LA(1);
			if (_la==FORWARD_ONLY || _la==SCROLL) {
				{
				setState(1877);
				_la = _input.LA(1);
				if ( !(_la==FORWARD_ONLY || _la==SCROLL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1881);
			_la = _input.LA(1);
			if (((((_la - 284)) & ~0x3f) == 0 && ((1L << (_la - 284)) & ((1L << (DYNAMIC - 284)) | (1L << (FAST_FORWARD - 284)) | (1L << (KEYSET - 284)))) != 0) || _la==STATIC) {
				{
				setState(1880);
				_la = _input.LA(1);
				if ( !(((((_la - 284)) & ~0x3f) == 0 && ((1L << (_la - 284)) & ((1L << (DYNAMIC - 284)) | (1L << (FAST_FORWARD - 284)) | (1L << (KEYSET - 284)))) != 0) || _la==STATIC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1884);
			_la = _input.LA(1);
			if (((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & ((1L << (OPTIMISTIC - 323)) | (1L << (READ_ONLY - 323)) | (1L << (SCROLL_LOCKS - 323)))) != 0)) {
				{
				setState(1883);
				_la = _input.LA(1);
				if ( !(((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & ((1L << (OPTIMISTIC - 323)) | (1L << (READ_ONLY - 323)) | (1L << (SCROLL_LOCKS - 323)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1887);
			_la = _input.LA(1);
			if (_la==TYPE_WARNING) {
				{
				setState(1886); match(TYPE_WARNING);
				}
			}

			setState(1889); match(FOR);
			setState(1890); select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_cursorContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(tsqlParser.NEXT, 0); }
		public TerminalNode FIRST() { return getToken(tsqlParser.FIRST, 0); }
		public List<TerminalNode> LOCAL_ID() { return getTokens(tsqlParser.LOCAL_ID); }
		public TerminalNode PRIOR() { return getToken(tsqlParser.PRIOR, 0); }
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LOCAL_ID(int i) {
			return getToken(tsqlParser.LOCAL_ID, i);
		}
		public TerminalNode FETCH() { return getToken(tsqlParser.FETCH, 0); }
		public TerminalNode RELATIVE() { return getToken(tsqlParser.RELATIVE, 0); }
		public TerminalNode LAST() { return getToken(tsqlParser.LAST, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode ABSOLUTE() { return getToken(tsqlParser.ABSOLUTE, 0); }
		public TerminalNode FROM() { return getToken(tsqlParser.FROM, 0); }
		public Fetch_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_cursor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitFetch_cursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_cursorContext fetch_cursor() throws RecognitionException {
		Fetch_cursorContext _localctx = new Fetch_cursorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_fetch_cursor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1892); match(FETCH);
			setState(1904);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(1901);
				switch (_input.LA(1)) {
				case NEXT:
					{
					setState(1893); match(NEXT);
					}
					break;
				case PRIOR:
					{
					setState(1894); match(PRIOR);
					}
					break;
				case FIRST:
					{
					setState(1895); match(FIRST);
					}
					break;
				case LAST:
					{
					setState(1896); match(LAST);
					}
					break;
				case ABSOLUTE:
					{
					setState(1897); match(ABSOLUTE);
					setState(1898); expression(0);
					}
					break;
				case RELATIVE:
					{
					setState(1899); match(RELATIVE);
					setState(1900); expression(0);
					}
					break;
				case FROM:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1903); match(FROM);
				}
				break;
			}
			setState(1907);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(1906); match(GLOBAL);
				}
				break;
			}
			setState(1909); cursor_name();
			setState(1919);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				{
				setState(1910); match(INTO);
				setState(1911); match(LOCAL_ID);
				setState(1916);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1912); match(COMMA);
						setState(1913); match(LOCAL_ID);
						}
						} 
					}
					setState(1918);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
				}
				}
				break;
			}
			setState(1922);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(1921); match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_specialContext extends ParserRuleContext {
		public ExpressionContext l_name;
		public ExpressionContext r_name;
		public TerminalNode SET() { return getToken(tsqlParser.SET, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(tsqlParser.SERIALIZABLE, 0); }
		public TerminalNode TRANSACTION() { return getToken(tsqlParser.TRANSACTION, 0); }
		public TerminalNode TEMPORARY() { return getToken(tsqlParser.TEMPORARY, 0); }
		public TerminalNode LEVEL() { return getToken(tsqlParser.LEVEL, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(tsqlParser.UNCOMMITTED, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ISOLATION() { return getToken(tsqlParser.ISOLATION, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode REPEATABLE() { return getToken(tsqlParser.REPEATABLE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMITTED() { return getToken(tsqlParser.COMMITTED, 0); }
		public TerminalNode READ() { return getToken(tsqlParser.READ, 0); }
		public TerminalNode EXISTING() { return getToken(tsqlParser.EXISTING, 0); }
		public TerminalNode OPTION() { return getToken(tsqlParser.OPTION, 0); }
		public TerminalNode SNAPSHOT() { return getToken(tsqlParser.SNAPSHOT, 0); }
		public Set_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_special; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSet_special(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_specialContext set_special() throws RecognitionException {
		Set_specialContext _localctx = new Set_specialContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_set_special);
		int _la;
		try {
			setState(1966);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924); match(SET);
				setState(1925); id();
				setState(1930);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1926); id();
					}
					break;
				case DECIMAL:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case PLUS:
				case MINUS:
					{
					setState(1927); constant();
					}
					break;
				case LOCAL_ID:
					{
					setState(1928); match(LOCAL_ID);
					}
					break;
				case OFF:
				case ON:
					{
					setState(1929); on_off();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1933);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(1932); match(SEMI);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1935); match(SET);
				setState(1936); match(TRANSACTION);
				setState(1937); match(ISOLATION);
				setState(1938); match(LEVEL);
				setState(1947);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(1939); match(READ);
					setState(1940); match(UNCOMMITTED);
					}
					break;

				case 2:
					{
					setState(1941); match(READ);
					setState(1942); match(COMMITTED);
					}
					break;

				case 3:
					{
					setState(1943); match(REPEATABLE);
					setState(1944); match(READ);
					}
					break;

				case 4:
					{
					setState(1945); match(SNAPSHOT);
					}
					break;

				case 5:
					{
					setState(1946); match(SERIALIZABLE);
					}
					break;
				}
				setState(1950);
				switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(1949); match(SEMI);
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1952); match(SET);
				setState(1954);
				_la = _input.LA(1);
				if (_la==EXISTING) {
					{
					setState(1953); match(EXISTING);
					}
				}

				setState(1957);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(1956); match(TEMPORARY);
					}
				}

				setState(1959); match(OPTION);
				setState(1960); ((Set_specialContext)_localctx).l_name = expression(0);
				setState(1961); match(EQUAL);
				setState(1962); ((Set_specialContext)_localctx).r_name = expression(0);
				setState(1964);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(1963); match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Primitive_expressionContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Primitive_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitPrimitive_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Subquery_expressionContext extends ExpressionContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Subquery_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSubquery_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case_expressionContext extends ExpressionContext {
		public Case_exprContext case_expr() {
			return getRuleContext(Case_exprContext.class,0);
		}
		public Case_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitCase_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bracket_expressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bracket_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitBracket_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_concatenationContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public String_concatenationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitString_concatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Binary_operator_expressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Binary_operator_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitBinary_operator_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_operator_expressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Unary_operator_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitUnary_operator_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Column_ref_expressionContext extends ExpressionContext {
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public Column_ref_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitColumn_ref_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_call_expressionContext extends ExpressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(tsqlParser.COLLATE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_call_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitFunction_call_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				_localctx = new Unary_operator_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1969); match(BIT_NOT);
				setState(1970); expression(6);
				}
				break;

			case 2:
				{
				_localctx = new Unary_operator_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1971);
				((Unary_operator_expressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Unary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(1972); expression(3);
				}
				break;

			case 3:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1973); match(DEFAULT);
				}
				break;

			case 4:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1974); match(NULL);
				}
				break;

			case 5:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1975); match(LOCAL_ID);
				}
				break;

			case 6:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1976); constant();
				}
				break;

			case 7:
				{
				_localctx = new Function_call_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1977); function_call();
				}
				break;

			case 8:
				{
				_localctx = new Case_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1978); case_expr();
				}
				break;

			case 9:
				{
				_localctx = new Column_ref_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1979); full_column_name();
				}
				break;

			case 10:
				{
				_localctx = new Bracket_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1980); match(LR_BRACKET);
				setState(1981); expression(0);
				setState(1982); match(RR_BRACKET);
				}
				break;

			case 11:
				{
				_localctx = new Subquery_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1984); match(LR_BRACKET);
				setState(1985); subquery();
				setState(1986); match(RR_BRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2008);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2006);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
					case 1:
						{
						_localctx = new String_concatenationContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1990);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1991); match(1);
						setState(1992); expression(6);
						}
						break;

					case 2:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1993);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1994);
						((Binary_operator_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & ((1L << (STAR - 411)) | (1L << (DIVIDE - 411)) | (1L << (MODULE - 411)))) != 0)) ) {
							((Binary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1995); expression(5);
						}
						break;

					case 3:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1996);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1997);
						((Binary_operator_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 414)) & ~0x3f) == 0 && ((1L << (_la - 414)) & ((1L << (PLUS - 414)) | (1L << (MINUS - 414)) | (1L << (BIT_OR - 414)) | (1L << (BIT_AND - 414)) | (1L << (BIT_XOR - 414)))) != 0)) ) {
							((Binary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1998); expression(3);
						}
						break;

					case 4:
						{
						_localctx = new Function_call_expressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1999);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(2000); match(COLLATE);
						setState(2001); id();
						}
						break;

					case 5:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2002);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(2003); comparison_operator();
						setState(2004); expression(0);
						}
						break;
					}
					} 
				}
				setState(2010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode AUTOINCREMENT() { return getToken(tsqlParser.AUTOINCREMENT, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitConstant_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_constant_expression);
		try {
			setState(2020);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2011); match(NULL);
				}
				break;
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2012); constant();
				}
				break;
			case COALESCE:
			case CONVERT:
			case CURRENT:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case FORCESEEK:
			case IDENTITY:
			case LEFT:
			case NULLIF:
			case REPLACE:
			case RIGHT:
			case SESSION_USER:
			case SYSTEM_USER:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case BINARY_CHECKSUM:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATEADD:
			case DATEDIFF:
			case DATENAME:
			case DATEPART:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MIN_ACTIVE_ROWVERSION:
			case MOD:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(2013); function_call();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(2014); match(LOCAL_ID);
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(2015); match(LR_BRACKET);
				setState(2016); constant_expression();
				setState(2017); match(RR_BRACKET);
				}
				break;
			case AUTOINCREMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2019); match(AUTOINCREMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022); select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dml_table_sourceContext extends ParserRuleContext {
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public Dml_table_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_table_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDml_table_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dml_table_sourceContext dml_table_source() throws RecognitionException {
		Dml_table_sourceContext _localctx = new Dml_table_sourceContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_dml_table_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024); query_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_expressionContext extends ParserRuleContext {
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public TerminalNode XMLNAMESPACES() { return getToken(tsqlParser.XMLNAMESPACES, 0); }
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public With_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitWith_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_expressionContext with_expression() throws RecognitionException {
		With_expressionContext _localctx = new With_expressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_with_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026); match(WITH);
			setState(2029);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2027); match(XMLNAMESPACES);
				setState(2028); match(COMMA);
				}
				break;
			}
			setState(2031); common_table_expression();
			setState(2036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2032); match(COMMA);
				setState(2033); common_table_expression();
				}
				}
				setState(2038);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public IdContext expression_name;
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2039); ((Common_table_expressionContext)_localctx).expression_name = id();
			setState(2044);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(2040); match(LR_BRACKET);
				setState(2041); column_name_list();
				setState(2042); match(RR_BRACKET);
				}
			}

			setState(2046); match(AS);
			setState(2047); match(LR_BRACKET);
			setState(2048); select_statement();
			setState(2049); match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_elemContext extends ParserRuleContext {
		public IdContext udt_column_name;
		public IdContext method_name;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Update_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_elem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitUpdate_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_elemContext update_elem() throws RecognitionException {
		Update_elemContext _localctx = new Update_elemContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_update_elem);
		try {
			setState(2067);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2053);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(2051); full_column_name();
					}
					break;
				case LOCAL_ID:
					{
					setState(2052); match(LOCAL_ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2057);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(2055); match(EQUAL);
					}
					break;
				case PLUS_ASSIGN:
				case MINUS_ASSIGN:
				case MULT_ASSIGN:
				case DIV_ASSIGN:
				case MOD_ASSIGN:
				case AND_ASSIGN:
				case XOR_ASSIGN:
				case OR_ASSIGN:
					{
					setState(2056); assignment_operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2059); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2060); ((Update_elemContext)_localctx).udt_column_name = id();
				setState(2061); match(DOT);
				setState(2062); ((Update_elemContext)_localctx).method_name = id();
				setState(2063); match(LR_BRACKET);
				setState(2064); expression_list();
				setState(2065); match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Then_condition_listContext extends ParserRuleContext {
		public Then_conditionContext then_condition(int i) {
			return getRuleContext(Then_conditionContext.class,i);
		}
		public List<Then_conditionContext> then_condition() {
			return getRuleContexts(Then_conditionContext.class);
		}
		public Then_condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_condition_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitThen_condition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_condition_listContext then_condition_list() throws RecognitionException {
		Then_condition_listContext _localctx = new Then_condition_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_then_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2069); then_condition();
			setState(2073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CALL) | (1L << CASE) | (1L << CLOSE) | (1L << COALESCE) | (1L << COMMENT) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CONVERT) | (1L << CREATE) | (1L << CURRENT) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DEALLOCATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECLARE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DELETE - 64)) | (1L << (DROP - 64)) | (1L << (EXCEPTION - 64)) | (1L << (EXEC - 64)) | (1L << (EXECUTE - 64)) | (1L << (FETCH - 64)) | (1L << (FORCESEEK - 64)) | (1L << (GOTO - 64)) | (1L << (GRANT - 64)) | (1L << (IDENTITY - 64)) | (1L << (IF - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (LEFT - 132)) | (1L << (NULL - 132)) | (1L << (NULLIF - 132)) | (1L << (OPEN - 132)) | (1L << (PRINT - 132)) | (1L << (RAISERROR - 132)) | (1L << (REPLACE - 132)) | (1L << (RETURN - 132)) | (1L << (REVERT - 132)) | (1L << (RIGHT - 132)) | (1L << (ROLLBACK - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (SAVE - 198)) | (1L << (SELECT - 198)) | (1L << (SESSION_USER - 198)) | (1L << (SET - 198)) | (1L << (SYSTEM_USER - 198)) | (1L << (TRUNCATE - 198)) | (1L << (UPDATE - 198)) | (1L << (USE - 198)) | (1L << (WAITFOR - 198)) | (1L << (WHILE - 198)) | (1L << (WITH - 198)) | (1L << (ABSOLUTE - 198)) | (1L << (APPLY - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (AUTO - 262)) | (1L << (AVG - 262)) | (1L << (BASE64 - 262)) | (1L << (BINARY_CHECKSUM - 262)) | (1L << (CALLER - 262)) | (1L << (CAST - 262)) | (1L << (CATCH - 262)) | (1L << (CHECKSUM - 262)) | (1L << (CHECKSUM_AGG - 262)) | (1L << (COMMITTED - 262)) | (1L << (CONCAT - 262)) | (1L << (COOKIE - 262)) | (1L << (COUNT - 262)) | (1L << (COUNT_BIG - 262)) | (1L << (DATEADD - 262)) | (1L << (DATEDIFF - 262)) | (1L << (DATENAME - 262)) | (1L << (DATEPART - 262)) | (1L << (DELAY - 262)) | (1L << (DELETED - 262)) | (1L << (DENSE_RANK - 262)) | (1L << (DISABLE - 262)) | (1L << (DYNAMIC - 262)) | (1L << (ENCRYPTION - 262)) | (1L << (FAST - 262)) | (1L << (FAST_FORWARD - 262)) | (1L << (FIRST - 262)) | (1L << (FOLLOWING - 262)) | (1L << (FORWARD_ONLY - 262)) | (1L << (FULLSCAN - 262)) | (1L << (GLOBAL - 262)) | (1L << (GO - 262)) | (1L << (GROUPING - 262)) | (1L << (GROUPING_ID - 262)) | (1L << (HASH - 262)) | (1L << (INSENSITIVE - 262)) | (1L << (INSERTED - 262)) | (1L << (ISOLATION - 262)) | (1L << (KEEPFIXED - 262)) | (1L << (KEYSET - 262)) | (1L << (LAST - 262)) | (1L << (LEVEL - 262)) | (1L << (LOCAL - 262)) | (1L << (LOCK_ESCALATION - 262)) | (1L << (LOGIN - 262)) | (1L << (LOOP - 262)) | (1L << (MARK - 262)) | (1L << (MAX - 262)) | (1L << (MIN - 262)) | (1L << (MIN_ACTIVE_ROWVERSION - 262)) | (1L << (MOD - 262)) | (1L << (MODIFY - 262)) | (1L << (NEXT - 262)) | (1L << (NAME - 262)) | (1L << (NOCOUNT - 262)) | (1L << (NOEXPAND - 262)) | (1L << (NORECOMPUTE - 262)) | (1L << (NTILE - 262)) | (1L << (NUMBER - 262)) | (1L << (OFFSET - 262)) | (1L << (ONLY - 262)) | (1L << (OPTIMISTIC - 262)) | (1L << (OPTIMIZE - 262)) | (1L << (OUT - 262)))) != 0) || ((((_la - 326)) & ~0x3f) == 0 && ((1L << (_la - 326)) & ((1L << (OUTPUT - 326)) | (1L << (OWNER - 326)) | (1L << (PARTITION - 326)) | (1L << (PATH - 326)) | (1L << (PRECEDING - 326)) | (1L << (PRIOR - 326)) | (1L << (RANGE - 326)) | (1L << (RANK - 326)) | (1L << (READONLY - 326)) | (1L << (READ_ONLY - 326)) | (1L << (RECOMPILE - 326)) | (1L << (RELATIVE - 326)) | (1L << (REMOTE - 326)) | (1L << (REPEATABLE - 326)) | (1L << (ROOT - 326)) | (1L << (ROW - 326)) | (1L << (ROWGUID - 326)) | (1L << (ROWS - 326)) | (1L << (ROW_NUMBER - 326)) | (1L << (SAMPLE - 326)) | (1L << (SCHEMABINDING - 326)) | (1L << (SCROLL - 326)) | (1L << (SCROLL_LOCKS - 326)) | (1L << (SELF - 326)) | (1L << (SERIALIZABLE - 326)) | (1L << (SNAPSHOT - 326)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 326)) | (1L << (STATIC - 326)) | (1L << (STATS_STREAM - 326)) | (1L << (STDEV - 326)) | (1L << (STDEVP - 326)) | (1L << (SUM - 326)) | (1L << (THROW - 326)) | (1L << (TIES - 326)) | (1L << (TIME - 326)) | (1L << (TRY - 326)) | (1L << (TYPE - 326)) | (1L << (TYPE_WARNING - 326)) | (1L << (UNBOUNDED - 326)) | (1L << (UNCOMMITTED - 326)) | (1L << (UNKNOWN - 326)) | (1L << (USING - 326)) | (1L << (VAR - 326)) | (1L << (VARP - 326)) | (1L << (VIEW_METADATA - 326)) | (1L << (WORK - 326)) | (1L << (XML - 326)) | (1L << (XMLNAMESPACES - 326)) | (1L << (DOUBLE_QUOTE_ID - 326)) | (1L << (SQUARE_BRACKET_ID - 326)) | (1L << (LOCAL_ID - 326)) | (1L << (DECIMAL - 326)) | (1L << (ID - 326)) | (1L << (STRING - 326)) | (1L << (BINARY - 326)) | (1L << (FLOAT - 326)) | (1L << (REAL - 326)))) != 0) || ((((_la - 405)) & ~0x3f) == 0 && ((1L << (_la - 405)) & ((1L << (DOLLAR - 405)) | (1L << (LR_BRACKET - 405)) | (1L << (PLUS - 405)) | (1L << (MINUS - 405)) | (1L << (BIT_NOT - 405)))) != 0)) {
				{
				{
				setState(2070); then_condition();
				}
				}
				setState(2075);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Then_conditionContext extends ParserRuleContext {
		public Sql_clauseContext sql_clause() {
			return getRuleContext(Sql_clauseContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Then_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitThen_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_conditionContext then_condition() throws RecognitionException {
		Then_conditionContext _localctx = new Then_conditionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_then_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				{
				setState(2076); sql_clause();
				}
				break;

			case 2:
				{
				setState(2077); expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_listContext extends ParserRuleContext {
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public Search_condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSearch_condition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_condition_listContext search_condition_list() throws RecognitionException {
		Search_condition_listContext _localctx = new Search_condition_listContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_search_condition_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2080); search_condition();
			setState(2085);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(2081); match(COMMA);
					setState(2082); search_condition();
					}
					} 
				}
				setState(2087);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_conditionContext extends ParserRuleContext {
		public List<Search_condition_orContext> search_condition_or() {
			return getRuleContexts(Search_condition_orContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(tsqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(tsqlParser.AND, i);
		}
		public Search_condition_orContext search_condition_or(int i) {
			return getRuleContext(Search_condition_orContext.class,i);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSearch_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_search_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088); search_condition_or();
			setState(2093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(2089); match(AND);
				setState(2090); search_condition_or();
				}
				}
				setState(2095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_orContext extends ParserRuleContext {
		public List<Search_condition_notContext> search_condition_not() {
			return getRuleContexts(Search_condition_notContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(tsqlParser.OR); }
		public Search_condition_notContext search_condition_not(int i) {
			return getRuleContext(Search_condition_notContext.class,i);
		}
		public TerminalNode OR(int i) {
			return getToken(tsqlParser.OR, i);
		}
		public Search_condition_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_or; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSearch_condition_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_condition_orContext search_condition_or() throws RecognitionException {
		Search_condition_orContext _localctx = new Search_condition_orContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_search_condition_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2096); search_condition_not();
			setState(2101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(2097); match(OR);
				setState(2098); search_condition_not();
				}
				}
				setState(2103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_notContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public Search_condition_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_not; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSearch_condition_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_condition_notContext search_condition_not() throws RecognitionException {
		Search_condition_notContext _localctx = new Search_condition_notContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_search_condition_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2104); match(NOT);
				}
			}

			setState(2107); predicate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode ESCAPE() { return getToken(tsqlParser.ESCAPE, 0); }
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public TerminalNode EXISTS() { return getToken(tsqlParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ANY() { return getToken(tsqlParser.ANY, 0); }
		public TerminalNode AND() { return getToken(tsqlParser.AND, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IS() { return getToken(tsqlParser.IS, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public TerminalNode SOME() { return getToken(tsqlParser.SOME, 0); }
		public TerminalNode IN() { return getToken(tsqlParser.IN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(tsqlParser.BETWEEN, 0); }
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode LIKE() { return getToken(tsqlParser.LIKE, 0); }
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_predicate);
		int _la;
		try {
			setState(2164);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2109); match(EXISTS);
				setState(2110); match(LR_BRACKET);
				setState(2111); subquery();
				setState(2112); match(RR_BRACKET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2114); expression(0);
				setState(2115); comparison_operator();
				setState(2116); expression(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2118); expression(0);
				setState(2119); comparison_operator();
				setState(2120);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(2121); match(LR_BRACKET);
				setState(2122); subquery();
				setState(2123); match(RR_BRACKET);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2125); expression(0);
				setState(2127);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2126); match(NOT);
					}
				}

				setState(2129); match(BETWEEN);
				setState(2130); expression(0);
				setState(2131); match(AND);
				setState(2132); expression(0);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2134); expression(0);
				setState(2136);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2135); match(NOT);
					}
				}

				setState(2138); match(IN);
				setState(2139); match(LR_BRACKET);
				setState(2142);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2140); subquery();
					}
					break;

				case 2:
					{
					setState(2141); expression_list();
					}
					break;
				}
				setState(2144); match(RR_BRACKET);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2146); expression(0);
				setState(2148);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2147); match(NOT);
					}
				}

				setState(2150); match(LIKE);
				setState(2151); expression(0);
				setState(2154);
				_la = _input.LA(1);
				if (_la==ESCAPE) {
					{
					setState(2152); match(ESCAPE);
					setState(2153); expression(0);
					}
				}

				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2156); expression(0);
				setState(2157); match(IS);
				setState(2158); null_notnull();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2160); match(LR_BRACKET);
				setState(2161); search_condition();
				setState(2162); match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_expressionContext extends ParserRuleContext {
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitQuery_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_query_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(2166); query_specification();
				}
				break;
			case LR_BRACKET:
				{
				setState(2167); match(LR_BRACKET);
				setState(2168); query_expression();
				setState(2169); match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(2173); union();
					}
					} 
				}
				setState(2178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public Query_expressionContext query_expression(int i) {
			return getRuleContext(Query_expressionContext.class,i);
		}
		public TerminalNode EXCEPT() { return getToken(tsqlParser.EXCEPT, 0); }
		public TerminalNode UNION() { return getToken(tsqlParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public TerminalNode INTERSECT() { return getToken(tsqlParser.INTERSECT, 0); }
		public List<Query_expressionContext> query_expression() {
			return getRuleContexts(Query_expressionContext.class);
		}
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_union);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2185);
			switch (_input.LA(1)) {
			case UNION:
				{
				setState(2179); match(UNION);
				setState(2181);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(2180); match(ALL);
					}
				}

				}
				break;
			case EXCEPT:
				{
				setState(2183); match(EXCEPT);
				}
				break;
			case INTERSECT:
				{
				setState(2184); match(INTERSECT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2196);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(2187); query_specification();
				}
				break;
			case LR_BRACKET:
				{
				setState(2192); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2188); match(LR_BRACKET);
						setState(2189); query_expression();
						setState(2190); match(RR_BRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2194); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_specificationContext extends ParserRuleContext {
		public Table_nameContext into_table;
		public Search_conditionContext where;
		public Search_conditionContext having;
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public TerminalNode PERCENT() { return getToken(tsqlParser.PERCENT, 0); }
		public TerminalNode INTO() { return getToken(tsqlParser.INTO, 0); }
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TOP() { return getToken(tsqlParser.TOP, 0); }
		public TerminalNode SELECT() { return getToken(tsqlParser.SELECT, 0); }
		public TerminalNode WHERE() { return getToken(tsqlParser.WHERE, 0); }
		public List<Group_by_itemContext> group_by_item() {
			return getRuleContexts(Group_by_itemContext.class);
		}
		public TerminalNode DISTINCT() { return getToken(tsqlParser.DISTINCT, 0); }
		public TerminalNode HAVING() { return getToken(tsqlParser.HAVING, 0); }
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public TerminalNode BY() { return getToken(tsqlParser.BY, 0); }
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TIES() { return getToken(tsqlParser.TIES, 0); }
		public Group_by_itemContext group_by_item(int i) {
			return getRuleContext(Group_by_itemContext.class,i);
		}
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(tsqlParser.FROM, 0); }
		public TerminalNode GROUP() { return getToken(tsqlParser.GROUP, 0); }
		public Query_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitQuery_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_specificationContext query_specification() throws RecognitionException {
		Query_specificationContext _localctx = new Query_specificationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_query_specification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2198); match(SELECT);
			setState(2200);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(2199);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(2211);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(2202); match(TOP);
				setState(2203); expression(0);
				setState(2205);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(2204); match(PERCENT);
					}
				}

				setState(2209);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2207); match(WITH);
					setState(2208); match(TIES);
					}
				}

				}
			}

			setState(2213); select_list();
			setState(2216);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				{
				setState(2214); match(INTO);
				setState(2215); ((Query_specificationContext)_localctx).into_table = table_name();
				}
				break;
			}
			setState(2227);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				{
				setState(2218); match(FROM);
				setState(2219); table_source();
				setState(2224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(2220); match(COMMA);
						setState(2221); table_source();
						}
						} 
					}
					setState(2226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
				}
				}
				break;
			}
			setState(2231);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				setState(2229); match(WHERE);
				setState(2230); ((Query_specificationContext)_localctx).where = search_condition();
				}
				break;
			}
			setState(2243);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2233); match(GROUP);
				setState(2234); match(BY);
				setState(2235); group_by_item();
				setState(2240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(2236); match(COMMA);
						setState(2237); group_by_item();
						}
						} 
					}
					setState(2242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
				}
				}
				break;
			}
			setState(2247);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				{
				setState(2245); match(HAVING);
				setState(2246); ((Query_specificationContext)_localctx).having = search_condition();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(tsqlParser.NEXT, 0); }
		public TerminalNode FIRST() { return getToken(tsqlParser.FIRST, 0); }
		public List<Order_by_expressionContext> order_by_expression() {
			return getRuleContexts(Order_by_expressionContext.class);
		}
		public Order_by_expressionContext order_by_expression(int i) {
			return getRuleContext(Order_by_expressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode FETCH() { return getToken(tsqlParser.FETCH, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW(int i) {
			return getToken(tsqlParser.ROW, i);
		}
		public TerminalNode OFFSET() { return getToken(tsqlParser.OFFSET, 0); }
		public TerminalNode ORDER() { return getToken(tsqlParser.ORDER, 0); }
		public List<TerminalNode> ROW() { return getTokens(tsqlParser.ROW); }
		public List<TerminalNode> ROWS() { return getTokens(tsqlParser.ROWS); }
		public TerminalNode BY() { return getToken(tsqlParser.BY, 0); }
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode ROWS(int i) {
			return getToken(tsqlParser.ROWS, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2249); match(ORDER);
			setState(2250); match(BY);
			setState(2251); order_by_expression();
			setState(2256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(2252); match(COMMA);
					setState(2253); order_by_expression();
					}
					} 
				}
				setState(2258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
			}
			setState(2270);
			switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
			case 1:
				{
				setState(2259); match(OFFSET);
				setState(2260); expression(0);
				setState(2261);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(2268);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					setState(2262); match(FETCH);
					setState(2263);
					_la = _input.LA(1);
					if ( !(_la==FIRST || _la==NEXT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(2264); expression(0);
					setState(2265);
					_la = _input.LA(1);
					if ( !(_la==ROW || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(2266); match(ONLY);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_clauseContext extends ParserRuleContext {
		public TerminalNode BROWSE() { return getToken(tsqlParser.BROWSE, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public Xml_common_directivesContext xml_common_directives() {
			return getRuleContext(Xml_common_directivesContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode PATH() { return getToken(tsqlParser.PATH, 0); }
		public TerminalNode AUTO() { return getToken(tsqlParser.AUTO, 0); }
		public TerminalNode XML() { return getToken(tsqlParser.XML, 0); }
		public For_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitFor_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_clauseContext for_clause() throws RecognitionException {
		For_clauseContext _localctx = new For_clauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_for_clause);
		try {
			setState(2291);
			switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2272); match(FOR);
				setState(2273); match(BROWSE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2274); match(FOR);
				setState(2275); match(XML);
				setState(2276); match(AUTO);
				setState(2278);
				switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
				case 1:
					{
					setState(2277); xml_common_directives();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2280); match(FOR);
				setState(2281); match(XML);
				setState(2282); match(PATH);
				setState(2286);
				switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
				case 1:
					{
					setState(2283); match(LR_BRACKET);
					setState(2284); match(STRING);
					setState(2285); match(RR_BRACKET);
					}
					break;
				}
				setState(2289);
				switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
				case 1:
					{
					setState(2288); xml_common_directives();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_common_directivesContext extends ParserRuleContext {
		public TerminalNode ROOT() { return getToken(tsqlParser.ROOT, 0); }
		public TerminalNode BASE64() { return getToken(tsqlParser.BASE64, 0); }
		public TerminalNode BINARY() { return getToken(tsqlParser.BINARY, 0); }
		public TerminalNode TYPE() { return getToken(tsqlParser.TYPE, 0); }
		public Xml_common_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_common_directives; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitXml_common_directives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xml_common_directivesContext xml_common_directives() throws RecognitionException {
		Xml_common_directivesContext _localctx = new Xml_common_directivesContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_xml_common_directives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293); match(COMMA);
			setState(2298);
			switch (_input.LA(1)) {
			case BINARY:
				{
				setState(2294); match(BINARY);
				setState(2295); match(BASE64);
				}
				break;
			case TYPE:
				{
				setState(2296); match(TYPE);
				}
				break;
			case ROOT:
				{
				setState(2297); match(ROOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_expressionContext extends ParserRuleContext {
		public TerminalNode DESC() { return getToken(tsqlParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(tsqlParser.ASC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Order_by_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOrder_by_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_expressionContext order_by_expression() throws RecognitionException {
		Order_by_expressionContext _localctx = new Order_by_expressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_order_by_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300); expression(0);
			setState(2302);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2301);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Group_by_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitGroup_by_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_itemContext group_by_item() throws RecognitionException {
		Group_by_itemContext _localctx = new Group_by_itemContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_group_by_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2304); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_clauseContext extends ParserRuleContext {
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public TerminalNode OPTION() { return getToken(tsqlParser.OPTION, 0); }
		public Option_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOption_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Option_clauseContext option_clause() throws RecognitionException {
		Option_clauseContext _localctx = new Option_clauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_option_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2306); match(OPTION);
			setState(2307); match(LR_BRACKET);
			setState(2308); option();
			setState(2313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2309); match(COMMA);
				setState(2310); option();
				}
				}
				setState(2315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2316); match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public Token number_rows;
		public Optimize_for_argContext optimize_for_arg(int i) {
			return getRuleContext(Optimize_for_argContext.class,i);
		}
		public TerminalNode OPTIMIZE() { return getToken(tsqlParser.OPTIMIZE, 0); }
		public TerminalNode UNKNOWN() { return getToken(tsqlParser.UNKNOWN, 0); }
		public List<Optimize_for_argContext> optimize_for_arg() {
			return getRuleContexts(Optimize_for_argContext.class);
		}
		public TerminalNode UNION() { return getToken(tsqlParser.UNION, 0); }
		public TerminalNode ORDER() { return getToken(tsqlParser.ORDER, 0); }
		public TerminalNode CONCAT() { return getToken(tsqlParser.CONCAT, 0); }
		public TerminalNode FOR() { return getToken(tsqlParser.FOR, 0); }
		public TerminalNode PLAN() { return getToken(tsqlParser.PLAN, 0); }
		public TerminalNode FAST() { return getToken(tsqlParser.FAST, 0); }
		public TerminalNode HASH() { return getToken(tsqlParser.HASH, 0); }
		public TerminalNode KEEPFIXED() { return getToken(tsqlParser.KEEPFIXED, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public TerminalNode MERGE() { return getToken(tsqlParser.MERGE, 0); }
		public TerminalNode GROUP() { return getToken(tsqlParser.GROUP, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_option);
		int _la;
		try {
			setState(2342);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2318); match(FAST);
				setState(2319); ((OptionContext)_localctx).number_rows = match(DECIMAL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2320);
				_la = _input.LA(1);
				if ( !(_la==ORDER || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(2321); match(GROUP);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2322);
				_la = _input.LA(1);
				if ( !(_la==MERGE || _la==CONCAT || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(2323); match(UNION);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2324); match(KEEPFIXED);
				setState(2325); match(PLAN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2326); match(OPTIMIZE);
				setState(2327); match(FOR);
				setState(2328); match(LR_BRACKET);
				setState(2329); optimize_for_arg();
				setState(2334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2330); match(COMMA);
					setState(2331); optimize_for_arg();
					}
					}
					setState(2336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2337); match(RR_BRACKET);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2339); match(OPTIMIZE);
				setState(2340); match(FOR);
				setState(2341); match(UNKNOWN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optimize_for_argContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode UNKNOWN() { return getToken(tsqlParser.UNKNOWN, 0); }
		public Optimize_for_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimize_for_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOptimize_for_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optimize_for_argContext optimize_for_arg() throws RecognitionException {
		Optimize_for_argContext _localctx = new Optimize_for_argContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_optimize_for_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2344); match(LOCAL_ID);
			setState(2348);
			switch (_input.LA(1)) {
			case UNKNOWN:
				{
				setState(2345); match(UNKNOWN);
				}
				break;
			case EQUAL:
				{
				setState(2346); match(EQUAL);
				setState(2347); constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_elemContext> select_list_elem() {
			return getRuleContexts(Select_list_elemContext.class);
		}
		public Select_list_elemContext select_list_elem(int i) {
			return getRuleContext(Select_list_elemContext.class,i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2350); select_list_elem();
			setState(2355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(2351); match(COMMA);
					setState(2352); select_list_elem();
					}
					} 
				}
				setState(2357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_elemContext extends ParserRuleContext {
		public Table_nameContext tablename;
		public Column_aliasContext columnalias;
		public ExpressionContext expr;
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode ROWGUID() { return getToken(tsqlParser.ROWGUID, 0); }
		public TerminalNode IDENTITY() { return getToken(tsqlParser.IDENTITY, 0); }
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public As_table_aliasContext as_table_alias() {
			return getRuleContext(As_table_aliasContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Cfl_statementContext cfl_statement() {
			return getRuleContext(Cfl_statementContext.class,0);
		}
		public Select_list_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_elem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSelect_list_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_elemContext select_list_elem() throws RecognitionException {
		Select_list_elemContext _localctx = new Select_list_elemContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_select_list_elem);
		int _la;
		try {
			setState(2383);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2361);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (DOUBLE_QUOTE_ID - 324)) | (1L << (SQUARE_BRACKET_ID - 324)) | (1L << (ID - 324)))) != 0)) {
					{
					setState(2358); ((Select_list_elemContext)_localctx).tablename = table_name();
					setState(2359); match(DOT);
					}
				}

				setState(2366);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(2363); match(STAR);
					}
					break;
				case DOLLAR:
					{
					setState(2364); match(DOLLAR);
					setState(2365);
					_la = _input.LA(1);
					if ( !(_la==IDENTITY || _la==ROWGUID) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2368); ((Select_list_elemContext)_localctx).columnalias = column_alias();
				setState(2369); match(EQUAL);
				setState(2370); ((Select_list_elemContext)_localctx).expr = expression(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2372); ((Select_list_elemContext)_localctx).expr = expression(0);
				setState(2377);
				switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
				case 1:
					{
					setState(2374);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(2373); match(AS);
						}
					}

					setState(2376); ((Select_list_elemContext)_localctx).columnalias = column_alias();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2379); cfl_statement();
				setState(2381);
				switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
				case 1:
					{
					setState(2380); as_table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(tsqlParser.BY, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(tsqlParser.PARTITION, 0); }
		public Partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_by_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitPartition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_by_clauseContext partition_by_clause() throws RecognitionException {
		Partition_by_clauseContext _localctx = new Partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_partition_by_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385); match(PARTITION);
			setState(2386); match(BY);
			setState(2387); expression_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_sourceContext extends ParserRuleContext {
		public Table_source_item_joinedContext table_source_item_joined() {
			return getRuleContext(Table_source_item_joinedContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Table_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTable_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_sourceContext table_source() throws RecognitionException {
		Table_sourceContext _localctx = new Table_sourceContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_table_source);
		try {
			setState(2398);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2389); table_source_item_joined();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2390); match(LR_BRACKET);
				setState(2391); table_source_item_joined();
				setState(2392); match(RR_BRACKET);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2394); match(LR_BRACKET);
				setState(2395); subquery();
				setState(2396); match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_source_item_joinedContext extends ParserRuleContext {
		public Join_partContext join_part(int i) {
			return getRuleContext(Join_partContext.class,i);
		}
		public Table_source_itemContext table_source_item() {
			return getRuleContext(Table_source_itemContext.class,0);
		}
		public List<Join_partContext> join_part() {
			return getRuleContexts(Join_partContext.class);
		}
		public Table_source_item_joinedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source_item_joined; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTable_source_item_joined(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_source_item_joinedContext table_source_item_joined() throws RecognitionException {
		Table_source_item_joinedContext _localctx = new Table_source_item_joinedContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_table_source_item_joined);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2400); table_source_item();
			setState(2404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,370,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(2401); join_part();
					}
					} 
				}
				setState(2406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,370,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_source_itemContext extends ParserRuleContext {
		public Rowset_functionContext rowset_function() {
			return getRuleContext(Rowset_functionContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public As_table_aliasContext as_table_alias() {
			return getRuleContext(As_table_aliasContext.class,0);
		}
		public Column_alias_listContext column_alias_list() {
			return getRuleContext(Column_alias_listContext.class,0);
		}
		public Change_tableContext change_table() {
			return getRuleContext(Change_tableContext.class,0);
		}
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public Table_source_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTable_source_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_source_itemContext table_source_item() throws RecognitionException {
		Table_source_itemContext _localctx = new Table_source_itemContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_table_source_item);
		try {
			setState(2442);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2407); table_name_with_hint();
				setState(2409);
				switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
				case 1:
					{
					setState(2408); as_table_alias();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2411); rowset_function();
				setState(2413);
				switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
				case 1:
					{
					setState(2412); as_table_alias();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2415); derived_table();
				setState(2420);
				switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
				case 1:
					{
					setState(2416); as_table_alias();
					setState(2418);
					switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
					case 1:
						{
						setState(2417); column_alias_list();
						}
						break;
					}
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2422); change_table();
				setState(2423); as_table_alias();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2425); function_call();
				setState(2427);
				switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
				case 1:
					{
					setState(2426); as_table_alias();
					}
					break;
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2429); match(LOCAL_ID);
				setState(2431);
				switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
				case 1:
					{
					setState(2430); as_table_alias();
					}
					break;
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2433); match(LOCAL_ID);
				setState(2434); match(DOT);
				setState(2435); function_call();
				setState(2440);
				switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
				case 1:
					{
					setState(2436); as_table_alias();
					setState(2438);
					switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
					case 1:
						{
						setState(2437); column_alias_list();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Change_tableContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public TerminalNode CHANGETABLE() { return getToken(tsqlParser.CHANGETABLE, 0); }
		public TerminalNode CHANGES() { return getToken(tsqlParser.CHANGES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Change_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitChange_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Change_tableContext change_table() throws RecognitionException {
		Change_tableContext _localctx = new Change_tableContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_change_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2444); match(CHANGETABLE);
			setState(2445); match(LR_BRACKET);
			setState(2446); match(CHANGES);
			setState(2447); table_name();
			setState(2448); match(COMMA);
			setState(2449);
			_la = _input.LA(1);
			if ( !(_la==NULL || _la==LOCAL_ID || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(2450); match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_partContext extends ParserRuleContext {
		public Token join_type;
		public Token join_hint;
		public TerminalNode JOIN() { return getToken(tsqlParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(tsqlParser.OUTER, 0); }
		public TerminalNode FULL() { return getToken(tsqlParser.FULL, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(tsqlParser.LOOP, 0); }
		public TerminalNode LEFT() { return getToken(tsqlParser.LEFT, 0); }
		public TerminalNode APPLY() { return getToken(tsqlParser.APPLY, 0); }
		public TerminalNode REMOTE() { return getToken(tsqlParser.REMOTE, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public TerminalNode CROSS() { return getToken(tsqlParser.CROSS, 0); }
		public Table_sourceContext table_source() {
			return getRuleContext(Table_sourceContext.class,0);
		}
		public TerminalNode INNER() { return getToken(tsqlParser.INNER, 0); }
		public TerminalNode HASH() { return getToken(tsqlParser.HASH, 0); }
		public TerminalNode RIGHT() { return getToken(tsqlParser.RIGHT, 0); }
		public TerminalNode MERGE() { return getToken(tsqlParser.MERGE, 0); }
		public Join_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_part; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitJoin_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_partContext join_part() throws RecognitionException {
		Join_partContext _localctx = new Join_partContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_join_part);
		int _la;
		try {
			setState(2478);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2459);
				switch (_input.LA(1)) {
				case INNER:
				case JOIN:
				case MERGE:
				case HASH:
				case LOOP:
				case REMOTE:
					{
					setState(2453);
					_la = _input.LA(1);
					if (_la==INNER) {
						{
						setState(2452); match(INNER);
						}
					}

					}
					break;
				case FULL:
				case LEFT:
				case RIGHT:
					{
					setState(2455);
					((Join_partContext)_localctx).join_type = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==LEFT || _la==RIGHT) ) {
						((Join_partContext)_localctx).join_type = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(2457);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(2456); match(OUTER);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2462);
				_la = _input.LA(1);
				if (_la==MERGE || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (HASH - 296)) | (1L << (LOOP - 296)) | (1L << (REMOTE - 296)))) != 0)) {
					{
					setState(2461);
					((Join_partContext)_localctx).join_hint = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MERGE || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (HASH - 296)) | (1L << (LOOP - 296)) | (1L << (REMOTE - 296)))) != 0)) ) {
						((Join_partContext)_localctx).join_hint = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(2464); match(JOIN);
				setState(2465); table_source();
				setState(2466); match(ON);
				setState(2467); search_condition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2469); match(CROSS);
				setState(2470); match(JOIN);
				setState(2471); table_source();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2472); match(CROSS);
				setState(2473); match(APPLY);
				setState(2474); table_source();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2475); match(OUTER);
				setState(2476); match(APPLY);
				setState(2477); table_source();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_name_with_hintContext extends ParserRuleContext {
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_name_with_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name_with_hint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTable_name_with_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_name_with_hintContext table_name_with_hint() throws RecognitionException {
		Table_name_with_hintContext _localctx = new Table_name_with_hintContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_table_name_with_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2480); table_name();
			setState(2482);
			switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
			case 1:
				{
				setState(2481); with_table_hints();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rowset_functionContext extends ParserRuleContext {
		public Token data_file;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENROWSET() { return getToken(tsqlParser.OPENROWSET, 0); }
		public TerminalNode BULK() { return getToken(tsqlParser.BULK, 0); }
		public Bulk_optionContext bulk_option() {
			return getRuleContext(Bulk_optionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Rowset_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowset_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitRowset_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rowset_functionContext rowset_function() throws RecognitionException {
		Rowset_functionContext _localctx = new Rowset_functionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_rowset_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2484); match(OPENROWSET);
			setState(2485); match(LR_BRACKET);
			setState(2486); match(BULK);
			setState(2487); ((Rowset_functionContext)_localctx).data_file = match(STRING);
			setState(2488); match(COMMA);
			setState(2498);
			switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
			case 1:
				{
				setState(2489); bulk_option();
				setState(2494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2490); match(COMMA);
					setState(2491); bulk_option();
					}
					}
					setState(2496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				{
				setState(2497); id();
				}
				break;
			}
			setState(2500); match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bulk_optionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Bulk_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulk_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitBulk_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bulk_optionContext bulk_option() throws RecognitionException {
		Bulk_optionContext _localctx = new Bulk_optionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_bulk_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2502); id();
			setState(2503); match(EQUAL);
			setState(2504);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_tableContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Table_value_constructorContext table_value_constructor() {
			return getRuleContext(Table_value_constructorContext.class,0);
		}
		public Derived_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDerived_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Derived_tableContext derived_table() throws RecognitionException {
		Derived_tableContext _localctx = new Derived_tableContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_derived_table);
		try {
			setState(2512);
			switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2506); subquery();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2507); match(LR_BRACKET);
				setState(2508); subquery();
				setState(2509); match(RR_BRACKET);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2511); table_value_constructor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public ExpressionContext style;
		public Token seed;
		public Token increment;
		public TerminalNode TIMESTAMP() { return getToken(tsqlParser.TIMESTAMP, 0); }
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public TerminalNode COALESCE() { return getToken(tsqlParser.COALESCE, 0); }
		public TerminalNode IDENTITY() { return getToken(tsqlParser.IDENTITY, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(tsqlParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode NULLIF() { return getToken(tsqlParser.NULLIF, 0); }
		public Replace_statementContext replace_statement() {
			return getRuleContext(Replace_statementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DATENAME() { return getToken(tsqlParser.DATENAME, 0); }
		public Scalar_function_nameContext scalar_function_name() {
			return getRuleContext(Scalar_function_nameContext.class,0);
		}
		public TerminalNode MIN_ACTIVE_ROWVERSION() { return getToken(tsqlParser.MIN_ACTIVE_ROWVERSION, 0); }
		public TerminalNode SYSTEM_USER() { return getToken(tsqlParser.SYSTEM_USER, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CHECKSUM() { return getToken(tsqlParser.CHECKSUM, 0); }
		public TerminalNode DECIMAL(int i) {
			return getToken(tsqlParser.DECIMAL, i);
		}
		public TerminalNode BINARY_CHECKSUM() { return getToken(tsqlParser.BINARY_CHECKSUM, 0); }
		public TerminalNode CONVERT() { return getToken(tsqlParser.CONVERT, 0); }
		public Aggregate_windowed_functionContext aggregate_windowed_function() {
			return getRuleContext(Aggregate_windowed_functionContext.class,0);
		}
		public Ranking_windowed_functionContext ranking_windowed_function() {
			return getRuleContext(Ranking_windowed_functionContext.class,0);
		}
		public TerminalNode CAST() { return getToken(tsqlParser.CAST, 0); }
		public DatepartContext datepart() {
			return getRuleContext(DatepartContext.class,0);
		}
		public TerminalNode DATEADD() { return getToken(tsqlParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(tsqlParser.DATEDIFF, 0); }
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public Declare_typeContext declare_type() {
			return getRuleContext(Declare_typeContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode SESSION_USER() { return getToken(tsqlParser.SESSION_USER, 0); }
		public TerminalNode CURRENT_USER() { return getToken(tsqlParser.CURRENT_USER, 0); }
		public TerminalNode DATEPART() { return getToken(tsqlParser.DATEPART, 0); }
		public TerminalNode MOD() { return getToken(tsqlParser.MOD, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(tsqlParser.DECIMAL); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_function_call);
		int _la;
		try {
			setState(2621);
			switch ( getInterpreter().adaptivePredict(_input,393,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2514); ranking_windowed_function();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2515); aggregate_windowed_function();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2516); scalar_function_name();
				setState(2517); match(LR_BRACKET);
				setState(2519);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (CASE - 25)) | (1L << (COALESCE - 25)) | (1L << (CONVERT - 25)) | (1L << (CURRENT - 25)) | (1L << (CURRENT_TIMESTAMP - 25)) | (1L << (CURRENT_USER - 25)) | (1L << (DEFAULT - 25)))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (FORCESEEK - 97)) | (1L << (IDENTITY - 97)) | (1L << (LEFT - 97)) | (1L << (NULL - 97)) | (1L << (NULLIF - 97)))) != 0) || ((((_la - 182)) & ~0x3f) == 0 && ((1L << (_la - 182)) & ((1L << (REPLACE - 182)) | (1L << (RIGHT - 182)) | (1L << (SESSION_USER - 182)) | (1L << (SYSTEM_USER - 182)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (BINARY_CHECKSUM - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DATEADD - 260)) | (1L << (DATEDIFF - 260)) | (1L << (DATENAME - 260)) | (1L << (DATEPART - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MIN_ACTIVE_ROWVERSION - 260)) | (1L << (MOD - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (DOUBLE_QUOTE_ID - 324)) | (1L << (SQUARE_BRACKET_ID - 324)) | (1L << (LOCAL_ID - 324)) | (1L << (DECIMAL - 324)) | (1L << (ID - 324)) | (1L << (STRING - 324)) | (1L << (BINARY - 324)) | (1L << (FLOAT - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (REAL - 388)) | (1L << (DOLLAR - 388)) | (1L << (LR_BRACKET - 388)) | (1L << (PLUS - 388)) | (1L << (MINUS - 388)) | (1L << (BIT_NOT - 388)))) != 0)) {
					{
					setState(2518); expression_list();
					}
				}

				setState(2521); match(RR_BRACKET);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2523); match(BINARY_CHECKSUM);
				setState(2524); match(LR_BRACKET);
				setState(2525); match(STAR);
				setState(2526); match(RR_BRACKET);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2527); match(CAST);
				setState(2528); match(LR_BRACKET);
				setState(2529); expression(0);
				setState(2530); match(AS);
				setState(2531); declare_type();
				setState(2532); match(RR_BRACKET);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2534); match(CONVERT);
				setState(2535); match(LR_BRACKET);
				setState(2536); declare_type();
				setState(2537); match(COMMA);
				setState(2538); expression(0);
				setState(2541);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2539); match(COMMA);
					setState(2540); ((Function_callContext)_localctx).style = expression(0);
					}
				}

				setState(2543); match(RR_BRACKET);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2545); match(CHECKSUM);
				setState(2546); match(LR_BRACKET);
				setState(2547); match(STAR);
				setState(2548); match(RR_BRACKET);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2549); match(COALESCE);
				setState(2550); match(LR_BRACKET);
				setState(2551); expression_list();
				setState(2552); match(RR_BRACKET);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2554); match(CURRENT_TIMESTAMP);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2555); match(CURRENT_USER);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2556); match(DATEADD);
				setState(2557); match(LR_BRACKET);
				setState(2558); datepart();
				setState(2559); match(COMMA);
				setState(2560); expression(0);
				setState(2561); match(COMMA);
				setState(2562); expression(0);
				setState(2563); match(RR_BRACKET);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2565); match(DATEDIFF);
				setState(2566); match(LR_BRACKET);
				setState(2567); datepart();
				setState(2568); match(COMMA);
				setState(2569); expression(0);
				setState(2570); match(COMMA);
				setState(2571); expression(0);
				setState(2572); match(RR_BRACKET);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2574); match(DATENAME);
				setState(2575); match(LR_BRACKET);
				setState(2576); datepart();
				setState(2577); match(COMMA);
				setState(2578); expression(0);
				setState(2579); match(RR_BRACKET);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2581); match(DATEPART);
				setState(2582); match(LR_BRACKET);
				setState(2583); datepart();
				setState(2584); match(COMMA);
				setState(2585); expression(0);
				setState(2586); match(RR_BRACKET);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2588); match(IDENTITY);
				setState(2589); match(LR_BRACKET);
				setState(2590); declare_type();
				setState(2593);
				switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
				case 1:
					{
					setState(2591); match(COMMA);
					setState(2592); ((Function_callContext)_localctx).seed = match(DECIMAL);
					}
					break;
				}
				setState(2597);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2595); match(COMMA);
					setState(2596); ((Function_callContext)_localctx).increment = match(DECIMAL);
					}
				}

				setState(2599); match(RR_BRACKET);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2601); match(MIN_ACTIVE_ROWVERSION);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2602); match(MOD);
				setState(2603); match(LR_BRACKET);
				setState(2604); expression(0);
				setState(2605); match(COMMA);
				setState(2606); expression(0);
				setState(2607); match(RR_BRACKET);
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2609); match(NULLIF);
				setState(2610); match(LR_BRACKET);
				setState(2611); expression(0);
				setState(2612); match(COMMA);
				setState(2613); expression(0);
				setState(2614); match(RR_BRACKET);
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2616); match(SESSION_USER);
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2617); match(SYSTEM_USER);
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2618); match(CURRENT);
				setState(2619); match(TIMESTAMP);
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2620); replace_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatepartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public DatepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datepart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDatepart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatepartContext datepart() throws RecognitionException {
		DatepartContext _localctx = new DatepartContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_datepart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2623); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class As_table_aliasContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(tsqlParser.AS, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public As_table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_table_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitAs_table_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_table_aliasContext as_table_alias() throws RecognitionException {
		As_table_aliasContext _localctx = new As_table_aliasContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_as_table_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2626);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2625); match(AS);
				}
			}

			setState(2628); table_alias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2630); id();
			setState(2632);
			switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
			case 1:
				{
				setState(2631); with_table_hints();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_table_hintsContext extends ParserRuleContext {
		public Table_hintContext table_hint(int i) {
			return getRuleContext(Table_hintContext.class,i);
		}
		public TerminalNode WITH() { return getToken(tsqlParser.WITH, 0); }
		public List<Table_hintContext> table_hint() {
			return getRuleContexts(Table_hintContext.class);
		}
		public With_table_hintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_table_hints; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitWith_table_hints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_table_hintsContext with_table_hints() throws RecognitionException {
		With_table_hintsContext _localctx = new With_table_hintsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_with_table_hints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2635);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2634); match(WITH);
				}
			}

			setState(2637); match(LR_BRACKET);
			setState(2638); table_hint();
			setState(2643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2639); match(COMMA);
				setState(2640); table_hint();
				}
				}
				setState(2645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2646); match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_hintContext extends ParserRuleContext {
		public TerminalNode SERIALIZABLE() { return getToken(tsqlParser.SERIALIZABLE, 0); }
		public TerminalNode NOEXPAND() { return getToken(tsqlParser.NOEXPAND, 0); }
		public Index_column_nameContext index_column_name() {
			return getRuleContext(Index_column_nameContext.class,0);
		}
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public TerminalNode SPATIAL_WINDOW_MAX_CELLS() { return getToken(tsqlParser.SPATIAL_WINDOW_MAX_CELLS, 0); }
		public TerminalNode FORCESEEK() { return getToken(tsqlParser.FORCESEEK, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Index_valueContext index_value() {
			return getRuleContext(Index_valueContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(tsqlParser.INDEX, 0); }
		public TerminalNode SNAPSHOT() { return getToken(tsqlParser.SNAPSHOT, 0); }
		public Table_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_hint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTable_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_hintContext table_hint() throws RecognitionException {
		Table_hintContext _localctx = new Table_hintContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_table_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2649);
			_la = _input.LA(1);
			if (_la==NOEXPAND) {
				{
				setState(2648); match(NOEXPAND);
				}
			}

			setState(2689);
			switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
			case 1:
				{
				setState(2651); match(INDEX);
				setState(2652); match(LR_BRACKET);
				setState(2653); index_value();
				setState(2658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2654); match(COMMA);
					setState(2655); index_value();
					}
					}
					setState(2660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2661); match(RR_BRACKET);
				}
				break;

			case 2:
				{
				setState(2663); match(INDEX);
				setState(2664); match(EQUAL);
				setState(2665); index_value();
				}
				break;

			case 3:
				{
				setState(2666); match(FORCESEEK);
				setState(2681);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(2667); match(LR_BRACKET);
					setState(2668); index_value();
					setState(2669); match(LR_BRACKET);
					setState(2670); index_column_name();
					setState(2675);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2671); match(COMMA);
						setState(2672); index_column_name();
						}
						}
						setState(2677);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2678); match(RR_BRACKET);
					setState(2679); match(RR_BRACKET);
					}
				}

				}
				break;

			case 4:
				{
				setState(2683); match(SERIALIZABLE);
				}
				break;

			case 5:
				{
				setState(2684); match(SNAPSHOT);
				}
				break;

			case 6:
				{
				setState(2685); match(SPATIAL_WINDOW_MAX_CELLS);
				setState(2686); match(EQUAL);
				setState(2687); match(DECIMAL);
				}
				break;

			case 7:
				{
				setState(2688); match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public Index_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitIndex_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_column_nameContext index_column_name() throws RecognitionException {
		Index_column_nameContext _localctx = new Index_column_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_index_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2691); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Index_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitIndex_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_valueContext index_value() throws RecognitionException {
		Index_valueContext _localctx = new Index_valueContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_index_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2693);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_alias_listContext extends ParserRuleContext {
		public Column_aliasContext columnname;
		public List<Column_aliasContext> column_alias() {
			return getRuleContexts(Column_aliasContext.class);
		}
		public Column_aliasContext column_alias(int i) {
			return getRuleContext(Column_aliasContext.class,i);
		}
		public Column_alias_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitColumn_alias_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_alias_listContext column_alias_list() throws RecognitionException {
		Column_alias_listContext _localctx = new Column_alias_listContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_column_alias_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2695); match(LR_BRACKET);
			setState(2696); ((Column_alias_listContext)_localctx).columnname = column_alias();
			setState(2701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2697); match(COMMA);
				setState(2698); ((Column_alias_listContext)_localctx).columnname = column_alias();
				}
				}
				setState(2703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2704); match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_column_alias);
		try {
			setState(2708);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2706); id();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2707); match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_value_constructorContext extends ParserRuleContext {
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public TerminalNode VALUES() { return getToken(tsqlParser.VALUES, 0); }
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public Table_value_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_value_constructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTable_value_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_value_constructorContext table_value_constructor() throws RecognitionException {
		Table_value_constructorContext _localctx = new Table_value_constructorContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_table_value_constructor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2710); match(VALUES);
			setState(2711); match(LR_BRACKET);
			setState(2712); expression_list();
			setState(2713); match(RR_BRACKET);
			setState(2721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,405,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(2714); match(COMMA);
					setState(2715); match(LR_BRACKET);
					setState(2716); expression_list();
					setState(2717); match(RR_BRACKET);
					}
					} 
				}
				setState(2723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,405,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2724); expression(0);
			setState(2729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2725); match(COMMA);
				setState(2726); expression(0);
				}
				}
				setState(2731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_exprContext extends ParserRuleContext {
		public List<TerminalNode> THEN() { return getTokens(tsqlParser.THEN); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WHEN(int i) {
			return getToken(tsqlParser.WHEN, i);
		}
		public TerminalNode THEN(int i) {
			return getToken(tsqlParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(tsqlParser.ELSE, 0); }
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public TerminalNode CASE() { return getToken(tsqlParser.CASE, 0); }
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> WHEN() { return getTokens(tsqlParser.WHEN); }
		public TerminalNode END() { return getToken(tsqlParser.END, 0); }
		public Case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitCase_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_case_expr);
		int _la;
		try {
			setState(2765);
			switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2732); match(CASE);
				setState(2733); expression(0);
				setState(2739); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2734); match(WHEN);
					setState(2735); expression(0);
					setState(2736); match(THEN);
					setState(2737); expression(0);
					}
					}
					setState(2741); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2745);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2743); match(ELSE);
					setState(2744); expression(0);
					}
				}

				setState(2747); match(END);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2749); match(CASE);
				setState(2755); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2750); match(WHEN);
					setState(2751); search_condition();
					setState(2752); match(THEN);
					setState(2753); expression(0);
					}
					}
					setState(2757); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2761);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2759); match(ELSE);
					setState(2760); expression(0);
					}
				}

				setState(2763); match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ranking_windowed_functionContext extends ParserRuleContext {
		public TerminalNode DENSE_RANK() { return getToken(tsqlParser.DENSE_RANK, 0); }
		public TerminalNode RANK() { return getToken(tsqlParser.RANK, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(tsqlParser.ROW_NUMBER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NTILE() { return getToken(tsqlParser.NTILE, 0); }
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public Ranking_windowed_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranking_windowed_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitRanking_windowed_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ranking_windowed_functionContext ranking_windowed_function() throws RecognitionException {
		Ranking_windowed_functionContext _localctx = new Ranking_windowed_functionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_ranking_windowed_function);
		try {
			setState(2785);
			switch (_input.LA(1)) {
			case RANK:
				enterOuterAlt(_localctx, 1);
				{
				setState(2767); match(RANK);
				setState(2768); match(LR_BRACKET);
				setState(2769); match(RR_BRACKET);
				setState(2770); over_clause();
				}
				break;
			case DENSE_RANK:
				enterOuterAlt(_localctx, 2);
				{
				setState(2771); match(DENSE_RANK);
				setState(2772); match(LR_BRACKET);
				setState(2773); match(RR_BRACKET);
				setState(2774); over_clause();
				}
				break;
			case NTILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2775); match(NTILE);
				setState(2776); match(LR_BRACKET);
				setState(2777); expression(0);
				setState(2778); match(RR_BRACKET);
				setState(2779); over_clause();
				}
				break;
			case ROW_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2781); match(ROW_NUMBER);
				setState(2782); match(LR_BRACKET);
				setState(2783); match(RR_BRACKET);
				setState(2784); over_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_windowed_functionContext extends ParserRuleContext {
		public TerminalNode STDEVP() { return getToken(tsqlParser.STDEVP, 0); }
		public TerminalNode SUM() { return getToken(tsqlParser.SUM, 0); }
		public TerminalNode COUNT_BIG() { return getToken(tsqlParser.COUNT_BIG, 0); }
		public TerminalNode AVG() { return getToken(tsqlParser.AVG, 0); }
		public TerminalNode STDEV() { return getToken(tsqlParser.STDEV, 0); }
		public All_distinct_expressionContext all_distinct_expression() {
			return getRuleContext(All_distinct_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MIN() { return getToken(tsqlParser.MIN, 0); }
		public TerminalNode CHECKSUM_AGG() { return getToken(tsqlParser.CHECKSUM_AGG, 0); }
		public TerminalNode GROUPING() { return getToken(tsqlParser.GROUPING, 0); }
		public TerminalNode MAX() { return getToken(tsqlParser.MAX, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode COUNT() { return getToken(tsqlParser.COUNT, 0); }
		public TerminalNode VARP() { return getToken(tsqlParser.VARP, 0); }
		public TerminalNode GROUPING_ID() { return getToken(tsqlParser.GROUPING_ID, 0); }
		public TerminalNode VAR() { return getToken(tsqlParser.VAR, 0); }
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public Aggregate_windowed_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_windowed_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitAggregate_windowed_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_windowed_functionContext aggregate_windowed_function() throws RecognitionException {
		Aggregate_windowed_functionContext _localctx = new Aggregate_windowed_functionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_aggregate_windowed_function);
		try {
			setState(2878);
			switch (_input.LA(1)) {
			case AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2787); match(AVG);
				setState(2788); match(LR_BRACKET);
				setState(2789); all_distinct_expression();
				setState(2790); match(RR_BRACKET);
				setState(2792);
				switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
				case 1:
					{
					setState(2791); over_clause();
					}
					break;
				}
				}
				break;
			case CHECKSUM_AGG:
				enterOuterAlt(_localctx, 2);
				{
				setState(2794); match(CHECKSUM_AGG);
				setState(2795); match(LR_BRACKET);
				setState(2796); all_distinct_expression();
				setState(2797); match(RR_BRACKET);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 3);
				{
				setState(2799); match(GROUPING);
				setState(2800); match(LR_BRACKET);
				setState(2801); expression(0);
				setState(2802); match(RR_BRACKET);
				}
				break;
			case GROUPING_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(2804); match(GROUPING_ID);
				setState(2805); match(LR_BRACKET);
				setState(2806); expression_list();
				setState(2807); match(RR_BRACKET);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(2809); match(MAX);
				setState(2810); match(LR_BRACKET);
				setState(2811); all_distinct_expression();
				setState(2812); match(RR_BRACKET);
				setState(2814);
				switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
				case 1:
					{
					setState(2813); over_clause();
					}
					break;
				}
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(2816); match(MIN);
				setState(2817); match(LR_BRACKET);
				setState(2818); all_distinct_expression();
				setState(2819); match(RR_BRACKET);
				setState(2821);
				switch ( getInterpreter().adaptivePredict(_input,415,_ctx) ) {
				case 1:
					{
					setState(2820); over_clause();
					}
					break;
				}
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 7);
				{
				setState(2823); match(SUM);
				setState(2824); match(LR_BRACKET);
				setState(2825); all_distinct_expression();
				setState(2826); match(RR_BRACKET);
				setState(2828);
				switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
				case 1:
					{
					setState(2827); over_clause();
					}
					break;
				}
				}
				break;
			case STDEV:
				enterOuterAlt(_localctx, 8);
				{
				setState(2830); match(STDEV);
				setState(2831); match(LR_BRACKET);
				setState(2832); all_distinct_expression();
				setState(2833); match(RR_BRACKET);
				setState(2835);
				switch ( getInterpreter().adaptivePredict(_input,417,_ctx) ) {
				case 1:
					{
					setState(2834); over_clause();
					}
					break;
				}
				}
				break;
			case STDEVP:
				enterOuterAlt(_localctx, 9);
				{
				setState(2837); match(STDEVP);
				setState(2838); match(LR_BRACKET);
				setState(2839); all_distinct_expression();
				setState(2840); match(RR_BRACKET);
				setState(2842);
				switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
				case 1:
					{
					setState(2841); over_clause();
					}
					break;
				}
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(2844); match(VAR);
				setState(2845); match(LR_BRACKET);
				setState(2846); all_distinct_expression();
				setState(2847); match(RR_BRACKET);
				setState(2849);
				switch ( getInterpreter().adaptivePredict(_input,419,_ctx) ) {
				case 1:
					{
					setState(2848); over_clause();
					}
					break;
				}
				}
				break;
			case VARP:
				enterOuterAlt(_localctx, 11);
				{
				setState(2851); match(VARP);
				setState(2852); match(LR_BRACKET);
				setState(2853); all_distinct_expression();
				setState(2854); match(RR_BRACKET);
				setState(2856);
				switch ( getInterpreter().adaptivePredict(_input,420,_ctx) ) {
				case 1:
					{
					setState(2855); over_clause();
					}
					break;
				}
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 12);
				{
				setState(2858); match(COUNT);
				setState(2859); match(LR_BRACKET);
				setState(2862);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(2860); match(STAR);
					}
					break;
				case ALL:
				case CASE:
				case COALESCE:
				case CONVERT:
				case CURRENT:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DEFAULT:
				case DISTINCT:
				case FORCESEEK:
				case IDENTITY:
				case LEFT:
				case NULL:
				case NULLIF:
				case REPLACE:
				case RIGHT:
				case SESSION_USER:
				case SYSTEM_USER:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case BINARY_CHECKSUM:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATEADD:
				case DATEDIFF:
				case DATENAME:
				case DATEPART:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MIN_ACTIVE_ROWVERSION:
				case MOD:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
					{
					setState(2861); all_distinct_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2864); match(RR_BRACKET);
				setState(2866);
				switch ( getInterpreter().adaptivePredict(_input,422,_ctx) ) {
				case 1:
					{
					setState(2865); over_clause();
					}
					break;
				}
				}
				break;
			case COUNT_BIG:
				enterOuterAlt(_localctx, 13);
				{
				setState(2868); match(COUNT_BIG);
				setState(2869); match(LR_BRACKET);
				setState(2872);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(2870); match(STAR);
					}
					break;
				case ALL:
				case CASE:
				case COALESCE:
				case CONVERT:
				case CURRENT:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DEFAULT:
				case DISTINCT:
				case FORCESEEK:
				case IDENTITY:
				case LEFT:
				case NULL:
				case NULLIF:
				case REPLACE:
				case RIGHT:
				case SESSION_USER:
				case SYSTEM_USER:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case BINARY_CHECKSUM:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATEADD:
				case DATEDIFF:
				case DATENAME:
				case DATEPART:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MIN:
				case MIN_ACTIVE_ROWVERSION:
				case MOD:
				case MODIFY:
				case NEXT:
				case NAME:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
					{
					setState(2871); all_distinct_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2874); match(RR_BRACKET);
				setState(2876);
				switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
				case 1:
					{
					setState(2875); over_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_distinct_expressionContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(tsqlParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(tsqlParser.DISTINCT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public All_distinct_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_distinct_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitAll_distinct_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_distinct_expressionContext all_distinct_expression() throws RecognitionException {
		All_distinct_expressionContext _localctx = new All_distinct_expressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_all_distinct_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2881);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(2880);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(2883); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Over_clauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(tsqlParser.OVER, 0); }
		public Row_or_range_clauseContext row_or_range_clause() {
			return getRuleContext(Row_or_range_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Partition_by_clauseContext partition_by_clause() {
			return getRuleContext(Partition_by_clauseContext.class,0);
		}
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOver_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2885); match(OVER);
			setState(2886); match(LR_BRACKET);
			setState(2888);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2887); partition_by_clause();
				}
			}

			setState(2891);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(2890); order_by_clause();
				}
			}

			setState(2894);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(2893); row_or_range_clause();
				}
			}

			setState(2896); match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_or_range_clauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(tsqlParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public Window_frame_extentContext window_frame_extent() {
			return getRuleContext(Window_frame_extentContext.class,0);
		}
		public Row_or_range_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_or_range_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitRow_or_range_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_or_range_clauseContext row_or_range_clause() throws RecognitionException {
		Row_or_range_clauseContext _localctx = new Row_or_range_clauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_row_or_range_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2898);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(2899); window_frame_extent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_extentContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(tsqlParser.BETWEEN, 0); }
		public Window_frame_boundContext window_frame_bound(int i) {
			return getRuleContext(Window_frame_boundContext.class,i);
		}
		public Window_frame_precedingContext window_frame_preceding() {
			return getRuleContext(Window_frame_precedingContext.class,0);
		}
		public TerminalNode AND() { return getToken(tsqlParser.AND, 0); }
		public List<Window_frame_boundContext> window_frame_bound() {
			return getRuleContexts(Window_frame_boundContext.class);
		}
		public Window_frame_extentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_extent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitWindow_frame_extent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_extentContext window_frame_extent() throws RecognitionException {
		Window_frame_extentContext _localctx = new Window_frame_extentContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_window_frame_extent);
		try {
			setState(2907);
			switch (_input.LA(1)) {
			case CURRENT:
			case UNBOUNDED:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2901); window_frame_preceding();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2902); match(BETWEEN);
				setState(2903); window_frame_bound();
				setState(2904); match(AND);
				setState(2905); window_frame_bound();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_boundContext extends ParserRuleContext {
		public Window_frame_followingContext window_frame_following() {
			return getRuleContext(Window_frame_followingContext.class,0);
		}
		public Window_frame_precedingContext window_frame_preceding() {
			return getRuleContext(Window_frame_precedingContext.class,0);
		}
		public Window_frame_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_bound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitWindow_frame_bound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_boundContext window_frame_bound() throws RecognitionException {
		Window_frame_boundContext _localctx = new Window_frame_boundContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_window_frame_bound);
		try {
			setState(2911);
			switch ( getInterpreter().adaptivePredict(_input,431,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2909); window_frame_preceding();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2910); window_frame_following();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_precedingContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(tsqlParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(tsqlParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(tsqlParser.PRECEDING, 0); }
		public TerminalNode CURRENT() { return getToken(tsqlParser.CURRENT, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Window_frame_precedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_preceding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitWindow_frame_preceding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_precedingContext window_frame_preceding() throws RecognitionException {
		Window_frame_precedingContext _localctx = new Window_frame_precedingContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_window_frame_preceding);
		try {
			setState(2919);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2913); match(UNBOUNDED);
				setState(2914); match(PRECEDING);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2915); match(DECIMAL);
				setState(2916); match(PRECEDING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2917); match(CURRENT);
				setState(2918); match(ROW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_followingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(tsqlParser.UNBOUNDED, 0); }
		public TerminalNode FOLLOWING() { return getToken(tsqlParser.FOLLOWING, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public Window_frame_followingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_following; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitWindow_frame_following(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_followingContext window_frame_following() throws RecognitionException {
		Window_frame_followingContext _localctx = new Window_frame_followingContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_window_frame_following);
		try {
			setState(2925);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2921); match(UNBOUNDED);
				setState(2922); match(FOLLOWING);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2923); match(DECIMAL);
				setState(2924); match(FOLLOWING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_table_nameContext extends ParserRuleContext {
		public IdContext server;
		public IdContext database;
		public IdContext schema;
		public IdContext table;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Full_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitFull_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_table_nameContext full_table_name() throws RecognitionException {
		Full_table_nameContext _localctx = new Full_table_nameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_full_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2944);
			switch ( getInterpreter().adaptivePredict(_input,435,_ctx) ) {
			case 1:
				{
				setState(2927); ((Full_table_nameContext)_localctx).server = id();
				setState(2928); match(DOT);
				setState(2929); ((Full_table_nameContext)_localctx).database = id();
				setState(2930); match(DOT);
				setState(2931); ((Full_table_nameContext)_localctx).schema = id();
				setState(2932); match(DOT);
				}
				break;

			case 2:
				{
				setState(2934); ((Full_table_nameContext)_localctx).database = id();
				setState(2935); match(DOT);
				setState(2937);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (DOUBLE_QUOTE_ID - 324)) | (1L << (SQUARE_BRACKET_ID - 324)) | (1L << (ID - 324)))) != 0)) {
					{
					setState(2936); ((Full_table_nameContext)_localctx).schema = id();
					}
				}

				setState(2939); match(DOT);
				}
				break;

			case 3:
				{
				setState(2941); ((Full_table_nameContext)_localctx).schema = id();
				setState(2942); match(DOT);
				}
				break;
			}
			setState(2946); ((Full_table_nameContext)_localctx).table = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdContext database;
		public IdContext schema;
		public IdContext table;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2958);
			switch ( getInterpreter().adaptivePredict(_input,437,_ctx) ) {
			case 1:
				{
				setState(2948); ((Table_nameContext)_localctx).database = id();
				setState(2949); match(DOT);
				setState(2951);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (DOUBLE_QUOTE_ID - 324)) | (1L << (SQUARE_BRACKET_ID - 324)) | (1L << (ID - 324)))) != 0)) {
					{
					setState(2950); ((Table_nameContext)_localctx).schema = id();
					}
				}

				setState(2953); match(DOT);
				}
				break;

			case 2:
				{
				setState(2955); ((Table_nameContext)_localctx).schema = id();
				setState(2956); match(DOT);
				}
				break;
			}
			setState(2960); ((Table_nameContext)_localctx).table = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_nameContext extends ParserRuleContext {
		public IdContext database;
		public IdContext schema;
		public IdContext procedure;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Procedure_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitProcedure_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_nameContext procedure_name() throws RecognitionException {
		Procedure_nameContext _localctx = new Procedure_nameContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_procedure_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2972);
			switch ( getInterpreter().adaptivePredict(_input,439,_ctx) ) {
			case 1:
				{
				setState(2962); ((Procedure_nameContext)_localctx).database = id();
				setState(2963); match(DOT);
				setState(2965);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (DOUBLE_QUOTE_ID - 324)) | (1L << (SQUARE_BRACKET_ID - 324)) | (1L << (ID - 324)))) != 0)) {
					{
					setState(2964); ((Procedure_nameContext)_localctx).schema = id();
					}
				}

				setState(2967); match(DOT);
				}
				break;

			case 2:
				{
				setState(2969); ((Procedure_nameContext)_localctx).schema = id();
				setState(2970); match(DOT);
				}
				break;
			}
			setState(2974); ((Procedure_nameContext)_localctx).procedure = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public IdContext schema;
		public IdContext view;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2979);
			switch ( getInterpreter().adaptivePredict(_input,440,_ctx) ) {
			case 1:
				{
				setState(2976); ((View_nameContext)_localctx).schema = id();
				setState(2977); match(DOT);
				}
				break;
			}
			setState(2981); ((View_nameContext)_localctx).view = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_proc_nameContext extends ParserRuleContext {
		public IdContext database;
		public IdContext schema;
		public IdContext procedure;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Func_proc_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_proc_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitFunc_proc_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_proc_nameContext func_proc_name() throws RecognitionException {
		Func_proc_nameContext _localctx = new Func_proc_nameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_func_proc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2993);
			switch ( getInterpreter().adaptivePredict(_input,442,_ctx) ) {
			case 1:
				{
				setState(2983); ((Func_proc_nameContext)_localctx).database = id();
				setState(2984); match(DOT);
				setState(2986);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (DOUBLE_QUOTE_ID - 324)) | (1L << (SQUARE_BRACKET_ID - 324)) | (1L << (ID - 324)))) != 0)) {
					{
					setState(2985); ((Func_proc_nameContext)_localctx).schema = id();
					}
				}

				setState(2988); match(DOT);
				}
				break;

			case 2:
				{
				{
				setState(2990); ((Func_proc_nameContext)_localctx).schema = id();
				}
				setState(2991); match(DOT);
				}
				break;
			}
			setState(2995); ((Func_proc_nameContext)_localctx).procedure = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_objectContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Full_table_nameContext full_table_name() {
			return getRuleContext(Full_table_nameContext.class,0);
		}
		public Ddl_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDdl_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ddl_objectContext ddl_object() throws RecognitionException {
		Ddl_objectContext _localctx = new Ddl_objectContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_ddl_object);
		try {
			setState(2999);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2997); full_table_name();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2998); match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Full_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitFull_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_column_nameContext full_column_name() throws RecognitionException {
		Full_column_nameContext _localctx = new Full_column_nameContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_full_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3004);
			switch ( getInterpreter().adaptivePredict(_input,444,_ctx) ) {
			case 1:
				{
				setState(3001); table_name();
				setState(3002); match(DOT);
				}
				break;
			}
			setState(3006); column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitColumn_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_column_name_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3008); column_name();
			setState(3013);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,445,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(3009); match(COMMA);
					setState(3010); column_name();
					}
					} 
				}
				setState(3015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,445,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3016); id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(tsqlParser.LOCAL_ID, 0); }
		public Cursor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitCursor_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_nameContext cursor_name() throws RecognitionException {
		Cursor_nameContext _localctx = new Cursor_nameContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_cursor_name);
		try {
			setState(3020);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(3018); id();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3019); match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class On_offContext extends ParserRuleContext {
		public TerminalNode OFF() { return getToken(tsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(tsqlParser.ON, 0); }
		public On_offContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_off; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitOn_off(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_offContext on_off() throws RecognitionException {
		On_offContext _localctx = new On_offContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_on_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3022);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusteredContext extends ParserRuleContext {
		public TerminalNode NONCLUSTERED() { return getToken(tsqlParser.NONCLUSTERED, 0); }
		public TerminalNode CLUSTERED() { return getToken(tsqlParser.CLUSTERED, 0); }
		public ClusteredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustered; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitClustered(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusteredContext clustered() throws RecognitionException {
		ClusteredContext _localctx = new ClusteredContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_clustered);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3024);
			_la = _input.LA(1);
			if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_notnullContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(tsqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public Null_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_notnull; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitNull_notnull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_notnullContext null_notnull() throws RecognitionException {
		Null_notnullContext _localctx = new Null_notnullContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3027);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3026); match(NOT);
				}
			}

			setState(3029); match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scalar_function_nameContext extends ParserRuleContext {
		public TerminalNode CHECKSUM() { return getToken(tsqlParser.CHECKSUM, 0); }
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode BINARY_CHECKSUM() { return getToken(tsqlParser.BINARY_CHECKSUM, 0); }
		public TerminalNode LEFT() { return getToken(tsqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(tsqlParser.RIGHT, 0); }
		public Scalar_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitScalar_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_function_nameContext scalar_function_name() throws RecognitionException {
		Scalar_function_nameContext _localctx = new Scalar_function_nameContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_scalar_function_name);
		try {
			setState(3036);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(3031); func_proc_name();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3032); match(RIGHT);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(3033); match(LEFT);
				}
				break;
			case BINARY_CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(3034); match(BINARY_CHECKSUM);
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(3035); match(CHECKSUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_valueContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode NULL() { return getToken(tsqlParser.NULL, 0); }
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitDefault_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_default_value);
		try {
			setState(3040);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3038); match(NULL);
				}
				break;
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(3039); constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(tsqlParser.FLOAT, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode REAL() { return getToken(tsqlParser.REAL, 0); }
		public TerminalNode BINARY() { return getToken(tsqlParser.BINARY, 0); }
		public TerminalNode STRING() { return getToken(tsqlParser.STRING, 0); }
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_constant);
		int _la;
		try {
			setState(3054);
			switch ( getInterpreter().adaptivePredict(_input,452,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3042); match(STRING);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3043); match(BINARY);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3044); number();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3046);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(3045); sign();
					}
				}

				setState(3048);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==REAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3050);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(3049); sign();
					}
				}

				setState(3052); match(DOLLAR);
				setState(3053);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(tsqlParser.DECIMAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3057);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(3056); sign();
				}
			}

			setState(3059); match(DECIMAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(tsqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(tsqlParser.PLUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3061);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode DOUBLE_QUOTE_ID() { return getToken(tsqlParser.DOUBLE_QUOTE_ID, 0); }
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_ID() { return getToken(tsqlParser.SQUARE_BRACKET_ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_id);
		try {
			setState(3066);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MIN:
			case MODIFY:
			case NEXT:
			case NAME:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(3063); simple_id();
				}
				break;
			case DOUBLE_QUOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3064); match(DOUBLE_QUOTE_ID);
				}
				break;
			case SQUARE_BRACKET_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(3065); match(SQUARE_BRACKET_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_idContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(tsqlParser.SUM, 0); }
		public TerminalNode COUNT_BIG() { return getToken(tsqlParser.COUNT_BIG, 0); }
		public TerminalNode ENCRYPTION() { return getToken(tsqlParser.ENCRYPTION, 0); }
		public TerminalNode SPATIAL_WINDOW_MAX_CELLS() { return getToken(tsqlParser.SPATIAL_WINDOW_MAX_CELLS, 0); }
		public TerminalNode MAX() { return getToken(tsqlParser.MAX, 0); }
		public TerminalNode CHECKSUM_AGG() { return getToken(tsqlParser.CHECKSUM_AGG, 0); }
		public TerminalNode COUNT() { return getToken(tsqlParser.COUNT, 0); }
		public TerminalNode DELAY() { return getToken(tsqlParser.DELAY, 0); }
		public TerminalNode RECOMPILE() { return getToken(tsqlParser.RECOMPILE, 0); }
		public TerminalNode STATIC() { return getToken(tsqlParser.STATIC, 0); }
		public TerminalNode PARTITION() { return getToken(tsqlParser.PARTITION, 0); }
		public TerminalNode AUTO() { return getToken(tsqlParser.AUTO, 0); }
		public TerminalNode SAMPLE() { return getToken(tsqlParser.SAMPLE, 0); }
		public TerminalNode KEYSET() { return getToken(tsqlParser.KEYSET, 0); }
		public TerminalNode ID() { return getToken(tsqlParser.ID, 0); }
		public TerminalNode AVG() { return getToken(tsqlParser.AVG, 0); }
		public TerminalNode INSERTED() { return getToken(tsqlParser.INSERTED, 0); }
		public TerminalNode LAST() { return getToken(tsqlParser.LAST, 0); }
		public TerminalNode OPTIMISTIC() { return getToken(tsqlParser.OPTIMISTIC, 0); }
		public TerminalNode ROWGUID() { return getToken(tsqlParser.ROWGUID, 0); }
		public TerminalNode XMLNAMESPACES() { return getToken(tsqlParser.XMLNAMESPACES, 0); }
		public TerminalNode ONLY() { return getToken(tsqlParser.ONLY, 0); }
		public TerminalNode FOLLOWING() { return getToken(tsqlParser.FOLLOWING, 0); }
		public TerminalNode DENSE_RANK() { return getToken(tsqlParser.DENSE_RANK, 0); }
		public TerminalNode CALLER() { return getToken(tsqlParser.CALLER, 0); }
		public TerminalNode PRECEDING() { return getToken(tsqlParser.PRECEDING, 0); }
		public TerminalNode ISOLATION() { return getToken(tsqlParser.ISOLATION, 0); }
		public TerminalNode SCROLL_LOCKS() { return getToken(tsqlParser.SCROLL_LOCKS, 0); }
		public TerminalNode READ_ONLY() { return getToken(tsqlParser.READ_ONLY, 0); }
		public TerminalNode OFFSET() { return getToken(tsqlParser.OFFSET, 0); }
		public TerminalNode VARP() { return getToken(tsqlParser.VARP, 0); }
		public TerminalNode GROUPING_ID() { return getToken(tsqlParser.GROUPING_ID, 0); }
		public TerminalNode ABSOLUTE() { return getToken(tsqlParser.ABSOLUTE, 0); }
		public TerminalNode OUT() { return getToken(tsqlParser.OUT, 0); }
		public TerminalNode INSENSITIVE() { return getToken(tsqlParser.INSENSITIVE, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(tsqlParser.SERIALIZABLE, 0); }
		public TerminalNode CATCH() { return getToken(tsqlParser.CATCH, 0); }
		public TerminalNode OPTIMIZE() { return getToken(tsqlParser.OPTIMIZE, 0); }
		public TerminalNode LOOP() { return getToken(tsqlParser.LOOP, 0); }
		public TerminalNode STDEV() { return getToken(tsqlParser.STDEV, 0); }
		public TerminalNode MODIFY() { return getToken(tsqlParser.MODIFY, 0); }
		public TerminalNode GROUPING() { return getToken(tsqlParser.GROUPING, 0); }
		public TerminalNode REMOTE() { return getToken(tsqlParser.REMOTE, 0); }
		public TerminalNode SCROLL() { return getToken(tsqlParser.SCROLL, 0); }
		public TerminalNode CONCAT() { return getToken(tsqlParser.CONCAT, 0); }
		public TerminalNode ROWS() { return getToken(tsqlParser.ROWS, 0); }
		public TerminalNode SELF() { return getToken(tsqlParser.SELF, 0); }
		public TerminalNode LOCAL() { return getToken(tsqlParser.LOCAL, 0); }
		public TerminalNode DELETED() { return getToken(tsqlParser.DELETED, 0); }
		public TerminalNode NEXT() { return getToken(tsqlParser.NEXT, 0); }
		public TerminalNode FIRST() { return getToken(tsqlParser.FIRST, 0); }
		public TerminalNode RANK() { return getToken(tsqlParser.RANK, 0); }
		public TerminalNode TIME() { return getToken(tsqlParser.TIME, 0); }
		public TerminalNode GO() { return getToken(tsqlParser.GO, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(tsqlParser.ROW_NUMBER, 0); }
		public TerminalNode BASE64() { return getToken(tsqlParser.BASE64, 0); }
		public TerminalNode COMMITTED() { return getToken(tsqlParser.COMMITTED, 0); }
		public TerminalNode ROW() { return getToken(tsqlParser.ROW, 0); }
		public TerminalNode NOEXPAND() { return getToken(tsqlParser.NOEXPAND, 0); }
		public TerminalNode VAR() { return getToken(tsqlParser.VAR, 0); }
		public TerminalNode NAME() { return getToken(tsqlParser.NAME, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(tsqlParser.LOCK_ESCALATION, 0); }
		public TerminalNode TYPE() { return getToken(tsqlParser.TYPE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(tsqlParser.SNAPSHOT, 0); }
		public TerminalNode ROOT() { return getToken(tsqlParser.ROOT, 0); }
		public TerminalNode PRIOR() { return getToken(tsqlParser.PRIOR, 0); }
		public TerminalNode SCHEMABINDING() { return getToken(tsqlParser.SCHEMABINDING, 0); }
		public TerminalNode MIN() { return getToken(tsqlParser.MIN, 0); }
		public TerminalNode FULLSCAN() { return getToken(tsqlParser.FULLSCAN, 0); }
		public TerminalNode OWNER() { return getToken(tsqlParser.OWNER, 0); }
		public TerminalNode NOCOUNT() { return getToken(tsqlParser.NOCOUNT, 0); }
		public TerminalNode APPLY() { return getToken(tsqlParser.APPLY, 0); }
		public TerminalNode USING() { return getToken(tsqlParser.USING, 0); }
		public TerminalNode FAST_FORWARD() { return getToken(tsqlParser.FAST_FORWARD, 0); }
		public TerminalNode HASH() { return getToken(tsqlParser.HASH, 0); }
		public TerminalNode DISABLE() { return getToken(tsqlParser.DISABLE, 0); }
		public TerminalNode TYPE_WARNING() { return getToken(tsqlParser.TYPE_WARNING, 0); }
		public TerminalNode FORWARD_ONLY() { return getToken(tsqlParser.FORWARD_ONLY, 0); }
		public TerminalNode XML() { return getToken(tsqlParser.XML, 0); }
		public TerminalNode STDEVP() { return getToken(tsqlParser.STDEVP, 0); }
		public TerminalNode STATS_STREAM() { return getToken(tsqlParser.STATS_STREAM, 0); }
		public TerminalNode THROW() { return getToken(tsqlParser.THROW, 0); }
		public TerminalNode UNKNOWN() { return getToken(tsqlParser.UNKNOWN, 0); }
		public TerminalNode RELATIVE() { return getToken(tsqlParser.RELATIVE, 0); }
		public TerminalNode MARK() { return getToken(tsqlParser.MARK, 0); }
		public TerminalNode GLOBAL() { return getToken(tsqlParser.GLOBAL, 0); }
		public TerminalNode WORK() { return getToken(tsqlParser.WORK, 0); }
		public TerminalNode DYNAMIC() { return getToken(tsqlParser.DYNAMIC, 0); }
		public TerminalNode READONLY() { return getToken(tsqlParser.READONLY, 0); }
		public TerminalNode VIEW_METADATA() { return getToken(tsqlParser.VIEW_METADATA, 0); }
		public TerminalNode NUMBER() { return getToken(tsqlParser.NUMBER, 0); }
		public TerminalNode KEEPFIXED() { return getToken(tsqlParser.KEEPFIXED, 0); }
		public TerminalNode CAST() { return getToken(tsqlParser.CAST, 0); }
		public TerminalNode RANGE() { return getToken(tsqlParser.RANGE, 0); }
		public TerminalNode LEVEL() { return getToken(tsqlParser.LEVEL, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(tsqlParser.UNCOMMITTED, 0); }
		public TerminalNode FORCESEEK() { return getToken(tsqlParser.FORCESEEK, 0); }
		public TerminalNode COOKIE() { return getToken(tsqlParser.COOKIE, 0); }
		public TerminalNode NORECOMPUTE() { return getToken(tsqlParser.NORECOMPUTE, 0); }
		public TerminalNode REPEATABLE() { return getToken(tsqlParser.REPEATABLE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(tsqlParser.UNBOUNDED, 0); }
		public TerminalNode OUTPUT() { return getToken(tsqlParser.OUTPUT, 0); }
		public TerminalNode FAST() { return getToken(tsqlParser.FAST, 0); }
		public TerminalNode NTILE() { return getToken(tsqlParser.NTILE, 0); }
		public TerminalNode LOGIN() { return getToken(tsqlParser.LOGIN, 0); }
		public TerminalNode PATH() { return getToken(tsqlParser.PATH, 0); }
		public TerminalNode TIES() { return getToken(tsqlParser.TIES, 0); }
		public TerminalNode TRY() { return getToken(tsqlParser.TRY, 0); }
		public Simple_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitSimple_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_idContext simple_id() throws RecognitionException {
		Simple_idContext _localctx = new Simple_idContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_simple_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3068);
			_la = _input.LA(1);
			if ( !(_la==FORCESEEK || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (ABSOLUTE - 260)) | (1L << (APPLY - 260)) | (1L << (AUTO - 260)) | (1L << (AVG - 260)) | (1L << (BASE64 - 260)) | (1L << (CALLER - 260)) | (1L << (CAST - 260)) | (1L << (CATCH - 260)) | (1L << (CHECKSUM_AGG - 260)) | (1L << (COMMITTED - 260)) | (1L << (CONCAT - 260)) | (1L << (COOKIE - 260)) | (1L << (COUNT - 260)) | (1L << (COUNT_BIG - 260)) | (1L << (DELAY - 260)) | (1L << (DELETED - 260)) | (1L << (DENSE_RANK - 260)) | (1L << (DISABLE - 260)) | (1L << (DYNAMIC - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (FAST - 260)) | (1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NEXT - 260)) | (1L << (NAME - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLY - 260)) | (1L << (OPTIMISTIC - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)) | (1L << (TYPE_WARNING - 324)) | (1L << (UNBOUNDED - 324)) | (1L << (UNCOMMITTED - 324)) | (1L << (UNKNOWN - 324)) | (1L << (USING - 324)) | (1L << (VAR - 324)) | (1L << (VARP - 324)) | (1L << (VIEW_METADATA - 324)) | (1L << (WORK - 324)) | (1L << (XML - 324)) | (1L << (XMLNAMESPACES - 324)) | (1L << (ID - 324)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operatorContext extends ParserRuleContext {
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_comparison_operator);
		try {
			setState(3085);
			switch ( getInterpreter().adaptivePredict(_input,455,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3070); match(EQUAL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3071); match(GREATER);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3072); match(LESS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3073); match(LESS);
				setState(3074); match(EQUAL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3075); match(GREATER);
				setState(3076); match(EQUAL);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3077); match(LESS);
				setState(3078); match(GREATER);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3079); match(EXCLAMATION);
				setState(3080); match(EQUAL);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3081); match(EXCLAMATION);
				setState(3082); match(GREATER);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3083); match(EXCLAMATION);
				setState(3084); match(LESS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tsqlVisitor ) return ((tsqlVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3087);
			_la = _input.LA(1);
			if ( !(((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & ((1L << (PLUS_ASSIGN - 393)) | (1L << (MINUS_ASSIGN - 393)) | (1L << (MULT_ASSIGN - 393)) | (1L << (DIV_ASSIGN - 393)) | (1L << (MOD_ASSIGN - 393)) | (1L << (AND_ASSIGN - 393)) | (1L << (XOR_ASSIGN - 393)) | (1L << (OR_ASSIGN - 393)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 69: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 5 >= _localctx._p;

		case 1: return 4 >= _localctx._p;

		case 2: return 2 >= _localctx._p;

		case 3: return 11 >= _localctx._p;

		case 4: return 1 >= _localctx._p;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u01a6\u0c14\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\3\2\7\2\u0130\n\2\f\2\16\2\u0133\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\5\3\u013b\n\3\3\4\3\4\3\4\3\4\5\4\u0141\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0150\n\5\3\6\3\6\7\6\u0154\n\6\f\6\16"+
		"\6\u0157\13\6\3\6\3\6\5\6\u015b\n\6\3\6\3\6\5\6\u015f\n\6\3\6\3\6\5\6"+
		"\u0163\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u016a\n\6\3\6\3\6\3\6\5\6\u016f\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u017a\n\6\3\6\3\6\7\6\u017e\n"+
		"\6\f\6\16\6\u0181\13\6\3\6\7\6\u0184\n\6\f\6\16\6\u0187\13\6\5\6\u0189"+
		"\n\6\5\6\u018b\n\6\3\6\3\6\3\6\5\6\u0190\n\6\3\6\5\6\u0193\n\6\3\6\3\6"+
		"\5\6\u0197\n\6\3\6\5\6\u019a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01a2\n\6"+
		"\3\6\5\6\u01a5\n\6\3\6\3\6\3\6\5\6\u01aa\n\6\3\6\7\6\u01ad\n\6\f\6\16"+
		"\6\u01b0\13\6\3\6\3\6\3\6\5\6\u01b5\n\6\3\6\3\6\3\6\5\6\u01ba\n\6\3\6"+
		"\7\6\u01bd\n\6\f\6\16\6\u01c0\13\6\3\6\3\6\3\6\5\6\u01c5\n\6\3\6\3\6\3"+
		"\6\3\6\5\6\u01cb\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u01d2\n\6\3\6\3\6\5\6\u01d6"+
		"\n\6\5\6\u01d8\n\6\3\6\3\6\3\6\3\6\7\6\u01de\n\6\f\6\16\6\u01e1\13\6\3"+
		"\6\3\6\5\6\u01e5\n\6\3\6\3\6\5\6\u01e9\n\6\5\6\u01eb\n\6\3\6\3\6\3\6\5"+
		"\6\u01f0\n\6\3\6\3\6\3\6\5\6\u01f5\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01fd"+
		"\n\6\3\6\3\6\3\6\5\6\u0202\n\6\3\6\3\6\3\6\5\6\u0207\n\6\7\6\u0209\n\6"+
		"\f\6\16\6\u020c\13\6\3\6\3\6\5\6\u0210\n\6\5\6\u0212\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0220\n\7\3\b\5\b\u0223\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u022b\n\b\5\b\u022d\n\b\3\b\5\b\u0230\n\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0236\n\b\3\b\5\b\u0239\n\b\3\b\5\b\u023c\n\b\3\b\3\b"+
		"\3\b\3\b\7\b\u0242\n\b\f\b\16\b\u0245\13\b\5\b\u0247\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u024e\n\b\3\b\3\b\5\b\u0252\n\b\5\b\u0254\n\b\5\b\u0256\n\b"+
		"\3\b\5\b\u0259\n\b\3\b\5\b\u025c\n\b\3\b\5\b\u025f\n\b\3\t\5\t\u0262\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u026a\n\t\5\t\u026c\n\t\3\t\5\t\u026f\n"+
		"\t\3\t\3\t\5\t\u0273\n\t\3\t\5\t\u0276\n\t\3\t\3\t\3\t\3\t\5\t\u027c\n"+
		"\t\3\t\5\t\u027f\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u028a\n\t"+
		"\f\t\16\t\u028d\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u0294\n\t\3\t\5\t\u0297\n"+
		"\t\3\t\5\t\u029a\n\t\3\t\5\t\u029d\n\t\3\n\5\n\u02a0\n\n\3\n\3\n\5\n\u02a4"+
		"\n\n\3\n\5\n\u02a7\n\n\3\n\5\n\u02aa\n\n\3\n\5\n\u02ad\n\n\3\13\5\13\u02b0"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u02b8\n\13\5\13\u02ba\n\13\3"+
		"\13\3\13\5\13\u02be\n\13\3\13\5\13\u02c1\n\13\3\13\5\13\u02c4\n\13\3\13"+
		"\3\13\3\13\3\13\7\13\u02ca\n\13\f\13\16\13\u02cd\13\13\3\13\5\13\u02d0"+
		"\n\13\3\13\3\13\3\13\3\13\7\13\u02d6\n\13\f\13\16\13\u02d9\13\13\5\13"+
		"\u02db\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u02e2\n\13\3\13\3\13\5\13\u02e6"+
		"\n\13\5\13\u02e8\n\13\5\13\u02ea\n\13\3\13\5\13\u02ed\n\13\3\13\5\13\u02f0"+
		"\n\13\3\13\5\13\u02f3\n\13\3\f\3\f\3\f\3\f\7\f\u02f9\n\f\f\f\16\f\u02fc"+
		"\13\f\3\f\3\f\3\f\5\f\u0301\n\f\3\f\3\f\3\f\3\f\5\f\u0307\n\f\5\f\u0309"+
		"\n\f\3\r\3\r\5\r\u030d\n\r\3\r\5\r\u0310\n\r\3\r\5\r\u0313\n\r\3\16\3"+
		"\16\3\16\5\16\u0318\n\16\3\16\3\16\3\16\5\16\u031d\n\16\3\16\5\16\u0320"+
		"\n\16\3\17\3\17\5\17\u0324\n\17\3\17\5\17\u0327\n\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0331\n\17\3\17\3\17\5\17\u0335\n\17\3\17"+
		"\5\17\u0338\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0342\n"+
		"\17\5\17\u0344\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u034e"+
		"\n\20\3\21\3\21\3\21\3\21\5\21\u0354\n\21\3\21\3\21\3\21\5\21\u0359\n"+
		"\21\3\21\3\21\3\21\7\21\u035e\n\21\f\21\16\21\u0361\13\21\3\21\5\21\u0364"+
		"\n\21\5\21\u0366\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u036d\n\21\3\21\3"+
		"\21\3\21\5\21\u0372\n\21\3\21\3\21\3\21\5\21\u0377\n\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0384\n\23\f\23\16\23\u0387"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0399\n\24\3\24\3\24\5\24\u039d\n\24\3\24\3\24\5"+
		"\24\u03a1\n\24\5\24\u03a3\n\24\3\24\5\24\u03a6\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u03ae\n\25\3\25\7\25\u03b1\n\25\f\25\16\25\u03b4\13\25"+
		"\3\25\5\25\u03b7\n\25\3\25\3\25\3\25\3\25\5\25\u03bd\n\25\3\25\5\25\u03c0"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u03c9\n\26\f\26\16\26\u03cc"+
		"\13\26\3\26\3\26\5\26\u03d0\n\26\3\26\3\26\3\26\3\26\7\26\u03d6\n\26\f"+
		"\26\16\26\u03d9\13\26\5\26\u03db\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u03e2"+
		"\n\26\3\26\5\26\u03e5\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u03f3\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u03fa\n"+
		"\30\5\30\u03fc\n\30\3\31\3\31\3\31\3\31\3\31\7\31\u0403\n\31\f\31\16\31"+
		"\u0406\13\31\3\32\3\32\3\32\3\32\5\32\u040c\n\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u0416\n\32\3\32\5\32\u0419\n\32\3\33\3\33\3\33"+
		"\5\33\u041e\n\33\3\34\3\34\3\34\3\34\5\34\u0424\n\34\3\34\3\34\5\34\u0428"+
		"\n\34\3\35\3\35\3\35\3\35\5\35\u042e\n\35\3\35\3\35\5\35\u0432\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u0439\n\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\5\37\u0442\n\37\3\37\3\37\5\37\u0446\n\37\3 \3 \3 \3 \5 \u044c\n"+
		" \3 \3 \3 \7 \u0451\n \f \16 \u0454\13 \3 \5 \u0457\n \3!\3!\3!\3!\5!"+
		"\u045d\n!\3\"\3\"\5\"\u0461\n\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\5$\u0472\n$\3$\3$\5$\u0476\n$\3$\3$\3$\3%\3%\3%\3%\7%\u047f\n"+
		"%\f%\16%\u0482\13%\3%\5%\u0485\n%\3%\3%\3%\5%\u048a\n%\3%\3%\5%\u048e"+
		"\n%\3%\3%\3%\5%\u0493\n%\3%\5%\u0496\n%\5%\u0498\n%\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\7&\u04a3\n&\f&\16&\u04a6\13&\3&\3&\3&\3&\3&\5&\u04ad\n&\3&\3"+
		"&\5&\u04b1\n&\3&\5&\u04b4\n&\3\'\3\'\5\'\u04b8\n\'\3\'\3\'\5\'\u04bc\n"+
		"\'\3\'\3\'\5\'\u04c0\n\'\3\'\3\'\5\'\u04c4\n\'\3\'\3\'\3\'\3\'\5\'\u04ca"+
		"\n\'\3\'\3\'\5\'\u04ce\n\'\5\'\u04d0\n\'\3(\3(\5(\u04d4\n(\3(\3(\5(\u04d8"+
		"\n(\3(\3(\3(\3(\7(\u04de\n(\f(\16(\u04e1\13(\5(\u04e3\n(\3(\5(\u04e6\n"+
		"(\3(\3(\5(\u04ea\n(\3(\3(\3(\3(\7(\u04f0\n(\f(\16(\u04f3\13(\3(\3(\5("+
		"\u04f7\n(\3(\3(\3(\5(\u04fc\n(\3(\5(\u04ff\n(\5(\u0501\n(\3)\3)\5)\u0505"+
		"\n)\3)\3)\3)\5)\u050a\n)\3)\3)\5)\u050e\n)\3*\3*\3+\3+\5+\u0514\n+\3+"+
		"\3+\3+\3+\3+\3+\3+\5+\u051d\n+\3+\5+\u0520\n+\5+\u0522\n+\3,\3,\3,\3,"+
		"\5,\u0528\n,\3,\3,\3,\5,\u052d\n,\3,\3,\3,\3,\3,\5,\u0534\n,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0541\n,\5,\u0543\n,\5,\u0545\n,\3,\5,\u0548"+
		"\n,\3,\3,\3,\3,\3,\5,\u054f\n,\3,\5,\u0552\n,\3-\3-\3-\3-\3-\5-\u0559"+
		"\n-\3-\5-\u055c\n-\3-\3-\3-\3-\5-\u0562\n-\3-\3-\3-\5-\u0567\n-\5-\u0569"+
		"\n-\3-\5-\u056c\n-\3-\3-\3-\3-\5-\u0572\n-\3-\3-\3-\3-\5-\u0578\n-\5-"+
		"\u057a\n-\3-\5-\u057d\n-\3-\3-\5-\u0581\n-\3-\5-\u0584\n-\3-\3-\3-\3-"+
		"\5-\u058a\n-\3-\5-\u058d\n-\3-\3-\5-\u0591\n-\3-\5-\u0594\n-\3-\3-\3-"+
		"\3-\5-\u059a\n-\3-\5-\u059d\n-\5-\u059f\n-\3.\3.\5.\u05a3\n.\3/\3/\3/"+
		"\5/\u05a8\n/\3\60\3\60\3\60\3\60\3\61\5\61\u05af\n\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\5\61\u05b7\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u05c1\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u05c8\n\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u05d8"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u05df\n\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u05ea\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u05f1"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u05f9\n\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u0600\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0614\n\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u061b\n\61\5\61\u061d\n\61\3\62\3\62\3\63\3\63\5\63\u0623"+
		"\n\63\3\63\3\63\3\63\5\63\u0628\n\63\3\64\3\64\5\64\u062c\n\64\3\64\3"+
		"\64\3\64\5\64\u0631\n\64\3\64\7\64\u0634\n\64\f\64\16\64\u0637\13\64\3"+
		"\64\3\64\3\65\3\65\5\65\u063d\n\65\3\66\3\66\3\66\5\66\u0642\n\66\3\66"+
		"\3\66\5\66\u0646\n\66\3\66\3\66\5\66\u064a\n\66\3\66\3\66\3\66\3\66\5"+
		"\66\u0650\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0658\n\66\3\66\3\66"+
		"\3\66\5\66\u065d\n\66\5\66\u065f\n\66\3\66\5\66\u0662\n\66\3\66\7\66\u0665"+
		"\n\66\f\66\16\66\u0668\13\66\3\67\3\67\5\67\u066c\n\67\3\67\5\67\u066f"+
		"\n\67\3\67\3\67\3\67\5\67\u0674\n\67\3\67\5\67\u0677\n\67\3\67\5\67\u067a"+
		"\n\67\3\67\3\67\3\67\3\67\5\67\u0680\n\67\3\67\3\67\3\67\3\67\5\67\u0686"+
		"\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u068f\n\67\5\67\u0691\n"+
		"\67\38\38\58\u0695\n8\38\38\38\58\u069a\n8\38\58\u069d\n8\38\38\38\38"+
		"\58\u06a3\n8\38\38\58\u06a7\n8\38\38\38\38\58\u06ad\n8\38\38\38\38\58"+
		"\u06b3\n8\39\39\39\39\39\79\u06ba\n9\f9\169\u06bd\139\39\39\3:\3:\3:\3"+
		":\7:\u06c5\n:\f:\16:\u06c8\13:\3:\3:\3:\3;\3;\3;\3;\3;\3;\7;\u06d3\n;"+
		"\f;\16;\u06d6\13;\5;\u06d8\n;\3;\3;\3;\3<\3<\3<\3<\3<\5<\u06e2\n<\3<\3"+
		"<\3<\5<\u06e7\n<\3<\3<\3=\3=\3=\3=\3=\3=\5=\u06f1\n=\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\5>\u06fc\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\5?\u0713\n?\3@\3@\3@\7@\u0718\n@\f@\16@\u071b\13@\3A"+
		"\3A\3B\3B\3B\3B\3B\5B\u0724\nB\3C\3C\3C\3C\5C\u072a\nC\3C\3C\3C\5C\u072f"+
		"\nC\3C\5C\u0732\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u073d\nC\5C\u073f\nC"+
		"\3C\5C\u0742\nC\3C\3C\3C\3C\3C\3C\3C\3C\5C\u074c\nC\5C\u074e\nC\3C\5C"+
		"\u0751\nC\5C\u0753\nC\3D\5D\u0756\nD\3D\5D\u0759\nD\3D\5D\u075c\nD\3D"+
		"\5D\u075f\nD\3D\5D\u0762\nD\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0770"+
		"\nE\3E\5E\u0773\nE\3E\5E\u0776\nE\3E\3E\3E\3E\3E\7E\u077d\nE\fE\16E\u0780"+
		"\13E\5E\u0782\nE\3E\5E\u0785\nE\3F\3F\3F\3F\3F\3F\5F\u078d\nF\3F\5F\u0790"+
		"\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u079e\nF\3F\5F\u07a1\nF\3F"+
		"\3F\5F\u07a5\nF\3F\5F\u07a8\nF\3F\3F\3F\3F\3F\5F\u07af\nF\5F\u07b1\nF"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u07c7"+
		"\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u07d9\nG\fG\16"+
		"G\u07dc\13G\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u07e7\nH\3I\3I\3J\3J\3K\3K\3"+
		"K\5K\u07f0\nK\3K\3K\3K\7K\u07f5\nK\fK\16K\u07f8\13K\3L\3L\3L\3L\3L\5L"+
		"\u07ff\nL\3L\3L\3L\3L\3L\3M\3M\5M\u0808\nM\3M\3M\5M\u080c\nM\3M\3M\3M"+
		"\3M\3M\3M\3M\3M\5M\u0816\nM\3N\3N\7N\u081a\nN\fN\16N\u081d\13N\3O\3O\5"+
		"O\u0821\nO\3P\3P\3P\7P\u0826\nP\fP\16P\u0829\13P\3Q\3Q\3Q\7Q\u082e\nQ"+
		"\fQ\16Q\u0831\13Q\3R\3R\3R\7R\u0836\nR\fR\16R\u0839\13R\3S\5S\u083c\n"+
		"S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0852"+
		"\nT\3T\3T\3T\3T\3T\3T\3T\5T\u085b\nT\3T\3T\3T\3T\5T\u0861\nT\3T\3T\3T"+
		"\3T\5T\u0867\nT\3T\3T\3T\3T\5T\u086d\nT\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0877"+
		"\nT\3U\3U\3U\3U\3U\5U\u087e\nU\3U\7U\u0881\nU\fU\16U\u0884\13U\3V\3V\5"+
		"V\u0888\nV\3V\3V\5V\u088c\nV\3V\3V\3V\3V\3V\6V\u0893\nV\rV\16V\u0894\5"+
		"V\u0897\nV\3W\3W\5W\u089b\nW\3W\3W\3W\5W\u08a0\nW\3W\3W\5W\u08a4\nW\5"+
		"W\u08a6\nW\3W\3W\3W\5W\u08ab\nW\3W\3W\3W\3W\7W\u08b1\nW\fW\16W\u08b4\13"+
		"W\5W\u08b6\nW\3W\3W\5W\u08ba\nW\3W\3W\3W\3W\3W\7W\u08c1\nW\fW\16W\u08c4"+
		"\13W\5W\u08c6\nW\3W\3W\5W\u08ca\nW\3X\3X\3X\3X\3X\7X\u08d1\nX\fX\16X\u08d4"+
		"\13X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u08df\nX\5X\u08e1\nX\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\5Y\u08e9\nY\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u08f1\nY\3Y\5Y\u08f4\nY\5Y\u08f6"+
		"\nY\3Z\3Z\3Z\3Z\3Z\5Z\u08fd\nZ\3[\3[\5[\u0901\n[\3\\\3\\\3]\3]\3]\3]\3"+
		"]\7]\u090a\n]\f]\16]\u090d\13]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\7^\u091f\n^\f^\16^\u0922\13^\3^\3^\3^\3^\3^\5^\u0929\n^\3_\3"+
		"_\3_\3_\5_\u092f\n_\3`\3`\3`\7`\u0934\n`\f`\16`\u0937\13`\3a\3a\3a\5a"+
		"\u093c\na\3a\3a\3a\5a\u0941\na\3a\3a\3a\3a\3a\3a\5a\u0949\na\3a\5a\u094c"+
		"\na\3a\3a\5a\u0950\na\5a\u0952\na\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\5c\u0961\nc\3d\3d\7d\u0965\nd\fd\16d\u0968\13d\3e\3e\5e\u096c\ne\3"+
		"e\3e\5e\u0970\ne\3e\3e\3e\5e\u0975\ne\5e\u0977\ne\3e\3e\3e\3e\3e\5e\u097e"+
		"\ne\3e\3e\5e\u0982\ne\3e\3e\3e\3e\3e\5e\u0989\ne\5e\u098b\ne\5e\u098d"+
		"\ne\3f\3f\3f\3f\3f\3f\3f\3f\3g\5g\u0998\ng\3g\3g\5g\u099c\ng\5g\u099e"+
		"\ng\3g\5g\u09a1\ng\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u09b1"+
		"\ng\3h\3h\5h\u09b5\nh\3i\3i\3i\3i\3i\3i\3i\3i\7i\u09bf\ni\fi\16i\u09c2"+
		"\13i\3i\5i\u09c5\ni\3i\3i\3j\3j\3j\3j\3k\3k\3k\3k\3k\3k\5k\u09d3\nk\3"+
		"l\3l\3l\3l\3l\5l\u09da\nl\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\5l\u09f0\nl\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0a24\nl\3l\3l\5l\u0a28\n"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5"+
		"l\u0a40\nl\3m\3m\3n\5n\u0a45\nn\3n\3n\3o\3o\5o\u0a4b\no\3p\5p\u0a4e\n"+
		"p\3p\3p\3p\3p\7p\u0a54\np\fp\16p\u0a57\13p\3p\3p\3q\5q\u0a5c\nq\3q\3q"+
		"\3q\3q\3q\7q\u0a63\nq\fq\16q\u0a66\13q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\7q\u0a74\nq\fq\16q\u0a77\13q\3q\3q\3q\5q\u0a7c\nq\3q\3q\3q\3q\3q"+
		"\3q\5q\u0a84\nq\3r\3r\3s\3s\3t\3t\3t\3t\7t\u0a8e\nt\ft\16t\u0a91\13t\3"+
		"t\3t\3u\3u\5u\u0a97\nu\3v\3v\3v\3v\3v\3v\3v\3v\3v\7v\u0aa2\nv\fv\16v\u0aa5"+
		"\13v\3w\3w\3w\7w\u0aaa\nw\fw\16w\u0aad\13w\3x\3x\3x\3x\3x\3x\3x\6x\u0ab6"+
		"\nx\rx\16x\u0ab7\3x\3x\5x\u0abc\nx\3x\3x\3x\3x\3x\3x\3x\3x\6x\u0ac6\n"+
		"x\rx\16x\u0ac7\3x\3x\5x\u0acc\nx\3x\3x\5x\u0ad0\nx\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u0ae4\ny\3z\3z\3z\3z\3z\5z\u0aeb"+
		"\nz\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u0b01"+
		"\nz\3z\3z\3z\3z\3z\5z\u0b08\nz\3z\3z\3z\3z\3z\5z\u0b0f\nz\3z\3z\3z\3z"+
		"\3z\5z\u0b16\nz\3z\3z\3z\3z\3z\5z\u0b1d\nz\3z\3z\3z\3z\3z\5z\u0b24\nz"+
		"\3z\3z\3z\3z\3z\5z\u0b2b\nz\3z\3z\3z\3z\5z\u0b31\nz\3z\3z\5z\u0b35\nz"+
		"\3z\3z\3z\3z\5z\u0b3b\nz\3z\3z\5z\u0b3f\nz\5z\u0b41\nz\3{\5{\u0b44\n{"+
		"\3{\3{\3|\3|\3|\5|\u0b4b\n|\3|\5|\u0b4e\n|\3|\5|\u0b51\n|\3|\3|\3}\3}"+
		"\3}\3~\3~\3~\3~\3~\3~\5~\u0b5e\n~\3\177\3\177\5\177\u0b62\n\177\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0b6a\n\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\5\u0081\u0b70\n\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0b7c"+
		"\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0b83\n\u0082"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\5\u0083\u0b8a\n\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0b91\n\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0084\5\u0084\u0b98\n\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\5\u0084\u0b9f\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u0ba6\n\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u0bad\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u0bb4\n\u0086\3\u0086\3\u0086\3\u0087\3\u0087\5\u0087\u0bba\n\u0087\3"+
		"\u0088\3\u0088\3\u0088\5\u0088\u0bbf\n\u0088\3\u0088\3\u0088\3\u0089\3"+
		"\u0089\3\u0089\7\u0089\u0bc6\n\u0089\f\u0089\16\u0089\u0bc9\13\u0089\3"+
		"\u008a\3\u008a\3\u008b\3\u008b\5\u008b\u0bcf\n\u008b\3\u008c\3\u008c\3"+
		"\u008d\3\u008d\3\u008e\5\u008e\u0bd6\n\u008e\3\u008e\3\u008e\3\u008f\3"+
		"\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u0bdf\n\u008f\3\u0090\3\u0090\5"+
		"\u0090\u0be3\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0be9\n\u0091"+
		"\3\u0091\3\u0091\5\u0091\u0bed\n\u0091\3\u0091\3\u0091\5\u0091\u0bf1\n"+
		"\u0091\3\u0092\5\u0092\u0bf4\n\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3"+
		"\u0094\3\u0094\3\u0094\5\u0094\u0bfd\n\u0094\3\u0095\3\u0095\3\u0096\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0c10\n\u0096\3\u0097"+
		"\3\u0097\3\u0097\2\u0098\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\2/\3\2\u0180\u0181\4\2\u0180\u0180\u0183\u0183\4\2\u011a\u011a\u016a"+
		"\u016a\4\2\u0180\u0181\u0183\u0183\4\2EE\u0080\u0080\4\2vw\u0147\u0147"+
		"\4\2\u00a9\u00a9\u0159\u0159\5\2\u011f\u011f\u015c\u015c\u0175\u0175\5"+
		"\2\u00dd\u00dd\u0108\u0108\u011d\u011d\4\2FF\u00ad\u00ad\3\2XY\4\2\u00f9"+
		"\u00f9\u0134\u0134\3\2\u0147\u0148\3\2\u00e6\u00e7\4\2\u009b\u009b\u009d"+
		"\u009d\6\2\u010c\u010c\u0149\u0149\u015f\u015f\u0183\u0183\5\2\20\21{"+
		"|\u00d4\u00d5\4\2\u00df\u00df\u0126\u0126\t\2CCFFYYzz\u00b7\u00b7\u00cc"+
		"\u00cc\u00f6\u00f6\4\2\u0126\u0126\u0132\u0132\4\2\u0124\u0124\u015d\u015d"+
		"\6\2\u011e\u011e\u0121\u0121\u012f\u012f\u0163\u0163\5\2\u0145\u0145\u0151"+
		"\u0151\u015e\u015e\3\2\u01a0\u01a1\3\2\u019d\u019f\4\2\u01a0\u01a1\u01a3"+
		"\u01a5\5\2\5\5\b\b\u00d9\u00d9\4\2\5\5JJ\4\2\u0157\u0157\u0159\u0159\4"+
		"\2\u0122\u0122\u013c\u013c\4\2\n\nHH\4\2\u00a5\u00a5\u012a\u012a\5\2\u008b"+
		"\u008b\u0112\u0112\u012a\u012a\4\2pp\u0158\u0158\4\2\u0097\u0097\u0180"+
		"\u0181\5\2hh\u0086\u0086\u00c2\u00c2\6\2\u008b\u008b\u012a\u012a\u0135"+
		"\u0135\u0154\u0154\4\2\u0181\u0181\u0183\u0183\3\2\u0181\u0182\4\2\u014e"+
		"\u014e\u0159\u0159\4\2$$\u0092\u0092\3\2\u0185\u0186\4\2\u0181\u0181\u0185"+
		"\u0185\n\2cc\u0106\u010a\u010c\u010e\u0110\u0115\u011a\u0138\u013b\u016a"+
		"\u016c\u0178\u0182\u0182\3\2\u018b\u0192\u0e30\2\u0131\3\2\2\2\4\u013a"+
		"\3\2\2\2\6\u0140\3\2\2\2\b\u014f\3\2\2\2\n\u0211\3\2\2\2\f\u021f\3\2\2"+
		"\2\16\u0222\3\2\2\2\20\u0261\3\2\2\2\22\u029f\3\2\2\2\24\u02af\3\2\2\2"+
		"\26\u02f4\3\2\2\2\30\u030c\3\2\2\2\32\u031f\3\2\2\2\34\u0343\3\2\2\2\36"+
		"\u034d\3\2\2\2 \u034f\3\2\2\2\"\u0378\3\2\2\2$\u037c\3\2\2\2&\u038a\3"+
		"\2\2\2(\u03a7\3\2\2\2*\u03c1\3\2\2\2,\u03e6\3\2\2\2.\u03fb\3\2\2\2\60"+
		"\u03fd\3\2\2\2\62\u0407\3\2\2\2\64\u041a\3\2\2\2\66\u041f\3\2\2\28\u0429"+
		"\3\2\2\2:\u0433\3\2\2\2<\u043d\3\2\2\2>\u0447\3\2\2\2@\u0458\3\2\2\2B"+
		"\u0460\3\2\2\2D\u0462\3\2\2\2F\u0469\3\2\2\2H\u0497\3\2\2\2J\u0499\3\2"+
		"\2\2L\u04cf\3\2\2\2N\u0500\3\2\2\2P\u0504\3\2\2\2R\u050f\3\2\2\2T\u0521"+
		"\3\2\2\2V\u0551\3\2\2\2X\u059e\3\2\2\2Z\u05a0\3\2\2\2\\\u05a4\3\2\2\2"+
		"^\u05a9\3\2\2\2`\u061c\3\2\2\2b\u061e\3\2\2\2d\u0620\3\2\2\2f\u0629\3"+
		"\2\2\2h\u063c\3\2\2\2j\u063e\3\2\2\2l\u0690\3\2\2\2n\u0694\3\2\2\2p\u06b4"+
		"\3\2\2\2r\u06c0\3\2\2\2t\u06cc\3\2\2\2v\u06dc\3\2\2\2x\u06ea\3\2\2\2z"+
		"\u06f2\3\2\2\2|\u0712\3\2\2\2~\u0714\3\2\2\2\u0080\u071c\3\2\2\2\u0082"+
		"\u071e\3\2\2\2\u0084\u0752\3\2\2\2\u0086\u0755\3\2\2\2\u0088\u0766\3\2"+
		"\2\2\u008a\u07b0\3\2\2\2\u008c\u07c6\3\2\2\2\u008e\u07e6\3\2\2\2\u0090"+
		"\u07e8\3\2\2\2\u0092\u07ea\3\2\2\2\u0094\u07ec\3\2\2\2\u0096\u07f9\3\2"+
		"\2\2\u0098\u0815\3\2\2\2\u009a\u0817\3\2\2\2\u009c\u0820\3\2\2\2\u009e"+
		"\u0822\3\2\2\2\u00a0\u082a\3\2\2\2\u00a2\u0832\3\2\2\2\u00a4\u083b\3\2"+
		"\2\2\u00a6\u0876\3\2\2\2\u00a8\u087d\3\2\2\2\u00aa\u088b\3\2\2\2\u00ac"+
		"\u0898\3\2\2\2\u00ae\u08cb\3\2\2\2\u00b0\u08f5\3\2\2\2\u00b2\u08f7\3\2"+
		"\2\2\u00b4\u08fe\3\2\2\2\u00b6\u0902\3\2\2\2\u00b8\u0904\3\2\2\2\u00ba"+
		"\u0928\3\2\2\2\u00bc\u092a\3\2\2\2\u00be\u0930\3\2\2\2\u00c0\u0951\3\2"+
		"\2\2\u00c2\u0953\3\2\2\2\u00c4\u0960\3\2\2\2\u00c6\u0962\3\2\2\2\u00c8"+
		"\u098c\3\2\2\2\u00ca\u098e\3\2\2\2\u00cc\u09b0\3\2\2\2\u00ce\u09b2\3\2"+
		"\2\2\u00d0\u09b6\3\2\2\2\u00d2\u09c8\3\2\2\2\u00d4\u09d2\3\2\2\2\u00d6"+
		"\u0a3f\3\2\2\2\u00d8\u0a41\3\2\2\2\u00da\u0a44\3\2\2\2\u00dc\u0a48\3\2"+
		"\2\2\u00de\u0a4d\3\2\2\2\u00e0\u0a5b\3\2\2\2\u00e2\u0a85\3\2\2\2\u00e4"+
		"\u0a87\3\2\2\2\u00e6\u0a89\3\2\2\2\u00e8\u0a96\3\2\2\2\u00ea\u0a98\3\2"+
		"\2\2\u00ec\u0aa6\3\2\2\2\u00ee\u0acf\3\2\2\2\u00f0\u0ae3\3\2\2\2\u00f2"+
		"\u0b40\3\2\2\2\u00f4\u0b43\3\2\2\2\u00f6\u0b47\3\2\2\2\u00f8\u0b54\3\2"+
		"\2\2\u00fa\u0b5d\3\2\2\2\u00fc\u0b61\3\2\2\2\u00fe\u0b69\3\2\2\2\u0100"+
		"\u0b6f\3\2\2\2\u0102\u0b82\3\2\2\2\u0104\u0b90\3\2\2\2\u0106\u0b9e\3\2"+
		"\2\2\u0108\u0ba5\3\2\2\2\u010a\u0bb3\3\2\2\2\u010c\u0bb9\3\2\2\2\u010e"+
		"\u0bbe\3\2\2\2\u0110\u0bc2\3\2\2\2\u0112\u0bca\3\2\2\2\u0114\u0bce\3\2"+
		"\2\2\u0116\u0bd0\3\2\2\2\u0118\u0bd2\3\2\2\2\u011a\u0bd5\3\2\2\2\u011c"+
		"\u0bde\3\2\2\2\u011e\u0be2\3\2\2\2\u0120\u0bf0\3\2\2\2\u0122\u0bf3\3\2"+
		"\2\2\u0124\u0bf7\3\2\2\2\u0126\u0bfc\3\2\2\2\u0128\u0bfe\3\2\2\2\u012a"+
		"\u0c0f\3\2\2\2\u012c\u0c11\3\2\2\2\u012e\u0130\5\4\3\2\u012f\u012e\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\2\2\3\u0135\3\3\2\2\2"+
		"\u0136\u013b\5\6\4\2\u0137\u013b\5\b\5\2\u0138\u013b\5\n\6\2\u0139\u013b"+
		"\5\f\7\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\5\3\2\2\2\u013c\u0141\5\16\b\2\u013d\u0141\5\20\t"+
		"\2\u013e\u0141\5\22\n\2\u013f\u0141\5\24\13\2\u0140\u013c\3\2\2\2\u0140"+
		"\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\7\3\2\2\2"+
		"\u0142\u0150\5\34\17\2\u0143\u0150\5 \21\2\u0144\u0150\5&\24\2\u0145\u0150"+
		"\5(\25\2\u0146\u0150\5*\26\2\u0147\u0150\5.\30\2\u0148\u0150\5\62\32\2"+
		"\u0149\u0150\5\66\34\2\u014a\u0150\58\35\2\u014b\u0150\5:\36\2\u014c\u0150"+
		"\5<\37\2\u014d\u0150\5> \2\u014e\u0150\5@!\2\u014f\u0142\3\2\2\2\u014f"+
		"\u0143\3\2\2\2\u014f\u0144\3\2\2\2\u014f\u0145\3\2\2\2\u014f\u0146\3\2"+
		"\2\2\u014f\u0147\3\2\2\2\u014f\u0148\3\2\2\2\u014f\u0149\3\2\2\2\u014f"+
		"\u014a\3\2\2\2\u014f\u014b\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u014e\3\2\2\2\u0150\t\3\2\2\2\u0151\u0155\7\16\2\2\u0152\u0154"+
		"\5\4\3\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a\7R"+
		"\2\2\u0159\u015b\7\u019b\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u0212\3\2\2\2\u015c\u015e\7\25\2\2\u015d\u015f\7\u019b\2\2\u015e\u015d"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0212\3\2\2\2\u0160\u0162\7/\2\2\u0161"+
		"\u0163\7\u019b\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0212"+
		"\3\2\2\2\u0164\u0165\7W\2\2\u0165\u0212\5r:\2\u0166\u0167\7j\2\2\u0167"+
		"\u0169\5\u0126\u0094\2\u0168\u016a\7\u019b\2\2\u0169\u0168\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u0212\3\2\2\2\u016b\u016c\5\u0126\u0094\2\u016c\u016e"+
		"\7\u019c\2\2\u016d\u016f\7\u019b\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\u0212\3\2\2\2\u0170\u0171\7s\2\2\u0171\u0172\5\u00a0Q\2\u0172"+
		"\u0173\7\u00e2\2\2\u0173\u0179\5\u009aN\2\u0174\u0175\7Q\2\2\u0175\u0176"+
		"\5\u00a0Q\2\u0176\u0177\7\u00e2\2\2\u0177\u0178\5\u009aN\2\u0178\u017a"+
		"\3\2\2\2\u0179\u0174\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u018a\3\2\2\2\u017b"+
		"\u0188\7P\2\2\u017c\u017e\5\4\3\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0189\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0184\5\u008cG\2\u0183\u0182\3\2\2\2\u0184\u0187"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0189\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0188\u017f\3\2\2\2\u0188\u0185\3\2\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u017b\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f\3\2\2\2\u018c"+
		"\u018d\7R\2\2\u018d\u0190\7s\2\2\u018e\u0190\7S\2\2\u018f\u018c\3\2\2"+
		"\2\u018f\u018e\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u0193\7\u019b\2\2\u0192"+
		"\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0212\3\2\2\2\u0194\u0196\7\u00bf"+
		"\2\2\u0195\u0197\5\u008cG\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\3\2\2\2\u0198\u019a\7\u019b\2\2\u0199\u0198\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u0212\3\2\2\2\u019b\u01a1\7\u0168\2\2\u019c\u019d\t\2\2"+
		"\2\u019d\u019e\7\u019a\2\2\u019e\u019f\t\3\2\2\u019f\u01a0\7\u019a\2\2"+
		"\u01a0\u01a2\t\2\2\2\u01a1\u019c\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4"+
		"\3\2\2\2\u01a3\u01a5\7\u019b\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2"+
		"\2\u01a5\u0212\3\2\2\2\u01a6\u01a7\7\16\2\2\u01a7\u01a9\7\u016c\2\2\u01a8"+
		"\u01aa\7\u019b\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ae"+
		"\3\2\2\2\u01ab\u01ad\5\4\3\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b1\u01b2\7R\2\2\u01b2\u01b4\7\u016c\2\2\u01b3\u01b5\7\u019b\2"+
		"\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7"+
		"\7\16\2\2\u01b7\u01b9\7\u010e\2\2\u01b8\u01ba\7\u019b\2\2\u01b9\u01b8"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01be\3\2\2\2\u01bb\u01bd\5\4\3\2\u01bc"+
		"\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7R\2\2\u01c2"+
		"\u01c4\7\u010e\2\2\u01c3\u01c5\7\u019b\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\u0212\3\2\2\2\u01c6\u01c7\7\u00ff\2\2\u01c7\u01c8\t\4\2"+
		"\2\u01c8\u01ca\5\u008cG\2\u01c9\u01cb\7\u019b\2\2\u01ca\u01c9\3\2\2\2"+
		"\u01ca\u01cb\3\2\2\2\u01cb\u0212\3\2\2\2\u01cc\u01cd\7\u0102\2\2\u01cd"+
		"\u01d7\5\u00a0Q\2\u01ce\u01d8\5\4\3\2\u01cf\u01d1\7\25\2\2\u01d0\u01d2"+
		"\7\u019b\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d8\3\2\2"+
		"\2\u01d3\u01d5\7/\2\2\u01d4\u01d6\7\u019b\2\2\u01d5\u01d4\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01ce\3\2\2\2\u01d7\u01cf\3\2"+
		"\2\2\u01d7\u01d3\3\2\2\2\u01d8\u0212\3\2\2\2\u01d9\u01da\7\u0102\2\2\u01da"+
		"\u01db\5\u00a0Q\2\u01db\u01ea\7\u0135\2\2\u01dc\u01de\5\4\3\2\u01dd\u01dc"+
		"\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01eb\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e4\7\25\2\2\u01e3\u01e5\7"+
		"\u019b\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01eb\3\2\2\2"+
		"\u01e6\u01e8\7/\2\2\u01e7\u01e9\7\u019b\2\2\u01e8\u01e7\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01df\3\2\2\2\u01ea\u01e2\3\2"+
		"\2\2\u01ea\u01e6\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\7R\2\2\u01ed"+
		"\u01ef\7\u0135\2\2\u01ee\u01f0\7\u019b\2\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u0212\3\2\2\2\u01f1\u01f2\7\u00af\2\2\u01f2\u01f4\5\u008c"+
		"G\2\u01f3\u01f5\7\u019b\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u0212\3\2\2\2\u01f6\u01f7\7\u00b3\2\2\u01f7\u01f8\7\u0198\2\2\u01f8\u01f9"+
		"\t\5\2\2\u01f9\u01fc\7\u019a\2\2\u01fa\u01fd\5\u0122\u0092\2\u01fb\u01fd"+
		"\7\u0180\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2\2"+
		"\2\u01fe\u0201\7\u019a\2\2\u01ff\u0202\5\u0122\u0092\2\u0200\u0202\7\u0180"+
		"\2\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u020a\3\2\2\2\u0203"+
		"\u0206\7\u019a\2\2\u0204\u0207\5\u0120\u0091\2\u0205\u0207\7\u0180\2\2"+
		"\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0203"+
		"\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020f\7\u0199\2\2\u020e\u0210"+
		"\7\u019b\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2"+
		"\2\u0211\u0151\3\2\2\2\u0211\u015c\3\2\2\2\u0211\u0160\3\2\2\2\u0211\u0164"+
		"\3\2\2\2\u0211\u0166\3\2\2\2\u0211\u016b\3\2\2\2\u0211\u0170\3\2\2\2\u0211"+
		"\u0194\3\2\2\2\u0211\u019b\3\2\2\2\u0211\u01a6\3\2\2\2\u0211\u01c6\3\2"+
		"\2\2\u0211\u01cc\3\2\2\2\u0211\u01d9\3\2\2\2\u0211\u01f1\3\2\2\2\u0211"+
		"\u01f6\3\2\2\2\u0212\13\3\2\2\2\u0213\u0220\5H%\2\u0214\u0220\5J&\2\u0215"+
		"\u0220\5L\'\2\u0216\u0220\5N(\2\u0217\u0220\5T+\2\u0218\u0220\5V,\2\u0219"+
		"\u0220\5X-\2\u021a\u0220\5Z.\2\u021b\u0220\5\\/\2\u021c\u0220\5t;\2\u021d"+
		"\u0220\5v<\2\u021e\u0220\5x=\2\u021f\u0213\3\2\2\2\u021f\u0214\3\2\2\2"+
		"\u021f\u0215\3\2\2\2\u021f\u0216\3\2\2\2\u021f\u0217\3\2\2\2\u021f\u0218"+
		"\3\2\2\2\u021f\u0219\3\2\2\2\u021f\u021a\3\2\2\2\u021f\u021b\3\2\2\2\u021f"+
		"\u021c\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220\r\3\2\2\2"+
		"\u0221\u0223\5\u0094K\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u022c\7F\2\2\u0225\u0226\7\u00e5\2\2\u0226\u0227"+
		"\7\u0198\2\2\u0227\u0228\5\u008cG\2\u0228\u022a\7\u0199\2\2\u0229\u022b"+
		"\7\u00a9\2\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2\2"+
		"\2\u022c\u0225\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u0230"+
		"\7g\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0235\3\2\2\2\u0231"+
		"\u0236\5\u00dco\2\u0232\u0236\5\u010c\u0087\2\u0233\u0236\5B\"\2\u0234"+
		"\u0236\7\u0180\2\2\u0235\u0231\3\2\2\2\u0235\u0232\3\2\2\2\u0235\u0233"+
		"\3\2\2\2\u0235\u0234\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0239\5\u00dep"+
		"\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a\u023c"+
		"\5\26\f\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0246\3\2\2\2"+
		"\u023d\u023e\7g\2\2\u023e\u0243\5\u00c4c\2\u023f\u0240\7\u019a\2\2\u0240"+
		"\u0242\5\u00c4c\2\u0241\u023f\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0246"+
		"\u023d\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0255\3\2\2\2\u0248\u0253\7\u0101"+
		"\2\2\u0249\u0254\5\u00a0Q\2\u024a\u024b\7\63\2\2\u024b\u0251\7\u009a\2"+
		"\2\u024c\u024e\7\u0126\2\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0252\5\u0114\u008b\2\u0250\u0252\7\u0180\2\2\u0251"+
		"\u024d\3\2\2\2\u0251\u0250\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0249\3\2"+
		"\2\2\u0253\u024a\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0248\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0259\5\u00b0Y\2\u0258\u0257"+
		"\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u025c\5\u00b8]"+
		"\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025f"+
		"\7\u019b\2\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\17\3\2\2\2"+
		"\u0260\u0262\5\u0094K\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u026b\7z\2\2\u0264\u0265\7\u00e5\2\2\u0265\u0266"+
		"\7\u0198\2\2\u0266\u0267\5\u008cG\2\u0267\u0269\7\u0199\2\2\u0268\u026a"+
		"\7\u00a9\2\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2"+
		"\2\u026b\u0264\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026f"+
		"\7\177\2\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0272\3\2\2\2"+
		"\u0270\u0273\5\u010c\u0087\2\u0271\u0273\5B\"\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0271\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0276\5\u00dep\2\u0275\u0274"+
		"\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u027b\3\2\2\2\u0277\u0278\7\u0198\2"+
		"\2\u0278\u0279\5\u0110\u0089\2\u0279\u027a\7\u0199\2\2\u027a\u027c\3\2"+
		"\2\2\u027b\u0277\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d"+
		"\u027f\5\26\f\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0293\3"+
		"\2\2\2\u0280\u0281\7\u00fa\2\2\u0281\u0282\7\u0198\2\2\u0282\u0283\5\u00ec"+
		"w\2\u0283\u028b\7\u0199\2\2\u0284\u0285\7\u019a\2\2\u0285\u0286\7\u0198"+
		"\2\2\u0286\u0287\5\u00ecw\2\u0287\u0288\7\u0199\2\2\u0288\u028a\3\2\2"+
		"\2\u0289\u0284\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c"+
		"\3\2\2\2\u028c\u0294\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0294\5\u00d4k"+
		"\2\u028f\u0294\5N(\2\u0290\u0294\5\u0092J\2\u0291\u0292\7D\2\2\u0292\u0294"+
		"\7\u00fa\2\2\u0293\u0280\3\2\2\2\u0293\u028e\3\2\2\2\u0293\u028f\3\2\2"+
		"\2\u0293\u0290\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u0297"+
		"\5\u00b0Y\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2"+
		"\2\u0298\u029a\5\u00b8]\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029c\3\2\2\2\u029b\u029d\7\u019b\2\2\u029c\u029b\3\2\2\2\u029c\u029d"+
		"\3\2\2\2\u029d\21\3\2\2\2\u029e\u02a0\5\u0094K\2\u029f\u029e\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\5\u00a8U\2\u02a2\u02a4"+
		"\5\u00aeX\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2\2"+
		"\2\u02a5\u02a7\5\u00b0Y\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u02a9\3\2\2\2\u02a8\u02aa\5\u00b8]\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa"+
		"\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02ad\7\u019b\2\2\u02ac\u02ab\3\2\2"+
		"\2\u02ac\u02ad\3\2\2\2\u02ad\23\3\2\2\2\u02ae\u02b0\5\u0094K\2\u02af\u02ae"+
		"\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b9\7\u00f6\2"+
		"\2\u02b2\u02b3\7\u00e5\2\2\u02b3\u02b4\7\u0198\2\2\u02b4\u02b5\5\u008c"+
		"G\2\u02b5\u02b7\7\u0199\2\2\u02b6\u02b8\7\u00a9\2\2\u02b7\u02b6\3\2\2"+
		"\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b2\3\2\2\2\u02b9\u02ba"+
		"\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02be\5\u010c\u0087\2\u02bc\u02be\5"+
		"B\"\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be\u02c0\3\2\2\2\u02bf"+
		"\u02c1\5\u00dan\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3"+
		"\3\2\2\2\u02c2\u02c4\5\u00dep\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2"+
		"\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\7\u00d1\2\2\u02c6\u02cb\5\u0098M\2"+
		"\u02c7\u02c8\7\u019a\2\2\u02c8\u02ca\5\u0098M\2\u02c9\u02c7\3\2\2\2\u02ca"+
		"\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cf\3\2"+
		"\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02d0\5\26\f\2\u02cf\u02ce\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0\u02da\3\2\2\2\u02d1\u02d2\7g\2\2\u02d2\u02d7\5\u00c4"+
		"c\2\u02d3\u02d4\7\u019a\2\2\u02d4\u02d6\5\u00c4c\2\u02d5\u02d3\3\2\2\2"+
		"\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02db"+
		"\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02d1\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u02e9\3\2\2\2\u02dc\u02e7\7\u0101\2\2\u02dd\u02e8\5\u009eP\2\u02de\u02df"+
		"\7\63\2\2\u02df\u02e5\7\u009a\2\2\u02e0\u02e2\7\u0126\2\2\u02e1\u02e0"+
		"\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e6\5\u0114\u008b"+
		"\2\u02e4\u02e6\7\u0180\2\2\u02e5\u02e1\3\2\2\2\u02e5\u02e4\3\2\2\2\u02e6"+
		"\u02e8\3\2\2\2\u02e7\u02dd\3\2\2\2\u02e7\u02de\3\2\2\2\u02e8\u02ea\3\2"+
		"\2\2\u02e9\u02dc\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb"+
		"\u02ed\5\u00b0Y\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef"+
		"\3\2\2\2\u02ee\u02f0\5\u00b8]\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2"+
		"\2\u02f0\u02f2\3\2\2\2\u02f1\u02f3\7\u019b\2\2\u02f2\u02f1\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3\25\3\2\2\2\u02f4\u02f5\7\u0148\2\2\u02f5\u02fa\5"+
		"\30\r\2\u02f6\u02f7\7\u019a\2\2\u02f7\u02f9\5\30\r\2\u02f8\u02f6\3\2\2"+
		"\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u0308"+
		"\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u0300\7\177\2\2\u02fe\u0301\7\u0180"+
		"\2\2\u02ff\u0301\5\u0104\u0083\2\u0300\u02fe\3\2\2\2\u0300\u02ff\3\2\2"+
		"\2\u0301\u0306\3\2\2\2\u0302\u0303\7\u0198\2\2\u0303\u0304\5\u0110\u0089"+
		"\2\u0304\u0305\7\u0199\2\2\u0305\u0307\3\2\2\2\u0306\u0302\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u02fd\3\2\2\2\u0308\u0309\3\2"+
		"\2\2\u0309\27\3\2\2\2\u030a\u030d\5\32\16\2\u030b\u030d\5\u008cG\2\u030c"+
		"\u030a\3\2\2\2\u030c\u030b\3\2\2\2\u030d\u0312\3\2\2\2\u030e\u0310\7\t"+
		"\2\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0313\5\u00e8u\2\u0312\u030f\3\2\2\2\u0312\u0313\3\2\2\2\u0313\31\3\2"+
		"\2\2\u0314\u0318\7\u011b\2\2\u0315\u0318\7\u012c\2\2\u0316\u0318\5\u0104"+
		"\u0083\2\u0317\u0314\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0316\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031c\7\u0193\2\2\u031a\u031d\7\u019d\2\2\u031b\u031d"+
		"\5\u0112\u008a\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d\u0320\3"+
		"\2\2\2\u031e\u0320\7\u0179\2\2\u031f\u0317\3\2\2\2\u031f\u031e\3\2\2\2"+
		"\u0320\33\3\2\2\2\u0321\u0323\7\61\2\2\u0322\u0324\7\u00f2\2\2\u0323\u0322"+
		"\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2\2\2\u0325\u0327\5\u0118\u008d"+
		"\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329"+
		"\7x\2\2\u0329\u032a\5\u0126\u0094\2\u032a\u032b\7\u009d\2\2\u032b\u032c"+
		"\5\u00ceh\2\u032c\u032d\7\u0198\2\2\u032d\u032e\5\u0110\u0089\2\u032e"+
		"\u0330\7\u0199\2\2\u032f\u0331\7\u019b\2\2\u0330\u032f\3\2\2\2\u0330\u0331"+
		"\3\2\2\2\u0331\u0344\3\2\2\2\u0332\u0334\7\61\2\2\u0333\u0335\7\u00f2"+
		"\2\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2\2\2\u0336"+
		"\u0338\5\36\20\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3"+
		"\2\2\2\u0339\u033a\7x\2\2\u033a\u033b\5\u0128\u0095\2\u033b\u033c\7\u009d"+
		"\2\2\u033c\u033d\5\u0104\u0083\2\u033d\u033e\7\u0198\2\2\u033e\u033f\5"+
		"\u0110\u0089\2\u033f\u0341\7\u0199\2\2\u0340\u0342\7\u019b\2\2\u0341\u0340"+
		"\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u0321\3\2\2\2\u0343"+
		"\u0332\3\2\2\2\u0344\35\3\2\2\2\u0345\u034e\7%\2\2\u0346\u034e\7n\2\2"+
		"\u0347\u034e\7o\2\2\u0348\u034e\7\u0087\2\2\u0349\u034e\3\2\2\2\u034a"+
		"\u034e\7:\2\2\u034b\u034e\7\u016a\2\2\u034c\u034e\7N\2\2\u034d\u0345\3"+
		"\2\2\2\u034d\u0346\3\2\2\2\u034d\u0347\3\2\2\2\u034d\u0348\3\2\2\2\u034d"+
		"\u0349\3\2\2\2\u034d\u034a\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034c\3\2"+
		"\2\2\u034e\37\3\2\2\2\u034f\u0353\7\61\2\2\u0350\u0351\7\u00a4\2\2\u0351"+
		"\u0354\7\u00b8\2\2\u0352\u0354\7\u00df\2\2\u0353\u0350\3\2\2\2\u0353\u0352"+
		"\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\7\u00b1\2"+
		"\2\u0356\u0365\5\u0106\u0084\2\u0357\u0359\7\u0198\2\2\u0358\u0357\3\2"+
		"\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035f\5\"\22\2\u035b"+
		"\u035c\7\u019a\2\2\u035c\u035e\5\"\22\2\u035d\u035b\3\2\2\2\u035e\u0361"+
		"\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0363\3\2\2\2\u0361"+
		"\u035f\3\2\2\2\u0362\u0364\7\u0199\2\2\u0363\u0362\3\2\2\2\u0363\u0364"+
		"\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0358\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u036c\3\2\2\2\u0367\u0368\7\u00bd\2\2\u0368\u036d\5$\23\2\u0369\u036a"+
		"\7\u0090\2\2\u036a\u036b\7\u00bd\2\2\u036b\u036d\7\u00d1\2\2\u036c\u0367"+
		"\3\2\2\2\u036c\u0369\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0371\3\2\2\2\u036e"+
		"\u036f\7\u00da\2\2\u036f\u0370\7\u00ca\2\2\u0370\u0372\t\6\2\2\u0371\u036e"+
		"\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0376\3\2\2\2\u0373\u0374\7\u009d\2"+
		"\2\u0374\u0375\7W\2\2\u0375\u0377\7\u00be\2\2\u0376\u0373\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377!\3\2\2\2\u0378\u0379\t\7\2\2\u0379\u037a\5\u0112"+
		"\u008a\2\u037a\u037b\5`\61\2\u037b#\3\2\2\2\u037c\u037d\7\u0198\2\2\u037d"+
		"\u037e\5\u0112\u008a\2\u037e\u0385\5`\61\2\u037f\u0380\7\u019a\2\2\u0380"+
		"\u0381\5\u0112\u008a\2\u0381\u0382\5`\61\2\u0382\u0384\3\2\2\2\u0383\u037f"+
		"\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0388\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0389\7\u0199\2\2\u0389%\3\2"+
		"\2\2\u038a\u038b\7\61\2\2\u038b\u038c\7\u00db\2\2\u038c\u038d\5\u0126"+
		"\u0094\2\u038d\u038e\7\u009d\2\2\u038e\u038f\5\u00ceh\2\u038f\u0390\7"+
		"\u0198\2\2\u0390\u0391\5\u0110\u0089\2\u0391\u03a2\7\u0199\2\2\u0392\u0398"+
		"\7\u0103\2\2\u0393\u0399\7\u0125\2\2\u0394\u0395\7\u015b\2\2\u0395\u0396"+
		"\7\u0181\2\2\u0396\u0399\t\b\2\2\u0397\u0399\7\u0164\2\2\u0398\u0393\3"+
		"\2\2\2\u0398\u0394\3\2\2\2\u0398\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a"+
		"\u039b\7\u019a\2\2\u039b\u039d\7\u0140\2\2\u039c\u039a\3\2\2\2\u039c\u039d"+
		"\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039f\7\u019a\2\2\u039f\u03a1\5\u0116"+
		"\u008c\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2"+
		"\u0392\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a6\7\u019b"+
		"\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\'\3\2\2\2\u03a7\u03a8"+
		"\7\61\2\2\u03a8\u03a9\7\u00dd\2\2\u03a9\u03aa\5\u0104\u0083\2\u03aa\u03ab"+
		"\7\u0198\2\2\u03ab\u03b2\5h\65\2\u03ac\u03ae\7\u019a\2\2\u03ad\u03ac\3"+
		"\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\5h\65\2\u03b0"+
		"\u03ad\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2"+
		"\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b7\7\u019a\2\2\u03b6"+
		"\u03b5\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03bc\7\u0199"+
		"\2\2\u03b9\u03ba\7\u009d\2\2\u03ba\u03bd\5\u0126\u0094\2\u03bb\u03bd\7"+
		"D\2\2\u03bc\u03b9\3\2\2\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03bf\3\2\2\2\u03be\u03c0\7\u019b\2\2\u03bf\u03be\3\2\2\2\u03bf\u03c0"+
		"\3\2\2\2\u03c0)\3\2\2\2\u03c1\u03c2\7\61\2\2\u03c2\u03c3\7\u00fe\2\2\u03c3"+
		"\u03cf\5\u0108\u0085\2\u03c4\u03c5\7\u0198\2\2\u03c5\u03ca\5\u0112\u008a"+
		"\2\u03c6\u03c7\7\u019a\2\2\u03c7\u03c9\5\u0112\u008a\2\u03c8\u03c6\3\2"+
		"\2\2\u03c9\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb"+
		"\u03cd\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cd\u03ce\7\u0199\2\2\u03ce\u03d0"+
		"\3\2\2\2\u03cf\u03c4\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03da\3\2\2\2\u03d1"+
		"\u03d2\7\u0103\2\2\u03d2\u03d7\5,\27\2\u03d3\u03d4\7\u019a\2\2\u03d4\u03d6"+
		"\5,\27\2\u03d5\u03d3\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7"+
		"\u03d8\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03d1\3\2"+
		"\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\7\t\2\2\u03dd"+
		"\u03e1\5\22\n\2\u03de\u03df\7\u0103\2\2\u03df\u03e0\7 \2\2\u03e0\u03e2"+
		"\7\u00a3\2\2\u03e1\u03de\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e4\3\2\2"+
		"\2\u03e3\u03e5\7\u019b\2\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5"+
		"+\3\2\2\2\u03e6\u03e7\t\t\2\2\u03e7-\3\2\2\2\u03e8\u03e9\7\6\2\2\u03e9"+
		"\u03ea\7\u00dd\2\2\u03ea\u03eb\5\u0104\u0083\2\u03eb\u03ec\7\u00d1\2\2"+
		"\u03ec\u03ed\7\u0198\2\2\u03ed\u03ee\7\u0133\2\2\u03ee\u03ef\7\u0187\2"+
		"\2\u03ef\u03f0\t\n\2\2\u03f0\u03f2\7\u0199\2\2\u03f1\u03f3\7\u019b\2\2"+
		"\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03fc\3\2\2\2\u03f4\u03f5"+
		"\7\6\2\2\u03f5\u03f6\7\u00dd\2\2\u03f6\u03f7\5\u0104\u0083\2\u03f7\u03f9"+
		"\5\60\31\2\u03f8\u03fa\7\u019b\2\2\u03f9\u03f8\3\2\2\2\u03f9\u03fa\3\2"+
		"\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03e8\3\2\2\2\u03fb\u03f4\3\2\2\2\u03fc"+
		"/\3\2\2\2\u03fd\u03fe\7\4\2\2\u03fe\u0404\5h\65\2\u03ff\u0400\7\u019a"+
		"\2\2\u0400\u0401\7\4\2\2\u0401\u0403\5h\65\2\u0402\u03ff\3\2\2\2\u0403"+
		"\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\61\3\2\2"+
		"\2\u0406\u0404\3\2\2\2\u0407\u0408\7\6\2\2\u0408\u040b\79\2\2\u0409\u040c"+
		"\5\u0126\u0094\2\u040a\u040c\7\63\2\2\u040b\u0409\3\2\2\2\u040b\u040a"+
		"\3\2\2\2\u040c\u0415\3\2\2\2\u040d\u040e\7\u013b\2\2\u040e\u040f\7\u013d"+
		"\2\2\u040f\u0410\7\u0187\2\2\u0410\u0416\5\u0126\u0094\2\u0411\u0412\7"+
		"\'\2\2\u0412\u0416\5\u0126\u0094\2\u0413\u0414\7\u00d1\2\2\u0414\u0416"+
		"\5\64\33\2\u0415\u040d\3\2\2\2\u0415\u0411\3\2\2\2\u0415\u0413\3\2\2\2"+
		"\u0416\u0418\3\2\2\2\u0417\u0419\7\u019b\2\2\u0418\u0417\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\63\3\2\2\2\u041a\u041d\5\u0126\u0094\2\u041b\u041e"+
		"\5\u0126\u0094\2\u041c\u041e\7h\2\2\u041d\u041b\3\2\2\2\u041d\u041c\3"+
		"\2\2\2\u041d\u041e\3\2\2\2\u041e\65\3\2\2\2\u041f\u0420\7M\2\2\u0420\u0423"+
		"\7x\2\2\u0421\u0422\7s\2\2\u0422\u0424\7[\2\2\u0423\u0421\3\2\2\2\u0423"+
		"\u0424\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0427\5\u0126\u0094\2\u0426\u0428"+
		"\7\u019b\2\2\u0427\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428\67\3\2\2\2"+
		"\u0429\u042a\7M\2\2\u042a\u042d\7\u00b1\2\2\u042b\u042c\7s\2\2\u042c\u042e"+
		"\7[\2\2\u042d\u042b\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0431\5\u010a\u0086\2\u0430\u0432\7\u019b\2\2\u0431\u0430\3\2\2\2\u0431"+
		"\u0432\3\2\2\2\u04329\3\2\2\2\u0433\u0434\7M\2\2\u0434\u0438\7\u00db\2"+
		"\2\u0435\u0436\5\u0104\u0083\2\u0436\u0437\7\u0193\2\2\u0437\u0439\3\2"+
		"\2\2\u0438\u0435\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2\u043a"+
		"\u043b\5\u0126\u0094\2\u043b\u043c\7\u019b\2\2\u043c;\3\2\2\2\u043d\u043e"+
		"\7M\2\2\u043e\u0441\7\u00dd\2\2\u043f\u0440\7s\2\2\u0440\u0442\7[\2\2"+
		"\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0445"+
		"\5\u0104\u0083\2\u0444\u0446\7\u019b\2\2\u0445\u0444\3\2\2\2\u0445\u0446"+
		"\3\2\2\2\u0446=\3\2\2\2\u0447\u0448\7M\2\2\u0448\u044b\7\u00fe\2\2\u0449"+
		"\u044a\7s\2\2\u044a\u044c\7[\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2"+
		"\2\u044c\u044d\3\2\2\2\u044d\u0452\5\u0108\u0085\2\u044e\u044f\7\u019a"+
		"\2\2\u044f\u0451\5\u0108\u0085\2\u0450\u044e\3\2\2\2\u0451\u0454\3\2\2"+
		"\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0456\3\2\2\2\u0454\u0452"+
		"\3\2\2\2\u0455\u0457\7\u019b\2\2\u0456\u0455\3\2\2\2\u0456\u0457\3\2\2"+
		"\2\u0457?\3\2\2\2\u0458\u0459\7\u00ea\2\2\u0459\u045a\7\u00dd\2\2\u045a"+
		"\u045c\5\u0104\u0083\2\u045b\u045d\7\u019b\2\2\u045c\u045b\3\2\2\2\u045c"+
		"\u045d\3\2\2\2\u045dA\3\2\2\2\u045e\u0461\5D#\2\u045f\u0461\5F$\2\u0460"+
		"\u045e\3\2\2\2\u0460\u045f\3\2\2\2\u0461C\3\2\2\2\u0462\u0463\7\u00a0"+
		"\2\2\u0463\u0464\7\u0198\2\2\u0464\u0465\5\u0126\u0094\2\u0465\u0466\7"+
		"\u019a\2\2\u0466\u0467\7\u0183\2\2\u0467\u0468\7\u0199\2\2\u0468E\3\2"+
		"\2\2\u0469\u046a\7\u009f\2\2\u046a\u046b\7\u0198\2\2\u046b\u046c\7\u0183"+
		"\2\2\u046c\u046d\7\u019a\2\2\u046d\u046e\7\u0183\2\2\u046e\u046f\7\u0199"+
		"\2\2\u046f\u0471\7\u0193\2\2\u0470\u0472\5\u0126\u0094\2\u0471\u0470\3"+
		"\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0475\7\u0193\2\2"+
		"\u0474\u0476\5\u0126\u0094\2\u0475\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476"+
		"\u0477\3\2\2\2\u0477\u0478\7\u0193\2\2\u0478\u0479\5\u0126\u0094\2\u0479"+
		"G\3\2\2\2\u047a\u047b\7B\2\2\u047b\u0480\5d\63\2\u047c\u047d\7\u019a\2"+
		"\2\u047d\u047f\5d\63\2\u047e\u047c\3\2\2\2\u047f\u0482\3\2\2\2\u0480\u047e"+
		"\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0484\3\2\2\2\u0482\u0480\3\2\2\2\u0483"+
		"\u0485\7\u019b\2\2\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0498"+
		"\3\2\2\2\u0486\u0487\7B\2\2\u0487\u0489\7\u0180\2\2\u0488\u048a\7\t\2"+
		"\2\u0489\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048d"+
		"\5f\64\2\u048c\u048e\7\u019b\2\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2"+
		"\2\u048e\u0498\3\2\2\2\u048f\u0490\7B\2\2\u0490\u0492\5\u0128\u0095\2"+
		"\u0491\u0493\5`\61\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0495"+
		"\3\2\2\2\u0494\u0496\7\u019b\2\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2"+
		"\2\u0496\u0498\3\2\2\2\u0497\u047a\3\2\2\2\u0497\u0486\3\2\2\2\u0497\u048f"+
		"\3\2\2\2\u0498I\3\2\2\2\u0499\u049a\7B\2\2\u049a\u049b\7\u0132\2\2\u049b"+
		"\u049c\7\u00df\2\2\u049c\u049d\7\u00dd\2\2\u049d\u049e\5\u0104\u0083\2"+
		"\u049e\u049f\7\u0198\2\2\u049f\u04a4\5h\65\2\u04a0\u04a1\7\u019a\2\2\u04a1"+
		"\u04a3\5h\65\2\u04a2\u04a0\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4\u04a2\3\2"+
		"\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a7\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a7"+
		"\u04ac\7\u0199\2\2\u04a8\u04a9\7\u009d\2\2\u04a9\u04aa\7*\2\2\u04aa\u04ab"+
		"\t\13\2\2\u04ab\u04ad\7\u0159\2\2\u04ac\u04a8\3\2\2\2\u04ac\u04ad\3\2"+
		"\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04af\7\u0093\2\2\u04af\u04b1\7\u00e8\2"+
		"\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04b4"+
		"\7\u019b\2\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4K\3\2\2\2\u04b5"+
		"\u04b7\7#\2\2\u04b6\u04b8\7\u0126\2\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8"+
		"\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04bb\5\u0114\u008b\2\u04ba\u04bc\7"+
		"\u019b\2\2\u04bb\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04d0\3\2\2\2"+
		"\u04bd\u04bf\7@\2\2\u04be\u04c0\7\u0126\2\2\u04bf\u04be\3\2\2\2\u04bf"+
		"\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c3\5\u0114\u008b\2\u04c2\u04c4"+
		"\7\u019b\2\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04d0\3\2\2"+
		"\2\u04c5\u04d0\5\u0084C\2\u04c6\u04d0\5\u0088E\2\u04c7\u04c9\7\u009e\2"+
		"\2\u04c8\u04ca\7\u0126\2\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca"+
		"\u04cb\3\2\2\2\u04cb\u04cd\5\u0114\u008b\2\u04cc\u04ce\7\u019b\2\2\u04cd"+
		"\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d0\3\2\2\2\u04cf\u04b5\3\2"+
		"\2\2\u04cf\u04bd\3\2\2\2\u04cf\u04c5\3\2\2\2\u04cf\u04c6\3\2\2\2\u04cf"+
		"\u04c7\3\2\2\2\u04d0M\3\2\2\2\u04d1\u04d3\t\f\2\2\u04d2\u04d4\7u\2\2\u04d3"+
		"\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d7\3\2\2\2\u04d5\u04d6\7\u0180"+
		"\2\2\u04d6\u04d8\7\u0187\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8"+
		"\u04d9\3\2\2\2\u04d9\u04e2\5\u010a\u0086\2\u04da\u04df\5P)\2\u04db\u04dc"+
		"\7\u019a\2\2\u04dc\u04de\5P)\2\u04dd\u04db\3\2\2\2\u04de\u04e1\3\2\2\2"+
		"\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04df"+
		"\3\2\2\2\u04e2\u04da\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5\3\2\2\2\u04e4"+
		"\u04e6\7\u019b\2\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u0501"+
		"\3\2\2\2\u04e7\u04e9\t\f\2\2\u04e8\u04ea\7u\2\2\u04e9\u04e8\3\2\2\2\u04e9"+
		"\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\7\u0198\2\2\u04ec\u04f1"+
		"\5R*\2\u04ed\u04ee\7\u01a0\2\2\u04ee\u04f0\5R*\2\u04ef\u04ed\3\2\2\2\u04f0"+
		"\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\3\2"+
		"\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04fb\7\u0199\2\2\u04f5\u04f7\7\t\2\2\u04f6"+
		"\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\t\r"+
		"\2\2\u04f9\u04fa\7\u0187\2\2\u04fa\u04fc\7\u0183\2\2\u04fb\u04f6\3\2\2"+
		"\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04ff\7\u019b\2\2\u04fe"+
		"\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0501\3\2\2\2\u0500\u04d1\3\2"+
		"\2\2\u0500\u04e7\3\2\2\2\u0501O\3\2\2\2\u0502\u0503\7\u0180\2\2\u0503"+
		"\u0505\7\u0187\2\2\u0504\u0502\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u050d"+
		"\3\2\2\2\u0506\u050e\5\u0120\u0091\2\u0507\u0509\7\u0180\2\2\u0508\u050a"+
		"\t\16\2\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050e\3\2\2\2"+
		"\u050b\u050e\7D\2\2\u050c\u050e\7\u0097\2\2\u050d\u0506\3\2\2\2\u050d"+
		"\u0507\3\2\2\2\u050d\u050b\3\2\2\2\u050d\u050c\3\2\2\2\u050eQ\3\2\2\2"+
		"\u050f\u0510\t\3\2\2\u0510S\3\2\2\2\u0511\u0513\5^\60\2\u0512\u0514\7"+
		"\u019b\2\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0522\3\2\2\2"+
		"\u0515\u051c\7\u00c0\2\2\u0516\u0517\7\u0198\2\2\u0517\u0518\7\u0103\2"+
		"\2\u0518\u0519\7\u0113\2\2\u0519\u051a\7\u0187\2\2\u051a\u051b\7\u0180"+
		"\2\2\u051b\u051d\7\u0199\2\2\u051c\u0516\3\2\2\2\u051c\u051d\3\2\2\2\u051d"+
		"\u051f\3\2\2\2\u051e\u0520\7\u019b\2\2\u051f\u051e\3\2\2\2\u051f\u0520"+
		"\3\2\2\2\u0520\u0522\3\2\2\2\u0521\u0511\3\2\2\2\u0521\u0515\3\2\2\2\u0522"+
		"U\3\2\2\2\u0523\u0524\7\u00d1\2\2\u0524\u0527\7\u0180\2\2\u0525\u0526"+
		"\7\u0193\2\2\u0526\u0528\5\u0126\u0094\2\u0527\u0525\3\2\2\2\u0527\u0528"+
		"\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\7\u0187\2\2\u052a\u052c\5\u008c"+
		"G\2\u052b\u052d\7\u019b\2\2\u052c\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d"+
		"\u0552\3\2\2\2\u052e\u052f\7\u00d1\2\2\u052f\u0530\7\u0180\2\2\u0530\u0531"+
		"\5\u012c\u0097\2\u0531\u0533\5\u008cG\2\u0532\u0534\7\u019b\2\2\u0533"+
		"\u0532\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0552\3\2\2\2\u0535\u0536\7\u00d1"+
		"\2\2\u0536\u0537\7\u0180\2\2\u0537\u0538\7\u0187\2\2\u0538\u0539\78\2"+
		"\2\u0539\u0544\5\u0086D\2\u053a\u0542\7b\2\2\u053b\u053c\7\u00b4\2\2\u053c"+
		"\u0543\7\u0144\2\2\u053d\u0540\7\u00f6\2\2\u053e\u053f\7\u009a\2\2\u053f"+
		"\u0541\5\u0110\u0089\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543"+
		"\3\2\2\2\u0542\u053b\3\2\2\2\u0542\u053d\3\2\2\2\u0543\u0545\3\2\2\2\u0544"+
		"\u053a\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0547\3\2\2\2\u0546\u0548\7\u019b"+
		"\2\2\u0547\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0552\3\2\2\2\u0549"+
		"\u054a\7\u00d1\2\2\u054a\u054b\7\u0182\2\2\u054b\u054c\7\u0187\2\2\u054c"+
		"\u054e\5\u008cG\2\u054d\u054f\7\u019b\2\2\u054e\u054d\3\2\2\2\u054e\u054f"+
		"\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u0552\5\u008aF\2\u0551\u0523\3\2\2"+
		"\2\u0551\u052e\3\2\2\2\u0551\u0535\3\2\2\2\u0551\u0549\3\2\2\2\u0551\u0550"+
		"\3\2\2\2\u0552W\3\2\2\2\u0553\u0554\7\16\2\2\u0554\u0555\7K\2\2\u0555"+
		"\u0558\t\17\2\2\u0556\u0559\5\u0126\u0094\2\u0557\u0559\7\u0180\2\2\u0558"+
		"\u0556\3\2\2\2\u0558\u0557\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055b\3\2"+
		"\2\2\u055a\u055c\7\u019b\2\2\u055b\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c"+
		"\u059f\3\2\2\2\u055d\u055e\7\16\2\2\u055e\u0568\t\17\2\2\u055f\u0562\5"+
		"\u0126\u0094\2\u0560\u0562\7\u0180\2\2\u0561\u055f\3\2\2\2\u0561\u0560"+
		"\3\2\2\2\u0562\u0566\3\2\2\2\u0563\u0564\7\u0103\2\2\u0564\u0565\7\u0136"+
		"\2\2\u0565\u0567\7\u0183\2\2\u0566\u0563\3\2\2\2\u0566\u0567\3\2\2\2\u0567"+
		"\u0569\3\2\2\2\u0568\u0561\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056b\3\2"+
		"\2\2\u056a\u056c\7\u019b\2\2\u056b\u056a\3\2\2\2\u056b\u056c\3\2\2\2\u056c"+
		"\u059f\3\2\2\2\u056d\u056e\7*\2\2\u056e\u0579\t\17\2\2\u056f\u0572\5\u0126"+
		"\u0094\2\u0570\u0572\7\u0180\2\2\u0571\u056f\3\2\2\2\u0571\u0570\3\2\2"+
		"\2\u0572\u0577\3\2\2\2\u0573\u0574\7\u0103\2\2\u0574\u0575\7\u0198\2\2"+
		"\u0575\u0576\t\20\2\2\u0576\u0578\7\u0199\2\2\u0577\u0573\3\2\2\2\u0577"+
		"\u0578\3\2\2\2\u0578\u057a\3\2\2\2\u0579\u0571\3\2\2\2\u0579\u057a\3\2"+
		"\2\2\u057a\u057c\3\2\2\2\u057b\u057d\7\u019b\2\2\u057c\u057b\3\2\2\2\u057c"+
		"\u057d\3\2\2\2\u057d\u059f\3\2\2\2\u057e\u0580\7*\2\2\u057f\u0581\7\u0176"+
		"\2\2\u0580\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0583\3\2\2\2\u0582"+
		"\u0584\7\u019b\2\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u059f"+
		"\3\2\2\2\u0585\u0586\7\u00c4\2\2\u0586\u0589\t\17\2\2\u0587\u058a\5\u0126"+
		"\u0094\2\u0588\u058a\7\u0180\2\2\u0589\u0587\3\2\2\2\u0589\u0588\3\2\2"+
		"\2\u0589\u058a\3\2\2\2\u058a\u058c\3\2\2\2\u058b\u058d\7\u019b\2\2\u058c"+
		"\u058b\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u059f\3\2\2\2\u058e\u0590\7\u00c4"+
		"\2\2\u058f\u0591\7\u0176\2\2\u0590\u058f\3\2\2\2\u0590\u0591\3\2\2\2\u0591"+
		"\u0593\3\2\2\2\u0592\u0594\7\u019b\2\2\u0593\u0592\3\2\2\2\u0593\u0594"+
		"\3\2\2\2\u0594\u059f\3\2\2\2\u0595\u0596\7\u00c8\2\2\u0596\u0599\t\17"+
		"\2\2\u0597\u059a\5\u0126\u0094\2\u0598\u059a\7\u0180\2\2\u0599\u0597\3"+
		"\2\2\2\u0599\u0598\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059c\3\2\2\2\u059b"+
		"\u059d\7\u019b\2\2\u059c\u059b\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f"+
		"\3\2\2\2\u059e\u0553\3\2\2\2\u059e\u055d\3\2\2\2\u059e\u056d\3\2\2\2\u059e"+
		"\u057e\3\2\2\2\u059e\u0585\3\2\2\2\u059e\u058e\3\2\2\2\u059e\u0595\3\2"+
		"\2\2\u059fY\3\2\2\2\u05a0\u05a2\7\u0127\2\2\u05a1\u05a3\7\u0181\2\2\u05a2"+
		"\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3[\3\2\2\2\u05a4\u05a5\7\u00f8"+
		"\2\2\u05a5\u05a7\5\u0126\u0094\2\u05a6\u05a8\7\u019b\2\2\u05a7\u05a6\3"+
		"\2\2\2\u05a7\u05a8\3\2\2\2\u05a8]\3\2\2\2\u05a9\u05aa\t\f\2\2\u05aa\u05ab"+
		"\7\t\2\2\u05ab\u05ac\t\21\2\2\u05ac_\3\2\2\2\u05ad\u05af\7\u00f5\2\2\u05ae"+
		"\u05ad\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u061d\5b"+
		"\62\2\u05b1\u05b6\7\u0184\2\2\u05b2\u05b3\7\u0198\2\2\u05b3\u05b4\5\u008c"+
		"G\2\u05b4\u05b5\7\u0199\2\2\u05b5\u05b7\3\2\2\2\u05b6\u05b2\3\2\2\2\u05b6"+
		"\u05b7\3\2\2\2\u05b7\u061d\3\2\2\2\u05b8\u061d\7\22\2\2\u05b9\u061d\7"+
		"\23\2\2\u05ba\u061d\7\24\2\2\u05bb\u05c0\7\36\2\2\u05bc\u05bd\7\u0198"+
		"\2\2\u05bd\u05be\5\u008cG\2\u05be\u05bf\7\u0199\2\2\u05bf\u05c1\3\2\2"+
		"\2\u05c0\u05bc\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u061d\3\2\2\2\u05c2\u05c7"+
		"\7\37\2\2\u05c3\u05c4\7\u0198\2\2\u05c4\u05c5\5\u008cG\2\u05c5\u05c6\7"+
		"\u0199\2\2\u05c6\u05c8\3\2\2\2\u05c7\u05c3\3\2\2\2\u05c7\u05c8\3\2\2\2"+
		"\u05c8\u061d\3\2\2\2\u05c9\u061d\7\"\2\2\u05ca\u061d\7:\2\2\u05cb\u061d"+
		"\7;\2\2\u05cc\u061d\7\u01a6\2\2\u05cd\u061d\7<\2\2\u05ce\u061d\7>\2\2"+
		"\u05cf\u061d\7\u0181\2\2\u05d0\u061d\7A\2\2\u05d1\u061d\7L\2\2\u05d2\u05d7"+
		"\7\u0185\2\2\u05d3\u05d4\7\u0198\2\2\u05d4\u05d5\5\u008cG\2\u05d5\u05d6"+
		"\7\u0199\2\2\u05d6\u05d8\3\2\2\2\u05d7\u05d3\3\2\2\2\u05d7\u05d8\3\2\2"+
		"\2\u05d8\u061d\3\2\2\2\u05d9\u05de\7a\2\2\u05da\u05db\7\u0198\2\2\u05db"+
		"\u05dc\5\u008cG\2\u05dc\u05dd\7\u0199\2\2\u05dd\u05df\3\2\2\2\u05de\u05da"+
		"\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u061d\3\2\2\2\u05e0\u061d\7t\2\2\u05e1"+
		"\u061d\7}\2\2\u05e2\u061d\7\u008c\2\2\u05e3\u061d\7\u008d\2\2\u05e4\u05e9"+
		"\7\u008f\2\2\u05e5\u05e6\7\u0198\2\2\u05e6\u05e7\5\u008cG\2\u05e7\u05e8"+
		"\7\u0199\2\2\u05e8\u05ea\3\2\2\2\u05e9\u05e5\3\2\2\2\u05e9\u05ea\3\2\2"+
		"\2\u05ea\u061d\3\2\2\2\u05eb\u05f0\7\u0099\2\2\u05ec\u05ed\7\u0198\2\2"+
		"\u05ed\u05ee\5\u008cG\2\u05ee\u05ef\7\u0199\2\2\u05ef\u05f1\3\2\2\2\u05f0"+
		"\u05ec\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u061d\3\2\2\2\u05f2\u061d\7\u0094"+
		"\2\2\u05f3\u05f8\7\u0095\2\2\u05f4\u05f5\7\u0198\2\2\u05f5\u05f6\5\u008c"+
		"G\2\u05f6\u05f7\7\u0199\2\2\u05f7\u05f9\3\2\2\2\u05f8\u05f4\3\2\2\2\u05f8"+
		"\u05f9\3\2\2\2\u05f9\u061d\3\2\2\2\u05fa\u05ff\7\u0096\2\2\u05fb\u05fc"+
		"\7\u0198\2\2\u05fc\u05fd\5\u008cG\2\u05fd\u05fe\7\u0199\2\2\u05fe\u0600"+
		"\3\2\2\2\u05ff\u05fb\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u061d\3\2\2\2\u0601"+
		"\u061d\7\u0186\2\2\u0602\u061d\7\u00d6\2\2\u0603\u061d\7\u00d7\2\2\u0604"+
		"\u061d\7\u00d8\2\2\u0605\u061d\7\u00e0\2\2\u0606\u061d\7\u016a\2\2\u0607"+
		"\u061d\7\u016b\2\2\u0608\u061d\7\u00e3\2\2\u0609\u061d\7\u00ed\2\2\u060a"+
		"\u061d\7\u00ee\2\2\u060b\u061d\7\u00ef\2\2\u060c\u061d\7\u00f0\2\2\u060d"+
		"\u061d\7\u00f3\2\2\u060e\u0613\7\u00fb\2\2\u060f\u0610\7\u0198\2\2\u0610"+
		"\u0611\5\u008cG\2\u0611\u0612\7\u0199\2\2\u0612\u0614\3\2\2\2\u0613\u060f"+
		"\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u061d\3\2\2\2\u0615\u061a\7\u00fc\2"+
		"\2\u0616\u0617\7\u0198\2\2\u0617\u0618\5\u008cG\2\u0618\u0619\7\u0199"+
		"\2\2\u0619\u061b\3\2\2\2\u061a\u0616\3\2\2\2\u061a\u061b\3\2\2\2\u061b"+
		"\u061d\3\2\2\2\u061c\u05ae\3\2\2\2\u061c\u05b1\3\2\2\2\u061c\u05b8\3\2"+
		"\2\2\u061c\u05b9\3\2\2\2\u061c\u05ba\3\2\2\2\u061c\u05bb\3\2\2\2\u061c"+
		"\u05c2\3\2\2\2\u061c\u05c9\3\2\2\2\u061c\u05ca\3\2\2\2\u061c\u05cb\3\2"+
		"\2\2\u061c\u05cc\3\2\2\2\u061c\u05cd\3\2\2\2\u061c\u05ce\3\2\2\2\u061c"+
		"\u05cf\3\2\2\2\u061c\u05d0\3\2\2\2\u061c\u05d1\3\2\2\2\u061c\u05d2\3\2"+
		"\2\2\u061c\u05d9\3\2\2\2\u061c\u05e0\3\2\2\2\u061c\u05e1\3\2\2\2\u061c"+
		"\u05e2\3\2\2\2\u061c\u05e3\3\2\2\2\u061c\u05e4\3\2\2\2\u061c\u05eb\3\2"+
		"\2\2\u061c\u05f2\3\2\2\2\u061c\u05f3\3\2\2\2\u061c\u05fa\3\2\2\2\u061c"+
		"\u0601\3\2\2\2\u061c\u0602\3\2\2\2\u061c\u0603\3\2\2\2\u061c\u0604\3\2"+
		"\2\2\u061c\u0605\3\2\2\2\u061c\u0606\3\2\2\2\u061c\u0607\3\2\2\2\u061c"+
		"\u0608\3\2\2\2\u061c\u0609\3\2\2\2\u061c\u060a\3\2\2\2\u061c\u060b\3\2"+
		"\2\2\u061c\u060c\3\2\2\2\u061c\u060d\3\2\2\2\u061c\u060e\3\2\2\2\u061c"+
		"\u0615\3\2\2\2\u061da\3\2\2\2\u061e\u061f\t\22\2\2\u061fc\3\2\2\2\u0620"+
		"\u0622\7\u0180\2\2\u0621\u0623\7\t\2\2\u0622\u0621\3\2\2\2\u0622\u0623"+
		"\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0627\5`\61\2\u0625\u0626\7\u0187\2"+
		"\2\u0626\u0628\5\u008cG\2\u0627\u0625\3\2\2\2\u0627\u0628\3\2\2\2\u0628"+
		"e\3\2\2\2\u0629\u062b\7\u00dd\2\2\u062a\u062c\t\23\2\2\u062b\u062a\3\2"+
		"\2\2\u062b\u062c\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\7\u0198\2\2\u062e"+
		"\u0635\5h\65\2\u062f\u0631\7\u019a\2\2\u0630\u062f\3\2\2\2\u0630\u0631"+
		"\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0634\5h\65\2\u0633\u0630\3\2\2\2\u0634"+
		"\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0638\3\2"+
		"\2\2\u0637\u0635\3\2\2\2\u0638\u0639\7\u0199\2\2\u0639g\3\2\2\2\u063a"+
		"\u063d\5j\66\2\u063b\u063d\5n8\2\u063c\u063a\3\2\2\2\u063c\u063b\3\2\2"+
		"\2\u063di\3\2\2\2\u063e\u063f\5\u0112\u008a\2\u063f\u0641\5`\61\2\u0640"+
		"\u0642\5\u011a\u008e\2\u0641\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0645"+
		"\3\2\2\2\u0643\u0644\7v\2\2\u0644\u0646\5\u008cG\2\u0645\u0643\3\2\2\2"+
		"\u0645\u0646\3\2\2\2\u0646\u065e\3\2\2\2\u0647\u0648\7,\2\2\u0648\u064a"+
		"\5\u0126\u0094\2\u0649\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064b\3"+
		"\2\2\2\u064b\u064c\7D\2\2\u064c\u064f\5\u008eH\2\u064d\u064e\7\u0103\2"+
		"\2\u064e\u0650\7\u00fa\2\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650"+
		"\u065f\3\2\2\2\u0651\u0657\7p\2\2\u0652\u0653\7\u0198\2\2\u0653\u0654"+
		"\7\u0181\2\2\u0654\u0655\7\u019a\2\2\u0655\u0656\7\u0181\2\2\u0656\u0658"+
		"\7\u0199\2\2\u0657\u0652\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065c\3\2\2"+
		"\2\u0659\u065a\7\u0093\2\2\u065a\u065b\7b\2\2\u065b\u065d\7\u00b9\2\2"+
		"\u065c\u0659\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065f\3\2\2\2\u065e\u0649"+
		"\3\2\2\2\u065e\u0651\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0661\3\2\2\2\u0660"+
		"\u0662\7\u00c6\2\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0666"+
		"\3\2\2\2\u0663\u0665\5l\67\2\u0664\u0663\3\2\2\2\u0665\u0668\3\2\2\2\u0666"+
		"\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667k\3\2\2\2\u0668\u0666\3\2\2\2"+
		"\u0669\u066a\7,\2\2\u066a\u066c\5\u0126\u0094\2\u066b\u0669\3\2\2\2\u066b"+
		"\u066c\3\2\2\2\u066c\u066e\3\2\2\2\u066d\u066f\5\u011a\u008e\2\u066e\u066d"+
		"\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0685\3\2\2\2\u0670\u0671\7\u00ae\2"+
		"\2\u0671\u0674\7\u0084\2\2\u0672\u0674\7\u00f2\2\2\u0673\u0670\3\2\2\2"+
		"\u0673\u0672\3\2\2\2\u0674\u0676\3\2\2\2\u0675\u0677\5\u0118\u008d\2\u0676"+
		"\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0679\3\2\2\2\u0678\u067a\5p"+
		"9\2\u0679\u0678\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u0686\3\2\2\2\u067b"+
		"\u067f\7 \2\2\u067c\u067d\7\u0093\2\2\u067d\u067e\7b\2\2\u067e\u0680\7"+
		"\u00b9\2\2\u067f\u067c\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0681\3\2\2\2"+
		"\u0681\u0682\7\u0198\2\2\u0682\u0683\5\u00a0Q\2\u0683\u0684\7\u0199\2"+
		"\2\u0684\u0686\3\2\2\2\u0685\u0673\3\2\2\2\u0685\u067b\3\2\2\2\u0686\u0691"+
		"\3\2\2\2\u0687\u0688\7\u0081\2\2\u0688\u0689\7\u00f2\2\2\u0689\u068a\7"+
		"\u0198\2\2\u068a\u068b\5\u0122\u0092\2\u068b\u068e\7\u0199\2\2\u068c\u068d"+
		"\7D\2\2\u068d\u068f\5\u008cG\2\u068e\u068c\3\2\2\2\u068e\u068f\3\2\2\2"+
		"\u068f\u0691\3\2\2\2\u0690\u066b\3\2\2\2\u0690\u0687\3\2\2\2\u0691m\3"+
		"\2\2\2\u0692\u0693\7,\2\2\u0693\u0695\5\u0126\u0094\2\u0694\u0692\3\2"+
		"\2\2\u0694\u0695\3\2\2\2\u0695\u06b2\3\2\2\2\u0696\u0697\7\u00ae\2\2\u0697"+
		"\u069a\7\u0084\2\2\u0698\u069a\7\u00f2\2\2\u0699\u0696\3\2\2\2\u0699\u0698"+
		"\3\2\2\2\u069a\u069c\3\2\2\2\u069b\u069d\5\u0118\u008d\2\u069c\u069b\3"+
		"\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u069f\7\u0198\2\2"+
		"\u069f\u06a0\5\u0110\u0089\2\u06a0\u06a2\7\u0199\2\2\u06a1\u06a3\5p9\2"+
		"\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a6\3\2\2\2\u06a4\u06a5"+
		"\7\u009d\2\2\u06a5\u06a7\5\u0126\u0094\2\u06a6\u06a4\3\2\2\2\u06a6\u06a7"+
		"\3\2\2\2\u06a7\u06b3\3\2\2\2\u06a8\u06ac\7 \2\2\u06a9\u06aa\7\u0093\2"+
		"\2\u06aa\u06ab\7b\2\2\u06ab\u06ad\7\u00b9\2\2\u06ac\u06a9\3\2\2\2\u06ac"+
		"\u06ad\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06af\7\u0198\2\2\u06af\u06b0"+
		"\5\u00a0Q\2\u06b0\u06b1\7\u0199\2\2\u06b1\u06b3\3\2\2\2\u06b2\u0699\3"+
		"\2\2\2\u06b2\u06a8\3\2\2\2\u06b3o\3\2\2\2\u06b4\u06b5\7\u0103\2\2\u06b5"+
		"\u06b6\7\u0198\2\2\u06b6\u06bb\5\u0082B\2\u06b7\u06b8\7\u019a\2\2\u06b8"+
		"\u06ba\5\u0082B\2\u06b9\u06b7\3\2\2\2\u06ba\u06bd\3\2\2\2\u06bb\u06b9"+
		"\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be\3\2\2\2\u06bd\u06bb\3\2\2\2\u06be"+
		"\u06bf\7\u0199\2\2\u06bfq\3\2\2\2\u06c0\u06c1\7\u0100\2\2\u06c1\u06c2"+
		"\7\u00a6\2\2\u06c2\u06c6\7\u00e2\2\2\u06c3\u06c5\5\4\3\2\u06c4\u06c3\3"+
		"\2\2\2\u06c5\u06c8\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7"+
		"\u06c9\3\2\2\2\u06c8\u06c6\3\2\2\2\u06c9\u06ca\7\u00ba\2\2\u06ca\u06cb"+
		"\7\u019b\2\2\u06cbs\3\2\2\2\u06cc\u06cd\7\31\2\2\u06cd\u06ce\5\u0106\u0084"+
		"\2\u06ce\u06d7\7\u0198\2\2\u06cf\u06d4\5\u008cG\2\u06d0\u06d1\7\u019a"+
		"\2\2\u06d1\u06d3\5\u008cG\2\u06d2\u06d0\3\2\2\2\u06d3\u06d6\3\2\2\2\u06d4"+
		"\u06d2\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d4\3\2"+
		"\2\2\u06d7\u06cf\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9"+
		"\u06da\7\u0199\2\2\u06da\u06db\7\u019b\2\2\u06dbu\3\2\2\2\u06dc\u06dd"+
		"\7k\2\2\u06dd\u06de\5~@\2\u06de\u06e1\7\u009d\2\2\u06df\u06e2\5\u0104"+
		"\u0083\2\u06e0\u06e2\5\u0108\u0085\2\u06e1\u06df\3\2\2\2\u06e1\u06e0\3"+
		"\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e6\7\u00e4\2\2\u06e4\u06e7\7\u00b2"+
		"\2\2\u06e5\u06e7\5\u0110\u0089\2\u06e6\u06e4\3\2\2\2\u06e6\u06e5\3\2\2"+
		"\2\u06e7\u06e8\3\2\2\2\u06e8\u06e9\7\u019b\2\2\u06e9w\3\2\2\2\u06ea\u06eb"+
		"\7)\2\2\u06eb\u06ec\7\u009d\2\2\u06ec\u06ed\5|?\2\u06ed\u06ee\7\u0082"+
		"\2\2\u06ee\u06f0\7\u017d\2\2\u06ef\u06f1\7\u019b\2\2\u06f0\u06ef\3\2\2"+
		"\2\u06f0\u06f1\3\2\2\2\u06f1y\3\2\2\2\u06f2\u06f3\7\u00b8\2\2\u06f3\u06f4"+
		"\7\u0198\2\2\u06f4\u06f5\5\u008cG\2\u06f5\u06f6\7\u019a\2\2\u06f6\u06f7"+
		"\5\u008cG\2\u06f7\u06f8\7\u019a\2\2\u06f8\u06f9\5\u008cG\2\u06f9\u06fb"+
		"\7\u0199\2\2\u06fa\u06fc\7\u019b\2\2\u06fb\u06fa\3\2\2\2\u06fb\u06fc\3"+
		"\2\2\2\u06fc{\3\2\2\2\u06fd\u06fe\7(\2\2\u06fe\u06ff\5\u0104\u0083\2\u06ff"+
		"\u0700\7\u0193\2\2\u0700\u0701\5\u0112\u008a\2\u0701\u0713\3\2\2\2\u0702"+
		"\u0703\7x\2\2\u0703\u0713\5\u00e2r\2\u0704\u0705\7\u00ae\2\2\u0705\u0706"+
		"\7\u0084\2\2\u0706\u0707\7\u009d\2\2\u0707\u0713\5\u0104\u0083\2\u0708"+
		"\u0709\7\u00b1\2\2\u0709\u0713\5\u0106\u0084\2\u070a\u070b\7\u00c3\2\2"+
		"\u070b\u0713\5\u0126\u0094\2\u070c\u070d\7\u00dd\2\2\u070d\u0713\5\u0104"+
		"\u0083\2\u070e\u070f\7\u00f9\2\2\u070f\u0713\5\u0126\u0094\2\u0710\u0711"+
		"\7\u00fe\2\2\u0711\u0713\5\u0108\u0085\2\u0712\u06fd\3\2\2\2\u0712\u0702"+
		"\3\2\2\2\u0712\u0704\3\2\2\2\u0712\u0708\3\2\2\2\u0712\u070a\3\2\2\2\u0712"+
		"\u070c\3\2\2\2\u0712\u070e\3\2\2\2\u0712\u0710\3\2\2\2\u0713}\3\2\2\2"+
		"\u0714\u0719\5\u0080A\2\u0715\u0716\7\u019a\2\2\u0716\u0718\5\u0080A\2"+
		"\u0717\u0715\3\2\2\2\u0718\u071b\3\2\2\2\u0719\u0717\3\2\2\2\u0719\u071a"+
		"\3\2\2\2\u071a\177\3\2\2\2\u071b\u0719\3\2\2\2\u071c\u071d\t\24\2\2\u071d"+
		"\u0081\3\2\2\2\u071e\u071f\5\u0128\u0095\2\u071f\u0723\7\u0187\2\2\u0720"+
		"\u0724\5\u0128\u0095\2\u0721\u0724\5\u0116\u008c\2\u0722\u0724\7\u0181"+
		"\2\2\u0723\u0720\3\2\2\2\u0723\u0721\3\2\2\2\u0723\u0722\3\2\2\2\u0724"+
		"\u0083\3\2\2\2\u0725\u0726\7B\2\2\u0726\u0727\5\u0114\u008b\2\u0727\u0729"+
		"\78\2\2\u0728\u072a\7\u019b\2\2\u0729\u0728\3\2\2\2\u0729\u072a\3\2\2"+
		"\2\u072a\u0753\3\2\2\2\u072b\u072c\7B\2\2\u072c\u072e\5\u0114\u008b\2"+
		"\u072d\u072f\7\u012b\2\2\u072e\u072d\3\2\2\2\u072e\u072f\3\2\2\2\u072f"+
		"\u0731\3\2\2\2\u0730\u0732\7\u015d\2\2\u0731\u0730\3\2\2\2\u0731\u0732"+
		"\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0734\78\2\2\u0734\u0735\7b\2\2\u0735"+
		"\u073e\5\22\n\2\u0736\u073c\7b\2\2\u0737\u0738\7\u00b4\2\2\u0738\u073d"+
		"\7\u0144\2\2\u0739\u073d\7\u00f6\2\2\u073a\u073b\7\u009a\2\2\u073b\u073d"+
		"\5\u0110\u0089\2\u073c\u0737\3\2\2\2\u073c\u0739\3\2\2\2\u073c\u073a\3"+
		"\2\2\2\u073d\u073f\3\2\2\2\u073e\u0736\3\2\2\2\u073e\u073f\3\2\2\2\u073f"+
		"\u0741\3\2\2\2\u0740\u0742\7\u019b\2\2\u0741\u0740\3\2\2\2\u0741\u0742"+
		"\3\2\2\2\u0742\u0753\3\2\2\2\u0743\u0744\7B\2\2\u0744\u0745\5\u0114\u008b"+
		"\2\u0745\u0746\78\2\2\u0746\u074d\5\u0086D\2\u0747\u0748\7b\2\2\u0748"+
		"\u074b\7\u00f6\2\2\u0749\u074a\7\u009a\2\2\u074a\u074c\5\u0110\u0089\2"+
		"\u074b\u0749\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u074e\3\2\2\2\u074d\u0747"+
		"\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u0750\3\2\2\2\u074f\u0751\7\u019b\2"+
		"\2\u0750\u074f\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0753\3\2\2\2\u0752\u0725"+
		"\3\2\2\2\u0752\u072b\3\2\2\2\u0752\u0743\3\2\2\2\u0753\u0085\3\2\2\2\u0754"+
		"\u0756\t\25\2\2\u0755\u0754\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0758\3"+
		"\2\2\2\u0757\u0759\t\26\2\2\u0758\u0757\3\2\2\2\u0758\u0759\3\2\2\2\u0759"+
		"\u075b\3\2\2\2\u075a\u075c\t\27\2\2\u075b\u075a\3\2\2\2\u075b\u075c\3"+
		"\2\2\2\u075c\u075e\3\2\2\2\u075d\u075f\t\30\2\2\u075e\u075d\3\2\2\2\u075e"+
		"\u075f\3\2\2\2\u075f\u0761\3\2\2\2\u0760\u0762\7\u016e\2\2\u0761\u0760"+
		"\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0764\7b\2\2\u0764"+
		"\u0765\5\22\n\2\u0765\u0087\3\2\2\2\u0766\u0772\7^\2\2\u0767\u0770\7\u013c"+
		"\2\2\u0768\u0770\7\u014d\2\2\u0769\u0770\7\u0122\2\2\u076a\u0770\7\u0130"+
		"\2\2\u076b\u076c\7\u0106\2\2\u076c\u0770\5\u008cG\2\u076d\u076e\7\u0153"+
		"\2\2\u076e\u0770\5\u008cG\2\u076f\u0767\3\2\2\2\u076f\u0768\3\2\2\2\u076f"+
		"\u0769\3\2\2\2\u076f\u076a\3\2\2\2\u076f\u076b\3\2\2\2\u076f\u076d\3\2"+
		"\2\2\u076f\u0770\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0773\7g\2\2\u0772"+
		"\u076f\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0775\3\2\2\2\u0774\u0776\7\u0126"+
		"\2\2\u0775\u0774\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\3\2\2\2\u0777"+
		"\u0781\5\u0114\u008b\2\u0778\u0779\7\177\2\2\u0779\u077e\7\u0180\2\2\u077a"+
		"\u077b\7\u019a\2\2\u077b\u077d\7\u0180\2\2\u077c\u077a\3\2\2\2\u077d\u0780"+
		"\3\2\2\2\u077e\u077c\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0782\3\2\2\2\u0780"+
		"\u077e\3\2\2\2\u0781\u0778\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0784\3\2"+
		"\2\2\u0783\u0785\7\u019b\2\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785"+
		"\u0089\3\2\2\2\u0786\u0787\7\u00d1\2\2\u0787\u078c\5\u0126\u0094\2\u0788"+
		"\u078d\5\u0126\u0094\2\u0789\u078d\5\u0120\u0091\2\u078a\u078d\7\u0180"+
		"\2\2\u078b\u078d\5\u0116\u008c\2\u078c\u0788\3\2\2\2\u078c\u0789\3\2\2"+
		"\2\u078c\u078a\3\2\2\2\u078c\u078b\3\2\2\2\u078d\u078f\3\2\2\2\u078e\u0790"+
		"\7\u019b\2\2\u078f\u078e\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u07b1\3\2\2"+
		"\2\u0791\u0792\7\u00d1\2\2\u0792\u0793\7\u00e7\2\2\u0793\u0794\7\u012d"+
		"\2\2\u0794\u079d\7\u0131\2\2\u0795\u0796\7\u00b4\2\2\u0796\u079e\7\u0170"+
		"\2\2\u0797\u0798\7\u00b4\2\2\u0798\u079e\7\u0111\2\2\u0799\u079a\7\u0155"+
		"\2\2\u079a\u079e\7\u00b4\2\2\u079b\u079e\7\u0161\2\2\u079c\u079e\7\u0160"+
		"\2\2\u079d\u0795\3\2\2\2\u079d\u0797\3\2\2\2\u079d\u0799\3\2\2\2\u079d"+
		"\u079b\3\2\2\2\u079d\u079c\3\2\2\2\u079e\u07a0\3\2\2\2\u079f\u07a1\7\u019b"+
		"\2\2\u07a0\u079f\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07b1\3\2\2\2\u07a2"+
		"\u07a4\7\u00d1\2\2\u07a3\u07a5\7Z\2\2\u07a4\u07a3\3\2\2\2\u07a4\u07a5"+
		"\3\2\2\2\u07a5\u07a7\3\2\2\2\u07a6\u07a8\7\u00df\2\2\u07a7\u07a6\3\2\2"+
		"\2\u07a7\u07a8\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07aa\7\u00a3\2\2\u07aa"+
		"\u07ab\5\u008cG\2\u07ab\u07ac\7\u0187\2\2\u07ac\u07ae\5\u008cG\2\u07ad"+
		"\u07af\7\u019b\2\2\u07ae\u07ad\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b1"+
		"\3\2\2\2\u07b0\u0786\3\2\2\2\u07b0\u0791\3\2\2\2\u07b0\u07a2\3\2\2\2\u07b1"+
		"\u008b\3\2\2\2\u07b2\u07b3\bG\1\2\u07b3\u07b4\7\u01a2\2\2\u07b4\u07c7"+
		"\5\u008cG\2\u07b5\u07b6\t\31\2\2\u07b6\u07c7\5\u008cG\2\u07b7\u07c7\7"+
		"D\2\2\u07b8\u07c7\7\u0097\2\2\u07b9\u07c7\7\u0180\2\2\u07ba\u07c7\5\u0120"+
		"\u0091\2\u07bb\u07c7\5\u00d6l\2\u07bc\u07c7\5\u00eex\2\u07bd\u07c7\5\u010e"+
		"\u0088\2\u07be\u07bf\7\u0198\2\2\u07bf\u07c0\5\u008cG\2\u07c0\u07c1\7"+
		"\u0199\2\2\u07c1\u07c7\3\2\2\2\u07c2\u07c3\7\u0198\2\2\u07c3\u07c4\5\u0090"+
		"I\2\u07c4\u07c5\7\u0199\2\2\u07c5\u07c7\3\2\2\2\u07c6\u07b2\3\2\2\2\u07c6"+
		"\u07b5\3\2\2\2\u07c6\u07b7\3\2\2\2\u07c6\u07b8\3\2\2\2\u07c6\u07b9\3\2"+
		"\2\2\u07c6\u07ba\3\2\2\2\u07c6\u07bb\3\2\2\2\u07c6\u07bc\3\2\2\2\u07c6"+
		"\u07bd\3\2\2\2\u07c6\u07be\3\2\2\2\u07c6\u07c2\3\2\2\2\u07c7\u07da\3\2"+
		"\2\2\u07c8\u07c9\6G\2\3\u07c9\u07ca\7\3\2\2\u07ca\u07d9\5\u008cG\2\u07cb"+
		"\u07cc\6G\3\3\u07cc\u07cd\t\32\2\2\u07cd\u07d9\5\u008cG\2\u07ce\u07cf"+
		"\6G\4\3\u07cf\u07d0\t\33\2\2\u07d0\u07d9\5\u008cG\2\u07d1\u07d2\6G\5\3"+
		"\u07d2\u07d3\7\'\2\2\u07d3\u07d9\5\u0126\u0094\2\u07d4\u07d5\6G\6\3\u07d5"+
		"\u07d6\5\u012a\u0096\2\u07d6\u07d7\5\u008cG\2\u07d7\u07d9\3\2\2\2\u07d8"+
		"\u07c8\3\2\2\2\u07d8\u07cb\3\2\2\2\u07d8\u07ce\3\2\2\2\u07d8\u07d1\3\2"+
		"\2\2\u07d8\u07d4\3\2\2\2\u07d9\u07dc\3\2\2\2\u07da\u07d8\3\2\2\2\u07da"+
		"\u07db\3\2\2\2\u07db\u008d\3\2\2\2\u07dc\u07da\3\2\2\2\u07dd\u07e7\7\u0097"+
		"\2\2\u07de\u07e7\5\u0120\u0091\2\u07df\u07e7\5\u00d6l\2\u07e0\u07e7\7"+
		"\u0180\2\2\u07e1\u07e2\7\u0198\2\2\u07e2\u07e3\5\u008eH\2\u07e3\u07e4"+
		"\7\u0199\2\2\u07e4\u07e7\3\2\2\2\u07e5\u07e7\7\f\2\2\u07e6\u07dd\3\2\2"+
		"\2\u07e6\u07de\3\2\2\2\u07e6\u07df\3\2\2\2\u07e6\u07e0\3\2\2\2\u07e6\u07e1"+
		"\3\2\2\2\u07e6\u07e5\3\2\2\2\u07e7\u008f\3\2\2\2\u07e8\u07e9\5\22\n\2"+
		"\u07e9\u0091\3\2\2\2\u07ea\u07eb\5\u00acW\2\u07eb\u0093\3\2\2\2\u07ec"+
		"\u07ef\7\u0103\2\2\u07ed\u07ee\7\u0178\2\2\u07ee\u07f0\7\u019a\2\2\u07ef"+
		"\u07ed\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f6\5\u0096"+
		"L\2\u07f2\u07f3\7\u019a\2\2\u07f3\u07f5\5\u0096L\2\u07f4\u07f2\3\2\2\2"+
		"\u07f5\u07f8\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u0095"+
		"\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f9\u07fe\5\u0126\u0094\2\u07fa\u07fb\7"+
		"\u0198\2\2\u07fb\u07fc\5\u0110\u0089\2\u07fc\u07fd\7\u0199\2\2\u07fd\u07ff"+
		"\3\2\2\2\u07fe\u07fa\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\3\2\2\2\u0800"+
		"\u0801\7\t\2\2\u0801\u0802\7\u0198\2\2\u0802\u0803\5\22\n\2\u0803\u0804"+
		"\7\u0199\2\2\u0804\u0097\3\2\2\2\u0805\u0808\5\u010e\u0088\2\u0806\u0808"+
		"\7\u0180\2\2\u0807\u0805\3\2\2\2\u0807\u0806\3\2\2\2\u0808\u080b\3\2\2"+
		"\2\u0809\u080c\7\u0187\2\2\u080a\u080c\5\u012c\u0097\2\u080b\u0809\3\2"+
		"\2\2\u080b\u080a\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u0816\5\u008cG\2\u080e"+
		"\u080f\5\u0126\u0094\2\u080f\u0810\7\u0193\2\2\u0810\u0811\5\u0126\u0094"+
		"\2\u0811\u0812\7\u0198\2\2\u0812\u0813\5\u00ecw\2\u0813\u0814\7\u0199"+
		"\2\2\u0814\u0816\3\2\2\2\u0815\u0807\3\2\2\2\u0815\u080e\3\2\2\2\u0816"+
		"\u0099\3\2\2\2\u0817\u081b\5\u009cO\2\u0818\u081a\5\u009cO\2\u0819\u0818"+
		"\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081b\u081c\3\2\2\2\u081c"+
		"\u009b\3\2\2\2\u081d\u081b\3\2\2\2\u081e\u0821\5\4\3\2\u081f\u0821\5\u008c"+
		"G\2\u0820\u081e\3\2\2\2\u0820\u081f\3\2\2\2\u0821\u009d\3\2\2\2\u0822"+
		"\u0827\5\u00a0Q\2\u0823\u0824\7\u019a\2\2\u0824\u0826\5\u00a0Q\2\u0825"+
		"\u0823\3\2\2\2\u0826\u0829\3\2\2\2\u0827\u0825\3\2\2\2\u0827\u0828\3\2"+
		"\2\2\u0828\u009f\3\2\2\2\u0829\u0827\3\2\2\2\u082a\u082f\5\u00a2R\2\u082b"+
		"\u082c\7\7\2\2\u082c\u082e\5\u00a2R\2\u082d\u082b\3\2\2\2\u082e\u0831"+
		"\3\2\2\2\u082f\u082d\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u00a1\3\2\2\2\u0831"+
		"\u082f\3\2\2\2\u0832\u0837\5\u00a4S\2\u0833\u0834\7\u00a4\2\2\u0834\u0836"+
		"\5\u00a4S\2\u0835\u0833\3\2\2\2\u0836\u0839\3\2\2\2\u0837\u0835\3\2\2"+
		"\2\u0837\u0838\3\2\2\2\u0838\u00a3\3\2\2\2\u0839\u0837\3\2\2\2\u083a\u083c"+
		"\7\u0093\2\2\u083b\u083a\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083d\3\2\2"+
		"\2\u083d\u083e\5\u00a6T\2\u083e\u00a5\3\2\2\2\u083f\u0840\7[\2\2\u0840"+
		"\u0841\7\u0198\2\2\u0841\u0842\5\u0090I\2\u0842\u0843\7\u0199\2\2\u0843"+
		"\u0877\3\2\2\2\u0844\u0845\5\u008cG\2\u0845\u0846\5\u012a\u0096\2\u0846"+
		"\u0847\5\u008cG\2\u0847\u0877\3\2\2\2\u0848\u0849\5\u008cG\2\u0849\u084a"+
		"\5\u012a\u0096";
	private static final String _serializedATNSegment1 =
		"\2\u084a\u084b\t\34\2\2\u084b\u084c\7\u0198\2\2\u084c\u084d\5\u0090I\2"+
		"\u084d\u084e\7\u0199\2\2\u084e\u0877\3\2\2\2\u084f\u0851\5\u008cG\2\u0850"+
		"\u0852\7\u0093\2\2\u0851\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0853"+
		"\3\2\2\2\u0853\u0854\7\17\2\2\u0854\u0855\5\u008cG\2\u0855\u0856\7\7\2"+
		"\2\u0856\u0857\5\u008cG\2\u0857\u0877\3\2\2\2\u0858\u085a\5\u008cG\2\u0859"+
		"\u085b\7\u0093\2\2\u085a\u0859\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085c"+
		"\3\2\2\2\u085c\u085d\7v\2\2\u085d\u0860\7\u0198\2\2\u085e\u0861\5\u0090"+
		"I\2\u085f\u0861\5\u00ecw\2\u0860\u085e\3\2\2\2\u0860\u085f\3\2\2\2\u0861"+
		"\u0862\3\2\2\2\u0862\u0863\7\u0199\2\2\u0863\u0877\3\2\2\2\u0864\u0866"+
		"\5\u008cG\2\u0865\u0867\7\u0093\2\2\u0866\u0865\3\2\2\2\u0866\u0867\3"+
		"\2\2\2\u0867\u0868\3\2\2\2\u0868\u0869\7\u0088\2\2\u0869\u086c\5\u008c"+
		"G\2\u086a\u086b\7U\2\2\u086b\u086d\5\u008cG\2\u086c\u086a\3\2\2\2\u086c"+
		"\u086d\3\2\2\2\u086d\u0877\3\2\2\2\u086e\u086f\5\u008cG\2\u086f\u0870"+
		"\7\u0082\2\2\u0870\u0871\5\u011a\u008e\2\u0871\u0877\3\2\2\2\u0872\u0873"+
		"\7\u0198\2\2\u0873\u0874\5\u00a0Q\2\u0874\u0875\7\u0199\2\2\u0875\u0877"+
		"\3\2\2\2\u0876\u083f\3\2\2\2\u0876\u0844\3\2\2\2\u0876\u0848\3\2\2\2\u0876"+
		"\u084f\3\2\2\2\u0876\u0858\3\2\2\2\u0876\u0864\3\2\2\2\u0876\u086e\3\2"+
		"\2\2\u0876\u0872\3\2\2\2\u0877\u00a7\3\2\2\2\u0878\u087e\5\u00acW\2\u0879"+
		"\u087a\7\u0198\2\2\u087a\u087b\5\u00a8U\2\u087b\u087c\7\u0199\2\2\u087c"+
		"\u087e\3\2\2\2\u087d\u0878\3\2\2\2\u087d\u0879\3\2\2\2\u087e\u0882\3\2"+
		"\2\2\u087f\u0881\5\u00aaV\2\u0880\u087f\3\2\2\2\u0881\u0884\3\2\2\2\u0882"+
		"\u0880\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u00a9\3\2\2\2\u0884\u0882\3\2"+
		"\2\2\u0885\u0887\7\u00f1\2\2\u0886\u0888\7\5\2\2\u0887\u0886\3\2\2\2\u0887"+
		"\u0888\3\2\2\2\u0888\u088c\3\2\2\2\u0889\u088c\7V\2\2\u088a\u088c\7~\2"+
		"\2\u088b\u0885\3\2\2\2\u088b\u0889\3\2\2\2\u088b\u088a\3\2\2\2\u088c\u0896"+
		"\3\2\2\2\u088d\u0897\5\u00acW\2\u088e\u088f\7\u0198\2\2\u088f\u0890\5"+
		"\u00a8U\2\u0890\u0891\7\u0199\2\2\u0891\u0893\3\2\2\2\u0892\u088e\3\2"+
		"\2\2\u0893\u0894\3\2\2\2\u0894\u0892\3\2\2\2\u0894\u0895\3\2\2\2\u0895"+
		"\u0897\3\2\2\2\u0896\u088d\3\2\2\2\u0896\u0892\3\2\2\2\u0897\u00ab\3\2"+
		"\2\2\u0898\u089a\7\u00cc\2\2\u0899\u089b\t\35\2\2\u089a\u0899\3\2\2\2"+
		"\u089a\u089b\3\2\2\2\u089b\u08a5\3\2\2\2\u089c\u089d\7\u00e5\2\2\u089d"+
		"\u089f\5\u008cG\2\u089e\u08a0\7\u00a9\2\2\u089f\u089e\3\2\2\2\u089f\u08a0"+
		"\3\2\2\2\u08a0\u08a3\3\2\2\2\u08a1\u08a2\7\u0103\2\2\u08a2\u08a4\7\u0169"+
		"\2\2\u08a3\u08a1\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a6\3\2\2\2\u08a5"+
		"\u089c\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08aa\5\u00be"+
		"`\2\u08a8\u08a9\7\177\2\2\u08a9\u08ab\5\u0104\u0083\2\u08aa\u08a8\3\2"+
		"\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08b5\3\2\2\2\u08ac\u08ad\7g\2\2\u08ad"+
		"\u08b2\5\u00c4c\2\u08ae\u08af\7\u019a\2\2\u08af\u08b1\5\u00c4c\2\u08b0"+
		"\u08ae\3\2\2\2\u08b1\u08b4\3\2\2\2\u08b2\u08b0\3\2\2\2\u08b2\u08b3\3\2"+
		"\2\2\u08b3\u08b6\3\2\2\2\u08b4\u08b2\3\2\2\2\u08b5\u08ac\3\2\2\2\u08b5"+
		"\u08b6\3\2\2\2\u08b6\u08b9\3\2\2\2\u08b7\u08b8\7\u0101\2\2\u08b8\u08ba"+
		"\5\u00a0Q\2\u08b9\u08b7\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08c5\3\2\2"+
		"\2\u08bb\u08bc\7l\2\2\u08bc\u08bd\7\30\2\2\u08bd\u08c2\5\u00b6\\\2\u08be"+
		"\u08bf\7\u019a\2\2\u08bf\u08c1\5\u00b6\\\2\u08c0\u08be\3\2\2\2\u08c1\u08c4"+
		"\3\2\2\2\u08c2\u08c0\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c6\3\2\2\2\u08c4"+
		"\u08c2\3\2\2\2\u08c5\u08bb\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c9\3\2"+
		"\2\2\u08c7\u08c8\7m\2\2\u08c8\u08ca\5\u00a0Q\2\u08c9\u08c7\3\2\2\2\u08c9"+
		"\u08ca\3\2\2\2\u08ca\u00ad\3\2\2\2\u08cb\u08cc\7\u00a5\2\2\u08cc\u08cd"+
		"\7\30\2\2\u08cd\u08d2\5\u00b4[\2\u08ce\u08cf\7\u019a\2\2\u08cf\u08d1\5"+
		"\u00b4[\2\u08d0\u08ce\3\2\2\2\u08d1\u08d4\3\2\2\2\u08d2\u08d0\3\2\2\2"+
		"\u08d2\u08d3\3\2\2\2\u08d3\u08e0\3\2\2\2\u08d4\u08d2\3\2\2\2\u08d5\u08d6"+
		"\7\u0143\2\2\u08d6\u08d7\5\u008cG\2\u08d7\u08de\t\36\2\2\u08d8\u08d9\7"+
		"^\2\2\u08d9\u08da\t\37\2\2\u08da\u08db\5\u008cG\2\u08db\u08dc\t\36\2\2"+
		"\u08dc\u08dd\7\u0144\2\2\u08dd\u08df\3\2\2\2\u08de\u08d8\3\2\2\2\u08de"+
		"\u08df\3\2\2\2\u08df\u08e1\3\2\2\2\u08e0\u08d5\3\2\2\2\u08e0\u08e1\3\2"+
		"\2\2\u08e1\u00af\3\2\2\2\u08e2\u08e3\7b\2\2\u08e3\u08f6\7\26\2\2\u08e4"+
		"\u08e5\7b\2\2\u08e5\u08e6\7\u0177\2\2\u08e6\u08e8\7\u0108\2\2\u08e7\u08e9"+
		"\5\u00b2Z\2\u08e8\u08e7\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9\u08f6\3\2\2"+
		"\2\u08ea\u08eb\7b\2\2\u08eb\u08ec\7\u0177\2\2\u08ec\u08f0\7\u014b\2\2"+
		"\u08ed\u08ee\7\u0198\2\2\u08ee\u08ef\7\u0183\2\2\u08ef\u08f1\7\u0199\2"+
		"\2\u08f0\u08ed\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f3\3\2\2\2\u08f2\u08f4"+
		"\5\u00b2Z\2\u08f3\u08f2\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u08f6\3\2\2"+
		"\2\u08f5\u08e2\3\2\2\2\u08f5\u08e4\3\2\2\2\u08f5\u08ea\3\2\2\2\u08f6\u00b1"+
		"\3\2\2\2\u08f7\u08fc\7\u019a\2\2\u08f8\u08f9\7\u0184\2\2\u08f9\u08fd\7"+
		"\u010a\2\2\u08fa\u08fd\7\u016d\2\2\u08fb\u08fd\7\u0156\2\2\u08fc\u08f8"+
		"\3\2\2\2\u08fc\u08fa\3\2\2\2\u08fc\u08fb\3\2\2\2\u08fd\u00b3\3\2\2\2\u08fe"+
		"\u0900\5\u008cG\2\u08ff\u0901\t \2\2\u0900\u08ff\3\2\2\2\u0900\u0901\3"+
		"\2\2\2\u0901\u00b5\3\2\2\2\u0902\u0903\5\u008cG\2\u0903\u00b7\3\2\2\2"+
		"\u0904\u0905\7\u00a3\2\2\u0905\u0906\7\u0198\2\2\u0906\u090b\5\u00ba^"+
		"\2\u0907\u0908\7\u019a\2\2\u0908\u090a\5\u00ba^\2\u0909\u0907\3\2\2\2"+
		"\u090a\u090d\3\2\2\2\u090b\u0909\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090e"+
		"\3\2\2\2\u090d\u090b\3\2\2\2\u090e\u090f\7\u0199\2\2\u090f\u00b9\3\2\2"+
		"\2\u0910\u0911\7\u0120\2\2\u0911\u0929\7\u0181\2\2\u0912\u0913\t!\2\2"+
		"\u0913\u0929\7l\2\2\u0914\u0915\t\"\2\2\u0915\u0929\7\u00f1\2\2\u0916"+
		"\u0917\7\u012e\2\2\u0917\u0929\7\u00ab\2\2\u0918\u0919\7\u0146\2\2\u0919"+
		"\u091a\7b\2\2\u091a\u091b\7\u0198\2\2\u091b\u0920\5\u00bc_\2\u091c\u091d"+
		"\7\u019a\2\2\u091d\u091f\5\u00bc_\2\u091e\u091c\3\2\2\2\u091f\u0922\3"+
		"\2\2\2\u0920\u091e\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0923\3\2\2\2\u0922"+
		"\u0920\3\2\2\2\u0923\u0924\7\u0199\2\2\u0924\u0929\3\2\2\2\u0925\u0926"+
		"\7\u0146\2\2\u0926\u0927\7b\2\2\u0927\u0929\7\u0171\2\2\u0928\u0910\3"+
		"\2\2\2\u0928\u0912\3\2\2\2\u0928\u0914\3\2\2\2\u0928\u0916\3\2\2\2\u0928"+
		"\u0918\3\2\2\2\u0928\u0925\3\2\2\2\u0929\u00bb\3\2\2\2\u092a\u092e\7\u0180"+
		"\2\2\u092b\u092f\7\u0171\2\2\u092c\u092d\7\u0187\2\2\u092d\u092f\5\u0120"+
		"\u0091\2\u092e\u092b\3\2\2\2\u092e\u092c\3\2\2\2\u092f\u00bd\3\2\2\2\u0930"+
		"\u0935\5\u00c0a\2\u0931\u0932\7\u019a\2\2\u0932\u0934\5\u00c0a\2\u0933"+
		"\u0931\3\2\2\2\u0934\u0937\3\2\2\2\u0935\u0933\3\2\2\2\u0935\u0936\3\2"+
		"\2\2\u0936\u00bf\3\2\2\2\u0937\u0935\3\2\2\2\u0938\u0939\5\u0104\u0083"+
		"\2\u0939\u093a\7\u0193\2\2\u093a\u093c\3\2\2\2\u093b\u0938\3\2\2\2\u093b"+
		"\u093c\3\2\2\2\u093c\u0940\3\2\2\2\u093d\u0941\7\u019d\2\2\u093e\u093f"+
		"\7\u0197\2\2\u093f\u0941\t#\2\2\u0940\u093d\3\2\2\2\u0940\u093e\3\2\2"+
		"\2\u0941\u0952\3\2\2\2\u0942\u0943\5\u00e8u\2\u0943\u0944\7\u0187\2\2"+
		"\u0944\u0945\5\u008cG\2\u0945\u0952\3\2\2\2\u0946\u094b\5\u008cG\2\u0947"+
		"\u0949\7\t\2\2\u0948\u0947\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094a\3\2"+
		"\2\2\u094a\u094c\5\u00e8u\2\u094b\u0948\3\2\2\2\u094b\u094c\3\2\2\2\u094c"+
		"\u0952\3\2\2\2\u094d\u094f\5\n\6\2\u094e\u0950\5\u00dan\2\u094f\u094e"+
		"\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0952\3\2\2\2\u0951\u093b\3\2\2\2\u0951"+
		"\u0942\3\2\2\2\u0951\u0946\3\2\2\2\u0951\u094d\3\2\2\2\u0952\u00c1\3\2"+
		"\2\2\u0953\u0954\7\u014a\2\2\u0954\u0955\7\30\2\2\u0955\u0956\5\u00ec"+
		"w\2\u0956\u00c3\3\2\2\2\u0957\u0961\5\u00c6d\2\u0958\u0959\7\u0198\2\2"+
		"\u0959\u095a\5\u00c6d\2\u095a\u095b\7\u0199\2\2\u095b\u0961\3\2\2\2\u095c"+
		"\u095d\7\u0198\2\2\u095d\u095e\5\u0090I\2\u095e\u095f\7\u0199\2\2\u095f"+
		"\u0961\3\2\2\2\u0960\u0957\3\2\2\2\u0960\u0958\3\2\2\2\u0960\u095c\3\2"+
		"\2\2\u0961\u00c5\3\2\2\2\u0962\u0966\5\u00c8e\2\u0963\u0965\5\u00ccg\2"+
		"\u0964\u0963\3\2\2\2\u0965\u0968\3\2\2\2\u0966\u0964\3\2\2\2\u0966\u0967"+
		"\3\2\2\2\u0967\u00c7\3\2\2\2\u0968\u0966\3\2\2\2\u0969\u096b\5\u00ceh"+
		"\2\u096a\u096c\5\u00dan\2\u096b\u096a\3\2\2\2\u096b\u096c\3\2\2\2\u096c"+
		"\u098d\3\2\2\2\u096d\u096f\5\u00d0i\2\u096e\u0970\5\u00dan\2\u096f\u096e"+
		"\3\2\2\2\u096f\u0970\3\2\2\2\u0970\u098d\3\2\2\2\u0971\u0976\5\u00d4k"+
		"\2\u0972\u0974\5\u00dan\2\u0973\u0975\5\u00e6t\2\u0974\u0973\3\2\2\2\u0974"+
		"\u0975\3\2\2\2\u0975\u0977\3\2\2\2\u0976\u0972\3\2\2\2\u0976\u0977\3\2"+
		"\2\2\u0977\u098d\3\2\2\2\u0978\u0979\5\u00caf\2\u0979\u097a\5\u00dan\2"+
		"\u097a\u098d\3\2\2\2\u097b\u097d\5\u00d6l\2\u097c\u097e\5\u00dan\2\u097d"+
		"\u097c\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u098d\3\2\2\2\u097f\u0981\7\u0180"+
		"\2\2\u0980\u0982\5\u00dan\2\u0981\u0980\3\2\2\2\u0981\u0982\3\2\2\2\u0982"+
		"\u098d\3\2\2\2\u0983\u0984\7\u0180\2\2\u0984\u0985\7\u0193\2\2\u0985\u098a"+
		"\5\u00d6l\2\u0986\u0988\5\u00dan\2\u0987\u0989\5\u00e6t\2\u0988\u0987"+
		"\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098b\3\2\2\2\u098a\u0986\3\2\2\2\u098a"+
		"\u098b\3\2\2\2\u098b\u098d\3\2\2\2\u098c\u0969\3\2\2\2\u098c\u096d\3\2"+
		"\2\2\u098c\u0971\3\2\2\2\u098c\u0978\3\2\2\2\u098c\u097b\3\2\2\2\u098c"+
		"\u097f\3\2\2\2\u098c\u0983\3\2\2\2\u098d\u00c9\3\2\2\2\u098e\u098f\7\34"+
		"\2\2\u098f\u0990\7\u0198\2\2\u0990\u0991\7\35\2\2\u0991\u0992\5\u0104"+
		"\u0083\2\u0992\u0993\7\u019a\2\2\u0993\u0994\t$\2\2\u0994\u0995\7\u0199"+
		"\2\2\u0995\u00cb\3\2\2\2\u0996\u0998\7y\2\2\u0997\u0996\3\2\2\2\u0997"+
		"\u0998\3\2\2\2\u0998\u099e\3\2\2\2\u0999\u099b\t%\2\2\u099a\u099c\7\u00a7"+
		"\2\2\u099b\u099a\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099e\3\2\2\2\u099d"+
		"\u0997\3\2\2\2\u099d\u0999\3\2\2\2\u099e\u09a0\3\2\2\2\u099f\u09a1\t&"+
		"\2\2\u09a0\u099f\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2"+
		"\u09a3\7\u0083\2\2\u09a3\u09a4\5\u00c4c\2\u09a4\u09a5\7\u009d\2\2\u09a5"+
		"\u09a6\5\u00a0Q\2\u09a6\u09b1\3\2\2\2\u09a7\u09a8\7\62\2\2\u09a8\u09a9"+
		"\7\u0083\2\2\u09a9\u09b1\5\u00c4c\2\u09aa\u09ab\7\62\2\2\u09ab\u09ac\7"+
		"\u0107\2\2\u09ac\u09b1\5\u00c4c\2\u09ad\u09ae\7\u00a7\2\2\u09ae\u09af"+
		"\7\u0107\2\2\u09af\u09b1\5\u00c4c\2\u09b0\u099d\3\2\2\2\u09b0\u09a7\3"+
		"\2\2\2\u09b0\u09aa\3\2\2\2\u09b0\u09ad\3\2\2\2\u09b1\u00cd\3\2\2\2\u09b2"+
		"\u09b4\5\u0104\u0083\2\u09b3\u09b5\5\u00dep\2\u09b4\u09b3\3\2\2\2\u09b4"+
		"\u09b5\3\2\2\2\u09b5\u00cf\3\2\2\2\u09b6\u09b7\7\u00a1\2\2\u09b7\u09b8"+
		"\7\u0198\2\2\u09b8\u09b9\7\27\2\2\u09b9\u09ba\7\u0183\2\2\u09ba\u09c4"+
		"\7\u019a\2\2\u09bb\u09c0\5\u00d2j\2\u09bc\u09bd\7\u019a\2\2\u09bd\u09bf"+
		"\5\u00d2j\2\u09be\u09bc\3\2\2\2\u09bf\u09c2\3\2\2\2\u09c0\u09be\3\2\2"+
		"\2\u09c0\u09c1\3\2\2\2\u09c1\u09c5\3\2\2\2\u09c2\u09c0\3\2\2\2\u09c3\u09c5"+
		"\5\u0126\u0094\2\u09c4\u09bb\3\2\2\2\u09c4\u09c3\3\2\2\2\u09c5\u09c6\3"+
		"\2\2\2\u09c6\u09c7\7\u0199\2\2\u09c7\u00d1\3\2\2\2\u09c8\u09c9\5\u0126"+
		"\u0094\2\u09c9\u09ca\7\u0187\2\2\u09ca\u09cb\t\'\2\2\u09cb\u00d3\3\2\2"+
		"\2\u09cc\u09d3\5\u0090I\2\u09cd\u09ce\7\u0198\2\2\u09ce\u09cf\5\u0090"+
		"I\2\u09cf\u09d0\7\u0199\2\2\u09d0\u09d3\3\2\2\2\u09d1\u09d3\5\u00eav\2"+
		"\u09d2\u09cc\3\2\2\2\u09d2\u09cd\3\2\2\2\u09d2\u09d1\3\2\2\2\u09d3\u00d5"+
		"\3\2\2\2\u09d4\u0a40\5\u00f0y\2\u09d5\u0a40\5\u00f2z\2\u09d6\u09d7\5\u011c"+
		"\u008f\2\u09d7\u09d9\7\u0198\2\2\u09d8\u09da\5\u00ecw\2\u09d9\u09d8\3"+
		"\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\7\u0199\2\2"+
		"\u09dc\u0a40\3\2\2\2\u09dd\u09de\7\u010b\2\2\u09de\u09df\7\u0198\2\2\u09df"+
		"\u09e0\7\u019d\2\2\u09e0\u0a40\7\u0199\2\2\u09e1\u09e2\7\u010d\2\2\u09e2"+
		"\u09e3\7\u0198\2\2\u09e3\u09e4\5\u008cG\2\u09e4\u09e5\7\t\2\2\u09e5\u09e6"+
		"\5`\61\2\u09e6\u09e7\7\u0199\2\2\u09e7\u0a40\3\2\2\2\u09e8\u09e9\7\60"+
		"\2\2\u09e9\u09ea\7\u0198\2\2\u09ea\u09eb\5`\61\2\u09eb\u09ec\7\u019a\2"+
		"\2\u09ec\u09ef\5\u008cG\2\u09ed\u09ee\7\u019a\2\2\u09ee\u09f0\5\u008c"+
		"G\2\u09ef\u09ed\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1"+
		"\u09f2\7\u0199\2\2\u09f2\u0a40\3\2\2\2\u09f3\u09f4\7\u010f\2\2\u09f4\u09f5"+
		"\7\u0198\2\2\u09f5\u09f6\7\u019d\2\2\u09f6\u0a40\7\u0199\2\2\u09f7\u09f8"+
		"\7&\2\2\u09f8\u09f9\7\u0198\2\2\u09f9\u09fa\5\u00ecw\2\u09fa\u09fb\7\u0199"+
		"\2\2\u09fb\u0a40\3\2\2\2\u09fc\u0a40\7\66\2\2\u09fd\u0a40\7\67\2\2\u09fe"+
		"\u09ff\7\u0116\2\2\u09ff\u0a00\7\u0198\2\2\u0a00\u0a01\5\u00d8m\2\u0a01"+
		"\u0a02\7\u019a\2\2\u0a02\u0a03\5\u008cG\2\u0a03\u0a04\7\u019a\2\2\u0a04"+
		"\u0a05\5\u008cG\2\u0a05\u0a06\7\u0199\2\2\u0a06\u0a40\3\2\2\2\u0a07\u0a08"+
		"\7\u0117\2\2\u0a08\u0a09\7\u0198\2\2\u0a09\u0a0a\5\u00d8m\2\u0a0a\u0a0b"+
		"\7\u019a\2\2\u0a0b\u0a0c\5\u008cG\2\u0a0c\u0a0d\7\u019a\2\2\u0a0d\u0a0e"+
		"\5\u008cG\2\u0a0e\u0a0f\7\u0199\2\2\u0a0f\u0a40\3\2\2\2\u0a10\u0a11\7"+
		"\u0118\2\2\u0a11\u0a12\7\u0198\2\2\u0a12\u0a13\5\u00d8m\2\u0a13\u0a14"+
		"\7\u019a\2\2\u0a14\u0a15\5\u008cG\2\u0a15\u0a16\7\u0199\2\2\u0a16\u0a40"+
		"\3\2\2\2\u0a17\u0a18\7\u0119\2\2\u0a18\u0a19\7\u0198\2\2\u0a19\u0a1a\5"+
		"\u00d8m\2\u0a1a\u0a1b\7\u019a\2\2\u0a1b\u0a1c\5\u008cG\2\u0a1c\u0a1d\7"+
		"\u0199\2\2\u0a1d\u0a40\3\2\2\2\u0a1e\u0a1f\7p\2\2\u0a1f\u0a20\7\u0198"+
		"\2\2\u0a20\u0a23\5`\61\2\u0a21\u0a22\7\u019a\2\2\u0a22\u0a24\7\u0181\2"+
		"\2\u0a23\u0a21\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0a27\3\2\2\2\u0a25\u0a26"+
		"\7\u019a\2\2\u0a26\u0a28\7\u0181\2\2\u0a27\u0a25\3\2\2\2\u0a27\u0a28\3"+
		"\2\2\2\u0a28\u0a29\3\2\2\2\u0a29\u0a2a\7\u0199\2\2\u0a2a\u0a40\3\2\2\2"+
		"\u0a2b\u0a40\7\u0139\2\2\u0a2c\u0a2d\7\u013a\2\2\u0a2d\u0a2e\7\u0198\2"+
		"\2\u0a2e\u0a2f\5\u008cG\2\u0a2f\u0a30\7\u019a\2\2\u0a30\u0a31\5\u008c"+
		"G\2\u0a31\u0a32\7\u0199\2\2\u0a32\u0a40\3\2\2\2\u0a33\u0a34\7\u0098\2"+
		"\2\u0a34\u0a35\7\u0198\2\2\u0a35\u0a36\5\u008cG\2\u0a36\u0a37\7\u019a"+
		"\2\2\u0a37\u0a38\5\u008cG\2\u0a38\u0a39\7\u0199\2\2\u0a39\u0a40\3\2\2"+
		"\2\u0a3a\u0a40\7\u00d0\2\2\u0a3b\u0a40\7\u00dc\2\2\u0a3c\u0a3d\7\63\2"+
		"\2\u0a3d\u0a40\7\u016b\2\2\u0a3e\u0a40\5z>\2\u0a3f\u09d4\3\2\2\2\u0a3f"+
		"\u09d5\3\2\2\2\u0a3f\u09d6\3\2\2\2\u0a3f\u09dd\3\2\2\2\u0a3f\u09e1\3\2"+
		"\2\2\u0a3f\u09e8\3\2\2\2\u0a3f\u09f3\3\2\2\2\u0a3f\u09f7\3\2\2\2\u0a3f"+
		"\u09fc\3\2\2\2\u0a3f\u09fd\3\2\2\2\u0a3f\u09fe\3\2\2\2\u0a3f\u0a07\3\2"+
		"\2\2\u0a3f\u0a10\3\2\2\2\u0a3f\u0a17\3\2\2\2\u0a3f\u0a1e\3\2\2\2\u0a3f"+
		"\u0a2b\3\2\2\2\u0a3f\u0a2c\3\2\2\2\u0a3f\u0a33\3\2\2\2\u0a3f\u0a3a\3\2"+
		"\2\2\u0a3f\u0a3b\3\2\2\2\u0a3f\u0a3c\3\2\2\2\u0a3f\u0a3e\3\2\2\2\u0a40"+
		"\u00d7\3\2\2\2\u0a41\u0a42\7\u0182\2\2\u0a42\u00d9\3\2\2\2\u0a43\u0a45"+
		"\7\t\2\2\u0a44\u0a43\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46"+
		"\u0a47\5\u00dco\2\u0a47\u00db\3\2\2\2\u0a48\u0a4a\5\u0126\u0094\2\u0a49"+
		"\u0a4b\5\u00dep\2\u0a4a\u0a49\3\2\2\2\u0a4a\u0a4b\3\2\2\2\u0a4b\u00dd"+
		"\3\2\2\2\u0a4c\u0a4e\7\u0103\2\2\u0a4d\u0a4c\3\2\2\2\u0a4d\u0a4e\3\2\2"+
		"\2\u0a4e\u0a4f\3\2\2\2\u0a4f\u0a50\7\u0198\2\2\u0a50\u0a55\5\u00e0q\2"+
		"\u0a51\u0a52\7\u019a\2\2\u0a52\u0a54\5\u00e0q\2\u0a53\u0a51\3\2\2\2\u0a54"+
		"\u0a57\3\2\2\2\u0a55\u0a53\3\2\2\2\u0a55\u0a56\3\2\2\2\u0a56\u0a58\3\2"+
		"\2\2\u0a57\u0a55\3\2\2\2\u0a58\u0a59\7\u0199\2\2\u0a59\u00df\3\2\2\2\u0a5a"+
		"\u0a5c\7\u013f\2\2\u0a5b\u0a5a\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c\u0a83"+
		"\3\2\2\2\u0a5d\u0a5e\7x\2\2\u0a5e\u0a5f\7\u0198\2\2\u0a5f\u0a64\5\u00e4"+
		"s\2\u0a60\u0a61\7\u019a\2\2\u0a61\u0a63\5\u00e4s\2\u0a62\u0a60\3\2\2\2"+
		"\u0a63\u0a66\3\2\2\2\u0a64\u0a62\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65\u0a67"+
		"\3\2\2\2\u0a66\u0a64\3\2\2\2\u0a67\u0a68\7\u0199\2\2\u0a68\u0a84\3\2\2"+
		"\2\u0a69\u0a6a\7x\2\2\u0a6a\u0a6b\7\u0187\2\2\u0a6b\u0a84\5\u00e4s\2\u0a6c"+
		"\u0a7b\7c\2\2\u0a6d\u0a6e\7\u0198\2\2\u0a6e\u0a6f\5\u00e4s\2\u0a6f\u0a70"+
		"\7\u0198\2\2\u0a70\u0a75\5\u00e2r\2\u0a71\u0a72\7\u019a\2\2\u0a72\u0a74"+
		"\5\u00e2r\2\u0a73\u0a71\3\2\2\2\u0a74\u0a77\3\2\2\2\u0a75\u0a73\3\2\2"+
		"\2\u0a75\u0a76\3\2\2\2\u0a76\u0a78\3\2\2\2\u0a77\u0a75\3\2\2\2\u0a78\u0a79"+
		"\7\u0199\2\2\u0a79\u0a7a\7\u0199\2\2\u0a7a\u0a7c\3\2\2\2\u0a7b\u0a6d\3"+
		"\2\2\2\u0a7b\u0a7c\3\2\2\2\u0a7c\u0a84\3\2\2\2\u0a7d\u0a84\7\u0160\2\2"+
		"\u0a7e\u0a84\7\u0161\2\2\u0a7f\u0a80\7\u0162\2\2\u0a80\u0a81\7\u0187\2"+
		"\2\u0a81\u0a84\7\u0181\2\2\u0a82\u0a84\7\u0182\2\2\u0a83\u0a5d\3\2\2\2"+
		"\u0a83\u0a69\3\2\2\2\u0a83\u0a6c\3\2\2\2\u0a83\u0a7d\3\2\2\2\u0a83\u0a7e"+
		"\3\2\2\2\u0a83\u0a7f\3\2\2\2\u0a83\u0a82\3\2\2\2\u0a83\u0a84\3\2\2\2\u0a84"+
		"\u00e1\3\2\2\2\u0a85\u0a86\7\u0182\2\2\u0a86\u00e3\3\2\2\2\u0a87\u0a88"+
		"\t(\2\2\u0a88\u00e5\3\2\2\2\u0a89\u0a8a\7\u0198\2\2\u0a8a\u0a8f\5\u00e8"+
		"u\2\u0a8b\u0a8c\7\u019a\2\2\u0a8c\u0a8e\5\u00e8u\2\u0a8d\u0a8b\3\2\2\2"+
		"\u0a8e\u0a91\3\2\2\2\u0a8f\u0a8d\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a92"+
		"\3\2\2\2\u0a91\u0a8f\3\2\2\2\u0a92\u0a93\7\u0199\2\2\u0a93\u00e7\3\2\2"+
		"\2\u0a94\u0a97\5\u0126\u0094\2\u0a95\u0a97\7\u0183\2\2\u0a96\u0a94\3\2"+
		"\2\2\u0a96\u0a95\3\2\2\2\u0a97\u00e9\3\2\2\2\u0a98\u0a99\7\u00fa\2\2\u0a99"+
		"\u0a9a\7\u0198\2\2\u0a9a\u0a9b\5\u00ecw\2\u0a9b\u0aa3\7\u0199\2\2\u0a9c"+
		"\u0a9d\7\u019a\2\2\u0a9d\u0a9e\7\u0198\2\2\u0a9e\u0a9f\5\u00ecw\2\u0a9f"+
		"\u0aa0\7\u0199\2\2\u0aa0\u0aa2\3\2\2\2\u0aa1\u0a9c\3\2\2\2\u0aa2\u0aa5"+
		"\3\2\2\2\u0aa3\u0aa1\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u00eb\3\2\2\2\u0aa5"+
		"\u0aa3\3\2\2\2\u0aa6\u0aab\5\u008cG\2\u0aa7\u0aa8\7\u019a\2\2\u0aa8\u0aaa"+
		"\5\u008cG\2\u0aa9\u0aa7\3\2\2\2\u0aaa\u0aad\3\2\2\2\u0aab\u0aa9\3\2\2"+
		"\2\u0aab\u0aac\3\2\2\2\u0aac\u00ed\3\2\2\2\u0aad\u0aab\3\2\2\2\u0aae\u0aaf"+
		"\7\33\2\2\u0aaf\u0ab5\5\u008cG\2\u0ab0\u0ab1\7\u0100\2\2\u0ab1\u0ab2\5"+
		"\u008cG\2\u0ab2\u0ab3\7\u00e2\2\2\u0ab3\u0ab4\5\u008cG\2\u0ab4\u0ab6\3"+
		"\2\2\2\u0ab5\u0ab0\3\2\2\2\u0ab6\u0ab7\3\2\2\2\u0ab7\u0ab5\3\2\2\2\u0ab7"+
		"\u0ab8\3\2\2\2\u0ab8\u0abb\3\2\2\2\u0ab9\u0aba\7P\2\2\u0aba\u0abc\5\u008c"+
		"G\2\u0abb\u0ab9\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc\u0abd\3\2\2\2\u0abd"+
		"\u0abe\7R\2\2\u0abe\u0ad0\3\2\2\2\u0abf\u0ac5\7\33\2\2\u0ac0\u0ac1\7\u0100"+
		"\2\2\u0ac1\u0ac2\5\u00a0Q\2\u0ac2\u0ac3\7\u00e2\2\2\u0ac3\u0ac4\5\u008c"+
		"G\2\u0ac4\u0ac6\3\2\2\2\u0ac5\u0ac0\3\2\2\2\u0ac6\u0ac7\3\2\2\2\u0ac7"+
		"\u0ac5\3\2\2\2\u0ac7\u0ac8\3\2\2\2\u0ac8\u0acb\3\2\2\2\u0ac9\u0aca\7P"+
		"\2\2\u0aca\u0acc\5\u008cG\2\u0acb\u0ac9\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc"+
		"\u0acd\3\2\2\2\u0acd\u0ace\7R\2\2\u0ace\u0ad0\3\2\2\2\u0acf\u0aae\3\2"+
		"\2\2\u0acf\u0abf\3\2\2\2\u0ad0\u00ef\3\2\2\2\u0ad1\u0ad2\7\u014f\2\2\u0ad2"+
		"\u0ad3\7\u0198\2\2\u0ad3\u0ad4\7\u0199\2\2\u0ad4\u0ae4\5\u00f6|\2\u0ad5"+
		"\u0ad6\7\u011c\2\2\u0ad6\u0ad7\7\u0198\2\2\u0ad7\u0ad8\7\u0199\2\2\u0ad8"+
		"\u0ae4\5\u00f6|\2\u0ad9\u0ada\7\u0141\2\2\u0ada\u0adb\7\u0198\2\2\u0adb"+
		"\u0adc\5\u008cG\2\u0adc\u0add\7\u0199\2\2\u0add\u0ade\5\u00f6|\2\u0ade"+
		"\u0ae4\3\2\2\2\u0adf\u0ae0\7\u015a\2\2\u0ae0\u0ae1\7\u0198\2\2\u0ae1\u0ae2"+
		"\7\u0199\2\2\u0ae2\u0ae4\5\u00f6|\2\u0ae3\u0ad1\3\2\2\2\u0ae3\u0ad5\3"+
		"\2\2\2\u0ae3\u0ad9\3\2\2\2\u0ae3\u0adf\3\2\2\2\u0ae4\u00f1\3\2\2\2\u0ae5"+
		"\u0ae6\7\u0109\2\2\u0ae6\u0ae7\7\u0198\2\2\u0ae7\u0ae8\5\u00f4{\2\u0ae8"+
		"\u0aea\7\u0199\2\2\u0ae9\u0aeb\5\u00f6|\2\u0aea\u0ae9\3\2\2\2\u0aea\u0aeb"+
		"\3\2\2\2\u0aeb\u0b41\3\2\2\2\u0aec\u0aed\7\u0110\2\2\u0aed\u0aee\7\u0198"+
		"\2\2\u0aee\u0aef\5\u00f4{\2\u0aef\u0af0\7\u0199\2\2\u0af0\u0b41\3\2\2"+
		"\2\u0af1\u0af2\7\u0128\2\2\u0af2\u0af3\7\u0198\2\2\u0af3\u0af4\5\u008c"+
		"G\2\u0af4\u0af5\7\u0199\2\2\u0af5\u0b41\3\2\2\2\u0af6\u0af7\7\u0129\2"+
		"\2\u0af7\u0af8\7\u0198\2\2\u0af8\u0af9\5\u00ecw\2\u0af9\u0afa\7\u0199"+
		"\2\2\u0afa\u0b41\3\2\2\2\u0afb\u0afc\7\u0137\2\2\u0afc\u0afd\7\u0198\2"+
		"\2\u0afd\u0afe\5\u00f4{\2\u0afe\u0b00\7\u0199\2\2\u0aff\u0b01\5\u00f6"+
		"|\2\u0b00\u0aff\3\2\2\2\u0b00\u0b01\3\2\2\2\u0b01\u0b41\3\2\2\2\u0b02"+
		"\u0b03\7\u0138\2\2\u0b03\u0b04\7\u0198\2\2\u0b04\u0b05\5\u00f4{\2\u0b05"+
		"\u0b07\7\u0199\2\2\u0b06\u0b08\5\u00f6|\2\u0b07\u0b06\3\2\2\2\u0b07\u0b08"+
		"\3\2\2\2\u0b08\u0b41\3\2\2\2\u0b09\u0b0a\7\u0167\2\2\u0b0a\u0b0b\7\u0198"+
		"\2\2\u0b0b\u0b0c\5\u00f4{\2\u0b0c\u0b0e\7\u0199\2\2\u0b0d\u0b0f\5\u00f6"+
		"|\2\u0b0e\u0b0d\3\2\2\2\u0b0e\u0b0f\3\2\2\2\u0b0f\u0b41\3\2\2\2\u0b10"+
		"\u0b11\7\u0165\2\2\u0b11\u0b12\7\u0198\2\2\u0b12\u0b13\5\u00f4{\2\u0b13"+
		"\u0b15\7\u0199\2\2\u0b14\u0b16\5\u00f6|\2\u0b15\u0b14\3\2\2\2\u0b15\u0b16"+
		"\3\2\2\2\u0b16\u0b41\3\2\2\2\u0b17\u0b18\7\u0166\2\2\u0b18\u0b19\7\u0198"+
		"\2\2\u0b19\u0b1a\5\u00f4{\2\u0b1a\u0b1c\7\u0199\2\2\u0b1b\u0b1d\5\u00f6"+
		"|\2\u0b1c\u0b1b\3\2\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d\u0b41\3\2\2\2\u0b1e"+
		"\u0b1f\7\u0173\2\2\u0b1f\u0b20\7\u0198\2\2\u0b20\u0b21\5\u00f4{\2\u0b21"+
		"\u0b23\7\u0199\2\2\u0b22\u0b24\5\u00f6|\2\u0b23\u0b22\3\2\2\2\u0b23\u0b24"+
		"\3\2\2\2\u0b24\u0b41\3\2\2\2\u0b25\u0b26\7\u0174\2\2\u0b26\u0b27\7\u0198"+
		"\2\2\u0b27\u0b28\5\u00f4{\2\u0b28\u0b2a\7\u0199\2\2\u0b29\u0b2b\5\u00f6"+
		"|\2\u0b2a\u0b29\3\2\2\2\u0b2a\u0b2b\3\2\2\2\u0b2b\u0b41\3\2\2\2\u0b2c"+
		"\u0b2d\7\u0114\2\2\u0b2d\u0b30\7\u0198\2\2\u0b2e\u0b31\7\u019d\2\2\u0b2f"+
		"\u0b31\5\u00f4{\2\u0b30\u0b2e\3\2\2\2\u0b30\u0b2f\3\2\2\2\u0b31\u0b32"+
		"\3\2\2\2\u0b32\u0b34\7\u0199\2\2\u0b33\u0b35\5\u00f6|\2\u0b34\u0b33\3"+
		"\2\2\2\u0b34\u0b35\3\2\2\2\u0b35\u0b41\3\2\2\2\u0b36\u0b37\7\u0115\2\2"+
		"\u0b37\u0b3a\7\u0198\2\2\u0b38\u0b3b\7\u019d\2\2\u0b39\u0b3b\5\u00f4{"+
		"\2\u0b3a\u0b38\3\2\2\2\u0b3a\u0b39\3\2\2\2\u0b3b\u0b3c\3\2\2\2\u0b3c\u0b3e"+
		"\7\u0199\2\2\u0b3d\u0b3f\5\u00f6|\2\u0b3e\u0b3d\3\2\2\2\u0b3e\u0b3f\3"+
		"\2\2\2\u0b3f\u0b41\3\2\2\2\u0b40\u0ae5\3\2\2\2\u0b40\u0aec\3\2\2\2\u0b40"+
		"\u0af1\3\2\2\2\u0b40\u0af6\3\2\2\2\u0b40\u0afb\3\2\2\2\u0b40\u0b02\3\2"+
		"\2\2\u0b40\u0b09\3\2\2\2\u0b40\u0b10\3\2\2\2\u0b40\u0b17\3\2\2\2\u0b40"+
		"\u0b1e\3\2\2\2\u0b40\u0b25\3\2\2\2\u0b40\u0b2c\3\2\2\2\u0b40\u0b36\3\2"+
		"\2\2\u0b41\u00f3\3\2\2\2\u0b42\u0b44\t\35\2\2\u0b43\u0b42\3\2\2\2\u0b43"+
		"\u0b44\3\2\2\2\u0b44\u0b45\3\2\2\2\u0b45\u0b46\5\u008cG\2\u0b46\u00f5"+
		"\3\2\2\2\u0b47\u0b48\7\u00a8\2\2\u0b48\u0b4a\7\u0198\2\2\u0b49\u0b4b\5"+
		"\u00c2b\2\u0b4a\u0b49\3\2\2\2\u0b4a\u0b4b\3\2\2\2\u0b4b\u0b4d\3\2\2\2"+
		"\u0b4c\u0b4e\5\u00aeX\2\u0b4d\u0b4c\3\2\2\2\u0b4d\u0b4e\3\2\2\2\u0b4e"+
		"\u0b50\3\2\2\2\u0b4f\u0b51\5\u00f8}\2\u0b50\u0b4f\3\2\2\2\u0b50\u0b51"+
		"\3\2\2\2\u0b51\u0b52\3\2\2\2\u0b52\u0b53\7\u0199\2\2\u0b53\u00f7\3\2\2"+
		"\2\u0b54\u0b55\t)\2\2\u0b55\u0b56\5\u00fa~\2\u0b56\u00f9\3\2\2\2\u0b57"+
		"\u0b5e\5\u00fe\u0080\2\u0b58\u0b59\7\17\2\2\u0b59\u0b5a\5\u00fc\177\2"+
		"\u0b5a\u0b5b\7\7\2\2\u0b5b\u0b5c\5\u00fc\177\2\u0b5c\u0b5e\3\2\2\2\u0b5d"+
		"\u0b57\3\2\2\2\u0b5d\u0b58\3\2\2\2\u0b5e\u00fb\3\2\2\2\u0b5f\u0b62\5\u00fe"+
		"\u0080\2\u0b60\u0b62\5\u0100\u0081\2\u0b61\u0b5f\3\2\2\2\u0b61\u0b60\3"+
		"\2\2\2\u0b62\u00fd\3\2\2\2\u0b63\u0b64\7\u016f\2\2\u0b64\u0b6a\7\u014c"+
		"\2\2\u0b65\u0b66\7\u0181\2\2\u0b66\u0b6a\7\u014c\2\2\u0b67\u0b68\7\63"+
		"\2\2\u0b68\u0b6a\7\u0157\2\2\u0b69\u0b63\3\2\2\2\u0b69\u0b65\3\2\2\2\u0b69"+
		"\u0b67\3\2\2\2\u0b6a\u00ff\3\2\2\2\u0b6b\u0b6c\7\u016f\2\2\u0b6c\u0b70"+
		"\7\u0123\2\2\u0b6d\u0b6e\7\u0181\2\2\u0b6e\u0b70\7\u0123\2\2\u0b6f\u0b6b"+
		"\3\2\2\2\u0b6f\u0b6d\3\2\2\2\u0b70\u0101\3\2\2\2\u0b71\u0b72\5\u0126\u0094"+
		"\2\u0b72\u0b73\7\u0193\2\2\u0b73\u0b74\5\u0126\u0094\2\u0b74\u0b75\7\u0193"+
		"\2\2\u0b75\u0b76\5\u0126\u0094\2\u0b76\u0b77\7\u0193\2\2\u0b77\u0b83\3"+
		"\2\2\2\u0b78\u0b79\5\u0126\u0094\2\u0b79\u0b7b\7\u0193\2\2\u0b7a\u0b7c"+
		"\5\u0126\u0094\2\u0b7b\u0b7a\3\2\2\2\u0b7b\u0b7c\3\2\2\2\u0b7c\u0b7d\3"+
		"\2\2\2\u0b7d\u0b7e\7\u0193\2\2\u0b7e\u0b83\3\2\2\2\u0b7f\u0b80\5\u0126"+
		"\u0094\2\u0b80\u0b81\7\u0193\2\2\u0b81\u0b83\3\2\2\2\u0b82\u0b71\3\2\2"+
		"\2\u0b82\u0b78\3\2\2\2\u0b82\u0b7f\3\2\2\2\u0b82\u0b83\3\2\2\2\u0b83\u0b84"+
		"\3\2\2\2\u0b84\u0b85\5\u0126\u0094\2\u0b85\u0103\3\2\2\2\u0b86\u0b87\5"+
		"\u0126\u0094\2\u0b87\u0b89\7\u0193\2\2\u0b88\u0b8a\5\u0126\u0094\2\u0b89"+
		"\u0b88\3\2\2\2\u0b89\u0b8a\3\2\2\2\u0b8a\u0b8b\3\2\2\2\u0b8b\u0b8c\7\u0193"+
		"\2\2\u0b8c\u0b91\3\2\2\2\u0b8d\u0b8e\5\u0126\u0094\2\u0b8e\u0b8f\7\u0193"+
		"\2\2\u0b8f\u0b91\3\2\2\2\u0b90\u0b86\3\2\2\2\u0b90\u0b8d\3\2\2\2\u0b90"+
		"\u0b91\3\2\2\2\u0b91\u0b92\3\2\2\2\u0b92\u0b93\5\u0126\u0094\2\u0b93\u0105"+
		"\3\2\2\2\u0b94\u0b95\5\u0126\u0094\2\u0b95\u0b97\7\u0193\2\2\u0b96\u0b98"+
		"\5\u0126\u0094\2\u0b97\u0b96\3\2\2\2\u0b97\u0b98\3\2\2\2\u0b98\u0b99\3"+
		"\2\2\2\u0b99\u0b9a\7\u0193\2\2\u0b9a\u0b9f\3\2\2\2\u0b9b\u0b9c\5\u0126"+
		"\u0094\2\u0b9c\u0b9d\7\u0193\2\2\u0b9d\u0b9f\3\2\2\2\u0b9e\u0b94\3\2\2"+
		"\2\u0b9e\u0b9b\3\2\2\2\u0b9e\u0b9f\3\2\2\2\u0b9f\u0ba0\3\2\2\2\u0ba0\u0ba1"+
		"\5\u0126\u0094\2\u0ba1\u0107\3\2\2\2\u0ba2\u0ba3\5\u0126\u0094\2\u0ba3"+
		"\u0ba4\7\u0193\2\2\u0ba4\u0ba6\3\2\2\2\u0ba5\u0ba2\3\2\2\2\u0ba5\u0ba6"+
		"\3\2\2\2\u0ba6\u0ba7\3\2\2\2\u0ba7\u0ba8\5\u0126\u0094\2\u0ba8\u0109\3"+
		"\2\2\2\u0ba9\u0baa\5\u0126\u0094\2\u0baa\u0bac\7\u0193\2\2\u0bab\u0bad"+
		"\5\u0126\u0094\2\u0bac\u0bab\3\2\2\2\u0bac\u0bad\3\2\2\2\u0bad\u0bae\3"+
		"\2\2\2\u0bae\u0baf\7\u0193\2\2\u0baf\u0bb4\3\2\2\2\u0bb0\u0bb1\5\u0126"+
		"\u0094\2\u0bb1\u0bb2\7\u0193\2\2\u0bb2\u0bb4\3\2\2\2\u0bb3\u0ba9\3\2\2"+
		"\2\u0bb3\u0bb0\3\2\2\2\u0bb3\u0bb4\3\2\2\2\u0bb4\u0bb5\3\2\2\2\u0bb5\u0bb6"+
		"\5\u0126\u0094\2\u0bb6\u010b\3\2\2\2\u0bb7\u0bba\5\u0102\u0082\2\u0bb8"+
		"\u0bba\7\u0180\2\2\u0bb9\u0bb7\3\2\2\2\u0bb9\u0bb8\3\2\2\2\u0bba\u010d"+
		"\3\2\2\2\u0bbb\u0bbc\5\u0104\u0083\2\u0bbc\u0bbd\7\u0193\2\2\u0bbd\u0bbf"+
		"\3\2\2\2\u0bbe\u0bbb\3\2\2\2\u0bbe\u0bbf\3\2\2\2\u0bbf\u0bc0\3\2\2\2\u0bc0"+
		"\u0bc1\5\u0112\u008a\2\u0bc1\u010f\3\2\2\2\u0bc2\u0bc7\5\u0112\u008a\2"+
		"\u0bc3\u0bc4\7\u019a\2\2\u0bc4\u0bc6\5\u0112\u008a\2\u0bc5\u0bc3\3\2\2"+
		"\2\u0bc6\u0bc9\3\2\2\2\u0bc7\u0bc5\3\2\2\2\u0bc7\u0bc8\3\2\2\2\u0bc8\u0111"+
		"\3\2\2\2\u0bc9\u0bc7\3\2\2\2\u0bca\u0bcb\5\u0126\u0094\2\u0bcb\u0113\3"+
		"\2\2\2\u0bcc\u0bcf\5\u0126\u0094\2\u0bcd\u0bcf\7\u0180\2\2\u0bce\u0bcc"+
		"\3\2\2\2\u0bce\u0bcd\3\2\2\2\u0bcf\u0115\3\2\2\2\u0bd0\u0bd1\t\20\2\2"+
		"\u0bd1\u0117\3\2\2\2\u0bd2\u0bd3\t*\2\2\u0bd3\u0119\3\2\2\2\u0bd4\u0bd6"+
		"\7\u0093\2\2\u0bd5\u0bd4\3\2\2\2\u0bd5\u0bd6\3\2\2\2\u0bd6\u0bd7\3\2\2"+
		"\2\u0bd7\u0bd8\7\u0097\2\2\u0bd8\u011b\3\2\2\2\u0bd9\u0bdf\5\u010a\u0086"+
		"\2\u0bda\u0bdf\7\u00c2\2\2\u0bdb\u0bdf\7\u0086\2\2\u0bdc\u0bdf\7\u010b"+
		"\2\2\u0bdd\u0bdf\7\u010f\2\2\u0bde\u0bd9\3\2\2\2\u0bde\u0bda\3\2\2\2\u0bde"+
		"\u0bdb\3\2\2\2\u0bde\u0bdc\3\2\2\2\u0bde\u0bdd\3\2\2\2\u0bdf\u011d\3\2"+
		"\2\2\u0be0\u0be3\7\u0097\2\2\u0be1\u0be3\5\u0120\u0091\2\u0be2\u0be0\3"+
		"\2\2\2\u0be2\u0be1\3\2\2\2\u0be3\u011f\3\2\2\2\u0be4\u0bf1\7\u0183\2\2"+
		"\u0be5\u0bf1\7\u0184\2\2\u0be6\u0bf1\5\u0122\u0092\2\u0be7\u0be9\5\u0124"+
		"\u0093\2\u0be8\u0be7\3\2\2\2\u0be8\u0be9\3\2\2\2\u0be9\u0bea\3\2\2\2\u0bea"+
		"\u0bf1\t+\2\2\u0beb\u0bed\5\u0124\u0093\2\u0bec\u0beb\3\2\2\2\u0bec\u0bed"+
		"\3\2\2\2\u0bed\u0bee\3\2\2\2\u0bee\u0bef\7\u0197\2\2\u0bef\u0bf1\t,\2"+
		"\2\u0bf0\u0be4\3\2\2\2\u0bf0\u0be5\3\2\2\2\u0bf0\u0be6\3\2\2\2\u0bf0\u0be8"+
		"\3\2\2\2\u0bf0\u0bec\3\2\2\2\u0bf1\u0121\3\2\2\2\u0bf2\u0bf4\5\u0124\u0093"+
		"\2\u0bf3\u0bf2\3\2\2\2\u0bf3\u0bf4\3\2\2\2\u0bf4\u0bf5\3\2\2\2\u0bf5\u0bf6"+
		"\7\u0181\2\2\u0bf6\u0123\3\2\2\2\u0bf7\u0bf8\t\31\2\2\u0bf8\u0125\3\2"+
		"\2\2\u0bf9\u0bfd\5\u0128\u0095\2\u0bfa\u0bfd\7\u017e\2\2\u0bfb\u0bfd\7"+
		"\u017f\2\2\u0bfc\u0bf9\3\2\2\2\u0bfc\u0bfa\3\2\2\2\u0bfc\u0bfb\3\2\2\2"+
		"\u0bfd\u0127\3\2\2\2\u0bfe\u0bff\t-\2\2\u0bff\u0129\3\2\2\2\u0c00\u0c10"+
		"\7\u0187\2\2\u0c01\u0c10\7\u0188\2\2\u0c02\u0c10\7\u0189\2\2\u0c03\u0c04"+
		"\7\u0189\2\2\u0c04\u0c10\7\u0187\2\2\u0c05\u0c06\7\u0188\2\2\u0c06\u0c10"+
		"\7\u0187\2\2\u0c07\u0c08\7\u0189\2\2\u0c08\u0c10\7\u0188\2\2\u0c09\u0c0a"+
		"\7\u018a\2\2\u0c0a\u0c10\7\u0187\2\2\u0c0b\u0c0c\7\u018a\2\2\u0c0c\u0c10"+
		"\7\u0188\2\2\u0c0d\u0c0e\7\u018a\2\2\u0c0e\u0c10\7\u0189\2\2\u0c0f\u0c00"+
		"\3\2\2\2\u0c0f\u0c01\3\2\2\2\u0c0f\u0c02\3\2\2\2\u0c0f\u0c03\3\2\2\2\u0c0f"+
		"\u0c05\3\2\2\2\u0c0f\u0c07\3\2\2\2\u0c0f\u0c09\3\2\2\2\u0c0f\u0c0b\3\2"+
		"\2\2\u0c0f\u0c0d\3\2\2\2\u0c10\u012b\3\2\2\2\u0c11\u0c12\t.\2\2\u0c12"+
		"\u012d\3\2\2\2\u01ca\u0131\u013a\u0140\u014f\u0155\u015a\u015e\u0162\u0169"+
		"\u016e\u0179\u017f\u0185\u0188\u018a\u018f\u0192\u0196\u0199\u01a1\u01a4"+
		"\u01a9\u01ae\u01b4\u01b9\u01be\u01c4\u01ca\u01d1\u01d5\u01d7\u01df\u01e4"+
		"\u01e8\u01ea\u01ef\u01f4\u01fc\u0201\u0206\u020a\u020f\u0211\u021f\u0222"+
		"\u022a\u022c\u022f\u0235\u0238\u023b\u0243\u0246\u024d\u0251\u0253\u0255"+
		"\u0258\u025b\u025e\u0261\u0269\u026b\u026e\u0272\u0275\u027b\u027e\u028b"+
		"\u0293\u0296\u0299\u029c\u029f\u02a3\u02a6\u02a9\u02ac\u02af\u02b7\u02b9"+
		"\u02bd\u02c0\u02c3\u02cb\u02cf\u02d7\u02da\u02e1\u02e5\u02e7\u02e9\u02ec"+
		"\u02ef\u02f2\u02fa\u0300\u0306\u0308\u030c\u030f\u0312\u0317\u031c\u031f"+
		"\u0323\u0326\u0330\u0334\u0337\u0341\u0343\u034d\u0353\u0358\u035f\u0363"+
		"\u0365\u036c\u0371\u0376\u0385\u0398\u039c\u03a0\u03a2\u03a5\u03ad\u03b2"+
		"\u03b6\u03bc\u03bf\u03ca\u03cf\u03d7\u03da\u03e1\u03e4\u03f2\u03f9\u03fb"+
		"\u0404\u040b\u0415\u0418\u041d\u0423\u0427\u042d\u0431\u0438\u0441\u0445"+
		"\u044b\u0452\u0456\u045c\u0460\u0471\u0475\u0480\u0484\u0489\u048d\u0492"+
		"\u0495\u0497\u04a4\u04ac\u04b0\u04b3\u04b7\u04bb\u04bf\u04c3\u04c9\u04cd"+
		"\u04cf\u04d3\u04d7\u04df\u04e2\u04e5\u04e9\u04f1\u04f6\u04fb\u04fe\u0500"+
		"\u0504\u0509\u050d\u0513\u051c\u051f\u0521\u0527\u052c\u0533\u0540\u0542"+
		"\u0544\u0547\u054e\u0551\u0558\u055b\u0561\u0566\u0568\u056b\u0571\u0577"+
		"\u0579\u057c\u0580\u0583\u0589\u058c\u0590\u0593\u0599\u059c\u059e\u05a2"+
		"\u05a7\u05ae\u05b6\u05c0\u05c7\u05d7\u05de\u05e9\u05f0\u05f8\u05ff\u0613"+
		"\u061a\u061c\u0622\u0627\u062b\u0630\u0635\u063c\u0641\u0645\u0649\u064f"+
		"\u0657\u065c\u065e\u0661\u0666\u066b\u066e\u0673\u0676\u0679\u067f\u0685"+
		"\u068e\u0690\u0694\u0699\u069c\u06a2\u06a6\u06ac\u06b2\u06bb\u06c6\u06d4"+
		"\u06d7\u06e1\u06e6\u06f0\u06fb\u0712\u0719\u0723\u0729\u072e\u0731\u073c"+
		"\u073e\u0741\u074b\u074d\u0750\u0752\u0755\u0758\u075b\u075e\u0761\u076f"+
		"\u0772\u0775\u077e\u0781\u0784\u078c\u078f\u079d\u07a0\u07a4\u07a7\u07ae"+
		"\u07b0\u07c6\u07d8\u07da\u07e6\u07ef\u07f6\u07fe\u0807\u080b\u0815\u081b"+
		"\u0820\u0827\u082f\u0837\u083b\u0851\u085a\u0860\u0866\u086c\u0876\u087d"+
		"\u0882\u0887\u088b\u0894\u0896\u089a\u089f\u08a3\u08a5\u08aa\u08b2\u08b5"+
		"\u08b9\u08c2\u08c5\u08c9\u08d2\u08de\u08e0\u08e8\u08f0\u08f3\u08f5\u08fc"+
		"\u0900\u090b\u0920\u0928\u092e\u0935\u093b\u0940\u0948\u094b\u094f\u0951"+
		"\u0960\u0966\u096b\u096f\u0974\u0976\u097d\u0981\u0988\u098a\u098c\u0997"+
		"\u099b\u099d\u09a0\u09b0\u09b4\u09c0\u09c4\u09d2\u09d9\u09ef\u0a23\u0a27"+
		"\u0a3f\u0a44\u0a4a\u0a4d\u0a55\u0a5b\u0a64\u0a75\u0a7b\u0a83\u0a8f\u0a96"+
		"\u0aa3\u0aab\u0ab7\u0abb\u0ac7\u0acb\u0acf\u0ae3\u0aea\u0b00\u0b07\u0b0e"+
		"\u0b15\u0b1c\u0b23\u0b2a\u0b30\u0b34\u0b3a\u0b3e\u0b40\u0b43\u0b4a\u0b4d"+
		"\u0b50\u0b5d\u0b61\u0b69\u0b6f\u0b7b\u0b82\u0b89\u0b90\u0b97\u0b9e\u0ba5"+
		"\u0bac\u0bb3\u0bb9\u0bbe\u0bc7\u0bce\u0bd5\u0bde\u0be2\u0be8\u0bec\u0bf0"+
		"\u0bf3\u0bfc\u0c0f";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}