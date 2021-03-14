
/**
 * A class to hold the declarations and Expressions
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Amazing {
	// Put your data type declarations below. Here is an example
	int n = 4;
	float x = (float) 2.5;
	float y = (float) -1.5;
	int m = 18;

	// Put the code for your calculations in this method.
	void doCalculations() {
		y = x + n * y - (x + n) * y;
		m = m / n + m % n;
		x = 5 * x - n / 5;

	}// End of doCalculations

	public void displayValues() {
		// display the values of the variable
		System.out.println(y);
		System.out.println(m);
		System.out.println(x);
	}
}
