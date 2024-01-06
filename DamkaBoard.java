/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		for (int i = 0; i < size; i++) {
			// #Feedback: let's reduce it to one loop so we avoid duplication of code.
			String aligment = " *";
			if (i % 2 == 0) {
				aligment = "* ";
			}
			for (int j = 1; j <= size; j++) {
				System.out.print(aligment);
			}

			// #Feedback: why do we need this break? just scope it out from the loop.
			System.out.println();
		}
	}
}
