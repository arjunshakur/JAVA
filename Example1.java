import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 8, 4, 5, 3 };
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
        int a, b, c;
        System.out.println("enter 3 no.'s");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + "is the largest no.");
        } else if (b > a && b > c) {
            System.out.println(b + "is largest");
        } else {
            System.out.println(c + "is largest");
        }

        System.out.println("enter the year");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not leap year");
        }

        System.out.println("enter your marks(grade)");
        int marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("Outstanding");
        } else if (marks > 80) {
            System.out.println("A++");
        } else if (marks > 70) {
            System.out.println("B++");
        } else if (marks > 50) {
            System.out.println("C++");
        } else {
            System.out.println("Fail");
        }

        System.out.println("enter number ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            if (num > 0) {
                System.out.println("number is positive even");
            } else {
                System.out.println("number is negative even");
            }

        } else {
            if (num > 0) {
                System.out.println("number is positive odd");
            } else {
                System.out.println("number is negative odd");
            }
        }

        System.out.println("enter the length of the sides of the triangle");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        if (s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2) {
            System.out.println("valid triangle");
        } else {
            System.out.println("not valid triangle sides");
        }

        System.out.println("enter the units consumed");
        int minCharge = 250;
        int units = sc.nextInt();
        int bill = minCharge;
        if (units < 100) {
            bill += units * 1.20;
        } else if (units < 200) {
            bill += (100 * 1.20) + ((units - 100) * 1.50);
        } else {
            bill += (100 * 1.20) + (100 * 1.50) + ((units - 200) * 2);
        }
        System.out.println("Total amount to be paid:" + bill);

    }
}