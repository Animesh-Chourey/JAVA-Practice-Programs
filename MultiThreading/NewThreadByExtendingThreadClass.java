package MultiThreading;

class Execute extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Sub Thread");
        }
    }
}
public class NewThreadByExtendingThreadClass 
{
    public static void main(String args[])
    {
     Execute obj=new Execute();
     obj.start();
     //obj.run();
     for(int i=0;i<5;i++)
     {
         System.out.println("Main Thread");
     }
    } 
}
