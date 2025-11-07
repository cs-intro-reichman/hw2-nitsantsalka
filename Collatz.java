// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt (args[0]);
		String mode = args[1];
		int num = 0;
		int sum = 1;
		int i = 1;
		if (mode.equals("v")){	
			while(i <= seed){
				System.out.print(i + " ");
				if (i == 1){
					num = (i * 3) + 1;
					System.out.print(num + " ");
					sum ++ ;
				}
				while (num != 1){
					if (num % 2 == 0){
						num = num / 2;
					}
					else {
						num = (num * 3) + 1;
					}
					System.out.print(num + " ");
					sum ++ ;
				}
				System.out.println("(" + sum + ")");
				i++ ;
				sum = 1;
				num = i;
			}
		}
		else if(mode.equals("c"))
		{
			while(i <= seed){
				if (i == 1){
					num = (i * 3) + 1;
					sum ++ ;
				}
				while (num != 1){
					if (num % 2 == 0){
						num = num / 2;
					}
					else {
						num = (num * 3) + 1;
					}
					sum ++ ;
				}
				i++ ;
				sum = 1;
				num = i;
			}
		}
		System.out.print("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
		
}
