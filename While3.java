// Factorial
import java.util.Scanner;
class While3
{
 public static void main(String args[])
 {
  int n,i=1,f=1;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number whose u want factorial= ");
  n=sc.nextInt();
  while(i<=n)
  {
   f=f*i;
   i++;
  }
  System.out.println("Factorial= "+f);
 }
}