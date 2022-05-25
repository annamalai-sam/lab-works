package SampleProgram;

import java.util.Scanner;

public class prime {
    public static void main(String... s) {
        System.out.print("Enter a postive number: ");
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        int temp;
        boolean isPrime = false;
        if (num < 0) {
            System.out.println("Please enter postive number");
        } else if (num == 0 || num == 1) {
            System.out.println(num + " neither prime nor composite number");
        } else {
            for (int i = 2; i < num; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is not a prime number");
            } else {
                System.out.println(num + " is a prime number");
            }
        }
    }
}
