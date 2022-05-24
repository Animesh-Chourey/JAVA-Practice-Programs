class Par
{
    public void methodOne()
    {
        System.out.println("A");
    }
}
public class ObjectTypeCasting extends Par
{
    @Override
    public void methodOne()
    {
        System.out.println("B");
    }
    public void methodTwo()
    {
        System.out.println("C");
    }
    public static void main(String args[])
    {
        ObjectTypeCasting o=new ObjectTypeCasting();
        o.methodOne();
        o.methodTwo();
        ((Par)o).methodOne();
    }
}
