package SampleProgram;

import java.util.Scanner;

public class average {
    public static void main(String... s) {
        Scanner ObjScanner = new Scanner(System.in);
        System.out.print("How many number to average : ");
        int num = ObjScanner.nextInt();
        double[] numbers = new double[num];
        for (int i = 0; i < num; i++) {
            Scanner Obj = new Scanner(System.in);
            System.out.print("Number to average : ");
            Double temp = Obj.nextDouble();
            numbers[i] = temp;
        }
        double sum = 0;
        for (double i : numbers) {
            sum = sum + i;
        }
        System.out.println("Average is : " + sum / numbers.length);
    }
}
