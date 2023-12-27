/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int num1 = (int) (Math.random() * 10);
		// print first number
		System.out.print(num1 + " ");

		boolean non_decreasing = false;
		
		while (non_decreasing == false){
			// compare between two number
			int num2 = (int) (Math.random() * 10);
			if(num1 <= num2){
				System.out.print(num2 + " ");
				num1 = num2;
			}
			else{
				non_decreasing = true;
			}
			
		}
	}
}
