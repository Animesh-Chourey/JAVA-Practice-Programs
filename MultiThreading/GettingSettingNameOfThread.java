package MultiThreading;

class MyThread extends Thread
{}
public class GettingSettingNameOfThread 
{
    public static void main(String args[])
    {
        System.out.println(Thread.currentThread().getName());
        MyThread obj=new MyThread();
        System.out.println(obj.getName());
        Thread.currentThread().setName("Animesh Thread");
        System.out.println(obj.currentThread().getName());
        System.out.println(obj.getName());
    }
}