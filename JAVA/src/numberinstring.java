import java.util.Scanner;

public class numberinstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuffer str = new StringBuffer(scan.nextLine());
        String numbers[] = {"0","1","2","3","4","5","6","7","8","9"};
        StringBuffer num = new StringBuffer(str.length());
//        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            String check = str.substring(i ,i+1);
            //     System.out.println(number);
            //   System.out.println(check);
            //   System.out.println(check.equals(number));
            for (String number: numbers)
                if (check.equals(number)) {
                    num.append(check);
                }
        }
        System.out.println("Numbers is : "+num);
    }
}
