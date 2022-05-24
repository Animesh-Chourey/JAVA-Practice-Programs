class Outer2
{
    class Inner2
    {
        public void methodOne()
        {
            System.out.println("Inner class method");
        }
    }
    public void methodTwo()
    {
        Inner2 obj=new Inner2();
        obj.methodOne();
    }
    public static void main(String args[])
    {
        Outer2 o=new Outer2();
        o.methodTwo();
    }
}