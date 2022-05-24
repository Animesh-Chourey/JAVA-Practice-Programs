//Largest Element 
import java.util.Scanner;
class OneArray2
{
 public static void main(String args[])
 {
  int a[]=new int[5];
  int i,max;
  Scanner sc=new Scanner(System.in);
  System.out.print("enter array elements= ");
  for(i=0;i<5;i++)
   a[i]=sc.nextInt();
  max=a[0];
  System.out.println("Output= ");
  for(i=0;i<5;i++)
  {
   System.out.print(a[i]+" ");
   if(a[i]>max)
    max=a[i];
  }  
  System.out.println("\nMaximum Element= "+max);
 }
}