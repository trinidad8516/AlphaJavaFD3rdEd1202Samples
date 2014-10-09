package book5.chap01.DoingTwoThings;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class DoTwoThingsSync {
    ScheduledThreadPoolExecutor pool =
        new ScheduledThreadPoolExecutor(2);
    CountDownClockSync clock = 
        new CountDownClockSync();

    public static void main(String[] args)
    {
        new DoTwoThingsSync();
    }

    DoTwoThingsSync()
    {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}
