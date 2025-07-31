import java.util.Scanner;

public class Zoho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("");
        int num = sc.nextInt();
        char character = ' ';

        while (num != 0) {
            int rem = num % 26;
            if (rem == 0) {
                str.append('z');
                num = (num / 26) - 1;
            } else {
                character = (char) ('a' + rem - 1);
                str.append(character);

                // num = num - rem; wrong coz in the next step num/26 will anyways eleminate the
                // remainder
                num = num / 26;
            }
        }
        System.out.println(str.reverse());
    }
}

// isse simpler option batau
// ye dekh
/*
 * import java.util.Scanner;
 * 
 * public class Zoho {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter a number: ");
 * int num = sc.nextInt();
 * 
 * // Use StringBuilder for efficient string concatenation
 * StringBuilder str = new StringBuilder("");
 * 
 * // Keep looping as long as the number is greater than 0
 * while (num > 0) {
 * // Decrement num to shift the range from 1-26 to 0-25
 * num--;
 * 
 * // Find the remainder (0-25) and convert to a character ('a'-'z')
 * int rem = num % 26;
 * str.append((char) ('a' + rem));
 * 
 * // Integer division to move to the next "digit"
 * num = num / 26;
 * }
 * 
 * // The string is built backwards, so we must reverse it for the final output
 * System.out.println(str.reverse());
 * sc.close();
 * }
 * }
 */