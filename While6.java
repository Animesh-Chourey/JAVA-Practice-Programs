/*Prog to  print sum of any n digit number until sum becomes a single digit.(eg if no is 3456 then sum=18 agan the sum of digits of 18 should be 
calculated,sum=9 npw since the sum os on songle digit,program should be stopped)*/

import java.util.Scanner;
class While6
{
 public static void main(String args[])
 {
  int n,r,s=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number= ");
  n=sc.nextInt();
  while(n>0)
  {
   r=n%10;
   s=s+r;
   n=n/10;
   if(n==0)
   {
    System.out.print(s+" ");
	if(s>0 && s<10)
	 break;
	else
	{
	 n=s;
	 s=0;
	}
   }
  }
 }
}