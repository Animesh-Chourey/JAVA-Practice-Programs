package MultiThreading;

class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Child Thread");
            Thread.yield();
        }    
    }
}
public class YieldFunction 
{
    public static void main(String args[])
    {
         MyThread1 obj=new MyThread1();
         obj.start();
         for(int i=1;i<=5;i++)
             System.out.println("Main Thread");
    }
}
