import galileo.expr.Number;

class NumberSample {
	public void run(){
		System.out.println( "Running " + getClass().getName() + ".run()"  );

		Number number = new Number( 3.1 );
		System.out.println( number.eval() );
	}
}