import galileo.exprhandler.ExprHandler;
import galileo.environment.Environment;
import galileo.expr.Expr;
import galileo.expr.Number;

import scala.Option;

class ExprHandlerSample {
	public void run(){
		System.out.println( "Running " + getClass().getName() + ".run()"  );
		ExprHandler exprHandler = new ExprHandler();
		Expr input = new Number( 3.0 );
		Option<Environment> environment = Option.apply(null);
		String result  = exprHandler.eval( environment.get(), input );
		System.out.println( result );
	}
}