package thread.level;

public class X implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread X started");
        for(int i = 1; i<=4; i++)
        {
            System.out.println("Thread X: " +i);
        }
        System.out.println("Exit from X");
    }
}
