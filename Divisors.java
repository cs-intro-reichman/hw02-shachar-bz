/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		// loop which prints the divisors of num
		for (int i = 1; i < num + 1; i++ ){
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
