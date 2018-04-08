import galileo.linalg.DenseMatrix;
import galileo.expr.Expr;
import galileo.expr.Number;

import java.util.ArrayList;

import scala.collection.JavaConverters;

class LinAlgSample {
	public void run(){
		System.out.println( "Running " + getClass().getName() + ".run()"  );
		// ArrayList constructor syntax is not very conducive to terse implementations
		//DenseMatrix m = new DenseMatrix( [
		ArrayList row = new ArrayList<Expr>(); //[ new Number( 1 ); new Number( 2 ); ];	
		row.add( new Number( 1 ) );
		row.add( new Number( 2 ) );
		ArrayList matrix = new ArrayList<ArrayList<Expr>>();
		matrix.add( row );
		//               asScalaIterableConverter
		//JavaConverters.asScalaIterableConverter( matrix.iterator() ); //.asScala();
		//DenseMatrix denseMatrix = new DenseMatrix( matrix );
	}
}