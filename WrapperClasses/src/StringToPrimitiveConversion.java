//parse Function
public class StringToPrimitiveConversion 
{
    public static void main(String args[])
    {
        String age="90";
        int x=Integer.parseInt(age);
        float f=Float.parseFloat(age);
        double d=Double.parseDouble(age);
        byte b=Byte.parseByte(age);
        short s=Short.parseShort(age);
        System.out.println(x);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
        System.out.println(s);
    }
}
