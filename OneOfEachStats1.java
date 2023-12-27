/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
	
		int twoChildren = 0;
		int threeChildren = 0;
		int fourOrMoreChildren = 0;
		// count the number of born children 
		double count = 0;
		

		for(int i = 0; i < T; i++){
			boolean boy = false;
			boolean girl = false;
			int numOfChildren = 0;
			while (girl == false || boy == false) {
				// random a number and decides weather its a boy or a girl
				double random_human = Math.random();
				// add human that were born
				count += 1;
				
				if (random_human >= 0.5){
					boy = true;
					numOfChildren += 1;
				}
				else{
					girl = true;
					numOfChildren+= 1;
				}
			}
			// add 1 to the correct group of children
			if(numOfChildren == 2){
				twoChildren += 1;
			}
			else if (numOfChildren == 3){
				threeChildren += 1;
			}
			else{
				fourOrMoreChildren += 1;
			}
		}
		// print the average children in family
		
		double average = count / T;
		
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
		
		// find  what is the most commom number of children in familys and prints them
		int max = (Math.max(twoChildren, threeChildren));
		max = Math.max(max, fourOrMoreChildren);

		if(max == twoChildren){
			System.out.println("The most common number of children is 2.");
		}
		else if(max == threeChildren){
			System.out.println("The most common number of children is 3.");
		}
		else{
			System.out.println("The most common number of children is 4 or more");
		}
	}
}

