import java.util.Scanner;
class While1
{
 public static void main(String args[])
 {
  int a,b,c,ch=1;
  Scanner sc=new Scanner(System.in);
  while(ch==1)
  {
   System.out.print("Enter values of a and b= ");
   a=sc.nextInt();
   b=sc.nextInt();
   c=a+b;
   System.out.println("Sum= "+c);
   System.out.print("Enter choice 1 to further continue= ");
   ch=sc.nextInt();
  }
 }
}