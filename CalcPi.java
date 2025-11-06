// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numOfTerms = Integer.parseInt (args[0]);
		int denominator = 1;
		double Pi = 0;
		int i = 1;
		while(i <= numOfTerms){
			if (i%2 == 1){
				Pi = Pi + (1 / (double)denominator);
			}
			else {
				Pi = Pi - (1 / (double)denominator);
			}
			denominator = denominator + 2;
			i++;
		}
		Pi = Pi * 4.0;
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated:" + " " + " "+ " " + " " + " " + Pi);
	}
}
