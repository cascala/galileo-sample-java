import galileo.exprhandler.ExprHandler;
import galileo.environment.Environment;
import galileo.expr.Expr;
import galileo.expr.Number;
import galileo.expr.Variable;

import scala.Option;

class ExprSample {
	public void run() {
		Expr a = new Variable( "a" );
		Option<Environment> environment = Option.apply( new Environment( Option.apply( null ) ) );
		System.out.println( a.visit( environment ) );
		Expr n1 = new Number( 1 );
		environment.get().set( "a", n1 );
		System.out.println( a.visit( environment ) );
	}
}