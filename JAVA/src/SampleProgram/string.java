package SampleProgram;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
//        String name = "Anna Malai";
          String[] surname=  name.split(" ");
        System.out.print(surname[1]);
        System.out.println(" "+surname[0]);
    }
    }
