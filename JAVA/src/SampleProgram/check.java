package SampleProgram;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int one = obj.nextInt();
        int two = obj.nextInt();
        int three = obj.nextInt();
        int [] sample = {one,two,three};
        int big = sample[0];
        for (int i = 0; i < sample.length; i++) {
            if (big < sample[i]) {
                big = sample[i];
            }
        }
        System.out.println(big+" is the largest number");
    }
}
