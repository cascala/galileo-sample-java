import galileo.expr.Number;
import galileo.expr.Variable;
import galileo.linalg.DenseMatrix;

import scala.collection.immutable.$colon$colon;
import scala.collection.immutable.List$;
import scala.collection.immutable.List;

class LinAlgSample {
	// Helper that creates a scala List
	public static<T> List<T> list(T ... ts ) {
		List<T> result = List$.MODULE$.empty();
        for(int i = ts.length; i > 0; i--) {
            result = new $colon$colon(ts[i - 1], result);
        }
        return result;
	}

	public void run(){
		System.out.println( "Running " + getClass().getName() + ".run()"  );
		
		DenseMatrix matrixA = new DenseMatrix( 
				list( 
					list( new Variable( "a" ), new Number( 1 ) ),
					list( new Number( 2 ), new Variable( "b" ) )
				) 
			); 
		DenseMatrix rhsB = new DenseMatrix( 
				list( 
					list( new Variable( "c" ) ),
					list( new Number( 3 ) )
				) 
			); 

		// Demonstration of the overloaded operator '*'
		// In Scala, this is just matrixA * rhsB
		System.out.println( matrixA.$times( rhsB ) );

		// Demonstration of the overloaded operator '+'
		// In Scala, this is just matrixA + matrixA
		System.out.println( matrixA.$plus( matrixA ) );
		System.out.println( matrixA.$plus( matrixA ).eval() );
				
		// Solve
		System.out.println( matrixA.solve( rhsB ) );
	}
}