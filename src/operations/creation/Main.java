package operations.creation;

public class Main {
    public static void main(String[] args) {
        System.out.println("=> thread is starting ");
        //Thread1 thread1 = new Thread1("thread1");
       // thread1.setDaemon(true); This enables the DAEMON thread, so it may or may not run
       // thread1.start();

        Thread2 thread2 = new Thread2();

        thread2.run();
        System.out.println("=> Main thread is exiting ");
    }
}
