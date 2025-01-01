package operations.creation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is starting ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread is running: "+i);
        }
        Thread1 thread1 = new Thread1();
        thread1.start();
        System.out.println("Main thread is exiting ");
    }
}
