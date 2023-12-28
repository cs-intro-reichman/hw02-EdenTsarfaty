/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
    public static void main (String[] args){
        String word = args[0];
        String reversed_word = "";
        for (int i = word.length()-1; i >= 0; i--)
        {
            reversed_word += word.charAt(i);
        }
        System.out.println(reversed_word);
        System.out.println("The middle character is " + reversed_word.charAt(word.length()/2));
    }
}
