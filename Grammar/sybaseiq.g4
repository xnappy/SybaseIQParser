grammar sybaseiq;

sybaseiq_file
    : sql_clause* EOF
    ;

sql_clause
    : dml_clause

    | ddl_clause

    | cfl_statement

    | another_statement
    ;

// Data Manipulation Language:
dml_clause
    : delete_statement
    | insert_statement
    | select_statement
    | update_statement
    ;

// Data Definition Language:
ddl_clause
    : create_index
    | create_procedure
    | create_statistics
    | create_table
    | create_view

    | alter_table
    | alter_database

    | drop_index
    | drop_procedure
    | drop_statistics
    | drop_table
    | drop_view
    
    | truncate_statement
    ;

// Control-of-Flow Language:
// Labels for better AST traverse.
cfl_statement
    // http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc36272.1572/html/commands/X55146.htm
    : BEGIN sql_clause* END ';'?                                                                #begin_statement
    // http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1520/html/iqrefso/BABIIICH.htm
    | BEGIN PARALLEL IQ create_index* END PARALLEL IQ ';'?                                      #begin_parallel_statement
    // http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc01771.1600/doc/html/saiq-pteweh.html
    | EXCEPTION wot_statement                                                                   #exception_statement
    // http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1600/doc/html/san1281564923337.html
    | IF search_condition THEN then_condition_list
      (ELSEIF search_condition THEN then_condition_list)? 
      (ELSE (sql_clause* | expression*))? (END IF|ENDIF) ';'?                                   #if_statement
    // http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1530/doc/html/san1281564964993.html
    | RETURN expression? ';'?                                                                   #return_statement
    // http://infocenter.sybase.com/archive/index.jsp?topic=/com.sybase.dc37781_1150/html/psref/BABDEIHE.htm
    | TRY sql_clause* (CATCH '(' expression expression ')' sql_clause*)+ 
      (FINALLY sql_clause*)? END TRY                                                            #try_catch_statement
    // http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1520/html/iqrefso/Waitfor_statements.htm
    | WAITFOR (DELAY | TIME)  expression ';'?                                                   #waitfor_statement
    // http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1520/html/iqrefso/X315790.htm
    | WHILE search_condition (sql_clause | BREAK ';'? | CONTINUE ';'?)                          #while_statement
    // http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315751.htm
    | WHILE search_condition LOOP (sql_clause* | BREAK ';'? | CONTINUE ';'?) END LOOP ';'?      #loop_statement
    // http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315758.htm
    | PRINT expression ';'?                                                                     #print_statement
    // http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1520/html/iqrefso/X315759.htm
    | RAISERROR '(' msg=(DECIMAL | STRING | LOCAL_ID) ',' (number | LOCAL_ID) ','
       (number | LOCAL_ID) (',' (constant | LOCAL_ID))* ')' ';'?                                #raiseerror_statement
    // other
    | BREAK ';'?                                                                                #break_statement
    | CONTINUE ';'?                                                                             #continue_statement
    | GOTO id ';'?                                                                              #goto_statement
    | id ':' ';'?                                                                               #goto_statement
    | PARAMETERS id (',' id)* ';'?                                                              #parameter_statement
    ;

another_statement
    : declare_statement
    | declare_local_temporary_table
    | cursor_statement
    | execute_statement
    | set_statement
    | transaction_statement
    | go_statement
    | use_statement
    | call_statement
    | grant_rights
    | create_schema
    | comment_on_statement
    | message_statement
    ;

// DML

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315721.htm
delete_statement
    : with_expression?
      DELETE (TOP '(' expression ')' PERCENT?)?
      FROM? (table_source | ddl_object | rowset_function_limited | table_var=LOCAL_ID)
      output_clause?
      (FROM table_source (',' table_source)*)?
      (WHERE (search_condition | CURRENT OF (GLOBAL? cursor_name | cursor_var=LOCAL_ID)))?
      for_clause? option_clause? ';'?
    ;
    
// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315746.htm
insert_statement
    : with_expression?
      INSERT INTO? (tablename=ddl_object | rowset_function_limited) ('(' column_name_list ')')?
      insert_load_options? insert_select_load_options?
      (LOCATION servername=expression)? location_options?
      (VALUES '(' expression_list ')' (',' '(' expression_list ')')* derived_table | execute_statement | dml_table_source | DEFAULT VALUES)
      for_clause? option_clause? 
      subquery? ';'?
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315771.htm
select_statement
    : with_expression? query_expression order_by_clause? for_clause? option_clause? ';'?
    ;

// http://infocenter.sybase.com/archive/index.jsp?topic=/com.sybase.infocenter.dc38151.1260/html/iqref/Update.htm
update_statement
    : with_expression?
      UPDATE (TOP '(' expression ')' PERCENT?)?
      (ddl_object | rowset_function_limited) as_table_alias?
      SET update_elem (',' update_elem)*
      output_clause?
      (FROM table_source (',' table_source)*)?
      (WHERE (search_condition_list | CURRENT OF (GLOBAL? cursor_name | cursor_var=LOCAL_ID)))?
      for_clause? option_clause? ';'?
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00168.1540/doc/html/san1281564944071.html
output_clause
    : OUTPUT TO filename=expression APPEND? VERBOSE? 
      (FORMAT output_format)?
      (ESCAPE CHARACTER expression)?
      (DELIMITED BY expression)?
      (QUOTE expression ALL?)?  
      (COLUMN WIDTHS expression (',' expression)?)?
      (HEXADECIMAL (ON | OFF | ASIS))?
      (ENCODING expression)
      (WITH COLUMN NAMES)
    ;

output_format
    : TEXT | FIXED | HTML | SQL | XML
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315746.htm
insert_load_options
    : LIMIT number
    | NOTIFY number
    | SKIP number
    // problem mit ID | START ROW ID number
    ;

insert_select_load_options
    : WORD SKIP number 
    | IGNORE CONSTRAINT constraint_type (',' constraint_type)* 
    | MESSAGE LOG expression ROW LOG expression (ONLY LOG log_what (','log_what)*)? 
    | LOG DELIMITED BY expression
    ;

constraint_type
    : CHECK number
    | UNIQUE number
    | NULL number
    | FOREIGN KEY number
    | DATA VALUE number
    | ALL number
    ;

log_what
    : CHECK | ALL | NULL | UNIQUE | DATA VALUE | FOREIGN KEY | WORD
    ;

location_options
    : ENCRYPTED PASSWORD
    | PACKETSIZE number
    | QUOTED_IDENTIFIER (ON | OFF) 
    | ISOLATION LEVEL (READ UNCOMMITTED | READ COMMITTED | SERIALIZABLE)
    ;

// DDL

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc36272.1572/html/commands/X58868.htm
create_index
    : CREATE UNIQUE? index_type? INDEX indexname=id ON tablename=table_name '(' column_name_list ')' ';'?
    ;

index_type 
    : CMP | HG | HNG | LF | DATE | TIME | DTTM
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1520/html/iqrefso/X315708.htm
create_procedure
    : CREATE ((OR REPLACE)|(TEMPORARY))? PROCEDURE procedurename=procedure_name 
      '('?(procedure_param (',' procedure_param)* )?')'? 
      (RESULT result_column | NO RESULT SET)? (SQL SECURITY (INVOKER | DEFINER))? (ON EXCEPTION RESUME)?
    ;

procedure_param
    : (IN|OUT|INOUT) columnname=column_name declaretype=declare_type
    ;

result_column
    : '(' columnname=column_name declaretype=declare_type (',' columnname=column_name declaretype=declare_type)* ')'
    ;

// http://dcx.sybase.com/1200/en/dbreference/create-statistics-statement.html
create_statistics
    : CREATE STATISTICS statisticname=id ON tablename=table_name_with_hint '(' column_name_list ')'
      (WITH (FULLSCAN | SAMPLE DECIMAL (PERCENT | ROWS) | STATS_STREAM)
            (',' NORECOMPUTE)? (',' INCREMENTAL = on_off)? )? ';'?
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315712.htm
create_table
    : CREATE TABLE tablename=table_name '(' column_def_table_constraint (','? column_def_table_constraint)* ','? ')' (IN id | ON id | DEFAULT)? ';'?
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315714.htm
create_view
    : CREATE VIEW viewname=view_name ('(' column_name (',' column_name)* ')')?
      (WITH view_attribute (',' view_attribute)*)?
      AS select_statement (WITH CHECK OPTION)? ';'?
    ;

view_attribute
    : ENCRYPTION | SCHEMABINDING | VIEW_METADATA
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315714.htm
alter_table
    : ALTER TABLE tablename=table_name SET '(' LOCK_ESCALATION '=' (AUTO | TABLE | DISABLE) ')' ';'?
    | ALTER TABLE tablename=table_name add_list ';'?
    ;

add_list
    : ADD column_def_table_constraint (',' ADD column_def_table_constraint)* 
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc36272.1572/html/commands/X61977.htm
alter_database
    : ALTER DATABASE (database=id | CURRENT)
      (MODIFY NAME '=' new_name=id | COLLATE collation=id | SET database_option) ';'?
    ;

// Runtime check.
database_option
    : id (id | FULL)?
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc36272.1570/html/commands/X93093.htm
drop_index
    : DROP INDEX (IF EXISTS)? indexname=id ';'?
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc36272.1572/html/commands/X21497.htm
drop_procedure
    : DROP PROCEDURE (IF EXISTS)? procedurename=func_proc_name ';'?
    ;

// http://dcx.sybase.com/1200/en/dbreference/drop-statistics-statement.html
drop_statistics
    : DROP STATISTICS (table_name '.')? statisticname=id ';'
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc36272.1570/html/commands/X58548.htm
drop_table
    : DROP TABLE (IF EXISTS)? tablename=table_name ';'?
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc36272.1570/html/commands/X31140.htm
drop_view
    : DROP VIEW (IF EXISTS)? viewname=view_name (',' viewname=view_name)* ';'?
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1540/doc/html/san1281565011742.html
truncate_statement
    : TRUNCATE TABLE tablename=table_name ';'?
    ;

rowset_function_limited
    : openquery
    | opendatasource
    ;

openquery
    : OPENQUERY '(' linked_server=id ',' query=STRING ')'
    ;

opendatasource
    : OPENDATASOURCE '(' provider=STRING ',' init=STRING ')'
     '.' (database=id)? '.' (scheme=id)? '.' (table=id)
    ;

// Other statements.

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315717.htm
declare_statement
    : DECLARE name=simple_id declaretype=declare_type? (DEFAULT expression)? ( '=' expression )? ';'?
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315720.htm
declare_local_temporary_table
    :DECLARE LOCAL TEMPORARY TABLE tablename=table_name '(' column_def_table_constraint (',' column_def_table_constraint)* ')' (ON COMMIT (PRESERVE | DELETE) ROWS)? (NOT TRANSACTIONAL)?';'?
    ;

// https://msdn.microsoft.com/en-us/library/ms181441(v=sql.120).aspx
cursor_statement
    // https://msdn.microsoft.com/en-us/library/ms175035(v=sql.120).aspx
    : CLOSE GLOBAL? cursor_name ';'?
    // https://msdn.microsoft.com/en-us/library/ms188782(v=sql.120).aspx
    | DEALLOCATE GLOBAL? cursor_name ';'?
    // http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315719.htm
    | declare_cursor
    // https://msdn.microsoft.com/en-us/library/ms180152(v=sql.120).aspx
    | fetch_cursor
    // https://msdn.microsoft.com/en-us/library/ms190500(v=sql.120).aspx
    | OPEN GLOBAL? cursor_name ';'?
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc36272.1570/html/commands/X30305.htm
execute_statement
    : (EXEC | EXECUTE) IMMEDIATE? (return_status=LOCAL_ID '=')? func_proc_name (execute_statement_arg (',' execute_statement_arg)*)? ';'?
    | (EXEC | EXECUTE) IMMEDIATE? '(' execute_var_string ('+' execute_var_string)* ')' (AS? (LOGIN | USER) '=' STRING)? ';'?
    ;

execute_statement_arg
    : (parameter=LOCAL_ID '=')? (constant | LOCAL_ID (OUTPUT | OUT)? | DEFAULT | NULL)
    ;

execute_var_string
    : LOCAL_ID
    | STRING
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc00801.1510/html/iqrefso/X315773.htm
set_statement
    : SET simpleid1=simple_id ('.' member_name=id)? '=' expression ';'?
    | SET simpleid2=simple_id assignment_operator expression ';'?
    | set_special 
    ;

// http://infocenter.sybase.com/help/index.jsp?topic=/com.sybase.infocenter.dc36272.1570/html/commands/X53982.htm
transaction_statement
    : BEGIN DISTRIBUTED (TRAN | TRANSACTION) (id | LOCAL_ID)? ';'?
    | BEGIN (TRAN | TRANSACTION) ((id | LOCAL_ID) (WITH MARK STRING)?)? ';'?
    | COMMIT (TRAN | TRANSACTION) ((id | LOCAL_ID) (WITH '(' DELAYED_DURABILITY = (OFF | ON) ')')?)? ';'?
    | COMMIT WORK? ';'?
    | ROLLBACK (TRAN | TRANSACTION) (id | LOCAL_ID)? ';'?
    | ROLLBACK WORK? ';'?
    | SAVE (TRAN | TRANSACTION) (id | LOCAL_ID)? ';'?
    ;


go_statement
    : GO (count=DECIMAL)?
    ;

use_statement
    : USE database=id ';'?
    ;

declare_type
    : UNSIGNED? unsigned_addition
    | BINARY ('(' expression ')')?
    | BIT ('(' expression ')')?
    | BLOB
    | BOOLEAN
    | CHAR ('(' expression ')')?
    | CHARACTER ('(' expression ')')?
    | CLOB
    | DATE ('(' expression ')')?
    | DATETIME ('(' expression ')')?
    | DATETIMN ('(' expression ')')?
    | DATETIME2
    | DATETIMEOFFSET
    | DECIMAL ('(' expression ')')?
    | DECIMALN
    | DOUBLE 
    | FLOAT ('(' expression ')')?
    | FLOATN ('(' expression ')')?
    | IMAGE 
    | INTEGER
    | MONEY
    | MONEYN
    | NCHAR ('(' expression ')')
    | NVARCHAR ('(' expression ')')
    | NTEXT
    | NUMERIC ('(' expression ',' expression ')')?
    | NUMERICN ('(' expression ',' expression ')')?
    | REAL
    | SMALLMONEY
    | SMALLDATETIME ('(' expression ')')?
    | SYSNAME
    | TEXT
    | TIME ('(' expression ')')?
    | TIMESTAMP ('(' expression ')')?
    | TINYINT 
    | TYP_MONEY
    | TYP_VERBRAUCH
    | TYP_ZEITDIMENSION
    | TYP_ZEITWERT
    | UNIQUEIDENTIFIER
    | VARBINARY ('(' expression ')')?
    | VARCHAR ('(' expression ')')
    ;

unsigned_addition
    : BIGINT | BIGINTN | INT | INTN | SMALLINT | SMALLINTN
    ;

declare_local
    : LOCAL_ID AS? declaretype=declare_type ('=' expression)?
    ;

table_type_definition
    : TABLE (GLOBAL | TEMPORARY)? '(' column_def_table_constraint (','? column_def_table_constraint)* ')'
    ;

column_def_table_constraint
    : column_definition
    | table_constraint
    ;

column_definition
    : columnname=column_name declaretype=declare_type (PRIMARY KEY)? null_notnull? (IN expression)?
      //hier ist die Reihenfolge ungewiss, in der Doku ist die eine Rihenfolge und implementiert ist in der anderen Reihenfolge | beide funktionieren
      (((DEFAULT (expression|AUTOINCREMENT) | IDENTITY)? column_constraint?)|(column_constraint? (DEFAULT (expression|AUTOINCREMENT) | IDENTITY)?))
    ;

column_constraint
    : (CONSTRAINT id)? 
      ((PRIMARY KEY | UNIQUE | REFERENCES table_name (column_name)? (ON(UPDATE|DELETE|RESTRICT))) |
       IN dbspaceName=id | CHECK '(' search_condition ')' | IQ UNIQUE '(' number ')')
    ;

table_constraint
    : (CONSTRAINT id)?
       ((PRIMARY KEY | UNIQUE) clustered? '(' column_name_list ')' index_options? (ON id)?
       | CHECK (NOT FOR REPLICATION)? '(' search_condition ')')
    ;

index_options
    : WITH '(' index_option (',' index_option)* ')'
    ;

wot_statement
    : WHEN OTHERS THEN sql_clause* RESIGNAL ';'
    ;

call_statement
    : CALL procedure_name '(' (expression (',' expression)*)? ')' ';'
    ;

grant_rights
    : CALL SECURITY '.' GRANT_PERMISSION '('  schemanname=expression  ','  procname=expression  ')' ';'
    | CALL SECURITY '.' MANAGE_PERMISSION '('  schemanname=expression  ','  procname=expression   ')' ';'
    | GRANT permission_list  
      ON (table_name | view_name) 
      TO (PUBLIC | column_name_list) ';'
    ;

permission_list
    : permission (',' permission)*
    ;

permission
    : SELECT | UPDATE | INSERT | DELETE | REFERENCES | DECRYPT | EXECUTE
    ;

create_schema
    : CALL SECURITY '.' CREATE_SCHEMA '(' tablename=expression ')' ';' create_note
    ;

create_note
    : CALL SECURITY '.' CREATE_NOTE '(' tablename=expression ',' expression ',' expression ',' expression ')' ';' create_association+
    ;

create_association
    : CALL SECURITY '.' CREATE_ASSOCIATION '(' backendname=expression ',' tablename=expression ')' ';'
    ;

comment_on_statement
    : COMMENT ON comment_on_object IS STRING_COMMENT ';'?
    ;

message_statement
    : MESSAGE expression (',' expression)? 
      (TYPE (INFO | ACTION | WARNING | STATUS))?
      (TO ( CONSOLE 
          | CLIENT ( FOR '(' CONNECTION id  ( IMMEDIATE )? | ALL ')' )?
          | ( EVENT | SYSTEM )? LOG)?
      (DEBUG ONLY)?)? ';'?
    ;

 


replace_statement
    : REPLACE '(' expression ',' expression ',' expression ')' ';'?
    ;

// ToDo: need to be completed
comment_on_object
    : COLUMN tablename=table_name '.' columnname=column_name
//    | DBSPACE
//    | EVENT 
//    | EXTERNAL ENVIRONMENT? OBJECT
//    | EXTERNAL ENVIRONMENT
//    | EXTERNAL OBJECT
//    | FOREIGN KEY 
    | INDEX indexname=index_column_name
//    | INTEGRATED LOGIN
//    | JAVA CLASS
//    | JAVA JAR
//    | KERBEROS LOGIN
//    | LDAP SERVER
//    | LOGICAL SERVER
//    | LOGIN POLICY 
//    | LS POLICY
//    | MATERIALIZED VIEW
    | PRIMARY KEY ON tablename=table_name
    | PROCEDURE procedurename=procedure_name
    | ROLE rolename=id
//    | SERVICE 
//    | SEQUENCE 
//    | SPATIAL REFERENCE SYSTEM
//    | SPATIAL UNIT OF MEASURE
    | TABLE tablename=table_name
//    | TEXT CONFIGURATION
//    | TEXT INDEX
//    | TRIGGER 
    | USER username=id
    | VIEW viewname=view_name
    ;

index_option
    : simple_id '=' (simple_id | on_off | DECIMAL)
    ;

declare_cursor
    : DECLARE cursor_name CURSOR ';'?
    | DECLARE cursor_name INSENSITIVE? SCROLL? CURSOR FOR select_statement
      (FOR (READ ONLY | UPDATE | (OF column_name_list)))? ';'?
    | DECLARE cursor_name
      CURSOR  declare_set_cursor_common (FOR UPDATE (OF column_name_list)?)? ';'?
    ;

declare_set_cursor_common
    : (LOCAL | GLOBAL)?
      (FORWARD_ONLY | SCROLL)? (STATIC | KEYSET | DYNAMIC | FAST_FORWARD)?
      (READ_ONLY | SCROLL_LOCKS | OPTIMISTIC)? TYPE_WARNING?
      FOR select_statement
    ;

fetch_cursor
    : FETCH ((NEXT | PRIOR | FIRST | LAST | ABSOLUTE expression | RELATIVE expression)? FROM)?
      GLOBAL? cursor_name (INTO LOCAL_ID (',' LOCAL_ID)*)? ';'?
    ;


set_special
    : SET id (id | constant | LOCAL_ID | on_off) ';'?
    | SET TRANSACTION ISOLATION LEVEL
      (READ UNCOMMITTED | READ COMMITTED | REPEATABLE READ | SNAPSHOT | SERIALIZABLE) ';'?
    | SET EXISTING? TEMPORARY? OPTION l_name=expression '=' r_name=expression ';'?
    ;

// Expression.

// https://msdn.microsoft.com/en-us/library/ms190286.aspx
// Operator precendence: https://msdn.microsoft.com/en-us/library/ms190276.aspx
expression
    : DEFAULT                                                  #primitive_expression
    | NULL                                                     #primitive_expression
    | LOCAL_ID                                                 #primitive_expression
    | constant                                                 #primitive_expression
    | function_call                                            #function_call_expression
    | expression COLLATE id                                    #function_call_expression
    | case_expr                                                #case_expression
    | full_column_name                                         #column_ref_expression
    | '(' expression ')'                                       #bracket_expression
    | '(' subquery ')'                                         #subquery_expression
    | '~' expression                                           #unary_operator_expression
    | expression '|''|' expression                             #string_concatenation
    | expression op=('*' | '/' | '%') expression               #binary_operator_expression
    | op=('+' | '-') expression                                #unary_operator_expression
    | expression op=('+' | '-' | '&' | '^' | '|') expression   #binary_operator_expression
    | expression comparison_operator expression                #binary_operator_expression
    ;

constant_expression
    : NULL
    | constant
    | function_call
    | LOCAL_ID 
    | '(' constant_expression ')'
    | AUTOINCREMENT
    ;

subquery
    : select_statement
    ;

dml_table_source
    : query_specification
    ;

with_expression
    : WITH (XMLNAMESPACES ',')? common_table_expression (',' common_table_expression)*
    ;

common_table_expression
    : expression_name=id ('(' column_name_list ')')? AS '(' select_statement ')'
    ;

update_elem
    : (full_column_name | LOCAL_ID) ('=' | assignment_operator) expression
    | udt_column_name=id '.' method_name=id '(' expression_list ')'
    ;

then_condition_list
    : then_condition then_condition*
    ;

then_condition
    : (sql_clause | expression) 
    ;

search_condition_list
    : search_condition (',' search_condition)*
    ;

search_condition
    : search_condition_or (AND search_condition_or)*
    ;

search_condition_or
    : search_condition_not (OR search_condition_not)*
    ;

search_condition_not
    : NOT? predicate
    ;

predicate
    : EXISTS '(' subquery ')'
    | expression comparison_operator expression
    | expression comparison_operator (ALL | SOME | ANY) '(' subquery ')'
    | expression NOT? BETWEEN expression AND expression
    | expression NOT? IN '(' (subquery | expression_list) ')'
    | expression NOT? LIKE expression (ESCAPE expression)?
    | expression IS null_notnull
    | expression '(' expression ')'
    | '(' search_condition ')'
    ;

query_expression
    : (query_specification | '(' query_expression ')') union*
    ;

union
    : (UNION ALL? | EXCEPT | INTERSECT) (query_specification | ('(' query_expression ')')+)
    ;

query_specification
    : SELECT (ALL | DISTINCT)? (TOP expression PERCENT? (WITH TIES)?)?
      select_list
      (INTO into_table=table_name)?
      (FROM table_source (',' table_source)*)?
      (WHERE where=search_condition)?
      (GROUP BY group_by_item (',' group_by_item)*)?
      (HAVING having=search_condition)?
    ;

order_by_clause
    : ORDER BY order_by_expression (',' order_by_expression)*
      (OFFSET expression (ROW | ROWS) (FETCH (FIRST | NEXT) expression (ROW | ROWS) ONLY)?)?
    ;

for_clause
    : FOR BROWSE
    | FOR XML AUTO xml_common_directives?
    | FOR XML PATH ('(' STRING ')')? xml_common_directives?
    ;

xml_common_directives
    : ',' (BINARY BASE64 | TYPE | ROOT)
    ;

order_by_expression
    : expression (ASC | DESC)?
    ;

group_by_item
    : expression
    /*| rollup_spec
    | cube_spec
    | grouping_sets_spec
    | grand_total*/
    ;

option_clause
    : OPTION '(' option (',' option)* ')'
    ;

option
    : FAST number_rows=DECIMAL
    | (HASH | ORDER) GROUP
    | (MERGE | HASH | CONCAT) UNION
    | KEEPFIXED PLAN
    | OPTIMIZE FOR '(' optimize_for_arg (',' optimize_for_arg)* ')'
    | OPTIMIZE FOR UNKNOWN
    ;

optimize_for_arg
    : LOCAL_ID (UNKNOWN | '=' constant)
    ;

select_list
    : select_list_elem (',' select_list_elem)*
    ;

select_list_elem
    : (tablename=table_name '.')? ('*' | '$' (IDENTITY | ROWGUID))
    | columnalias=column_alias '=' expr=expression
    | expr=expression (AS? columnalias=column_alias)?
    | cfl_statement as_table_alias?
    ;

partition_by_clause
    : PARTITION BY expression_list
    ;

table_source
    : table_source_item_joined
    | '(' table_source_item_joined ')'
    | '(' subquery ')' 
    ;

table_source_item_joined
    : table_source_item join_part* 
    ;

table_source_item
    : table_name_with_hint        as_table_alias?
    | rowset_function             as_table_alias?
    | derived_table              (as_table_alias column_alias_list?)?
    | change_table                as_table_alias
    | function_call               as_table_alias?
    | LOCAL_ID                    as_table_alias?
    | LOCAL_ID '.' function_call (as_table_alias column_alias_list?)?
    ;

change_table
    : CHANGETABLE '(' CHANGES table_name ',' (NULL | DECIMAL | LOCAL_ID) ')'
    ;

join_part
    : (INNER? |
       join_type=(LEFT | RIGHT | FULL) OUTER?) (join_hint=(LOOP | HASH | MERGE | REMOTE))?
       JOIN table_source ON search_condition
    | CROSS JOIN table_source
    | CROSS APPLY table_source
    | OUTER APPLY table_source
    ;

table_name_with_hint
    : table_name with_table_hints?
    ;

rowset_function
    : OPENROWSET '(' BULK data_file=STRING ',' (bulk_option (',' bulk_option)* | id)')'
    ;

bulk_option
    : id '=' (DECIMAL | STRING)
    ;

derived_table
    : subquery
    | '(' subquery ')'
    | table_value_constructor
    ;

function_call
    : ranking_windowed_function
    | aggregate_windowed_function
    | scalar_function_name '(' expression_list? ')'
    // https://msdn.microsoft.com/en-us/library/ms173784.aspx
    | BINARY_CHECKSUM '(' '*' ')'
    // https://msdn.microsoft.com/en-us/library/hh231076.aspx
    // https://msdn.microsoft.com/en-us/library/ms187928.aspx
    | CAST '(' expression AS declare_type ')'
    | CONVERT '(' declare_type ',' expression (',' style=expression)? ')'
    // https://msdn.microsoft.com/en-us/library/ms189788.aspx
    | CHECKSUM '(' '*' ')'
    // https://msdn.microsoft.com/en-us/library/ms190349.aspx
    | COALESCE '(' expression_list ')'
    // https://msdn.microsoft.com/en-us/library/ms188751.aspx
    | CURRENT_TIMESTAMP
    // https://msdn.microsoft.com/en-us/library/ms176050.aspx
    | CURRENT_USER
    // https://msdn.microsoft.com/en-us/library/ms186819.aspx
    | DATEADD '(' datepart ',' expression ',' expression ')'
    // https://msdn.microsoft.com/en-us/library/ms189794.aspx
    | DATEDIFF '(' datepart ',' expression ',' expression ')'
    // https://msdn.microsoft.com/en-us/library/ms174395.aspx
    | DATENAME '(' datepart ',' expression ')'
    // https://msdn.microsoft.com/en-us/library/ms174420.aspx
    | DATEPART '(' datepart ',' expression ')'
    // https://msdn.microsoft.com/en-us/library/ms189838.aspx
    | IDENTITY '(' declare_type (',' seed=DECIMAL)? (',' increment=DECIMAL)? ')'
    // https://msdn.microsoft.com/en-us/library/bb839514.aspx
    | MIN_ACTIVE_ROWVERSION
    // http://dcx.sap.com/1001/en/dbrfen10/rf-mod.html
    | MOD '(' expression ',' expression ')'
    // https://msdn.microsoft.com/en-us/library/ms177562.aspx
    | NULLIF '(' expression ',' expression ')'
    // https://msdn.microsoft.com/en-us/library/ms177587.aspx
    | SESSION_USER
    // https://msdn.microsoft.com/en-us/library/ms179930.aspx
    | SYSTEM_USER
    | CURRENT TIMESTAMP
    | CURRENT DATE
    | replace_statement                     
    ;

datepart
    : ID
    ;

as_table_alias
    : AS? table_alias
    ;

table_alias
    : id with_table_hints?
    ;

// https://msdn.microsoft.com/en-us/library/ms187373.aspx
with_table_hints
    : WITH? '(' table_hint (',' table_hint)* ')'
    ;

// Id runtime check. Id can be (FORCESCAN, HOLDLOCK, NOLOCK, NOWAIT, PAGLOCK, READCOMMITTED,
// READCOMMITTEDLOCK, READPAST, READUNCOMMITTED, REPEATABLEREAD, ROWLOCK, TABLOCK, TABLOCKX
// UPDLOCK, XLOCK)

table_hint
    : NOEXPAND? ( INDEX '(' index_value (',' index_value)* ')'
                | INDEX '=' index_value
                | FORCESEEK ('(' index_value '(' index_column_name  (',' index_column_name)* ')' ')')?
                | SERIALIZABLE
                | SNAPSHOT
                | SPATIAL_WINDOW_MAX_CELLS '=' DECIMAL
                | ID)?
    ;

index_column_name
	: ID
	;

index_value
    : ID | DECIMAL
    ;

column_alias_list
    : '(' columnname=column_alias (',' columnname=column_alias)* ')'
    ;

column_alias
    : id
    | STRING
    ;

table_value_constructor
    : VALUES '(' expression_list ')' (',' '(' expression_list ')')*
    ;

expression_list
    : expression (',' expression)*
    ;

// https://msdn.microsoft.com/en-us/library/ms181765.aspx
case_expr
    : CASE expression (WHEN expression THEN expression)+ (ELSE expression)? END
    | CASE (WHEN search_condition THEN expression)+ (ELSE expression)? END
    ;

// https://msdn.microsoft.com/en-us/library/ms189798.aspx
ranking_windowed_function
    : RANK '(' ')' over_clause
    | DENSE_RANK '(' ')' over_clause
    | NTILE '(' expression ')' over_clause
    | ROW_NUMBER '(' ')' over_clause
    ;

// https://msdn.microsoft.com/en-us/library/ms173454.aspx
aggregate_windowed_function
    : AVG '(' all_distinct_expression ')' over_clause?
    | CHECKSUM_AGG '(' all_distinct_expression ')'
    | GROUPING '(' expression ')'
    | GROUPING_ID '(' expression_list ')'
    | MAX '(' all_distinct_expression ')' over_clause?
    | MIN '(' all_distinct_expression ')' over_clause?
    | SUM '(' all_distinct_expression ')' over_clause?
    | STDEV '(' all_distinct_expression ')' over_clause?
    | STDEVP '(' all_distinct_expression ')' over_clause?
    | VAR '(' all_distinct_expression ')' over_clause?
    | VARP '(' all_distinct_expression ')' over_clause?
    | COUNT '(' ('*' | all_distinct_expression) ')' over_clause?
    | COUNT_BIG '(' ('*' | all_distinct_expression) ')' over_clause?
    ;

all_distinct_expression
    : (ALL | DISTINCT)? expression
    ;

// https://msdn.microsoft.com/en-us/library/ms189461.aspx
over_clause
    : OVER '(' partition_by_clause? order_by_clause? row_or_range_clause? ')'
    ;

row_or_range_clause
    : (ROWS | RANGE) window_frame_extent
    ;

window_frame_extent
    : window_frame_preceding
    | BETWEEN window_frame_bound AND window_frame_bound
    ;

window_frame_bound
    : window_frame_preceding
    | window_frame_following
    ;

window_frame_preceding
    : UNBOUNDED PRECEDING
    | DECIMAL PRECEDING
    | CURRENT ROW
    ;

window_frame_following
    : UNBOUNDED FOLLOWING
    | DECIMAL FOLLOWING
    ;

// Primitive.

full_table_name
    : (server=id '.' database=id '.'  schema=id   '.'
      |              database=id '.' (schema=id)? '.'
      |                               schema=id   '.')? table=id
    ;

table_name
    : (database=id '.' (schema=id)? '.' | schema=id '.')? table=id
    ;

procedure_name
    : (database=id '.' (schema=id)? '.' | schema=id '.')? procedure=id
    ;

view_name
    : (schema=id '.')? view=id
    ;

func_proc_name
    : (database=id '.' (schema=id)? '.' | (schema=id) '.')? procedure=id
    ;

ddl_object
    : full_table_name
    | LOCAL_ID
    ;

full_column_name
    : (table_name '.')? column_name
    ;

column_name_list
    : column_name (',' column_name)*
    ;

column_name
    : id
    ;

cursor_name
    : id
    | LOCAL_ID
    ;

on_off
    : ON
    | OFF
    ;

clustered
    : CLUSTERED
    | NONCLUSTERED
    ;

null_notnull
    : NOT? NULL
    ;

scalar_function_name
    : func_proc_name
    | RIGHT
    | LEFT
    | BINARY_CHECKSUM
    | CHECKSUM
    ;

default_value
    : NULL
    | constant
    ;

// https://msdn.microsoft.com/en-us/library/ms179899.aspx
constant
    : STRING // string, datetime or uniqueidentifier
    | BINARY
    | number
    | sign? (REAL | FLOAT)  // float or decimal
    | sign? '$' (DECIMAL | FLOAT)       // money
    ;

number
    : sign? DECIMAL
    ;

sign
    : PLUS
    | MINUS
    ;

// https://msdn.microsoft.com/en-us/library/ms175874.aspx
id
    : simple_id
    | DOUBLE_QUOTE_ID
    | SQUARE_BRACKET_ID
    ;

simple_id
    : ID
    | ABSOLUTE
    | APPLY
    | AUTO
    | AVG
    | BASE64
    | CALLER
    | CAST
    | CATCH
    | CHECKSUM_AGG
    | COMMITTED
    | CONCAT
    | COOKIE
    | COUNT
    | COUNT_BIG
    | DELAY
    | DELETED
    | DENSE_RANK
    | DISABLE
    | DYNAMIC
    | ENCRYPTION
    | FAST
    | FAST_FORWARD
    | FIRST
    | FOLLOWING
    | FORCESEEK
    | FORWARD_ONLY
    | FULLSCAN
    | GLOBAL
    | GO
    | GROUPING
    | GROUPING_ID
    | HASH
    | INSENSITIVE
    | INSERTED
    | ISOLATION
    | KEYSET
    | KEEPFIXED
    | LAST
    | LEVEL
    | LOCAL
    | LOCK_ESCALATION
    | LOGIN
    | LOOP
    | MARK
    | MAX
    | MIN
    | MODIFY
    | NAME
    | NEXT
    | NOCOUNT
    | NOEXPAND
    | NORECOMPUTE
    | NTILE
    | NUMBER
    | OFFSET
    | ONLY
    | OPTIMISTIC
    | OPTIMIZE
    | OUT
    | OUTPUT
    | OWNER
    | PARTITION
    | PATH
    | PRECEDING
    | PRIOR
    | RANGE
    | RANK
    | READONLY
    | READ_ONLY
    | RECOMPILE
    | RELATIVE
    | REMOTE
    | REPEATABLE
    | ROOT
    | ROW
    | ROWGUID
    | ROWS
    | ROW_NUMBER
    | SAMPLE
    | SCHEMABINDING
    | SCROLL
    | SCROLL_LOCKS
    | SELF
    | SERIALIZABLE
    | SNAPSHOT
    | SPATIAL_WINDOW_MAX_CELLS
    | STATIC
    | STATS_STREAM
    | STDEV
    | STDEVP
    | SUM
    | THROW
    | TIES
    | TIME
    | TRY
    | TYPE
    | TYPE_WARNING
    | UNBOUNDED
    | UNCOMMITTED
    | UNKNOWN
    | USING
    | VAR
    | VARP
    | VIEW_METADATA
    | WORK
    | XML
    | XMLNAMESPACES
    ;

// https://msdn.microsoft.com/en-us/library/ms188074.aspx
// Spaces are allowed for comparison operators.
comparison_operator
    : '=' | '>' | '<' | '<' '=' | '>' '=' | '<' '>' | '!' '=' | '!' '>' | '!' '<'
    ;

assignment_operator
    : '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '^=' | '|=' 
    ;

// Lexer

// Basic keywords (from https://msdn.microsoft.com/en-us/library/ms189822.aspx)
ACTION:                          A C T I O N;
ADD:                             A D D;
ALL:                             A L L;
ALTER:                           A L T E R;
AND:                             A N D;
ANY:                             A N Y;
APPEND:                          A P P E N D;
AS:                              A S;
ASC:                             A S C;
ASIS:                            A S I S;
AUTHORIZATION:                   A U T H O R I Z A T I O N;
AUTOINCREMENT:                   A U T O I N C R E M E N T;
BACKUP:                          B A C K U P;
BEGIN:                           B E G I N;
BETWEEN:                         B E T W E E N;
BIGINT:                          B I G I N T;
BIGINTN:                         B I G I N T N;
BIT:                             B I T;
BLOB:                            B L O B;
BOOLEAN:                         B O O L E A N;
BREAK:                           B R E A K;
BROWSE:                          B R O W S E;
BULK:                            B U L K;
BY:                              B Y;
CALL:                            C A L L;
CASCADE:                         C A S C A D E;
CASE:                            C A S E;
CHANGETABLE:                     C H A N G E T A B L E;
CHANGES:                         C H A N G E S; 
CHAR:                            C H A R;
CHARACTER:                       C H A R A C T E R;
CHECK:                           C H E C K;
CHECKPOINT:                      C H E C K P O I N T;
CLIENT:                          C L I E N T;
CLOB:                            C L O B;
CLOSE:                           C L O S E;
CLUSTERED:                       C L U S T E R E D;
CMP:                             C M P;
COALESCE:                        C O A L E S C E;
COLLATE:                         C O L L A T E;
COLUMN:                          C O L U M N;
COMMENT:                         C O M M E N T;
COMMIT:                          C O M M I T;
COMPUTE:                         C O M P U T E;
CONNECTION:                      C O N N E C T I O N;
CONSTRAINT:                      C O N S T R A I N T;
CONSOLE:                         C O N S O L E;
CONTAINS:                        C O N T A I N S;
CONTAINSTABLE:                   C O N T A I N S T A B L E;
CONTINUE:                        C O N T I N U E;
CONVERT:                         C O N V E R T;
CREATE:                          C R E A T E;
CREATE_SCHEMA:                   C R E A T E '_' S C H E M A;
CREATE_NOTE:                     C R E A T E '_' N O T E;
CREATE_ASSOCIATION:              C R E A T E '_' A S S O C I A T I O N;
CROSS:                           C R O S S;
CURRENT:                         C U R R E N T;
CURRENT_DATE:                    C U R R E N T '_' D A T E;
CURRENT_TIME:                    C U R R E N T '_' T I M E;
CURRENT_TIMESTAMP:               C U R R E N T '_' T I M E S T A M P;
CURRENT_USER:                    C U R R E N T '_' U S E R;
CURSOR:                          C U R S O R;
DATA:                            D A T A;
DATABASE:                        D A T A B A S E;
DATE:                            D A T E;
DATETIME:                        D A T E T I M E;
DATETIME2:                       D A T E T I M E '2';
DATETIMN:                        D A T E T I M N;
DATETIMEOFFSET:                  D A T E T I M E O F F S E T;
DBCC:                            D B C C;
DEALLOCATE:                      D E A L L O C A T E;
DEBUG:                           D E B U G;
DECIMALN:                        D E C I M A L N;
DECLARE:                         D E C L A R E;
DECRYPT:                         D E C R Y P T;
DEFAULT:                         D E F A U L T;
DEFINER:                         D E F I N E R;
DELETE:                          D E L E T E;
DELIMITED:                       D E L I M I T E D;
DENY:                            D E N Y;
DESC:                            D E S C;
DISK:                            D I S K;
DISTINCT:                        D I S T I N C T;
DISTRIBUTED:                     D I S T R I B U T E D;
DOUBLE:                          D O U B L E;
DROP:                            D R O P;
DTTM:                            D T T M;
DUMP:                            D U M P;
ELSE:                            E L S E;
ELSEIF:                          E L S E I F;
ENCODING:                        E N C O D I N G;
END:                             E N D;
ENDIF:                           E N D I F;
ERRLVL:                          E R R L V L;
ESCAPE:                          E S C A P E;
EVENT:                           E V E N T;
EXCEPT:                          E X C E P T;
EXCEPTION:                       E X C E P T I O N;
EXEC:                            E X E C;
EXECUTE:                         E X E C U T E;
EXISTING:                        E X I S T I N G;
EXISTS:                          E X I S T S;
EXIT:                            E X I T;
EXTERNAL:                        E X T E R N A L;
FETCH:                           F E T C H;
FILE:                            F I L E;
FILLFACTOR:                      F I L L F A C T O R;
FIXED:                           F I X E D;
FLOATN:                          F L O A T N;
FOR:                             F O R;
FORCESEEK:                       F O R C E S E E K;
FOREIGN:                         F O R E I G N;
FORMAT:                          F O R M A T;
FREETEXT:                        F R E E T E X T;
FREETEXTTABLE:                   F R E E T E X T T A B L E;
FROM:                            F R O M;
FULL:                            F U L L;
FUNCTION:                        F U N C T I O N;
GOTO:                            G O T O;
GRANT:                           G R A N T;
GRANT_PERMISSION:                G R A N T '_' P E R M I S S I O N; 
GROUP:                           G R O U P;
HAVING:                          H A V I N G;
HEXADECIMAL:                     H E X A D E C I M A L;
HG:                              H G;
HNG:                             H N G;
HTML:                            H T M L; 
IDENTITY:                        I D E N T I T Y;
IDENTITYCOL:                     I D E N T I T Y C O L;
IDENTITY_INSERT:                 I D E N T I T Y '_' I N S E R T;
IF:                              I F;
IGNORE:                          I G N O R E;
IMAGE:                           I M A G E;
IMMEDIATE:                       I M M E D I A T E;
IN:                              I N;
INFO:                            I N F O;
INOUT:                           I N O U T;
INDEX:                           I N D E X;
INNER:                           I N N E R;
INSERT:                          I N S E R T;
INT:                             I N T;
INTN:                            I N T N;
INTEGER:                         I N T E G E R;
INTERSECT:                       I N T E R S E C T;
INTO:                            I N T O;
INVOKER:                         I N V O K E R;
IQ:                              I Q;
IS:                              I S;
JOIN:                            J O I N;
KEY:                             K E Y;
KILL:                            K I L L;
LEFT:                            L E F T;
LF:                              L F;
LIKE:                            L I K E;
LIMIT:                           L I M I T;
LINENO:                          L I N E N O;
LOAD:                            L O A D;
LOCATION:                        L O C A T I O N;
LOG:                             L O G;
MERGE:                           M E R G E;
MESSAGE:                         M E S S A G E;
MONEY:                           M O N E Y;
MONEYN:                          M O N E Y N;
NAMES:                           N A M E S;
NATIONAL:                        N A T I O N A L;
NCHAR:                           N C H A R;
NO:                              N O;
NOCHECK:                         N O C H E C K;
NONCLUSTERED:                    N O N C L U S T E R E D;
NOT:                             N O T;
NOTIFY:                          N O T I F Y;
NTEXT:                           N T E X T;
NUMERIC:                         N U M E R I C;
NUMERICN:                        N U M E R I C N;
NULL:                            N U L L;
NULLIF:                          N U L L I F;
NVARCHAR:                        N V A R C H A R;
OF:                              O F;
OFF:                             O F F;
OFFSETS:                         O F F S E T S;
ON:                              O N;
OPEN:                            O P E N;
OPENDATASOURCE:                  O P E N D A T A S O U R C E;
OPENQUERY:                       O P E N Q U E R Y;
OPENROWSET:                      O P E N R O W S E T;
OPENXML:                         O P E N X M L;
OPTION:                          O P T I O N;
OR:                              O R;
ORDER:                           O R D E R;
OTHERS:                          O T H E R S;
OUTER:                           O U T E R;
OVER:                            O V E R;
PACKETSIZE:                      P A C K E T S I Z E;
PARAMETERS:                      P A R A M E T E R S;
PARALLEL:                        P A R A L L E L;
PASSWORD:                        P A S S W O R D;
PERCENT:                         P E R C E N T;
PIVOT:                           P I V O T;
PLAN:                            P L A N;
PRECISION:                       P R E C I S I O N;
PRESERVE:                        P R E S E R V E;
PRIMARY:                         P R I M A R Y;
PRINT:                           P R I N T;
PROC:                            P R O C;
PROCEDURE:                       P R O C E D U R E;
PUBLIC:                          P U B L I C;
QUOTE:                           Q U O T E;
QUOTED_IDENTIFIER:               Q U O T E D '_' I D E N T I F I E R;
RAISERROR:                       R A I S E R R O R;
READ:                            R E A D;
READTEXT:                        R E A D T E X T;
RECONFIGURE:                     R E C O N F I G U R E;
REFERENCES:                      R E F E R E N C E S;
REPLACE:                         R E P L A C E;
REPLICATION:                     R E P L I C A T I O N;
RESIGNAL:                        R E S I G N A L; 
RESTORE:                         R E S T O R E;
RESTRICT:                        R E S T R I C T;
RESULT:                          R E S U L T;
RESUME:                          R E S U M E;
RETURN:                          R E T U R N;
REVERT:                          R E V E R T;
REVOKE:                          R E V O K E;
RIGHT:                           R I G H T;
ROLE:                            R O L E;
ROLLBACK:                        R O L L B A C K;
ROWCOUNT:                        R O W C O U N T;
ROWGUIDCOL:                      R O W G U I D C O L;
RULE:                            R U L E;
SAVE:                            S A V E;
SCHEMA:                          S C H E M A;
SECURITY:                        S E C U R I T Y;
SECURITYAUDIT:                   S E C U R I T Y A U D I T;
SELECT:                          S E L E C T;
SEMANTICKEYPHRASETABLE:          S E M A N T I C K E Y P H R A S E T A B L E;
SEMANTICSIMILARITYDETAILSTABLE:  S E M A N T I C S I M I L A R I T Y D E T A I L S T A B L E;
SEMANTICSIMILARITYTABLE:         S E M A N T I C S I M I L A R I T Y T A B L E;
SESSION_USER:                    S E S S I O N '_' U S E R;
SET:                             S E T;
SETUSER:                         S E T U S E R;
SHUTDOWN:                        S H U T D O W N;
SKIP:                            S K I P;
SMALLINT:                        S M A L L I N T;
SMALLINTN:                       S M A L L I N T N;
SMALLMONEY:                      S M A L L M O N E Y;
SMALLDATETIME:                   S M A L L D A T E T I M E;
SYSNAME:                         S Y S N A M E;
SOME:                            S O M E;
SQL:                             S Q L;
STATISTICS:                      S T A T I S T I C S;
STATUS:                          S T A T U S;
SYSTEM:                          S Y S T E M;
SYSTEM_USER:                     S Y S T E M '_' U S E R;
TABLE:                           T A B L E;
TABLESAMPLE:                     T A B L E S A M P L E;
TEMPORARY:                       T E M P O R A R Y;
TEXT:                            T E X T;
TEXTSIZE:                        T E X T S I Z E;
THEN:                            T H E N;
TINYINT:                         T I N Y I N T;
TO:                              T O;
TOP:                             T O P;
TRAN:                            T R A N;
TRANSACTION:                     T R A N S A C T I O N;
TRANSACTIONAL:                   T R A N S A C T I O N A L;
TRIGGER:                         T R I G G E R;
TRUNCATE:                        T R U N C A T E;
TRY_CONVERT:                     T R Y '_' C O N V E R T;
TSEQUAL:                         T S E Q U A L;
TYP_MONEY:                       T Y P '_' M O N E Y;
TYP_VERBRAUCH:                   T Y P '_' V E R B R A U C H;
TYP_ZEITDIMENSION:               T Y P '_' Z E I T D I M E N S I O N;
TYP_ZEITWERT:                    T Y P '_' Z E I T W E R T;
UNION:                           U N I O N;
UNIQUE:                          U N I Q U E;
UNIQUEIDENTIFIER:                U N I Q U E I D E N T I F I E R;
UNPIVOT:                         U N P I V O T;
UNSIGNED:                        U N S I G N E D;
UPDATE:                          U P D A T E;
UPDATETEXT:                      U P D A T E T E X T;
USE:                             U S E;
USER:                            U S E R;
VALUE:                           V A L U E;
VALUES:                          V A L U E S;
VARBINARY:                       V A R B I N A R Y;
VARCHAR:                         V A R C H A R;
VARYING:                         V A R Y I N G;
VERBOSE:                         V E R B O S E;
VIEW:                            V I E W;
WAITFOR:                         W A I T F O R;
WARNING:                         W A R N I N G;
//WD:                              W D;
WHEN:                            W H E N;
WHERE:                           W H E R E;
WHILE:                           W H I L E;
WIDTHS:                          W H I D T H S;
WITH:                            W I T H;
WITHIN:                          W I T H I N;
WRITETEXT:                       W R I T E T E X T;
WORD:                            W O R D;

// Additional keywords (they can be id).
ABSOLUTE:                        A B S O L U T E;
APPLY:                           A P P L Y;
AUTO:                            A U T O;
AVG:                             A V G;
BASE64:                          B A S E '64';
BINARY_CHECKSUM:                 B I N A R Y '_' C H E C K S U M;
CALLER:                          C A L L E R;
CAST:                            C A S T;
CATCH:                           C A T C H;
CHECKSUM:                        C H E C K S U M;
CHECKSUM_AGG:                    C H E C K S U M '_' A G G;
COMMITTED:                       C O M M I T T E D;
CONCAT:                          C O N C A T;
COOKIE:                          C O O K I E;
COUNT:                           C O U N T;
COUNT_BIG:                       C O U N T '_' B I G;
DATEADD:                         D A T E A D D;
DATEDIFF:                        D A T E D I F F;
DATENAME:                        D A T E N A M E;
DATEPART:                        D A T E P A R T;
DELAY:                           D E L A Y;
DELETED:                         D E L E T E D;
DENSE_RANK:                      D E N S E '_' R A N K;
DISABLE:                         D I S A B L E;
DYNAMIC:                         D Y N A M I C;
ENCRYPTED:                       E N C R Y P T E D;
ENCRYPTION:                      E N C R Y P T I O N;
FAST:                            F A S T;
FAST_FORWARD:                    F A S T '_' F O R W A R D;
FINALLY:                         F I N A L L Y;
FIRST:                           F I R S T;
FOLLOWING:                       F O L L O W I N G;
FORWARD_ONLY:                    F O R W A R D '_' O N L Y;
FULLSCAN:                        F U L L S C A N;
GLOBAL:                          G L O B A L;
GO:                              G O;
GROUPING:                        G R O U P I N G;
GROUPING_ID:                     G R O U P I N G '_' I D;
HASH:                            H A S H;
INSENSITIVE:                     I N S E N S I T I V E;
INSERTED:                        I N S E R T E D;
ISOLATION:                       I S O L A T I O N;
KEEPFIXED:                       K E E P F I X E D;
KEYSET:                          K E Y S E T;
LAST:                            L A S T;
LEVEL:                           L E V E L;
LOCAL:                           L O C A L;
LOCK_ESCALATION:                 L O C K '_' E S C A L A T I O N;
LOGIN:                           L O G I N;
LOOP:                            L O O P;
MANAGE_PERMISSION:               M A N A G E '_' P E R M I S S I O N;
MARK:                            M A R K;
MAX:                             M A X;
MIN:                             M I N;
MIN_ACTIVE_ROWVERSION:           M I N '_' A C T I V E '_' R O W V E R S I O N;
MOD:                             M O D;
MODIFY:                          M O D I F Y;
NEXT:                            N E X T;
NAME:                            N A M E;
NOCOUNT:                         N O C O U N T;
NOEXPAND:                        N O E X P A N D;
NORECOMPUTE:                     N O R E C O M P U T E;
NTILE:                           N T I L E;
NUMBER:                          N U M B E R;
OFFSET:                          O F F S E T;
ONLY:                            O N L Y;
OPTIMISTIC:                      O P T I M I S T I C;
OPTIMIZE:                        O P T I M I Z E;
OUT:                             O U T;
OUTPUT:                          O U T P U T;
OWNER:                           O W N E R;
PARTITION:                       P A R T I T I O N;
PATH:                            P A T H;
PRECEDING:                       P R E C E D I N G;
PRIOR:                           P R I O R;
RANGE:                           R A N G E;
RANK:                            R A N K;
READONLY:                        R E A D O N L Y;
READ_ONLY:                       R E A D '_' O N L Y;
RECOMPILE:                       R E C O M P I L E;
RELATIVE:                        R E L A T I V E;
REMOTE:                          R E M O T E;
REPEATABLE:                      R E P E A T A B L E;
ROOT:                            R O O T;
ROW:                             R O W;
ROWGUID:                         R O W G U I D;
ROWS:                            R O W S;
ROW_NUMBER:                      R O W '_' N U M B E R;
SAMPLE:                          S A M P L E;
SCHEMABINDING:                   S C H E M A B I N D I N G;
SCROLL:                          S C R O L L;
SCROLL_LOCKS:                    S C R O L L '_' L O C K S;
SELF:                            S E L F;
SERIALIZABLE:                    S E R I A L I Z A B L E;
SNAPSHOT:                        S N A P S H O T;
SPATIAL_WINDOW_MAX_CELLS:        S P A T I A L '_' W I N D O W '_' M A X '_' C E L L S;
STATIC:                          S T A T I C;
STATS_STREAM:                    S T A T S '_' S T R E A M;
STDEV:                           S T D E V;
STDEVP:                          S T D E V P;
SUM:                             S U M;
THROW:                           T H R O W;
TIES:                            T I E S;
TIME:                            T I M E;
TIMESTAMP:                       T I M E S T A M P;
TRY:                             T R Y;
TYPE:                            T Y P E;
TYPE_WARNING:                    T Y P E '_' W A R N I N G;
UNBOUNDED:                       U N B O U N D E D;
UNCOMMITTED:                     U N C O M M I T T E D;
UNKNOWN:                         U N K N O W N;
USING:                           U S I N G;
VAR:                             V A R;
VARP:                            V A R P;
VIEW_METADATA:                   V I E W '_' M E T A D A T A;
WORK:                            W O R K;
XML:                             X M L;
XMLNAMESPACES:                   X M L N A M E S P A C E S;

DOLLAR_ACTION:                   '$' A C T I O N;

SPACE:              [ \t\r\n]+    -> skip;
BLOCK_COMMENT:      '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT:       '--' ~[\r\n]* -> channel(HIDDEN);
STRING_COMMENT:     '"' .*? '"'; 

// TODO: ID can be not only Latin.
DOUBLE_QUOTE_ID:    '"' ~'"'+ '"';
SQUARE_BRACKET_ID:  '[' ~']'+ ']';
LOCAL_ID:           '@' [a-zA-Z_$@#0-9]+;
DECIMAL:             DEC_DIGIT+;
ID:                  [a-zA-Z_#][a-zA-Z_#$@0-9]*;
STRING:              N? '\'' (~'\'' | '\'\'')* '\'';
BINARY:              '0' X HEX_DIGIT*;
FLOAT:               DEC_DOT_DEC;
REAL:                DEC_DOT_DEC (E [+-]? DEC_DIGIT+)?;

EQUAL:               '=';

GREATER:             '>';
LESS:                '<';
EXCLAMATION:         '!';

PLUS_ASSIGN:         '+=';
MINUS_ASSIGN:        '-=';
MULT_ASSIGN:         '*=';
DIV_ASSIGN:          '/=';
MOD_ASSIGN:          '%=';
AND_ASSIGN:          '&=';
XOR_ASSIGN:          '^=';
OR_ASSIGN:           '|=';

DOT:                 '.';
UNDERLINE:           '_';
AT:                  '@';
SHARP:               '#';
DOLLAR:              '$';
LR_BRACKET:          '(';
RR_BRACKET:          ')';
COMMA:               ',';
SEMI:                ';';
COLON:               ':';
STAR:                '*';
DIVIDE:              '/';
MODULE:              '%';
PLUS:                '+';
MINUS:               '-';
BIT_NOT:             '~';
BIT_OR:              '|';
BIT_AND:             '&';
BIT_XOR:             '^';

fragment LETTER:       [a-zA-Z_];
fragment DEC_DOT_DEC:  (DEC_DIGIT+ '.' DEC_DIGIT+ |  DEC_DIGIT+ '.' | '.' DEC_DIGIT+);
fragment HEX_DIGIT:    [0-9A-Fa-f];
fragment DEC_DIGIT:    [0-9];

fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];