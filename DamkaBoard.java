/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		for(int i1 = 0; i1 < num; i1++){
			for(int i2 = 0; i2 < num; i2++){
				if(i1 % 2 == 0){
					System.out.print("* ");
				}
				else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
