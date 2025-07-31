import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int n = sc.nextInt(), reverse = 0, rem = 0;
        while (n > 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
