package MultiThreading;

class Demo extends Thread
{
    @Override
    public void run() //Since run() is a overriden method we cannot use throws here for InterruptedException
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("I am a lazy thread : "+i);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("I got interrupted");
        }
    }
}
public class SleepFunction2 
{
    public static void main(String args[])
    {
        Demo obj=new Demo();
        obj.start();
        obj.interrupt();
        System.out.println("End of main thread");
    }
}
