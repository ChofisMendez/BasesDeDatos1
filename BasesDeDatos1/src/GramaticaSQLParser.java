// Generated from GramaticaSQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, CREATE=8, DATABASE=9, 
		DATABASES=10, ALTER=11, DROP=12, SHOW=13, USE=14, CHECK=15, CONSTRAINT=16, 
		PRIMARY=17, FOREIGN=18, KEY=19, REFERENCES=20, INT=21, FLOAT=22, DATE=23, 
		CHAR=24, AND=25, OR=26, NOT=27, TABLE=28, TABLES=29, RENAME=30, TO=31, 
		ADD=32, COLUMN=33, COLUMNS=34, INSERT=35, INTO=36, VALUES=37, NULL=38, 
		UPDATE=39, SET=40, WHERE=41, DELETE=42, SELECT=43, FROM=44, ORDER=45, 
		BY=46, ASC=47, DESC=48, NUM=49, ID=50, LOGICAL=51, COMMENTS=52, WS=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'_'", "'('", "')'", "'*'", "';'", "','", "'='", "CREATE", 
		"DATABASE", "DATABASES", "ALTER", "DROP", "SHOW", "USE", "CHECK", "CONSTRAINT", 
		"PRIMARY", "FOREIGN", "KEY", "REFERENCES", "INT", "FLOAT", "DATE", "CHAR", 
		"AND", "OR", "NOT", "TABLE", "TABLES", "RENAME", "TO", "ADD", "COLUMN", 
		"COLUMNS", "INSERT", "INTO", "VALUES", "NULL", "UPDATE", "SET", "WHERE", 
		"DELETE", "SELECT", "FROM", "ORDER", "BY", "ASC", "DESC", "NUM", "ID", 
		"LOGICAL", "COMMENTS", "WS"
	};
	public static final int
		RULE_principal = 0, RULE_statements = 1, RULE_statementDatabase = 2, RULE_createDatabase = 3, 
		RULE_alterDatabase = 4, RULE_renameDatabase = 5, RULE_dropDatabase = 6, 
		RULE_showDatabases = 7, RULE_useDatabase = 8, RULE_createTable = 9, RULE_tipoId = 10, 
		RULE_cKey = 11, RULE_booleanExpression = 12, RULE_or = 13, RULE_and = 14, 
		RULE_not = 15, RULE_atom = 16, RULE_statementTable = 17, RULE_alterTable = 18, 
		RULE_renameTable = 19, RULE_actionTable = 20, RULE_addColumn = 21, RULE_addConstraint = 22, 
		RULE_dropColumn = 23, RULE_dropConstraint = 24, RULE_showTables = 25, 
		RULE_dropTable = 26, RULE_showColumnsFrom = 27, RULE_statementData = 28, 
		RULE_insert = 29, RULE_update = 30, RULE_delete = 31, RULE_select = 32, 
		RULE_condicion = 33, RULE_extra = 34;
	public static final String[] ruleNames = {
		"principal", "statements", "statementDatabase", "createDatabase", "alterDatabase", 
		"renameDatabase", "dropDatabase", "showDatabases", "useDatabase", "createTable", 
		"tipoId", "cKey", "booleanExpression", "or", "and", "not", "atom", "statementTable", 
		"alterTable", "renameTable", "actionTable", "addColumn", "addConstraint", 
		"dropColumn", "dropConstraint", "showTables", "dropTable", "showColumnsFrom", 
		"statementData", "insert", "update", "delete", "select", "condicion", 
		"extra"
	};

	@Override
	public String getGrammarFileName() { return "GramaticaSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrincipalContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_principal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70); statements();
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71); match(T__2);
					setState(72); statements();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(79);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(78); match(T__2);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtPrincipalDBContext extends StatementsContext {
		public StatementDatabaseContext statementDatabase() {
			return getRuleContext(StatementDatabaseContext.class,0);
		}
		public StmtPrincipalDBContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtPrincipalDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtPrincipalDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtPrincipalDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPrincipalDataContext extends StatementsContext {
		public StatementDataContext statementData() {
			return getRuleContext(StatementDataContext.class,0);
		}
		public StmtPrincipalDataContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtPrincipalData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtPrincipalData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtPrincipalData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPrincipalTableContext extends StatementsContext {
		public StatementTableContext statementTable() {
			return getRuleContext(StatementTableContext.class,0);
		}
		public StmtPrincipalTableContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtPrincipalTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtPrincipalTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtPrincipalTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new StmtPrincipalDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81); statementDatabase();
				}
				break;
			case 2:
				_localctx = new StmtPrincipalTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82); statementTable();
				}
				break;
			case 3:
				_localctx = new StmtPrincipalDataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83); statementData();
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

	public static class StatementDatabaseContext extends ParserRuleContext {
		public StatementDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementDatabase; }
	 
		public StatementDatabaseContext() { }
		public void copyFrom(StatementDatabaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtShowDBContext extends StatementDatabaseContext {
		public ShowDatabasesContext showDatabases() {
			return getRuleContext(ShowDatabasesContext.class,0);
		}
		public StmtShowDBContext(StatementDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtShowDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtShowDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtShowDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtDropDBContext extends StatementDatabaseContext {
		public DropDatabaseContext dropDatabase() {
			return getRuleContext(DropDatabaseContext.class,0);
		}
		public StmtDropDBContext(StatementDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtDropDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtDropDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtDropDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtCreateDBContext extends StatementDatabaseContext {
		public CreateDatabaseContext createDatabase() {
			return getRuleContext(CreateDatabaseContext.class,0);
		}
		public StmtCreateDBContext(StatementDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtCreateDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtCreateDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtCreateDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAlterDBContext extends StatementDatabaseContext {
		public AlterDatabaseContext alterDatabase() {
			return getRuleContext(AlterDatabaseContext.class,0);
		}
		public StmtAlterDBContext(StatementDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtAlterDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtAlterDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtAlterDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtUseDBContext extends StatementDatabaseContext {
		public UseDatabaseContext useDatabase() {
			return getRuleContext(UseDatabaseContext.class,0);
		}
		public StmtUseDBContext(StatementDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtUseDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtUseDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtUseDB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementDatabaseContext statementDatabase() throws RecognitionException {
		StatementDatabaseContext _localctx = new StatementDatabaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statementDatabase);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case CREATE:
				_localctx = new StmtCreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86); createDatabase();
				}
				break;
			case ALTER:
				_localctx = new StmtAlterDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87); alterDatabase();
				}
				break;
			case DROP:
				_localctx = new StmtDropDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88); dropDatabase();
				}
				break;
			case USE:
				_localctx = new StmtUseDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89); useDatabase();
				}
				break;
			case SHOW:
				_localctx = new StmtShowDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90); showDatabases();
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

	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode CREATE() { return getToken(GramaticaSQLParser.CREATE, 0); }
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(CREATE);
			setState(94); match(DATABASE);
			setState(95); match(ID);
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

	public static class AlterDatabaseContext extends ParserRuleContext {
		public RenameDatabaseContext renameDatabase() {
			return getRuleContext(RenameDatabaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode ALTER() { return getToken(GramaticaSQLParser.ALTER, 0); }
		public AlterDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAlterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAlterDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAlterDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDatabaseContext alterDatabase() throws RecognitionException {
		AlterDatabaseContext _localctx = new AlterDatabaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alterDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(ALTER);
			setState(98); match(DATABASE);
			setState(99); match(ID);
			setState(100); renameDatabase();
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

	public static class RenameDatabaseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(GramaticaSQLParser.RENAME, 0); }
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode TO() { return getToken(GramaticaSQLParser.TO, 0); }
		public RenameDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterRenameDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitRenameDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRenameDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameDatabaseContext renameDatabase() throws RecognitionException {
		RenameDatabaseContext _localctx = new RenameDatabaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_renameDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(RENAME);
			setState(103); match(TO);
			setState(104); match(ID);
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

	public static class DropDatabaseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public DropDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDatabaseContext dropDatabase() throws RecognitionException {
		DropDatabaseContext _localctx = new DropDatabaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dropDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(DROP);
			setState(107); match(DATABASE);
			setState(108); match(ID);
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

	public static class ShowDatabasesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GramaticaSQLParser.SHOW, 0); }
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DATABASES() { return getToken(GramaticaSQLParser.DATABASES, 0); }
		public ShowDatabasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDatabases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitShowDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitShowDatabases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDatabasesContext showDatabases() throws RecognitionException {
		ShowDatabasesContext _localctx = new ShowDatabasesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_showDatabases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(SHOW);
			setState(111); match(DATABASES);
			setState(112); match(ID);
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

	public static class UseDatabaseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode USE() { return getToken(GramaticaSQLParser.USE, 0); }
		public UseDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterUseDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitUseDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitUseDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDatabaseContext useDatabase() throws RecognitionException {
		UseDatabaseContext _localctx = new UseDatabaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(USE);
			setState(115); match(DATABASE);
			setState(116); match(ID);
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

	public static class CreateTableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public List<TipoIdContext> tipoId() {
			return getRuleContexts(TipoIdContext.class);
		}
		public TerminalNode CONSTRAINT() { return getToken(GramaticaSQLParser.CONSTRAINT, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public CKeyContext cKey() {
			return getRuleContext(CKeyContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(GramaticaSQLParser.CREATE, 0); }
		public TipoIdContext tipoId(int i) {
			return getRuleContext(TipoIdContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(CREATE);
			setState(119); match(TABLE);
			setState(120); match(ID);
			setState(121); match(T__5);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122); match(ID);
					setState(123); tipoId();
					setState(124); match(T__1);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(131); match(ID);
			setState(132); tipoId();
			setState(133); match(CONSTRAINT);
			setState(134); cKey();
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

	public static class TipoIdContext extends ParserRuleContext {
		public TipoIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoId; }
	 
		public TipoIdContext() { }
		public void copyFrom(TipoIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TipoIdFloatContext extends TipoIdContext {
		public TerminalNode FLOAT() { return getToken(GramaticaSQLParser.FLOAT, 0); }
		public TipoIdFloatContext(TipoIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterTipoIdFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitTipoIdFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitTipoIdFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoIdIntContext extends TipoIdContext {
		public TerminalNode INT() { return getToken(GramaticaSQLParser.INT, 0); }
		public TipoIdIntContext(TipoIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterTipoIdInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitTipoIdInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitTipoIdInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoIdCharContext extends TipoIdContext {
		public TerminalNode NUM() { return getToken(GramaticaSQLParser.NUM, 0); }
		public TerminalNode CHAR() { return getToken(GramaticaSQLParser.CHAR, 0); }
		public TipoIdCharContext(TipoIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterTipoIdChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitTipoIdChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitTipoIdChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoIdDateContext extends TipoIdContext {
		public TerminalNode DATE() { return getToken(GramaticaSQLParser.DATE, 0); }
		public TipoIdDateContext(TipoIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterTipoIdDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitTipoIdDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitTipoIdDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoIdContext tipoId() throws RecognitionException {
		TipoIdContext _localctx = new TipoIdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipoId);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TipoIdIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136); match(INT);
				}
				break;
			case FLOAT:
				_localctx = new TipoIdFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137); match(FLOAT);
				}
				break;
			case DATE:
				_localctx = new TipoIdDateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138); match(DATE);
				}
				break;
			case CHAR:
				_localctx = new TipoIdCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(139); match(CHAR);
				setState(140); match(T__5);
				setState(141); match(NUM);
				setState(142); match(T__4);
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

	public static class CKeyContext extends ParserRuleContext {
		public CKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cKey; }
	 
		public CKeyContext() { }
		public void copyFrom(CKeyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CKeyFKContext extends CKeyContext {
		public TerminalNode KEY() { return getToken(GramaticaSQLParser.KEY, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode REFERENCES() { return getToken(GramaticaSQLParser.REFERENCES, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TerminalNode FOREIGN() { return getToken(GramaticaSQLParser.FOREIGN, 0); }
		public CKeyFKContext(CKeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCKeyFK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCKeyFK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCKeyFK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CKeyCHKContext extends CKeyContext {
		public TerminalNode CHECK() { return getToken(GramaticaSQLParser.CHECK, 0); }
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public CKeyCHKContext(CKeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCKeyCHK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCKeyCHK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCKeyCHK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CKeyPKContext extends CKeyContext {
		public TerminalNode PRIMARY() { return getToken(GramaticaSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(GramaticaSQLParser.KEY, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public CKeyPKContext(CKeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCKeyPK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCKeyPK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCKeyPK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CKeyContext cKey() throws RecognitionException {
		CKeyContext _localctx = new CKeyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cKey);
		try {
			int _alt;
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new CKeyPKContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145); match(ID);
				setState(146); match(PRIMARY);
				setState(147); match(KEY);
				setState(148); match(T__5);
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149); match(ID);
						setState(150); match(T__1);
						}
						} 
					}
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(156); match(ID);
				setState(157); match(T__4);
				}
				break;
			case 2:
				_localctx = new CKeyFKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158); match(ID);
				setState(159); match(FOREIGN);
				setState(160); match(KEY);
				setState(161); match(T__5);
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(162); match(ID);
						setState(163); match(T__1);
						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(169); match(ID);
				setState(170); match(T__4);
				setState(171); match(REFERENCES);
				setState(172); match(ID);
				setState(173); match(T__5);
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(174); match(ID);
						setState(175); match(T__1);
						}
						} 
					}
					setState(180);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(181); match(ID);
				setState(182); match(T__4);
				}
				break;
			case 3:
				_localctx = new CKeyCHKContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183); match(ID);
				setState(184); match(CHECK);
				setState(185); match(T__5);
				setState(186); atom();
				setState(187); match(T__4);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); or();
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

	public static class OrContext extends ParserRuleContext {
		public List<TerminalNode> OR() { return getTokens(GramaticaSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GramaticaSQLParser.OR, i);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); and();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(194); match(OR);
				setState(195); and();
				}
				}
				setState(200);
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

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND(int i) {
			return getToken(GramaticaSQLParser.AND, i);
		}
		public NotContext not(int i) {
			return getRuleContext(NotContext.class,i);
		}
		public List<NotContext> not() {
			return getRuleContexts(NotContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(GramaticaSQLParser.AND); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); not();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(202); match(AND);
				setState(203); not();
				}
				}
				setState(208);
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

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
	 
		public NotContext() { }
		public void copyFrom(NotContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotNotAtomContext extends NotContext {
		public TerminalNode NOT() { return getToken(GramaticaSQLParser.NOT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public NotNotAtomContext(NotContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterNotNotAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitNotNotAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitNotNotAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotAtomContext extends NotContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public NotAtomContext(NotContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterNotAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitNotAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitNotAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_not);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotNotAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(NOT);
				setState(210); atom();
				}
				break;
			case T__5:
			case ID:
				_localctx = new NotAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211); atom();
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomIDContext extends AtomContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public AtomIDContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAtomID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAtomID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAtomID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExpContext extends AtomContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public AtomExpContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAtomExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAtomExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atom);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AtomIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214); match(ID);
				}
				break;
			case T__5:
				_localctx = new AtomExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215); match(T__5);
				setState(216); booleanExpression();
				setState(217); match(T__4);
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

	public static class StatementTableContext extends ParserRuleContext {
		public StatementTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementTable; }
	 
		public StatementTableContext() { }
		public void copyFrom(StatementTableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtDropTableContext extends StatementTableContext {
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public StmtDropTableContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtRenameTableContext extends StatementTableContext {
		public RenameTableContext renameTable() {
			return getRuleContext(RenameTableContext.class,0);
		}
		public StmtRenameTableContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtActionTableContext extends StatementTableContext {
		public ActionTableContext actionTable() {
			return getRuleContext(ActionTableContext.class,0);
		}
		public StmtActionTableContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtActionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtActionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtActionTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAlterTableContext extends StatementTableContext {
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public StmtAlterTableContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtAlterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtAlterTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtShowTablesContext extends StatementTableContext {
		public ShowTablesContext showTables() {
			return getRuleContext(ShowTablesContext.class,0);
		}
		public StmtShowTablesContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtShowColsFromContext extends StatementTableContext {
		public ShowColumnsFromContext showColumnsFrom() {
			return getRuleContext(ShowColumnsFromContext.class,0);
		}
		public StmtShowColsFromContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtShowColsFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtShowColsFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtShowColsFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementTableContext statementTable() throws RecognitionException {
		StatementTableContext _localctx = new StatementTableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statementTable);
		try {
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new StmtAlterTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221); alterTable();
				}
				break;
			case 2:
				_localctx = new StmtRenameTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222); renameTable();
				}
				break;
			case 3:
				_localctx = new StmtActionTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223); actionTable();
				}
				break;
			case 4:
				_localctx = new StmtShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224); showTables();
				}
				break;
			case 5:
				_localctx = new StmtDropTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(225); dropTable();
				}
				break;
			case 6:
				_localctx = new StmtShowColsFromContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(226); showColumnsFrom();
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

	public static class AlterTableContext extends ParserRuleContext {
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	 
		public AlterTableContext() { }
		public void copyFrom(AlterTableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableRenameContext extends AlterTableContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode ALTER() { return getToken(GramaticaSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public RenameTableContext renameTable() {
			return getRuleContext(RenameTableContext.class,0);
		}
		public AlterTableRenameContext(AlterTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAlterTableRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAlterTableRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAlterTableRename(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableActionContext extends AlterTableContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public List<ActionTableContext> actionTable() {
			return getRuleContexts(ActionTableContext.class);
		}
		public TerminalNode ALTER() { return getToken(GramaticaSQLParser.ALTER, 0); }
		public ActionTableContext actionTable(int i) {
			return getRuleContext(ActionTableContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public AlterTableActionContext(AlterTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAlterTableAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAlterTableAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAlterTableAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alterTable);
		int _la;
		try {
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AlterTableRenameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229); match(ALTER);
				setState(230); match(TABLE);
				setState(231); match(ID);
				setState(232); renameTable();
				}
				break;
			case 2:
				_localctx = new AlterTableActionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233); match(ALTER);
				setState(234); match(TABLE);
				setState(235); match(ID);
				{
				setState(236); actionTable();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(237); match(T__1);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243); actionTable();
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

	public static class RenameTableContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(GramaticaSQLParser.RENAME, 0); }
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode TO() { return getToken(GramaticaSQLParser.TO, 0); }
		public RenameTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameTableContext renameTable() throws RecognitionException {
		RenameTableContext _localctx = new RenameTableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_renameTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(RENAME);
			setState(248); match(TO);
			setState(249); match(ID);
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

	public static class ActionTableContext extends ParserRuleContext {
		public ActionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionTable; }
	 
		public ActionTableContext() { }
		public void copyFrom(ActionTableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActTableAddCnstContext extends ActionTableContext {
		public CKeyContext cKey() {
			return getRuleContext(CKeyContext.class,0);
		}
		public AddConstraintContext addConstraint() {
			return getRuleContext(AddConstraintContext.class,0);
		}
		public ActTableAddCnstContext(ActionTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterActTableAddCnst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitActTableAddCnst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitActTableAddCnst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActTableAddColContext extends ActionTableContext {
		public AddColumnContext addColumn() {
			return getRuleContext(AddColumnContext.class,0);
		}
		public TipoIdContext tipoId() {
			return getRuleContext(TipoIdContext.class,0);
		}
		public CKeyContext cKey(int i) {
			return getRuleContext(CKeyContext.class,i);
		}
		public List<CKeyContext> cKey() {
			return getRuleContexts(CKeyContext.class);
		}
		public ActTableAddColContext(ActionTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterActTableAddCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitActTableAddCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitActTableAddCol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActTableDropColContext extends ActionTableContext {
		public DropColumnContext dropColumn() {
			return getRuleContext(DropColumnContext.class,0);
		}
		public ActTableDropColContext(ActionTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterActTableDropCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitActTableDropCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitActTableDropCol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActTableDropCnstContext extends ActionTableContext {
		public DropConstraintContext dropConstraint() {
			return getRuleContext(DropConstraintContext.class,0);
		}
		public ActTableDropCnstContext(ActionTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterActTableDropCnst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitActTableDropCnst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitActTableDropCnst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTableContext actionTable() throws RecognitionException {
		ActionTableContext _localctx = new ActionTableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_actionTable);
		try {
			int _alt;
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ActTableAddColContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251); addColumn();
				setState(252); tipoId();
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253); cKey();
						setState(254); match(T__1);
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(261); cKey();
				}
				break;
			case 2:
				_localctx = new ActTableAddCnstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263); addConstraint();
				setState(264); cKey();
				}
				break;
			case 3:
				_localctx = new ActTableDropColContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(266); dropColumn();
				}
				break;
			case 4:
				_localctx = new ActTableDropCnstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(267); dropConstraint();
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

	public static class AddColumnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode COLUMN() { return getToken(GramaticaSQLParser.COLUMN, 0); }
		public TerminalNode ADD() { return getToken(GramaticaSQLParser.ADD, 0); }
		public AddColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddColumnContext addColumn() throws RecognitionException {
		AddColumnContext _localctx = new AddColumnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_addColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(ADD);
			setState(271); match(COLUMN);
			setState(272); match(ID);
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

	public static class AddConstraintContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode ADD() { return getToken(GramaticaSQLParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(GramaticaSQLParser.CONSTRAINT, 0); }
		public AddConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAddConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAddConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAddConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddConstraintContext addConstraint() throws RecognitionException {
		AddConstraintContext _localctx = new AddConstraintContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_addConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(ADD);
			setState(275); match(CONSTRAINT);
			setState(276); match(ID);
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

	public static class DropColumnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode COLUMN() { return getToken(GramaticaSQLParser.COLUMN, 0); }
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public DropColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnContext dropColumn() throws RecognitionException {
		DropColumnContext _localctx = new DropColumnContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dropColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(DROP);
			setState(279); match(COLUMN);
			setState(280); match(ID);
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

	public static class DropConstraintContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(GramaticaSQLParser.CONSTRAINT, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public DropConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterDropConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitDropConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintContext dropConstraint() throws RecognitionException {
		DropConstraintContext _localctx = new DropConstraintContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dropConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(DROP);
			setState(283); match(CONSTRAINT);
			setState(284); match(ID);
			setState(285); match(T__6);
			setState(286); match(ID);
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

	public static class ShowTablesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GramaticaSQLParser.SHOW, 0); }
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode TABLES() { return getToken(GramaticaSQLParser.TABLES, 0); }
		public ShowTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowTablesContext showTables() throws RecognitionException {
		ShowTablesContext _localctx = new ShowTablesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_showTables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); match(SHOW);
			setState(289); match(TABLES);
			setState(290); match(ID);
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(DROP);
			setState(293); match(TABLE);
			setState(294); match(ID);
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

	public static class ShowColumnsFromContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GramaticaSQLParser.SHOW, 0); }
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode COLUMNS() { return getToken(GramaticaSQLParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(GramaticaSQLParser.FROM, 0); }
		public ShowColumnsFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showColumnsFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterShowColumnsFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitShowColumnsFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitShowColumnsFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowColumnsFromContext showColumnsFrom() throws RecognitionException {
		ShowColumnsFromContext _localctx = new ShowColumnsFromContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_showColumnsFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(SHOW);
			setState(297); match(COLUMNS);
			setState(298); match(FROM);
			setState(299); match(ID);
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

	public static class StatementDataContext extends ParserRuleContext {
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public StatementDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStatementData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStatementData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStatementData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementDataContext statementData() throws RecognitionException {
		StatementDataContext _localctx = new StatementDataContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statementData);
		try {
			setState(305);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); insert();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); update();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(303); delete();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(304); select();
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

	public static class InsertContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode VALUES() { return getToken(GramaticaSQLParser.VALUES, 0); }
		public List<TipoIdContext> tipoId() {
			return getRuleContexts(TipoIdContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TipoIdContext tipoId(int i) {
			return getRuleContext(TipoIdContext.class,i);
		}
		public TerminalNode INSERT() { return getToken(GramaticaSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(GramaticaSQLParser.INTO, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(INSERT);
			setState(308); match(INTO);
			setState(309); match(ID);
			setState(310); match(T__5);
			setState(311); match(ID);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(312); match(T__1);
				setState(313); match(ID);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319); match(T__4);
			setState(320); match(VALUES);
			setState(321); match(T__5);
			setState(322); tipoId();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(323); match(T__1);
				setState(324); tipoId();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330); match(T__4);
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

	public static class UpdateContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(GramaticaSQLParser.UPDATE, 0); }
		public List<TipoIdContext> tipoId() {
			return getRuleContexts(TipoIdContext.class);
		}
		public TerminalNode WHERE() { return getToken(GramaticaSQLParser.WHERE, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TipoIdContext tipoId(int i) {
			return getRuleContext(TipoIdContext.class,i);
		}
		public TerminalNode SET() { return getToken(GramaticaSQLParser.SET, 0); }
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(UPDATE);
			setState(333); match(ID);
			setState(334); match(SET);
			setState(335); match(ID);
			setState(336); match(T__0);
			setState(337); tipoId();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(338); match(T__1);
				setState(339); tipoId();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(345); match(WHERE);
				setState(346); condicion();
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(GramaticaSQLParser.DELETE, 0); }
		public TerminalNode WHERE() { return getToken(GramaticaSQLParser.WHERE, 0); }
		public TerminalNode FROM() { return getToken(GramaticaSQLParser.FROM, 0); }
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(DELETE);
			setState(350); match(FROM);
			setState(351); match(ID);
			setState(354);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(352); match(WHERE);
				setState(353); condicion();
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

	public static class SelectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public List<TerminalNode> ASC() { return getTokens(GramaticaSQLParser.ASC); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(GramaticaSQLParser.ORDER, 0); }
		public TerminalNode ASC(int i) {
			return getToken(GramaticaSQLParser.ASC, i);
		}
		public TerminalNode WHERE() { return getToken(GramaticaSQLParser.WHERE, 0); }
		public TerminalNode DESC(int i) {
			return getToken(GramaticaSQLParser.DESC, i);
		}
		public TerminalNode FROM() { return getToken(GramaticaSQLParser.FROM, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TerminalNode SELECT() { return getToken(GramaticaSQLParser.SELECT, 0); }
		public List<TerminalNode> DESC() { return getTokens(GramaticaSQLParser.DESC); }
		public TerminalNode BY() { return getToken(GramaticaSQLParser.BY, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); match(SELECT);
			setState(366);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(357); match(T__3);
				}
				break;
			case ID:
				{
				setState(358); match(ID);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(359); match(T__1);
					setState(360); match(ID);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(368); match(FROM);
			setState(369); match(ID);
			setState(372);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(370); match(WHERE);
				setState(371); condicion();
				}
			}

			setState(386);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(374); match(ORDER);
				setState(375); match(BY);
				setState(376); match(ID);
				setState(377);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(378); match(T__1);
					setState(379); match(ID);
					setState(380);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GramaticaSQLParser.NOT, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode LOGICAL() { return getToken(GramaticaSQLParser.LOGICAL, 0); }
		public TerminalNode AND() { return getToken(GramaticaSQLParser.AND, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TerminalNode OR() { return getToken(GramaticaSQLParser.OR, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_condicion);
		try {
			setState(399);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388); match(ID);
				setState(389); match(AND);
				setState(390); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391); match(ID);
				setState(392); match(OR);
				setState(393); match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(394); match(NOT);
				setState(395); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396); match(ID);
				setState(397); match(LOGICAL);
				setState(398); match(ID);
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

	public static class ExtraContext extends ParserRuleContext {
		public TerminalNode AND(int i) {
			return getToken(GramaticaSQLParser.AND, i);
		}
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(GramaticaSQLParser.AND); }
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(GramaticaSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GramaticaSQLParser.OR, i);
		}
		public ExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterExtra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitExtra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitExtra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraContext extra() throws RecognitionException {
		ExtraContext _localctx = new ExtraContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_extra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(401); match(AND);
				setState(402); condicion();
				}
				}
				setState(405); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND );
			setState(409); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(407); match(OR);
				setState(408); condicion();
				}
				}
				setState(411); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OR );
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u01a0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\5\2R\n"+
		"\2\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0081\n\13\f"+
		"\13\16\13\u0084\13\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0092\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009a\n\r\f\r\16\r\u009d"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a7\n\r\f\r\16\r\u00aa\13"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c0\n\r\3\16\3\16\3\17\3\17\3\17\7\17"+
		"\u00c7\n\17\f\17\16\17\u00ca\13\17\3\20\3\20\3\20\7\20\u00cf\n\20\f\20"+
		"\16\20\u00d2\13\20\3\21\3\21\3\21\5\21\u00d7\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00de\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e6\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f1\n\24\f\24\16\24"+
		"\u00f4\13\24\3\24\3\24\5\24\u00f8\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u0103\n\26\f\26\16\26\u0106\13\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u010f\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\5\36\u0134\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u013d\n\37\f"+
		"\37\16\37\u0140\13\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0148\n\37\f"+
		"\37\16\37\u014b\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \7 \u0157\n \f"+
		" \16 \u015a\13 \3 \3 \5 \u015e\n \3!\3!\3!\3!\3!\5!\u0165\n!\3\"\3\"\3"+
		"\"\3\"\3\"\7\"\u016c\n\"\f\"\16\"\u016f\13\"\5\"\u0171\n\"\3\"\3\"\3\""+
		"\3\"\5\"\u0177\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0180\n\"\f\"\16\""+
		"\u0183\13\"\5\"\u0185\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0192\n"+
		"#\3$\3$\6$\u0196\n$\r$\16$\u0197\3$\3$\6$\u019c\n$\r$\16$\u019d\3$\2\2"+
		"%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"\2\3\3\2\61\62\u01ae\2H\3\2\2\2\4V\3\2\2\2\6]\3\2\2\2\b_\3\2\2\2\nc\3"+
		"\2\2\2\fh\3\2\2\2\16l\3\2\2\2\20p\3\2\2\2\22t\3\2\2\2\24x\3\2\2\2\26\u0091"+
		"\3\2\2\2\30\u00bf\3\2\2\2\32\u00c1\3\2\2\2\34\u00c3\3\2\2\2\36\u00cb\3"+
		"\2\2\2 \u00d6\3\2\2\2\"\u00dd\3\2\2\2$\u00e5\3\2\2\2&\u00f7\3\2\2\2(\u00f9"+
		"\3\2\2\2*\u010e\3\2\2\2,\u0110\3\2\2\2.\u0114\3\2\2\2\60\u0118\3\2\2\2"+
		"\62\u011c\3\2\2\2\64\u0122\3\2\2\2\66\u0126\3\2\2\28\u012a\3\2\2\2:\u0133"+
		"\3\2\2\2<\u0135\3\2\2\2>\u014e\3\2\2\2@\u015f\3\2\2\2B\u0166\3\2\2\2D"+
		"\u0191\3\2\2\2F\u0195\3\2\2\2HM\5\4\3\2IJ\7\7\2\2JL\5\4\3\2KI\3\2\2\2"+
		"LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PR\7\7\2\2QP\3\2\2\2"+
		"QR\3\2\2\2R\3\3\2\2\2SW\5\6\4\2TW\5$\23\2UW\5:\36\2VS\3\2\2\2VT\3\2\2"+
		"\2VU\3\2\2\2W\5\3\2\2\2X^\5\b\5\2Y^\5\n\6\2Z^\5\16\b\2[^\5\22\n\2\\^\5"+
		"\20\t\2]X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\7\3\2\2\2"+
		"_`\7\n\2\2`a\7\13\2\2ab\7\64\2\2b\t\3\2\2\2cd\7\r\2\2de\7\13\2\2ef\7\64"+
		"\2\2fg\5\f\7\2g\13\3\2\2\2hi\7 \2\2ij\7!\2\2jk\7\64\2\2k\r\3\2\2\2lm\7"+
		"\16\2\2mn\7\13\2\2no\7\64\2\2o\17\3\2\2\2pq\7\17\2\2qr\7\f\2\2rs\7\64"+
		"\2\2s\21\3\2\2\2tu\7\20\2\2uv\7\13\2\2vw\7\64\2\2w\23\3\2\2\2xy\7\n\2"+
		"\2yz\7\36\2\2z{\7\64\2\2{\u0082\7\4\2\2|}\7\64\2\2}~\5\26\f\2~\177\7\b"+
		"\2\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7\64\2\2\u0086\u0087\5\26\f\2\u0087\u0088\7\22\2\2\u0088\u0089"+
		"\5\30\r\2\u0089\25\3\2\2\2\u008a\u0092\7\27\2\2\u008b\u0092\7\30\2\2\u008c"+
		"\u0092\7\31\2\2\u008d\u008e\7\32\2\2\u008e\u008f\7\4\2\2\u008f\u0090\7"+
		"\63\2\2\u0090\u0092\7\5\2\2\u0091\u008a\3\2\2\2\u0091\u008b\3\2\2\2\u0091"+
		"\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0092\27\3\2\2\2\u0093\u0094\7\64\2"+
		"\2\u0094\u0095\7\23\2\2\u0095\u0096\7\25\2\2\u0096\u009b\7\4\2\2\u0097"+
		"\u0098\7\64\2\2\u0098\u009a\7\b\2\2\u0099\u0097\3\2\2\2\u009a\u009d\3"+
		"\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\7\64\2\2\u009f\u00c0\7\5\2\2\u00a0\u00a1\7"+
		"\64\2\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a8\7\4\2\2"+
		"\u00a4\u00a5\7\64\2\2\u00a5\u00a7\7\b\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ac\7\64\2\2\u00ac\u00ad\7\5\2\2\u00ad\u00ae\7"+
		"\26\2\2\u00ae\u00af\7\64\2\2\u00af\u00b4\7\4\2\2\u00b0\u00b1\7\64\2\2"+
		"\u00b1\u00b3\7\b\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00b8\7\64\2\2\u00b8\u00c0\7\5\2\2\u00b9\u00ba\7\64\2\2\u00ba\u00bb\7"+
		"\21\2\2\u00bb\u00bc\7\4\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7\5\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u0093\3\2\2\2\u00bf\u00a0\3\2\2\2\u00bf\u00b9\3\2"+
		"\2\2\u00c0\31\3\2\2\2\u00c1\u00c2\5\34\17\2\u00c2\33\3\2\2\2\u00c3\u00c8"+
		"\5\36\20\2\u00c4\u00c5\7\34\2\2\u00c5\u00c7\5\36\20\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\35\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00d0\5 \21\2\u00cc\u00cd\7\33\2"+
		"\2\u00cd\u00cf\5 \21\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\37\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d4\7\35\2\2\u00d4\u00d7\5\"\22\2\u00d5\u00d7\5\"\22\2\u00d6\u00d3"+
		"\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00de\7\64\2\2\u00d9"+
		"\u00da\7\4\2\2\u00da\u00db\5\32\16\2\u00db\u00dc\7\5\2\2\u00dc\u00de\3"+
		"\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de#\3\2\2\2\u00df\u00e6"+
		"\5&\24\2\u00e0\u00e6\5(\25\2\u00e1\u00e6\5*\26\2\u00e2\u00e6\5\64\33\2"+
		"\u00e3\u00e6\5\66\34\2\u00e4\u00e6\58\35\2\u00e5\u00df\3\2\2\2\u00e5\u00e0"+
		"\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6%\3\2\2\2\u00e7\u00e8\7\r\2\2\u00e8\u00e9\7\36\2\2"+
		"\u00e9\u00ea\7\64\2\2\u00ea\u00f8\5(\25\2\u00eb\u00ec\7\r\2\2\u00ec\u00ed"+
		"\7\36\2\2\u00ed\u00ee\7\64\2\2\u00ee\u00f2\5*\26\2\u00ef\u00f1\7\b\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\5*\26\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00e7\3\2\2\2\u00f7\u00eb\3\2\2\2\u00f8\'\3\2\2\2"+
		"\u00f9\u00fa\7 \2\2\u00fa\u00fb\7!\2\2\u00fb\u00fc\7\64\2\2\u00fc)\3\2"+
		"\2\2\u00fd\u00fe\5,\27\2\u00fe\u0104\5\26\f\2\u00ff\u0100\5\30\r\2\u0100"+
		"\u0101\7\b\2\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0106\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\5\30\r\2\u0108\u010f\3\2\2\2\u0109\u010a\5"+
		".\30\2\u010a\u010b\5\30\r\2\u010b\u010f\3\2\2\2\u010c\u010f\5\60\31\2"+
		"\u010d\u010f\5\62\32\2\u010e\u00fd\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010d\3\2\2\2\u010f+\3\2\2\2\u0110\u0111\7\"\2\2\u0111"+
		"\u0112\7#\2\2\u0112\u0113\7\64\2\2\u0113-\3\2\2\2\u0114\u0115\7\"\2\2"+
		"\u0115\u0116\7\22\2\2\u0116\u0117\7\64\2\2\u0117/\3\2\2\2\u0118\u0119"+
		"\7\16\2\2\u0119\u011a\7#\2\2\u011a\u011b\7\64\2\2\u011b\61\3\2\2\2\u011c"+
		"\u011d\7\16\2\2\u011d\u011e\7\22\2\2\u011e\u011f\7\64\2\2\u011f\u0120"+
		"\7\3\2\2\u0120\u0121\7\64\2\2\u0121\63\3\2\2\2\u0122\u0123\7\17\2\2\u0123"+
		"\u0124\7\37\2\2\u0124\u0125\7\64\2\2\u0125\65\3\2\2\2\u0126\u0127\7\16"+
		"\2\2\u0127\u0128\7\36\2\2\u0128\u0129\7\64\2\2\u0129\67\3\2\2\2\u012a"+
		"\u012b\7\17\2\2\u012b\u012c\7$\2\2\u012c\u012d\7.\2\2\u012d\u012e\7\64"+
		"\2\2\u012e9\3\2\2\2\u012f\u0134\5<\37\2\u0130\u0134\5> \2\u0131\u0134"+
		"\5@!\2\u0132\u0134\5B\"\2\u0133\u012f\3\2\2\2\u0133\u0130\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134;\3\2\2\2\u0135\u0136\7%\2\2\u0136"+
		"\u0137\7&\2\2\u0137\u0138\7\64\2\2\u0138\u0139\7\4\2\2\u0139\u013e\7\64"+
		"\2\2\u013a\u013b\7\b\2\2\u013b\u013d\7\64\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\5\2\2\u0142\u0143\7\'\2\2\u0143"+
		"\u0144\7\4\2\2\u0144\u0149\5\26\f\2\u0145\u0146\7\b\2\2\u0146\u0148\5"+
		"\26\f\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7\5"+
		"\2\2\u014d=\3\2\2\2\u014e\u014f\7)\2\2\u014f\u0150\7\64\2\2\u0150\u0151"+
		"\7*\2\2\u0151\u0152\7\64\2\2\u0152\u0153\7\t\2\2\u0153\u0158\5\26\f\2"+
		"\u0154\u0155\7\b\2\2\u0155\u0157\5\26\f\2\u0156\u0154\3\2\2\2\u0157\u015a"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015d\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015b\u015c\7+\2\2\u015c\u015e\5D#\2\u015d\u015b\3\2\2"+
		"\2\u015d\u015e\3\2\2\2\u015e?\3\2\2\2\u015f\u0160\7,\2\2\u0160\u0161\7"+
		".\2\2\u0161\u0164\7\64\2\2\u0162\u0163\7+\2\2\u0163\u0165\5D#\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165A\3\2\2\2\u0166\u0170\7-\2\2\u0167"+
		"\u0171\7\6\2\2\u0168\u016d\7\64\2\2\u0169\u016a\7\b\2\2\u016a\u016c\7"+
		"\64\2\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0167\3\2"+
		"\2\2\u0170\u0168\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7.\2\2\u0173"+
		"\u0176\7\64\2\2\u0174\u0175\7+\2\2\u0175\u0177\5D#\2\u0176\u0174\3\2\2"+
		"\2\u0176\u0177\3\2\2\2\u0177\u0184\3\2\2\2\u0178\u0179\7/\2\2\u0179\u017a"+
		"\7\60\2\2\u017a\u017b\7\64\2\2\u017b\u0181\t\2\2\2\u017c\u017d\7\b\2\2"+
		"\u017d\u017e\7\64\2\2\u017e\u0180\t\2\2\2\u017f\u017c\3\2\2\2\u0180\u0183"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0178\3\2\2\2\u0184\u0185\3\2\2\2\u0185C\3\2\2\2"+
		"\u0186\u0187\7\64\2\2\u0187\u0188\7\33\2\2\u0188\u0192\7\64\2\2\u0189"+
		"\u018a\7\64\2\2\u018a\u018b\7\34\2\2\u018b\u0192\7\64\2\2\u018c\u018d"+
		"\7\35\2\2\u018d\u0192\7\64\2\2\u018e\u018f\7\64\2\2\u018f\u0190\7\65\2"+
		"\2\u0190\u0192\7\64\2\2\u0191\u0186\3\2\2\2\u0191\u0189\3\2\2\2\u0191"+
		"\u018c\3\2\2\2\u0191\u018e\3\2\2\2\u0192E\3\2\2\2\u0193\u0194\7\33\2\2"+
		"\u0194\u0196\5D#\2\u0195\u0193\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u019a\7\34\2\2"+
		"\u019a\u019c\5D#\2\u019b\u0199\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019eG\3\2\2\2#MQV]\u0082\u0091\u009b\u00a8"+
		"\u00b4\u00bf\u00c8\u00d0\u00d6\u00dd\u00e5\u00f2\u00f7\u0104\u010e\u0133"+
		"\u013e\u0149\u0158\u015d\u0164\u016d\u0170\u0176\u0181\u0184\u0191\u0197"+
		"\u019d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}