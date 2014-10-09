package book5.chap01.Executor;

public class LaunchEventNew implements Runnable
{
    private String message;

    public LaunchEventNew(String message)
    {
        this.message = message;
    }

    public void run()
    {
        System.out.println(message);
    }
}
