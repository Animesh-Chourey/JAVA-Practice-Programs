class ExceptionExample4
{
 public static void main(String arsgs[])
 {
  try
  {
   int a=12,b=2;
   System.out.println("Result= "+a/b);
   int arr[]={1,2,3,4,5};
   System.out.println("Array value= "+arr[7]);
  }catch(ArithmeticException e)
  {
   System.out.println("Division by zero error");
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("Excess elements out of range");
  }
 }
}