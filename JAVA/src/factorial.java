import java.util.Scanner;
public class factorial {
    public static void main(String... s) {
        System.out.print("Enter a positive number: ");
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        int fact = 1;
        if (num <= -1) {
            System.out.println("Please enter positive number");
        } else if (num == 0) {
            System.out.println("The factorial of number " + num + " is " + fact);
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial of number " + num + " is " + fact);
        }
    }
}
