package MultiThreading;
class Demo1 extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Child Thread");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        }
    }
}
public class JoinFunction 
{
    public static void main(String args[]) throws InterruptedException
    {
        Demo1 obj=new Demo1();
        obj.start();
        obj.join();
        for(int i=1;i<5;i++)
            System.out.println("main thread");
    }
}
