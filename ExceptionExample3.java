class ExceptionExample3
{
 public static void main(String args[])
 {
  System.out.println("Hello");
  System.out.println("Before Division");
  try
  {
   System.out.println("Result= "+10/0);
  }
  catch(Exception ex)
  {
   System.out.println(ex.toString());
  }
  System.out.println("After Division");
  System.out.println("End of string");
 }
}