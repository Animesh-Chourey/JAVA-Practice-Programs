public class MethodInnerClass 
{
    public void methodOne()
    {
        class Inner
        {
            public void sum(int i,int j)
            {
                System.out.println("Sum= "+(i+j));
            }
        }
        Inner i=new Inner();
        i.sum(10,20);
        i.sum(100,200);
        i.sum(1000,2000);
    }
    public static void main(String args[])
    {
        new MethodInnerClass().methodOne();
        //MethodInnerClass obj=new MethodInnerClass();
        //obj.methodOne();
    }
}
