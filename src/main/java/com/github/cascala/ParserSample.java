import galileo.parser.Parser;
import galileo.expr.Expr;

//import scala.util.parsing.combinator.JavaTokenParsers;
import scala.util.parsing.combinator.Parsers.ParseResult;
//import scala.collection.immutable.List;

class ParserSample {
	public void run(){
		System.out.println( "Running " + getClass().getName() + ".run()"  );
		Parser parser = new Parser();
		// Parse an array of expressions. Handle result
		String input = "1+2";
		ParseResult parseResult = parser.parse( input );
		//List<Expr> s = parseResult.get().toArrayList();
		System.out.println( parser.parse( input ) ); //.getClass() );
	}
}