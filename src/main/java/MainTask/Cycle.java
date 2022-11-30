package MainTask;

public class Cycle {


    public static synchronized void cycleFor() {
        GetAndSetTime getAndSetTime = new GetAndSetTime();
        long resultTime;
        for (int i = 0; i < 100; i++) {

            System.out.println("The thread name: " + Thread.currentThread().getName() + ". The current number: " + i);
            getAndSetTime.setEndTime(System.currentTimeMillis());

        }
        resultTime =getAndSetTime.getEndTime() - getAndSetTime.getStartTime();
        System.out.println(resultTime);
    }
}
