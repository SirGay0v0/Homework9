package MainTask;

public class MyThread implements Runnable {
    String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Increment.increment();
    }
}
