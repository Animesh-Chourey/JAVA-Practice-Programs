//Swap values of two variables using function with no return type and with parameters
import java.util.Scanner;
class Func3
{
 void swap(int a,int b)
 {
  int c;
  c=a;
  a=b;
  b=c;
  System.out.println("After Swapping");
  System.out.println("A= "+a);
  System.out.println("B= "+b);
 }
 public static void main(String args[])
 {
  int a,b;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter values of a and b= ");
  a=sc.nextInt();
  b=sc.nextInt();
  Func3 obj=new Func3();
  obj.swap(a,b);
 }
}