

public class LogicaSQL extends GramaticaSQLBaseVisitor<String>
{
	
	public DDL ddl = new DDL();
	public String idRename = "asd";

	@Override
	public String visitTipoIdFloat(GramaticaSQLParser.TipoIdFloatContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTipoIdFloat(ctx);
	}

	@Override
	public String visitCKeyFK(GramaticaSQLParser.CKeyFKContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCKeyFK(ctx);
	}

	@Override
	public String visitAlterTableRename(GramaticaSQLParser.AlterTableRenameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAlterTableRename(ctx);
	}

	@Override
	public String visitStmtDropTable(GramaticaSQLParser.StmtDropTableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtDropTable(ctx);
	}

	@Override
	public String visitSelect(GramaticaSQLParser.SelectContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSelect(ctx);
	}

	@Override
	public String visitTipoIdChar(GramaticaSQLParser.TipoIdCharContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTipoIdChar(ctx);
	}

	@Override
	public String visitAddConstraint(GramaticaSQLParser.AddConstraintContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAddConstraint(ctx);
	}

	@Override
	public String visitRenameTable(GramaticaSQLParser.RenameTableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRenameTable(ctx);
	}

	@Override
	public String visitStmtPrincipalTable(GramaticaSQLParser.StmtPrincipalTableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtPrincipalTable(ctx);
	}

	@Override
	public String visitDropColumn(GramaticaSQLParser.DropColumnContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDropColumn(ctx);
	}

	@Override
	public String visitShowTables(GramaticaSQLParser.ShowTablesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitShowTables(ctx);
	}

	@Override
	public String visitDropDatabase(GramaticaSQLParser.DropDatabaseContext ctx) {
		String id = ctx.ID().getText();
		ddl.dropDatabase(id);
		// TODO Auto-generated method stub
		return super.visitDropDatabase(ctx);
	}

	@Override
	public String visitStmtDropDB(GramaticaSQLParser.StmtDropDBContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtDropDB(ctx);
	}

	@Override
	public String visitStatementData(GramaticaSQLParser.StatementDataContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatementData(ctx);
	}

	@Override
	public String visitActTableAddCnst(GramaticaSQLParser.ActTableAddCnstContext ctx) {
		// TODO Auto-generated method stub
		return super.visitActTableAddCnst(ctx);
	}

	@Override
	public String visitActTableDropCol(GramaticaSQLParser.ActTableDropColContext ctx) {
		// TODO Auto-generated method stub
		return super.visitActTableDropCol(ctx);
	}

	@Override
	public String visitNotAtom(GramaticaSQLParser.NotAtomContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNotAtom(ctx);
	}



	@Override
	public String visitAlterDatabase(GramaticaSQLParser.AlterDatabaseContext ctx) {
		String idAntiguo = ctx.ID(0).getText();
		String idNuevo = ctx.ID(1).getText();
		ddl.alterDatabase(idAntiguo, idNuevo);
		// TODO Auto-generated method stub
		return super.visitAlterDatabase(ctx);
	}

	@Override
	public String visitStmtPrincipalDB(GramaticaSQLParser.StmtPrincipalDBContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtPrincipalDB(ctx);
	}

	@Override
	public String visitAddColumn(GramaticaSQLParser.AddColumnContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAddColumn(ctx);
	}

	@Override
	public String visitUseDatabase(GramaticaSQLParser.UseDatabaseContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUseDatabase(ctx);
	}

	@Override
	public String visitNotNotAtom(GramaticaSQLParser.NotNotAtomContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNotNotAtom(ctx);
	}

	@Override
	public String visitDropConstraint(GramaticaSQLParser.DropConstraintContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDropConstraint(ctx);
	}

	@Override
	public String visitActTableAddCol(GramaticaSQLParser.ActTableAddColContext ctx) {
		// TODO Auto-generated method stub
		return super.visitActTableAddCol(ctx);
	}

	@Override
	public String visitStmtAlterDB(GramaticaSQLParser.StmtAlterDBContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtAlterDB(ctx);
	}

	@Override
	public String visitStmtShowColsFrom(GramaticaSQLParser.StmtShowColsFromContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtShowColsFrom(ctx);
	}

	@Override
	public String visitAtomID(GramaticaSQLParser.AtomIDContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAtomID(ctx);
	}

	@Override
	public String visitCreateDatabase(GramaticaSQLParser.CreateDatabaseContext ctx) {
		String id = ctx.ID().getText();
		ddl.createDatabase(id);
		// TODO Auto-generated method stub
		return super.visitCreateDatabase(ctx);
	}

	@Override
	public String visitAlterTableAction(GramaticaSQLParser.AlterTableActionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAlterTableAction(ctx);
	}

	@Override
	public String visitStmtRenameTable(GramaticaSQLParser.StmtRenameTableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtRenameTable(ctx);
	}

	@Override
	public String visitTipoIdInt(GramaticaSQLParser.TipoIdIntContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTipoIdInt(ctx);
	}

	@Override
	public String visitCKeyPK(GramaticaSQLParser.CKeyPKContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCKeyPK(ctx);
	}

	@Override
	public String visitStmtAlterTable(GramaticaSQLParser.StmtAlterTableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtAlterTable(ctx);
	}

	@Override
	public String visitCKeyCHK(GramaticaSQLParser.CKeyCHKContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCKeyCHK(ctx);
	}

	@Override
	public String visitCreateTable(GramaticaSQLParser.CreateTableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCreateTable(ctx);
	}

	@Override
	public String visitInsert(GramaticaSQLParser.InsertContext ctx) {
		// TODO Auto-generated method stub
		return super.visitInsert(ctx);
	}

	@Override
	public String visitUpdate(GramaticaSQLParser.UpdateContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUpdate(ctx);
	}

	@Override
	public String visitDelete(GramaticaSQLParser.DeleteContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDelete(ctx);
	}

	@Override
	public String visitStmtShowTables(GramaticaSQLParser.StmtShowTablesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtShowTables(ctx);
	}

	@Override
	public String visitPrincipal(GramaticaSQLParser.PrincipalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrincipal(ctx);
	}

	@Override
	public String visitShowColumnsFrom(GramaticaSQLParser.ShowColumnsFromContext ctx) {
		// TODO Auto-generated method stub
		return super.visitShowColumnsFrom(ctx);
	}

	@Override
	public String visitStmtActionTable(GramaticaSQLParser.StmtActionTableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtActionTable(ctx);
	}

	@Override
	public String visitAnd(GramaticaSQLParser.AndContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAnd(ctx);
	}

	@Override
	public String visitExtra(GramaticaSQLParser.ExtraContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExtra(ctx);
	}

	@Override
	public String visitTipoIdDate(GramaticaSQLParser.TipoIdDateContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTipoIdDate(ctx);
	}

	@Override
	public String visitDropTable(GramaticaSQLParser.DropTableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDropTable(ctx);
	}

	@Override
	public String visitStmtShowDB(GramaticaSQLParser.StmtShowDBContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtShowDB(ctx);
	}

	@Override
	public String visitOr(GramaticaSQLParser.OrContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOr(ctx);
	}

	@Override
	public String visitShowDatabases(GramaticaSQLParser.ShowDatabasesContext ctx) {
		ddl.showDatabases();
		// TODO Auto-generated method stub
		return super.visitShowDatabases(ctx);
	}

	@Override
	public String visitActTableDropCnst(GramaticaSQLParser.ActTableDropCnstContext ctx) {
		// TODO Auto-generated method stub
		return super.visitActTableDropCnst(ctx);
	}

	@Override
	public String visitBooleanExpression(GramaticaSQLParser.BooleanExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBooleanExpression(ctx);
	}

	@Override
	public String visitCondicion(GramaticaSQLParser.CondicionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCondicion(ctx);
	}

	@Override
	public String visitStmtPrincipalData(GramaticaSQLParser.StmtPrincipalDataContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtPrincipalData(ctx);
	}

	@Override
	public String visitAtomExp(GramaticaSQLParser.AtomExpContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAtomExp(ctx);
	}

	@Override
	public String visitStmtCreateDB(GramaticaSQLParser.StmtCreateDBContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtCreateDB(ctx);
	}

	@Override
	public String visitStmtUseDB(GramaticaSQLParser.StmtUseDBContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmtUseDB(ctx);
	}
	
}
