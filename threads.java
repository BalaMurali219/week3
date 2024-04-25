class MyThread extends Thread {
    private int thread;
    public MyThread(int thread) 
    {
        this.thread = thread;
    }
    public void run() {
        System.out.println("Thread " + thread + " is running.");
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            System.out.println("Thread " + thread + " was interrupted.");
        }
        System.out.println("Thread " + thread + " has finished running.");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is starting.");
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main thread is finished.");
    }
}
