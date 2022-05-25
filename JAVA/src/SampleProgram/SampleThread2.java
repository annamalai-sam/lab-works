package SampleProgram;

public class SampleThread2 extends Thread {
    public static void main(String[] args) {
        SampleThread2 thread = new SampleThread2();
        System.out.println("Hasan");
        thread.start();
        System.out.println("Sangee");
    }
}
class test4 extends SampleThread2 {
    public static void main(String[] args) {
        test4 myObj = new test4();
        myObj.start();
    }
}