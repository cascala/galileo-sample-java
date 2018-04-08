import galileo.exprhandler.ExprHandler;
import galileo.environment.Environment;
import galileo.expr.Expr;
import galileo.expr.Number;
import galileo.expr.Variable;

import scala.Option;

class ExprHandlerSample {
	public void run(){
		System.out.println( "Running " + getClass().getName() + ".run()"  );
		ExprHandler exprHandler = new ExprHandler();
		Expr input = new Variable( "a" );
		Environment environment = new Environment( Option.apply( null ) );
		String result  = exprHandler.eval( environment, input );
		System.out.println( result );
		environment.set( "a", new Number( 1 ) );
		System.out.println( exprHandler.eval( environment, input ) );
	}
}