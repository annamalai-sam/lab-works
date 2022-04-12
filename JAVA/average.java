public class average {
    public static void main(String... s) {

        double sum = 0;
        double[] numbers = { 7, 6, 9, 5, 5, 5, 5 };
        for (double i : numbers) {
            sum = sum + i;
        }
        System.out.println("Average is : " + sum / numbers.length);
    }
}
