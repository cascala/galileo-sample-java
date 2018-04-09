import galileo.environment.Environment;
import galileo.expr.Expr;
import galileo.expr.Number;
import galileo.expr.Variable;
import galileo.exprhandler.ExprHandler;

import scala.Option;

class ExprHandlerSample implements SampleInterface {
	public void run(){
		ExprHandler exprHandler = new ExprHandler();
		Expr input = new Variable( "a" );
		Environment environment = new Environment( Option.apply( null ) );
		String result  = exprHandler.eval( environment, input );
		System.out.println( result );
		environment.set( "a", new Number( 1 ) );
		System.out.println( exprHandler.eval( environment, input ) );
	}
}