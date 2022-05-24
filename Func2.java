//Calculate Factorial using Function with return type and with parameters
import java.util.Scanner;
class Func2
{
 int fact(int n)
 {
  int f=1,i;
  for(i=2;i<=n;i++)
   f=f*i;
  return f; 
 }
 public static void main(String args[])
 {
  int n,fa;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number= ");
  n=sc.nextInt();
  Func2 obj=new Func2();
  fa=obj.fact(n);
  System.out.println("Factorial= "+fa);
 }
}