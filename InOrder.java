/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int num1 = (int) (Math.random() * 10);
		//convert int to string
		String answer = Integer.toString(num1);     

		// check if there will be another numbers in the program
		int random = (int) (Math.random() * 10);
		boolean non_decreasing = false;

		int num2 = (int) (Math.random() * 10);
		
		while (non_decreasing == false){
			if (num2 == num1 - 1){
				non_decreasing = true;
			}
			else {
				// add number that meet the conditions
				answer += " " + num2;
				num1 = num2;
			}
			// create another number between 0-10
			num2 = (int) (Math.random() * 10);
			// random a number and check if the while loop will continue to work
			random = (int) (Math.random() * 10); 			
		}

		System.out.println(answer);
	}
}
