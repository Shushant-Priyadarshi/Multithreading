package operations.creation;

public class Thread1 extends Thread {


    public Thread1(String threadName) {
        super(threadName); //Constructor overloading of Thread
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1 is running: " + Thread.currentThread() + " " + i);
        }
    }
}
