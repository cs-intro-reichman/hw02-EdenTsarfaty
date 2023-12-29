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
		for (int j = 0; j < size; j++)
		{
			if (j % 2 == 1) {
				System.out.print(" ");
			}
			System.out.println(row);
		}
	}
}
