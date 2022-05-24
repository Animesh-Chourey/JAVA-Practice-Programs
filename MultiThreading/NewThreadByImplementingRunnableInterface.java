package MultiThreading;

class MyRunnable implements Runnable
{ 
  @Override  
  public void run()
  {
      for(int i=1;i<=5;i++)
          System.out.println("child class");
  }
}
public class NewThreadByImplementingRunnableInterface 
{
    public static void main(String args[])
    {
        MyRunnable obj=new MyRunnable();
        Thread t=new Thread(obj);
        Thread t1=new Thread();
        t1.start();
        for(int i=0;i<5;i++)
            System.out.println("Main Thread");
    }
}