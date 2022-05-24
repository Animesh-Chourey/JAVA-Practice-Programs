class test
{
 public static void main(String args[])
 {
   java.util.Scanner sc=new java.util.Scanner(System.in);
   String s=sc.next();
   s=s.trim();
   try
   {
    Long.parseLong(s);
	System.out.println("Valid Mobile Number\n");
	
   }catch(Exception e)
   {
    System.out.println("Invalid Mobile Number\n");
   }
 }
}