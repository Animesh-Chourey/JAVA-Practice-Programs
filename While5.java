//Reverse of any n digit number
import java.util.Scanner;
class While5
{
 public static void main(String args[])
 {
  int n,s=0,r;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter any n digit number= ");
  n=sc.nextInt();
  while(n>0)
  {
   r=n%10;
   s=10*s+r;
   n=n/10;
  }
  System.out.println("Reverse= "+s);
 }
}
