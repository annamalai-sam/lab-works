public class array {
    public static void main(String[] args) {
        int array[] = {2,4,5,7,8};
        int small = array[0];
        int big = array[0];
        for (int i = 0; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }
        System.out.println("Smallest number in array is : "+small);
        for (int i = 0; i < array.length; i++) {
            if (big < array[i]) {
                big = array[i];
            }
        }
        System.out.println("biggest number in array is : "+big);
    }
    }
