package SampleProgram;

import java.util.Scanner;

public class strong_number {
    public static void main(String... s) {
        Scanner ObjScanner = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int num = ObjScanner.nextInt();
        int number = num;
        int last_digit = 0;
        int strongNumber = 0;
        if (number < 0) {
            System.out.println("please enter positive number");
        } else {
            while (num != 0) {
                last_digit = num % 10;
                // System.out.println(last_digit);
                int fact = 1;
                for (int i = 1; i <= last_digit; i++) {
                    fact = fact * i;
                }
                strongNumber = strongNumber + fact;
                num = num / 10;
            }
            if (number == 0) {
                System.out.println(number + " is not a strong number");
            } else if (strongNumber == number) {
                System.out.println(number + " is a strong number");
            } else {
                System.out.println(number + " is not a strong number");
            }
        }
    }
}