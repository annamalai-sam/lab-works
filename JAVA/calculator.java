import java.util.Scanner;

public class calculator {
    public static void main(String... s) {
        Scanner Obj1 = new Scanner(System.in);
        System.out.print("Enter number 1:");
        double n1 = Obj1.nextDouble();
        Scanner Obj2 = new Scanner(System.in);
        System.out.print("Enter number 2:");
        double n2 = Obj2.nextDouble();
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a operator :");
        String oper = myObj.nextLine();
        System.out.println(oper);
        switch (oper) {
            case "add":
                System.out.println("Addition of two number is: " + add(n1, n2));
                break;
            case "sub":
                System.out.println("subraction of two number is: " + sub(n1, n2));
                break;
            case "mul":
                System.out.println("multiplication of two number is: " + mul(n1, n2));
                break;
            case "div":
                System.out.println("Division quotient of two number is: " + div(n1, n2));
                break;
            case "rem":
                System.out.println("Division remainer of two number is: " + rem(n1, n2));
                break;
            default:
                System.out.println(
                        " give add for addition operation \n give sub for subraction operation \n give mul for multiplication operation \n give div for division operation \n give rem for remainder operation");
                break;
        }
    }

    static int add(double a, Double b) {
        int temp = (int) (a + b);
        return temp;
    }

    static double sub(double a, double b) {
        double temp = a - b;
        return temp;
    }

    static double mul(double a, double b) {
        double temp = a * b;
        return temp;
    }

    static double div(double a, double b) {
        double temp = a / b;
        return temp;
    }

    static double rem(double a, double b) {
        double temp = a % b;
        return temp;
    }
}
