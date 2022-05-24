//Print Table of a number using function with no return type and with arguments
import java.util.Scanner;
class Func1
{
 void table(int n)
 {
  int i,t;
  for(i=1;i<=10;i++)
  {
   t=n*i;
   System.out.println(n+"*"+i+"= "+t);
  }   
 }
 public static void main(String args[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number= ");
  n=sc.nextInt();
  Func1 obj=new Func1();
  obj.table(n);
 }
}