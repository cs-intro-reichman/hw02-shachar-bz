/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);

		String print = num + " is a perfect number since " + num + " = 1" ;
		// calculate the sum of the divisors
		int sum = 1;
		// every number divide by one, so we start counting from two and so on...
		for (int i = 2; i < num; i++){
			if (num % i == 0){
				sum = sum + i;
				print = print + " + " + i;
			}
		}
		// if the sum of the divisors is equal to the number - print perfect, else print not perfect
		if(sum == num){
			System.out.println(print);
		}
		else{
			System.out.println(num + " is not a perfect number ");
		}
		



	}
}
