import java.util.Scanner;

public class uppercase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string : " );
        String txt = obj.nextLine();
        System.out.println("UpperCase : "+txt.toUpperCase());
        System.out.println("toLowerCase : "+txt.toLowerCase());
    }
}
