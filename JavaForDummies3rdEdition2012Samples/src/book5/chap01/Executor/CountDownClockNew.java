package book5.chap01.Executor;
public class CountDownClockNew implements Runnable
{
    int t;

    public CountDownClockNew(int t)
    {
        this.t = t;
    }

    public void run()
    {
        System.out.println("T minus " + t);
    }
}
