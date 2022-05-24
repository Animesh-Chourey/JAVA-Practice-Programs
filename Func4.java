//Sum of digits of any n digit integer with return type and with arguments
import java.util.Scanner;
class Func4 
{
 int Sumofdigits(int n)
 {
  int r,s=0;
  while(n>0)
  {
   r=n%10;
   s=s+r;
   n=n/10;
  }
  return s;
 }
 public static void main(String args[])
 {
  int n,sum;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter any n digit number= ");
  n=sc.nextInt();
  Func4 obj=new Func4();
  sum=obj.Sumofdigits(n);
  System.out.println("Sum= "+sum);
 }
}