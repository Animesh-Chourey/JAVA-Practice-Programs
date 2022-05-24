public class ReverseIntegerWithWrapperClass 
{
    public static void main(String args[])
    {
        int x=123;
        String s=Integer.toString(x);
        String s1=new StringBuffer(s).reverse().toString();
        int rev=Integer.parseInt(s1);
        System.out.println(rev);
    }
}