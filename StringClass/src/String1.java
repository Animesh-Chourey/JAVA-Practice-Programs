public class String1 
{
    public static void main(String args[])
    {
       String s="Ani";
       System.out.println(s.charAt(2));//charAt Function (index returned is zero based)
       
       System.out.println(s.concat("Aki"));
       
       String s1="Ani";
        System.out.println(s.equals(s1));
        
        String s3=new String("Ani");
        String s4=new String("Ani");
        System.out.println(s3.equals(s4));
    }
}
