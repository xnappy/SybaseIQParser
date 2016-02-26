// Generated from C:\datawarehouse\branches\projects\TECPLTBI.050\02_source\BIDeploy\src\de\einsundeins\analysis\grammar\tsql.g4 by ANTLR 4.1
package de.einsundeins.analysis.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tsqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tsqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tsqlParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(@NotNull tsqlParser.Expression_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor(@NotNull tsqlParser.Declare_cursorContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#clustered}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustered(@NotNull tsqlParser.ClusteredContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_table_hints(@NotNull tsqlParser.With_table_hintsContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(@NotNull tsqlParser.Query_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#create_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statistics(@NotNull tsqlParser.Create_statisticsContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#join_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_part(@NotNull tsqlParser.Join_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(@NotNull tsqlParser.PredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#replace_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace_statement(@NotNull tsqlParser.Replace_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#use_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_statement(@NotNull tsqlParser.Use_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimize_for_arg(@NotNull tsqlParser.Optimize_for_argContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source(@NotNull tsqlParser.Table_sourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_common_directives(@NotNull tsqlParser.Xml_common_directivesContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(@NotNull tsqlParser.Result_columnContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#waitfor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor_statement(@NotNull tsqlParser.Waitfor_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(@NotNull tsqlParser.Goto_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#set_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_special(@NotNull tsqlParser.Set_specialContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(@NotNull tsqlParser.OptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#table_source_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item(@NotNull tsqlParser.Table_source_itemContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#tsql_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsql_file(@NotNull tsqlParser.Tsql_fileContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(@NotNull tsqlParser.Query_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(@NotNull tsqlParser.Over_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(@NotNull tsqlParser.Update_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(@NotNull tsqlParser.Drop_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull tsqlParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#change_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_table(@NotNull tsqlParser.Change_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_definition(@NotNull tsqlParser.Table_type_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_statement(@NotNull tsqlParser.Declare_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#func_proc_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_proc_name(@NotNull tsqlParser.Func_proc_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(@NotNull tsqlParser.Column_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function_limited(@NotNull tsqlParser.Rowset_function_limitedContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_value_constructor(@NotNull tsqlParser.Table_value_constructorContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(@NotNull tsqlParser.Function_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_cursor(@NotNull tsqlParser.Fetch_cursorContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(@NotNull tsqlParser.Select_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#full_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name(@NotNull tsqlParser.Full_column_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#table_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_hint(@NotNull tsqlParser.Table_hintContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#declare_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_local(@NotNull tsqlParser.Declare_localContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(@NotNull tsqlParser.Table_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(@NotNull tsqlParser.Column_aliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#dml_table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_table_source(@NotNull tsqlParser.Dml_table_sourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull tsqlParser.If_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(@NotNull tsqlParser.Constant_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanking_windowed_function(@NotNull tsqlParser.Ranking_windowed_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#truncate_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_statement(@NotNull tsqlParser.Truncate_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#wot_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWot_statement(@NotNull tsqlParser.Wot_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(@NotNull tsqlParser.Derived_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#another_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnother_statement(@NotNull tsqlParser.Another_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias_list(@NotNull tsqlParser.Column_alias_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#create_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure(@NotNull tsqlParser.Create_procedureContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#binary_operator_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator_expression(@NotNull tsqlParser.Binary_operator_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(@NotNull tsqlParser.Search_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#try_catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_statement(@NotNull tsqlParser.Try_catch_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(@NotNull tsqlParser.UnionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by_clause(@NotNull tsqlParser.Partition_by_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(@NotNull tsqlParser.Return_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#comment_on_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_object(@NotNull tsqlParser.Comment_on_objectContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(@NotNull tsqlParser.Create_viewContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression(@NotNull tsqlParser.Order_by_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_set_cursor_common(@NotNull tsqlParser.Declare_set_cursor_commonContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#column_ref_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_ref_expression(@NotNull tsqlParser.Column_ref_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#function_call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression(@NotNull tsqlParser.Function_call_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(@NotNull tsqlParser.Continue_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#group_by_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_item(@NotNull tsqlParser.Group_by_itemContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_var_string(@NotNull tsqlParser.Execute_var_stringContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(@NotNull tsqlParser.View_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_table_alias(@NotNull tsqlParser.As_table_aliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#alter_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database(@NotNull tsqlParser.Alter_databaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(@NotNull tsqlParser.Case_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_function_name(@NotNull tsqlParser.Scalar_function_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(@NotNull tsqlParser.Select_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#grant_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_statement(@NotNull tsqlParser.Grant_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#bracket_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_expression(@NotNull tsqlParser.Bracket_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(@NotNull tsqlParser.Break_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(@NotNull tsqlParser.Default_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statistics(@NotNull tsqlParser.Drop_statisticsContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement(@NotNull tsqlParser.Set_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#unsigned_zusatz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_zusatz(@NotNull tsqlParser.Unsigned_zusatzContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(@NotNull tsqlParser.Cursor_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#index_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_type(@NotNull tsqlParser.Index_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure(@NotNull tsqlParser.Drop_procedureContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#primitive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_expression(@NotNull tsqlParser.Primitive_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_distinct_expression(@NotNull tsqlParser.All_distinct_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#sql_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clause(@NotNull tsqlParser.Sql_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#bulk_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk_option(@NotNull tsqlParser.Bulk_optionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#on_off}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_off(@NotNull tsqlParser.On_offContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(@NotNull tsqlParser.Comparison_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#security_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_statement(@NotNull tsqlParser.Security_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#openquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenquery(@NotNull tsqlParser.OpenqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_statement(@NotNull tsqlParser.Cursor_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(@NotNull tsqlParser.Insert_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(@NotNull tsqlParser.Column_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#null_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_notnull(@NotNull tsqlParser.Null_notnullContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(@NotNull tsqlParser.Create_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#search_condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_list(@NotNull tsqlParser.Search_condition_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#rowset_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function(@NotNull tsqlParser.Rowset_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#drop_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view(@NotNull tsqlParser.Drop_viewContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#unary_operator_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator_expression(@NotNull tsqlParser.Unary_operator_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#procedure_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_param(@NotNull tsqlParser.Procedure_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#index_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_column_name(@NotNull tsqlParser.Index_column_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#permission_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermission_list(@NotNull tsqlParser.Permission_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#with_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_expression(@NotNull tsqlParser.With_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#then_condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_condition_list(@NotNull tsqlParser.Then_condition_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#begin_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_statement(@NotNull tsqlParser.Begin_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_windowed_function(@NotNull tsqlParser.Aggregate_windowed_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#add_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_list(@NotNull tsqlParser.Add_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#subquery_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_expression(@NotNull tsqlParser.Subquery_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(@NotNull tsqlParser.Create_indexContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#string_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_concatenation(@NotNull tsqlParser.String_concatenationContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#opendatasource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpendatasource(@NotNull tsqlParser.OpendatasourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_clause(@NotNull tsqlParser.For_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#view_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_attribute(@NotNull tsqlParser.View_attributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#index_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_options(@NotNull tsqlParser.Index_optionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#permission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermission(@NotNull tsqlParser.PermissionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#ddl_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_object(@NotNull tsqlParser.Ddl_objectContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_range_clause(@NotNull tsqlParser.Row_or_range_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_with_hint(@NotNull tsqlParser.Table_name_with_hintContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elem(@NotNull tsqlParser.Select_list_elemContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_option(@NotNull tsqlParser.Database_optionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(@NotNull tsqlParser.Column_name_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(@NotNull tsqlParser.SignContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#simple_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_id(@NotNull tsqlParser.Simple_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#declare_local_temporary_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_local_temporary_table(@NotNull tsqlParser.Declare_local_temporary_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#full_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name(@NotNull tsqlParser.Full_table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#search_condition_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_not(@NotNull tsqlParser.Search_condition_notContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_dml_list_elem(@NotNull tsqlParser.Output_dml_list_elemContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_clause(@NotNull tsqlParser.Ddl_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(@NotNull tsqlParser.Common_table_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(@NotNull tsqlParser.Procedure_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(@NotNull tsqlParser.Print_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#declare_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_type(@NotNull tsqlParser.Declare_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(@NotNull tsqlParser.Alter_tableContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(@NotNull tsqlParser.Table_aliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(@NotNull tsqlParser.Throw_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraint(@NotNull tsqlParser.Column_def_table_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#then_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_condition(@NotNull tsqlParser.Then_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(@NotNull tsqlParser.Column_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#exception_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_statement(@NotNull tsqlParser.Exception_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(@NotNull tsqlParser.Execute_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_bound(@NotNull tsqlParser.Window_frame_boundContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#update_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_elem(@NotNull tsqlParser.Update_elemContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#search_condition_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_or(@NotNull tsqlParser.Search_condition_orContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull tsqlParser.While_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item_joined(@NotNull tsqlParser.Table_source_item_joinedContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#output_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_clause(@NotNull tsqlParser.Output_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(@NotNull tsqlParser.Loop_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull tsqlParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(@NotNull tsqlParser.Delete_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#drop_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index(@NotNull tsqlParser.Drop_indexContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(@NotNull tsqlParser.Assignment_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull tsqlParser.Table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseerror_statement(@NotNull tsqlParser.Raiseerror_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(@NotNull tsqlParser.Case_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_following(@NotNull tsqlParser.Window_frame_followingContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_extent(@NotNull tsqlParser.Window_frame_extentContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_option(@NotNull tsqlParser.Index_optionContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull tsqlParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#output_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_column_name(@NotNull tsqlParser.Output_column_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#dml_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_clause(@NotNull tsqlParser.Dml_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement_arg(@NotNull tsqlParser.Execute_statement_argContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#comment_on_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_statement(@NotNull tsqlParser.Comment_on_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#index_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_value(@NotNull tsqlParser.Index_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#execute_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_clause(@NotNull tsqlParser.Execute_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_statement(@NotNull tsqlParser.Call_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_preceding(@NotNull tsqlParser.Window_frame_precedingContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_statement(@NotNull tsqlParser.Transaction_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(@NotNull tsqlParser.SubqueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#go_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo_statement(@NotNull tsqlParser.Go_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#option_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_clause(@NotNull tsqlParser.Option_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(@NotNull tsqlParser.Order_by_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link tsqlParser#datepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatepart(@NotNull tsqlParser.DatepartContext ctx);
}