package SampleProgram;

public class SampleThread implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        SampleThread obj =new SampleThread();
        Thread thread = new Thread(obj);
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hasan");
        thread.start();
        Thread.sleep(1000);
        System.out.println(thread.getName());
        System.out.println("Sangee");
    }
    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }
    }
}