package MainTask;

public class Increment {
    public synchronized static void increment() {
        for (int i = 0; i < 100; i++) {

        //    System.out.println("The thread name: " + Thread.currentThread().getName() + ". The current number: " + i);
            System.out.println(i);
        }
        System.out.println();
    }
}
