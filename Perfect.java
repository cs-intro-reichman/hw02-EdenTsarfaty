/**
 *  Gets a command-line argument (int), and checks if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		String score = "";
		for (int i = 1; i <= num/2; i++)  //No need to check numbers greater than num/2
		{
			if (num % i == 0)
			{
				sum += i;
				if (sum < num) { //Checks if i is the final divisor of num
					score += (i + " + ");
				}
				else {
					score += (i);
				}
			}
		}
		if (sum==num) {
			System.out.print(num + " is a perfect number since " + num
					+ " = " + score);
			if (num == 0) //fixes the string for num = 0
				System.out.print(0);
		}
		else
			System.out.print(num + " is not a perfect number");
	}
}
