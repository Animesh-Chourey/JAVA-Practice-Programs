import java.util.Scanner;
class Swap
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter values of a and b= ");
  a=sc.nextInt();
  b=sc.nextInt();
  c=a;a=b;b=c;
  System.out.println("A= "+a+" "+"B= "+b);
 }
}