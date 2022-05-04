import java.util.Scanner;
public class reverse {
    public static void main(String... s) {
        // System.out.println(7 / 10);
        System.out.print("Enter a postive number to reverse: ");
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        int reverse = 0;
        int reminder = 0;
        if (num < 0) {
            System.out.println("Please enter postive number");
        } else {
            while (num != 0) {
                reminder = num % 10;
                reverse = (reverse * 10) + reminder;
                num = num / 10;
            }
        }
        System.out.println("The reverse number of " + num + " is " + reverse);
    }
}