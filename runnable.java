class MyRunnable implements Runnable {
    private int threadNumber;

    public MyRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    public void run() {
        System.out.println("Thread " + threadNumber + " is running.");
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadNumber + " was interrupted.");
        }
        System.out.println("Thread " + threadNumber + " has finished running.");
    }
}
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Main thread is starting.");
        Runnable r1 = new MyRunnable(1);
        Runnable r2 = new MyRunnable(2);
        Runnable r3 = new MyRunnable(3);
        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
        System.out.println("Main thread is finished.");
    }
}
