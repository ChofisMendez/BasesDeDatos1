
// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SQLVisitor {
	
	private ANTLRInputStream input;
	private GramaticaSQLLexer lexer;
	private CommonTokenStream tokens;
	private GramaticaSQLParser parser;
	
    public void verificar(String entrada) {
        
        input = new ANTLRInputStream(entrada);
        lexer = new GramaticaSQLLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new GramaticaSQLParser(tokens);
        LogicaSQL logica = new LogicaSQL();
        logica.visit(parser.statementDatabase());
        //ParseTree tree = parser.createDatabase();
        //System.out.println(tree.toStringTree(parser));
    }
}