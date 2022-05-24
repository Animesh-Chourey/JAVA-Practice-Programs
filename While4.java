//Sum of digits of n digit integer
import java.util.Scanner;
class While4
{
 public static void main(String args[])
 {
  int n,s=0,r;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter any digit number= ");
  n=sc.nextInt();
  while(n>0)
  {
   r=n%10;
   s=s+r;
   n=n/10;
  }
  System.out.println("Sum= "+s);
 } 
}