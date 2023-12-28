/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main (String[] args) {
        int lowest = 0;
        int randomnum = 0;
        do
        {
            randomnum = (int)(Math.random() * 10);
            if (randomnum >= lowest) {
                System.out.print(randomnum + " ");
                lowest = randomnum;
            }
        }
        while (lowest<9);
    }
}
