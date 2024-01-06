/**
 *  Gets a command-line argument (int), and checks if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		String score = "";
		boolean isPerfect = true;
		
		for (int i = 1; i <= n/2; i++)  
		{
			if (num % i == 0)
			{
				sum += i;
				if (sum < num) { 
					score += (" + " + i);
				} else {
					score += (i);
					// #Feedback: for both equal\greather cases we can stop the loop.
					break;
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
