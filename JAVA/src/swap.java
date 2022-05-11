public class swap {
    public static void main(String[] args) {
        int firstVariable = 10;
        System.out.println("firstVariable :"+firstVariable);
        int secondVariable = 20;
        System.out.println( "secondVariable :"+secondVariable);
        int thirdVariable = secondVariable;
        secondVariable = firstVariable;
        firstVariable = thirdVariable;
        System.out.println("firstVariable :"+firstVariable);
        System.out.println( "secondVariable :"+secondVariable);

    }
}
