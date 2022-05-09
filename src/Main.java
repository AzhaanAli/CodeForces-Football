import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** DIRECTIONS:
         * For a given string of 1's and 0's, print "YES" if the greatest consecutive
         * string of either 1's or 0's exceeds size 6. Otherwise print "NO".
         */

        Scanner s = new Scanner(System.in);
        System.out.println(
                hasSevenInRow(s.nextLine())?
                        "YES" :
                        "NO"
        );

    }

    public static boolean hasSevenInRow(String s){

        char[] asArr = s.toCharArray();

        // If the string is less than 7 characters long, we know there isn't a consecutive line of 7.
        if(asArr.length < 7) return false;

        // Keep track of the last character.
        // If it's the same as the last, increment the counter
        // If it's not the same as the last, then reset the count and reassign the value of last char.
        int consecutive = 0;
        char lastChar = asArr[0];
        for(int i = 1; i < asArr.length; i++)
        {
            // Above algorithm.
            char currentChar = asArr[i];
            if(lastChar == currentChar)
                consecutive++;
            else {
                consecutive = 0;
                lastChar = currentChar;
            }
            // Check if a string of 7 has been found.
            if(consecutive == 7) return true;
        }

        // No string of 7 has been found.
        return false;

    }

}