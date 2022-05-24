class ExceptionExample5
{
 public static void main(String args[])
 {
  try
  {
   System.out.println("try block");
   System.out.println(10/0);
  }catch(NullPointerException ex)
  {
   System.out.println("Hello "+ex);
  }
  finally
  {
   System.out.println("Finally BLock");
  }
 }
}