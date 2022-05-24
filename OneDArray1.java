import java.util.Scanner;
class OneArray1
{
 public static void main(String args[])
 {
  int a[]=new int[5];
  int i,s=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter array elements= ");
  for(i=0;i<5;i++)
   a[i]=sc.nextInt();
  System.out.print("Output= ");
  for(i=0;i<5;i++)
  {
   System.out.print(a[i]+" ");
   s=s+a[i];
  }  
  System.out.println("Sum= "+s);
 }
}