import java.util.Scanner;

public class fibonacci {
    public static void main(String... s) {
        System.out.print("Enter a postive number: ");
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        if (num <= -1) {
            System.out.println("Please enter postive number");
        } else {
            int t0 = 0, t1 = 1;
            int temp = 0;
            for (int i = 0; i < num - 1; i++) {
                temp = t0 + t1;
                t0 = t1;
                t1 = temp;
            }
            System.out.println("Fibonacci Series of " + num + " term " + "is " + temp);
        }
    }
}
