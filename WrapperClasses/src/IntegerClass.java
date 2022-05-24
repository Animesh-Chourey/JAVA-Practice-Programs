

public class IntegerClass 
{
    public static void main(String args[])
    {
        // Boxing
        int i=100;
        Integer iobj=new Integer(i);
        System.out.println(iobj);
        Integer i1=new Integer("10");
        System.out.println(i1);
      //  Integer i2=new Integer("ten");
 //       System.out.println(i2);//Here the String is not representing a number therefore an error
   
        // Unboxing - Convert any wrapper class into its pritmitive
        Integer iobj1=new Integer(30);
        int x=iobj1.intValue();
        System.out.println(iobj1);
    }
}
