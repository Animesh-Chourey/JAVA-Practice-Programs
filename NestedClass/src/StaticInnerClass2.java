//From static inner class we can define a static member also like main and can invoke the static inner class directly also

public class StaticInnerClass2 
{
    static class Inner
    {
        public static void main(String args[])
        {
            System.out.println("Static inner class main function");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Outer class main function");
    }
}
