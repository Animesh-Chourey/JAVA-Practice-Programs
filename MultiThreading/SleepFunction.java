package MultiThreading;

public class SleepFunction 
{
    public static void main(String args[]) throws InterruptedException //We can use throws here for exception or can use try catch block
    {
        try
        {
         System.out.println("A");
         Thread.sleep(3000);
         System.out.println("n");
         Thread.sleep(3000);
         System.out.println("i");
         Thread.sleep(3000);
         System.out.println("m");
        }catch(Exception e){}
    }
}
