import java.util.Scanner;

public class perfect {
    public static void main(String... s) {
        System.out.print("Enter a postive number: ");
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        int temp;
        System.out.println(num);
        int[] factors = new int[num];
        int sum = 0;
        // variable declaration space
        if (num <= 0) {
            System.out.println("Please enter postive number");
        } else {
            for (int i = 1; i < num; i++) {
                temp = num % i;
                // System.out.println(temp);
                if (temp == 0) {
                    factors[i] = i;
                }
            }
        }
        for (int o : factors) {
            // System.out.println("array :" + factors[o]);
            sum = sum + o;
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
