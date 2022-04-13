import java.util.Scanner;

public class armstrong {
    public static void main(String... s) {
        Scanner ObjScanner = new Scanner(System.in);
        System.out.print("Enter a postive number : ");
        int num = ObjScanner.nextInt();
        // System.out.println(num);
        int powerValue = 0;
        int armstrongValue = 0;
        int number = num;
        int finalNumber = num;
        // System.out.println(finalNumber);
        if (finalNumber < 0) {
            System.out.println("Please enter postive number");
        } else {
            while (number != 0) {
                number = number / 10;
                powerValue++;
            }
            while (num != 0) {
                int remainder = 0;
                remainder = num % 10;
                // System.out.println(remainder);
                int power = 1;
                for (int i = 0; i < powerValue; i++) {
                    power = power * remainder;
                    // System.out.println(power);
                }
                num = num / 10;
                armstrongValue = armstrongValue + power;
            }
            System.out.println("armstrongValue : " + armstrongValue);
            if (armstrongValue == finalNumber) {
                System.out.println(finalNumber + "  is Armstrong number");
            } else {
                System.out.println(finalNumber + "  is not a Armstrong number");
            }
        }
    }
}
