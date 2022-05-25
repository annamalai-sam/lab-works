package SampleProgram;

public class SampleThread implements Runnable {
    public static synchronized void main(String[] args) {
        SampleThread obj =new SampleThread();
        Thread thread = new Thread(obj);
        System.out.println("Hasan");
        thread.start();
        System.out.println("Sangee");
    }
    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }
    }
}