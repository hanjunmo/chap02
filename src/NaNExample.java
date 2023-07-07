
public class NaNExample {
     /*
      * 1. +, -1
      * 2. Infinity, -Infinity
      * 3. NaN
      */
	
	
	public static void main(String[] args) {
		double d1 = Double.NaN;
		double d2 = 0.0/0.0;
		
		d1 = d1 * 100 + 200;
		d2 = d2 * 100 + 200;
		
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);

	}

}
