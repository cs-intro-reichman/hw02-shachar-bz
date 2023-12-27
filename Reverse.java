

/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
 
 
public class  Reverse {
	public static void main (String[] args){
		String word = args[0];
		String reverse_Order = "";
		// creating a new string with reverse_Order

		for (int i = word.length() - 1; i >= 0; i-- ){
			reverse_Order = reverse_Order + word.charAt(i);
		}
		System.out.println(reverse_Order);
		
		if (word.length() % 2 == 0) {
			char middle = word.charAt((word.length() / 2) - 1);
			System.out.println("The middle character is " + middle );
		}
		else {
			char middle = word.charAt(((word.length() + 1) / 2) -1);
			System.out.println("The middle character is " + middle );
		}
	}
} 
 