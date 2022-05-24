//Simple do-while example

import java.util.Scanner;
class Dowhile
{
 public static void main(String args[])
 {
  int n,s=0;
  Scanner sc=new Scanner(System.in);
  do
  {
   System.out.print("Enter value of a= ");
   n=sc.nextInt();
   s=s+n;
  }while(n!=0);
  System.out.println("Sum= "+s);
 }
}