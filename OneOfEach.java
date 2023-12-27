
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy = false;
		boolean girl = false;
		int numOfChildren = 0;
		
		// quit loop when the parents make boy and girl
		while(girl == false || boy == false) {
			double random_human = Math.random(); 
			if (random_human >= 0.5){
				boy = true;
				numOfChildren += 1;
				System.out.print("b ");
			}
			else{
				girl = true;
				numOfChildren+= 1;
				System.out.print("g ");
			}
			}

			System.out.println();
			// print the amount of children that were born
			System.out.println("You made it... and you now have " 
							+ numOfChildren + " children");
			
		}
	}

