public class TryCatch {
    public static void main(String[] args) {
        int data = 100;
        int[] number = {1,2,3,4,5};
        try {
//            int i = data/0;
//            System.out.println("ArithmeticException in try");
            int j = number[8];
            System.out.println("ArrayIndexOutOfBoundsException in try");
        }
        catch (ArithmeticException g){
            System.out.println("ArithmeticException in catch");
        }
        catch (ArrayIndexOutOfBoundsException g){
            System.out.println("ArrayIndexOutOfBoundsException in catch");
        }
    }
}