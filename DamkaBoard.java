/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		String row = "";
		for (int i = 0; i < size; i++)
		{
			row += "* ";
		}
		row += "*";
		for (int j = 0; j < size-1; j++)
		{
			if (j % 2 == 1) { //Adds first " " for even rows
				System.out.print(" ");
			}
			System.out.println(row);
		}
		if (size % 2 == 0) { //Checks if the last row should start with " "
			System.out.print(" " + row);
		}
		else
			System.out.print(row);
	}
}
