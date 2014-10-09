package book5.chap01.DoingTwoThings;

public class CountDownClockSync extends Thread
{
    synchronized public void run()
    {
        for (int t = 20; t >= 0; t--)
        {
            System.out.println("T minus " + t);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {}
        }
    }
}
