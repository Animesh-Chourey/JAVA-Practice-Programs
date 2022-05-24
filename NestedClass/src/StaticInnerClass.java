public class StaticInnerClass 
{
    static class Inner
    {
        public void method()
        {
            System.out.println("Static class method");
        }
    }
    public static void main(String args[])
    {
        StaticInnerClass.Inner obj=new StaticInnerClass.Inner();
        obj.method();
    }
}
