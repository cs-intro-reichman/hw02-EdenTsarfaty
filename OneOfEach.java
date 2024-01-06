
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy_born = false, girl_born = false;
		int children = 0;
		// #Feedback: Classic case to use do\while - first itteration will always happen 
		do {
			if (Math.random() > 0.5) {
				boy_born = true;
				System.out.print("b ");
			}
			else {
				girl_born = true;
				System.out.print("g ");
			}
			children++;
		} while (!(boy_born && girl_born))
		System.out.print("\nYou made it... and you now have " + children + " children.");
	}
}
