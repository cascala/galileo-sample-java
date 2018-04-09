import galileo.expr.Number;

class NumberSample implements SampleInterface {
	public void run(){
		Number number = new Number( 3.1 );
		System.out.println( number.eval() );
	}
}