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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, CREATE=13, DATABASE=14, DATABASES=15, ALTER=16, 
		DROP=17, SHOW=18, USE=19, CHECK=20, CONSTRAINT=21, PRIMARY=22, FOREIGN=23, 
		KEY=24, REFERENCES=25, INT=26, FLOAT=27, DATE=28, CHAR=29, AND=30, OR=31, 
		NOT=32, TABLE=33, TABLES=34, RENAME=35, TO=36, ADD=37, COLUMN=38, COLUMNS=39, 
		INSERT=40, INTO=41, VALUES=42, NULL=43, UPDATE=44, SET=45, WHERE=46, DELETE=47, 
		SELECT=48, FROM=49, ORDER=50, BY=51, ASC=52, DESC=53, NUM=54, ID=55, VALOR=56, 
		LOGICAL=57, COMMENTS=58, WS=59;
	public static final String[] tokenNames = {
		"<INVALID>", "'<='", "'<>'", "'''", "'('", "')'", "'*'", "'>='", "';'", 
		"'<'", "','", "'='", "'>'", "CREATE", "DATABASE", "DATABASES", "ALTER", 
		"DROP", "SHOW", "USE", "CHECK", "CONSTRAINT", "PRIMARY", "FOREIGN", "KEY", 
		"REFERENCES", "INT", "FLOAT", "DATE", "CHAR", "AND", "OR", "NOT", "TABLE", 
		"TABLES", "RENAME", "TO", "ADD", "COLUMN", "COLUMNS", "INSERT", "INTO", 
		"VALUES", "NULL", "UPDATE", "SET", "WHERE", "DELETE", "SELECT", "FROM", 
		"ORDER", "BY", "ASC", "DESC", "NUM", "ID", "VALOR", "LOGICAL", "COMMENTS", 
		"WS"
	};
	public static final int
		RULE_principal = 0, RULE_statements = 1, RULE_statementDatabase = 2, RULE_createDatabase = 3, 
		RULE_alterDatabase = 4, RULE_dropDatabase = 5, RULE_showDatabases = 6, 
		RULE_useDatabase = 7, RULE_createTable = 8, RULE_insertColumns = 9, RULE_constraint = 10, 
		RULE_tipoId = 11, RULE_cKey = 12, RULE_insertConstraint = 13, RULE_booleanExpression = 14, 
		RULE_or = 15, RULE_and = 16, RULE_opeRelacional = 17, RULE_relacional = 18, 
		RULE_not = 19, RULE_atom = 20, RULE_statementTable = 21, RULE_alterTable = 22, 
		RULE_renameTable = 23, RULE_actionTable = 24, RULE_addColumn = 25, RULE_addConstraint = 26, 
		RULE_dropColumn = 27, RULE_dropConstraint = 28, RULE_showTables = 29, 
		RULE_dropTable = 30, RULE_showColumnsFrom = 31, RULE_statementData = 32, 
		RULE_insert = 33, RULE_update = 34, RULE_setting = 35, RULE_delete = 36, 
		RULE_select = 37, RULE_condicion = 38, RULE_extra = 39;
	public static final String[] ruleNames = {
		"principal", "statements", "statementDatabase", "createDatabase", "alterDatabase", 
		"dropDatabase", "showDatabases", "useDatabase", "createTable", "insertColumns", 
		"constraint", "tipoId", "cKey", "insertConstraint", "booleanExpression", 
		"or", "and", "opeRelacional", "relacional", "not", "atom", "statementTable", 
		"alterTable", "renameTable", "actionTable", "addColumn", "addConstraint", 
		"dropColumn", "dropConstraint", "showTables", "dropTable", "showColumnsFrom", 
		"statementData", "insert", "update", "setting", "delete", "select", "condicion", 
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
			setState(80); statements();
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81); match(T__4);
					setState(82); statements();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(89);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(88); match(T__4);
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
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new StmtPrincipalDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91); statementDatabase();
				}
				break;
			case 2:
				_localctx = new StmtPrincipalTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92); statementTable();
				}
				break;
			case 3:
				_localctx = new StmtPrincipalDataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93); statementData();
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
			setState(101);
			switch (_input.LA(1)) {
			case CREATE:
				_localctx = new StmtCreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96); createDatabase();
				}
				break;
			case ALTER:
				_localctx = new StmtAlterDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97); alterDatabase();
				}
				break;
			case DROP:
				_localctx = new StmtDropDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98); dropDatabase();
				}
				break;
			case USE:
				_localctx = new StmtUseDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(99); useDatabase();
				}
				break;
			case SHOW:
				_localctx = new StmtShowDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(100); showDatabases();
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
			setState(103); match(CREATE);
			setState(104); match(DATABASE);
			setState(105); match(ID);
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
		public TerminalNode RENAME() { return getToken(GramaticaSQLParser.RENAME, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TerminalNode TO() { return getToken(GramaticaSQLParser.TO, 0); }
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
			setState(107); match(ALTER);
			setState(108); match(DATABASE);
			setState(109); match(ID);
			setState(110); match(RENAME);
			setState(111); match(TO);
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
		enterRule(_localctx, 10, RULE_dropDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(DROP);
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
		enterRule(_localctx, 12, RULE_showDatabases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(SHOW);
			setState(119); match(DATABASES);
			setState(120); match(ID);
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
		enterRule(_localctx, 14, RULE_useDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(USE);
			setState(123); match(DATABASE);
			setState(124); match(ID);
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
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public InsertColumnsContext insertColumns() {
			return getRuleContext(InsertColumnsContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(GramaticaSQLParser.CREATE, 0); }
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
		enterRule(_localctx, 16, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(CREATE);
			setState(127); match(TABLE);
			setState(128); match(ID);
			setState(129); match(T__8);
			setState(133);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(130); insertColumns();
				setState(131); constraint();
				}
			}

			setState(135); match(T__7);
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

	public static class InsertColumnsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public List<TipoIdContext> tipoId() {
			return getRuleContexts(TipoIdContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TipoIdContext tipoId(int i) {
			return getRuleContext(TipoIdContext.class,i);
		}
		public InsertColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterInsertColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitInsertColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitInsertColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertColumnsContext insertColumns() throws RecognitionException {
		InsertColumnsContext _localctx = new InsertColumnsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_insertColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(ID);
			setState(138); tipoId();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(139); match(T__2);
				setState(140); match(ID);
				setState(141); tipoId();
				}
				}
				setState(146);
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

	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT(int i) {
			return getToken(GramaticaSQLParser.CONSTRAINT, i);
		}
		public CKeyContext cKey(int i) {
			return getRuleContext(CKeyContext.class,i);
		}
		public List<TerminalNode> CONSTRAINT() { return getTokens(GramaticaSQLParser.CONSTRAINT); }
		public List<CKeyContext> cKey() {
			return getRuleContexts(CKeyContext.class);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(147); match(CONSTRAINT);
				setState(148); cKey();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(149); match(T__2);
					setState(150); match(CONSTRAINT);
					setState(151); cKey();
					}
					}
					setState(156);
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
		enterRule(_localctx, 22, RULE_tipoId);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TipoIdIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159); match(INT);
				}
				break;
			case FLOAT:
				_localctx = new TipoIdFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160); match(FLOAT);
				}
				break;
			case DATE:
				_localctx = new TipoIdDateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161); match(DATE);
				}
				break;
			case CHAR:
				_localctx = new TipoIdCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(162); match(CHAR);
				setState(163); match(T__8);
				setState(164); match(NUM);
				setState(165); match(T__7);
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
		public List<InsertConstraintContext> insertConstraint() {
			return getRuleContexts(InsertConstraintContext.class);
		}
		public InsertConstraintContext insertConstraint(int i) {
			return getRuleContext(InsertConstraintContext.class,i);
		}
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
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public InsertConstraintContext insertConstraint() {
			return getRuleContext(InsertConstraintContext.class,0);
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
		enterRule(_localctx, 24, RULE_cKey);
		try {
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new CKeyPKContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168); match(ID);
				setState(169); match(PRIMARY);
				setState(170); match(KEY);
				setState(171); match(T__8);
				setState(172); insertConstraint();
				setState(173); match(T__7);
				}
				break;
			case 2:
				_localctx = new CKeyFKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175); match(ID);
				setState(176); match(FOREIGN);
				setState(177); match(KEY);
				setState(178); match(T__8);
				setState(179); insertConstraint();
				setState(180); match(T__7);
				setState(181); match(REFERENCES);
				setState(182); match(ID);
				setState(183); match(T__8);
				setState(184); insertConstraint();
				setState(185); match(T__7);
				}
				break;
			case 3:
				_localctx = new CKeyCHKContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(187); match(ID);
				setState(188); match(CHECK);
				setState(189); match(T__8);
				setState(190); atom();
				setState(191); match(T__7);
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

	public static class InsertConstraintContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public InsertConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterInsertConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitInsertConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitInsertConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertConstraintContext insertConstraint() throws RecognitionException {
		InsertConstraintContext _localctx = new InsertConstraintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_insertConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(ID);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(196); match(T__2);
				setState(197); match(ID);
				}
				}
				setState(202);
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
		enterRule(_localctx, 28, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); or();
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
		enterRule(_localctx, 30, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); and();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(206); match(OR);
				setState(207); and();
				}
				}
				setState(212);
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
		enterRule(_localctx, 32, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); not();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(214); match(AND);
				setState(215); not();
				}
				}
				setState(220);
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

	public static class OpeRelacionalContext extends ParserRuleContext {
		public OpeRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opeRelacional; }
	 
		public OpeRelacionalContext() { }
		public void copyFrom(OpeRelacionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelMenorIgualContext extends OpeRelacionalContext {
		public RelMenorIgualContext(OpeRelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterRelMenorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitRelMenorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRelMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelDiferentesContext extends OpeRelacionalContext {
		public RelDiferentesContext(OpeRelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterRelDiferentes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitRelDiferentes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRelDiferentes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelMayorContext extends OpeRelacionalContext {
		public RelMayorContext(OpeRelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterRelMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitRelMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRelMayor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelMenorContext extends OpeRelacionalContext {
		public RelMenorContext(OpeRelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterRelMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitRelMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRelMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelMayorIgualContext extends OpeRelacionalContext {
		public RelMayorIgualContext(OpeRelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterRelMayorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitRelMayorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRelMayorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelIgualContext extends OpeRelacionalContext {
		public RelIgualContext(OpeRelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterRelIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitRelIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRelIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpeRelacionalContext opeRelacional() throws RecognitionException {
		OpeRelacionalContext _localctx = new OpeRelacionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_opeRelacional);
		try {
			setState(227);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new RelMenorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221); match(T__3);
				}
				break;
			case T__11:
				_localctx = new RelMenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222); match(T__11);
				}
				break;
			case T__0:
				_localctx = new RelMayorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223); match(T__0);
				}
				break;
			case T__5:
				_localctx = new RelMayorIgualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224); match(T__5);
				}
				break;
			case T__10:
				_localctx = new RelDiferentesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(225); match(T__10);
				}
				break;
			case T__1:
				_localctx = new RelIgualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(226); match(T__1);
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

	public static class RelacionalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GramaticaSQLParser.NUM, 0); }
		public TerminalNode VALOR() { return getToken(GramaticaSQLParser.VALOR, 0); }
		public OpeRelacionalContext opeRelacional() {
			return getRuleContext(OpeRelacionalContext.class,0);
		}
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relacional);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); match(ID);
				setState(230); opeRelacional();
				setState(231); match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); match(ID);
				setState(234); opeRelacional();
				setState(235); match(T__9);
				setState(236); match(VALOR);
				setState(237); match(T__9);
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
		enterRule(_localctx, 38, RULE_not);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotNotAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241); match(NOT);
				setState(242); atom();
				}
				break;
			case T__8:
				_localctx = new NotAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243); atom();
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(T__8);
			setState(247); booleanExpression();
			setState(248); match(T__7);
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
	public static class StmtCreateTableContext extends StatementTableContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public StmtCreateTableContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtCreateTable(this);
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
		enterRule(_localctx, 42, RULE_statementTable);
		try {
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new StmtCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250); createTable();
				}
				break;
			case 2:
				_localctx = new StmtAlterTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251); alterTable();
				}
				break;
			case 3:
				_localctx = new StmtRenameTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252); renameTable();
				}
				break;
			case 4:
				_localctx = new StmtActionTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(253); actionTable();
				}
				break;
			case 5:
				_localctx = new StmtShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(254); showTables();
				}
				break;
			case 6:
				_localctx = new StmtDropTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(255); dropTable();
				}
				break;
			case 7:
				_localctx = new StmtShowColsFromContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(256); showColumnsFrom();
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
		enterRule(_localctx, 44, RULE_alterTable);
		int _la;
		try {
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new AlterTableRenameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259); match(ALTER);
				setState(260); match(TABLE);
				setState(261); match(ID);
				setState(262); renameTable();
				}
				break;
			case 2:
				_localctx = new AlterTableActionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263); match(ALTER);
				setState(264); match(TABLE);
				setState(265); match(ID);
				setState(266); actionTable();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(267); match(T__2);
					setState(268); actionTable();
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		enterRule(_localctx, 46, RULE_renameTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(RENAME);
			setState(277); match(TO);
			setState(278); match(ID);
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
		enterRule(_localctx, 48, RULE_actionTable);
		try {
			int _alt;
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ActTableAddColContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280); addColumn();
				setState(281); tipoId();
				setState(282); cKey();
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(283); match(T__2);
						setState(284); cKey();
						}
						} 
					}
					setState(289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new ActTableAddCnstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290); addConstraint();
				setState(291); cKey();
				}
				break;
			case 3:
				_localctx = new ActTableDropColContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(293); dropColumn();
				}
				break;
			case 4:
				_localctx = new ActTableDropCnstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(294); dropConstraint();
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
		enterRule(_localctx, 50, RULE_addColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(ADD);
			setState(298); match(COLUMN);
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
		enterRule(_localctx, 52, RULE_addConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(ADD);
			setState(302); match(CONSTRAINT);
			setState(303); match(ID);
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
		enterRule(_localctx, 54, RULE_dropColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(DROP);
			setState(306); match(COLUMN);
			setState(307); match(ID);
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
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(GramaticaSQLParser.CONSTRAINT, 0); }
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
		enterRule(_localctx, 56, RULE_dropConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(DROP);
			setState(310); match(CONSTRAINT);
			setState(311); match(ID);
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
		enterRule(_localctx, 58, RULE_showTables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(SHOW);
			setState(314); match(TABLES);
			setState(315); match(ID);
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
		enterRule(_localctx, 60, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); match(DROP);
			setState(318); match(TABLE);
			setState(319); match(ID);
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
		enterRule(_localctx, 62, RULE_showColumnsFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(SHOW);
			setState(322); match(COLUMNS);
			setState(323); match(FROM);
			setState(324); match(ID);
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
		enterRule(_localctx, 64, RULE_statementData);
		try {
			setState(330);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); insert();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(327); update();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(328); delete();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(329); select();
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
		enterRule(_localctx, 66, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(INSERT);
			setState(333); match(INTO);
			setState(334); match(ID);
			setState(335); match(T__8);
			setState(336); match(ID);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(337); match(T__2);
				setState(338); match(ID);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344); match(T__7);
			setState(345); match(VALUES);
			setState(346); match(T__8);
			setState(347); tipoId();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(348); match(T__2);
				setState(349); tipoId();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355); match(T__7);
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
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode UPDATE() { return getToken(GramaticaSQLParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(GramaticaSQLParser.SET, 0); }
		public SettingContext setting() {
			return getRuleContext(SettingContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); match(UPDATE);
			setState(358); match(ID);
			setState(359); match(SET);
			setState(360); setting();
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

	public static class SettingContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
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
		public SettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterSetting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitSetting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitSetting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingContext setting() throws RecognitionException {
		SettingContext _localctx = new SettingContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_setting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); match(ID);
			setState(363); match(T__1);
			setState(364); tipoId();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(365); match(T__2);
				setState(366); match(ID);
				setState(367); match(T__1);
				setState(368); tipoId();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(374); match(WHERE);
				setState(375); condicion();
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
		enterRule(_localctx, 72, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(DELETE);
			setState(379); match(FROM);
			setState(380); match(ID);
			setState(383);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(381); match(WHERE);
				setState(382); condicion();
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
		enterRule(_localctx, 74, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(SELECT);
			setState(395);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(386); match(T__6);
				}
				break;
			case ID:
				{
				setState(387); match(ID);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(388); match(T__2);
					setState(389); match(ID);
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(397); match(FROM);
			setState(398); match(ID);
			setState(401);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(399); match(WHERE);
				setState(400); condicion();
				}
			}

			setState(415);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(403); match(ORDER);
				setState(404); match(BY);
				setState(405); match(ID);
				setState(406);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(407); match(T__2);
					setState(408); match(ID);
					setState(409);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(414);
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
		enterRule(_localctx, 76, RULE_condicion);
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417); match(ID);
				setState(418); match(AND);
				setState(419); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420); match(ID);
				setState(421); match(OR);
				setState(422); match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423); match(NOT);
				setState(424); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425); match(ID);
				setState(426); match(LOGICAL);
				setState(427); match(ID);
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
		enterRule(_localctx, 78, RULE_extra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(430); match(AND);
				setState(431); condicion();
				}
				}
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND );
			setState(438); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(436); match(OR);
				setState(437); condicion();
				}
				}
				setState(440); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u01bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\7"+
		"\2V\n\2\f\2\16\2Y\13\2\3\2\5\2\\\n\2\3\3\3\3\3\3\5\3a\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\4h\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0088\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0091\n\13\f\13\16"+
		"\13\u0094\13\13\3\f\3\f\3\f\3\f\3\f\7\f\u009b\n\f\f\f\16\f\u009e\13\f"+
		"\5\f\u00a0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c4\n\16\3\17\3\17\3\17"+
		"\7\17\u00c9\n\17\f\17\16\17\u00cc\13\17\3\20\3\20\3\21\3\21\3\21\7\21"+
		"\u00d3\n\21\f\21\16\21\u00d6\13\21\3\22\3\22\3\22\7\22\u00db\n\22\f\22"+
		"\16\22\u00de\13\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e6\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f2\n\24\3\25\3\25"+
		"\3\25\5\25\u00f7\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0104\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u0110\n\30\f\30\16\30\u0113\13\30\5\30\u0115\n\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u0120\n\32\f\32\16\32\u0123\13\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u012a\n\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u014d\n\"\3#\3#\3#\3#"+
		"\3#\3#\3#\7#\u0156\n#\f#\16#\u0159\13#\3#\3#\3#\3#\3#\3#\7#\u0161\n#\f"+
		"#\16#\u0164\13#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\7%\u0174\n%"+
		"\f%\16%\u0177\13%\3%\3%\5%\u017b\n%\3&\3&\3&\3&\3&\5&\u0182\n&\3\'\3\'"+
		"\3\'\3\'\3\'\7\'\u0189\n\'\f\'\16\'\u018c\13\'\5\'\u018e\n\'\3\'\3\'\3"+
		"\'\3\'\5\'\u0194\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u019d\n\'\f\'\16"+
		"\'\u01a0\13\'\5\'\u01a2\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01af"+
		"\n(\3)\3)\6)\u01b3\n)\r)\16)\u01b4\3)\3)\6)\u01b9\n)\r)\16)\u01ba\3)\2"+
		"\2*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNP\2\3\3\2\66\67\u01cd\2R\3\2\2\2\4`\3\2\2\2\6g\3\2\2\2\bi\3\2\2"+
		"\2\nm\3\2\2\2\ft\3\2\2\2\16x\3\2\2\2\20|\3\2\2\2\22\u0080\3\2\2\2\24\u008b"+
		"\3\2\2\2\26\u009f\3\2\2\2\30\u00a8\3\2\2\2\32\u00c3\3\2\2\2\34\u00c5\3"+
		"\2\2\2\36\u00cd\3\2\2\2 \u00cf\3\2\2\2\"\u00d7\3\2\2\2$\u00e5\3\2\2\2"+
		"&\u00f1\3\2\2\2(\u00f6\3\2\2\2*\u00f8\3\2\2\2,\u0103\3\2\2\2.\u0114\3"+
		"\2\2\2\60\u0116\3\2\2\2\62\u0129\3\2\2\2\64\u012b\3\2\2\2\66\u012f\3\2"+
		"\2\28\u0133\3\2\2\2:\u0137\3\2\2\2<\u013b\3\2\2\2>\u013f\3\2\2\2@\u0143"+
		"\3\2\2\2B\u014c\3\2\2\2D\u014e\3\2\2\2F\u0167\3\2\2\2H\u016c\3\2\2\2J"+
		"\u017c\3\2\2\2L\u0183\3\2\2\2N\u01ae\3\2\2\2P\u01b2\3\2\2\2RW\5\4\3\2"+
		"ST\7\n\2\2TV\5\4\3\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2"+
		"YW\3\2\2\2Z\\\7\n\2\2[Z\3\2\2\2[\\\3\2\2\2\\\3\3\2\2\2]a\5\6\4\2^a\5,"+
		"\27\2_a\5B\"\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\5\3\2\2\2bh\5\b\5\2ch\5"+
		"\n\6\2dh\5\f\7\2eh\5\20\t\2fh\5\16\b\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2g"+
		"e\3\2\2\2gf\3\2\2\2h\7\3\2\2\2ij\7\17\2\2jk\7\20\2\2kl\79\2\2l\t\3\2\2"+
		"\2mn\7\22\2\2no\7\20\2\2op\79\2\2pq\7%\2\2qr\7&\2\2rs\79\2\2s\13\3\2\2"+
		"\2tu\7\23\2\2uv\7\20\2\2vw\79\2\2w\r\3\2\2\2xy\7\24\2\2yz\7\21\2\2z{\7"+
		"9\2\2{\17\3\2\2\2|}\7\25\2\2}~\7\20\2\2~\177\79\2\2\177\21\3\2\2\2\u0080"+
		"\u0081\7\17\2\2\u0081\u0082\7#\2\2\u0082\u0083\79\2\2\u0083\u0087\7\6"+
		"\2\2\u0084\u0085\5\24\13\2\u0085\u0086\5\26\f\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0084\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\7"+
		"\2\2\u008a\23\3\2\2\2\u008b\u008c\79\2\2\u008c\u0092\5\30\r\2\u008d\u008e"+
		"\7\f\2\2\u008e\u008f\79\2\2\u008f\u0091\5\30\r\2\u0090\u008d\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\25\3\2\2"+
		"\2\u0094\u0092\3\2\2\2\u0095\u0096\7\27\2\2\u0096\u009c\5\32\16\2\u0097"+
		"\u0098\7\f\2\2\u0098\u0099\7\27\2\2\u0099\u009b\5\32\16\2\u009a\u0097"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u0095\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\27\3\2\2\2\u00a1\u00a9\7\34\2\2\u00a2\u00a9\7\35\2\2\u00a3"+
		"\u00a9\7\36\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\7"+
		"8\2\2\u00a7\u00a9\7\7\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8"+
		"\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\79\2\2"+
		"\u00ab\u00ac\7\30\2\2\u00ac\u00ad\7\32\2\2\u00ad\u00ae\7\6\2\2\u00ae\u00af"+
		"\5\34\17\2\u00af\u00b0\7\7\2\2\u00b0\u00c4\3\2\2\2\u00b1\u00b2\79\2\2"+
		"\u00b2\u00b3\7\31\2\2\u00b3\u00b4\7\32\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6"+
		"\5\34\17\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\7\33\2\2\u00b8\u00b9\79\2\2"+
		"\u00b9\u00ba\7\6\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\7\7\2\2\u00bc\u00c4"+
		"\3\2\2\2\u00bd\u00be\79\2\2\u00be\u00bf\7\26\2\2\u00bf\u00c0\7\6\2\2\u00c0"+
		"\u00c1\5*\26\2\u00c1\u00c2\7\7\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00aa\3\2"+
		"\2\2\u00c3\u00b1\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c4\33\3\2\2\2\u00c5\u00ca"+
		"\79\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c9\79\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\35\3\2\2"+
		"\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\5 \21\2\u00ce\37\3\2\2\2\u00cf\u00d4"+
		"\5\"\22\2\u00d0\u00d1\7!\2\2\u00d1\u00d3\5\"\22\2\u00d2\u00d0\3\2\2\2"+
		"\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5!\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dc\5(\25\2\u00d8\u00d9\7 \2\2\u00d9"+
		"\u00db\5(\25\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd#\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e6"+
		"\7\13\2\2\u00e0\u00e6\7\3\2\2\u00e1\u00e6\7\16\2\2\u00e2\u00e6\7\t\2\2"+
		"\u00e3\u00e6\7\4\2\2\u00e4\u00e6\7\r\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e0"+
		"\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6%\3\2\2\2\u00e7\u00e8\79\2\2\u00e8\u00e9\5$\23\2\u00e9"+
		"\u00ea\78\2\2\u00ea\u00f2\3\2\2\2\u00eb\u00ec\79\2\2\u00ec\u00ed\5$\23"+
		"\2\u00ed\u00ee\7\5\2\2\u00ee\u00ef\7:\2\2\u00ef\u00f0\7\5\2\2\u00f0\u00f2"+
		"\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f2\'\3\2\2\2\u00f3"+
		"\u00f4\7\"\2\2\u00f4\u00f7\5*\26\2\u00f5\u00f7\5*\26\2\u00f6\u00f3\3\2"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7)\3\2\2\2\u00f8\u00f9\7\6\2\2\u00f9\u00fa"+
		"\5\36\20\2\u00fa\u00fb\7\7\2\2\u00fb+\3\2\2\2\u00fc\u0104\5\22\n\2\u00fd"+
		"\u0104\5.\30\2\u00fe\u0104\5\60\31\2\u00ff\u0104\5\62\32\2\u0100\u0104"+
		"\5<\37\2\u0101\u0104\5> \2\u0102\u0104\5@!\2\u0103\u00fc\3\2\2\2\u0103"+
		"\u00fd\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104-\3\2\2\2\u0105\u0106"+
		"\7\22\2\2\u0106\u0107\7#\2\2\u0107\u0108\79\2\2\u0108\u0115\5\60\31\2"+
		"\u0109\u010a\7\22\2\2\u010a\u010b\7#\2\2\u010b\u010c\79\2\2\u010c\u0111"+
		"\5\62\32\2\u010d\u010e\7\f\2\2\u010e\u0110\5\62\32\2\u010f\u010d\3\2\2"+
		"\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0105\3\2\2\2\u0114\u0109\3\2\2\2\u0115"+
		"/\3\2\2\2\u0116\u0117\7%\2\2\u0117\u0118\7&\2\2\u0118\u0119\79\2\2\u0119"+
		"\61\3\2\2\2\u011a\u011b\5\64\33\2\u011b\u011c\5\30\r\2\u011c\u0121\5\32"+
		"\16\2\u011d\u011e\7\f\2\2\u011e\u0120\5\32\16\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u012a\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0125\5\66\34\2\u0125\u0126\5\32\16\2\u0126"+
		"\u012a\3\2\2\2\u0127\u012a\58\35\2\u0128\u012a\5:\36\2\u0129\u011a\3\2"+
		"\2\2\u0129\u0124\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"\63\3\2\2\2\u012b\u012c\7\'\2\2\u012c\u012d\7(\2\2\u012d\u012e\79\2\2"+
		"\u012e\65\3\2\2\2\u012f\u0130\7\'\2\2\u0130\u0131\7\27\2\2\u0131\u0132"+
		"\79\2\2\u0132\67\3\2\2\2\u0133\u0134\7\23\2\2\u0134\u0135\7(\2\2\u0135"+
		"\u0136\79\2\2\u01369\3\2\2\2\u0137\u0138\7\23\2\2\u0138\u0139\7\27\2\2"+
		"\u0139\u013a\79\2\2\u013a;\3\2\2\2\u013b\u013c\7\24\2\2\u013c\u013d\7"+
		"$\2\2\u013d\u013e\79\2\2\u013e=\3\2\2\2\u013f\u0140\7\23\2\2\u0140\u0141"+
		"\7#\2\2\u0141\u0142\79\2\2\u0142?\3\2\2\2\u0143\u0144\7\24\2\2\u0144\u0145"+
		"\7)\2\2\u0145\u0146\7\63\2\2\u0146\u0147\79\2\2\u0147A\3\2\2\2\u0148\u014d"+
		"\5D#\2\u0149\u014d\5F$\2\u014a\u014d\5J&\2\u014b\u014d\5L\'\2\u014c\u0148"+
		"\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d"+
		"C\3\2\2\2\u014e\u014f\7*\2\2\u014f\u0150\7+\2\2\u0150\u0151\79\2\2\u0151"+
		"\u0152\7\6\2\2\u0152\u0157\79\2\2\u0153\u0154\7\f\2\2\u0154\u0156\79\2"+
		"\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\7\2\2\u015b"+
		"\u015c\7,\2\2\u015c\u015d\7\6\2\2\u015d\u0162\5\30\r\2\u015e\u015f\7\f"+
		"\2\2\u015f\u0161\5\30\r\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0165\u0166\7\7\2\2\u0166E\3\2\2\2\u0167\u0168\7.\2\2\u0168\u0169"+
		"\79\2\2\u0169\u016a\7/\2\2\u016a\u016b\5H%\2\u016bG\3\2\2\2\u016c\u016d"+
		"\79\2\2\u016d\u016e\7\r\2\2\u016e\u0175\5\30\r\2\u016f\u0170\7\f\2\2\u0170"+
		"\u0171\79\2\2\u0171\u0172\7\r\2\2\u0172\u0174\5\30\r\2\u0173\u016f\3\2"+
		"\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u017a\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7\60\2\2\u0179\u017b\5"+
		"N(\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017bI\3\2\2\2\u017c\u017d"+
		"\7\61\2\2\u017d\u017e\7\63\2\2\u017e\u0181\79\2\2\u017f\u0180\7\60\2\2"+
		"\u0180\u0182\5N(\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182K\3\2"+
		"\2\2\u0183\u018d\7\62\2\2\u0184\u018e\7\b\2\2\u0185\u018a\79\2\2\u0186"+
		"\u0187\7\f\2\2\u0187\u0189\79\2\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u0184\3\2\2\2\u018d\u0185\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0190\7\63\2\2\u0190\u0193\79\2\2\u0191\u0192\7\60\2\2\u0192"+
		"\u0194\5N(\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u01a1\3\2\2"+
		"\2\u0195\u0196\7\64\2\2\u0196\u0197\7\65\2\2\u0197\u0198\79\2\2\u0198"+
		"\u019e\t\2\2\2\u0199\u019a\7\f\2\2\u019a\u019b\79\2\2\u019b\u019d\t\2"+
		"\2\2\u019c\u0199\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u0195\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2M\3\2\2\2\u01a3\u01a4\79\2\2\u01a4\u01a5"+
		"\7 \2\2\u01a5\u01af\79\2\2\u01a6\u01a7\79\2\2\u01a7\u01a8\7!\2\2\u01a8"+
		"\u01af\79\2\2\u01a9\u01aa\7\"\2\2\u01aa\u01af\79\2\2\u01ab\u01ac\79\2"+
		"\2\u01ac\u01ad\7;\2\2\u01ad\u01af\79\2\2\u01ae\u01a3\3\2\2\2\u01ae\u01a6"+
		"\3\2\2\2\u01ae\u01a9\3\2\2\2\u01ae\u01ab\3\2\2\2\u01afO\3\2\2\2\u01b0"+
		"\u01b1\7 \2\2\u01b1\u01b3\5N(\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\3\2\2"+
		"\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b7"+
		"\7!\2\2\u01b7\u01b9\5N(\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbQ\3\2\2\2%W[`g\u0087\u0092\u009c"+
		"\u009f\u00a8\u00c3\u00ca\u00d4\u00dc\u00e5\u00f1\u00f6\u0103\u0111\u0114"+
		"\u0121\u0129\u014c\u0157\u0162\u0175\u017a\u0181\u018a\u018d\u0193\u019e"+
		"\u01a1\u01ae\u01b4\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}