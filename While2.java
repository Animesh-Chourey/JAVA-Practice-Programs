import java.util.Scanner;
class While2
{
 public static void main(String args[])
 {
  int n,s=0,i=1;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number= ");
  n=sc.nextInt();
  while(i<=n)
  {
   System.out.println(i);
   s=s+i;
   i++;
  }
  System.out.println("Sum= "+s);
 }
}