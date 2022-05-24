package MultiThreading;

class Thread1 extends Thread
{
    public static void main(String args[]) throws InterruptedException
    {
        Thread.currentThread().setName("Thread1");
        Thread2 obj=new Thread2();
        synchronized(obj)
        {
            System.out.println(currentThread().getName()+"Called");
            obj.wait();
            System.out.println("main thread got notification call");
            System.out.println(obj.total);
        }
    }
}
class Thread2 extends Thread
{
    int total=0;
    @Override
    public void run()
    {
        synchronized(this)
        {
            System.out.println("child thread startd=s calculation");
            for(int i=1;i<=10;i++)
                total=total+i;
            System.out.println("child Thread now giving notification call");
            this.notify();
        }
    }
}