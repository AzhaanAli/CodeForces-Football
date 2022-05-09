import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** DIRECTIONS:
         * For a given string of 1's and 0's, print "YES" if the greatest consecutive
         * string of either 1's or 0's exceeds size 6. Otherwise print "NO".
         */

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(
                input.contains("0000000") || input.contains("1111111")?
                        "YES" :
                        "NO"
        );

    }

}