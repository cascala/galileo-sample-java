//import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main( String[] args ) {
		ArrayList<SampleInterface> samples = new ArrayList<SampleInterface>();
		samples.add( new ExprHandlerSample() );
		samples.add( new ExprSample() );
		samples.add( new LinAlgSample() );
		samples.add( new NumberSample() );
		samples.add( new ParserSample() );
		for( SampleInterface sample : samples ) {
			System.out.println( "Running " + sample.getClass().getName() + ".run()"  );
			sample.run();
		}
	}
}