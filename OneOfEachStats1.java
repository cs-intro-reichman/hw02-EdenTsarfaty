/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		boolean boy_born = false, girl_born = false;
		int iterations = Integer.parseInt(args[0]);
		int children = 0;
		int total_children = 0;
		int family_of_2 = 0;
		int family_of_3 = 0;
		int family_of_4p = 0;
		for (int i = 0; i < iterations; i++) {
			while (!(boy_born && girl_born)) {
				if (Math.random() > 0.5) {
					boy_born = true;
				} else {
					girl_born = true;
				}
				children++;
			}
			switch (children) {
				case 2:
					family_of_2++;
					break;
				case 3:
					family_of_3++;
					break;
				default:
					family_of_4p++;
			}
			total_children += children;
			children = 0;
			boy_born = false;
			girl_born = false;
		}
		System.out.println("Average: " + (double)total_children/iterations +
		" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + family_of_2);
		System.out.println("Number of families with 3 children: " + family_of_3);
		System.out.println("Number of families with 4 children: " + family_of_4p);
		System.out.print("The most common number of children is ");
		if (family_of_2 > family_of_3) {
			System.out.print("2.");
		}
		// #Feedback: Better to not nest ifs when the condition is continuous to the previous
		else if (family_of_3 > family_of_4p) {
			System.out.print("3.");
		} else {
			System.out.print("4.");
		}
	}
}
