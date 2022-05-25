package SampleProgram;

import java.util.Scanner;
public class buffer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuffer str = new StringBuffer(scan.nextLine());
        System.out.println(str);
    }
}
