import java.util.Scanner;

public class SimpleCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Addition of two numbers is " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction of two numbers is " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of two numbers is " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Division of two numbers is " + (a / b));
                    break;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    break;
                }
            default:
                System.out.println("Error! Invalid operator");
                break;
        }
    }
}
