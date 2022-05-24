//Store 10 elements and display only prime
import java.util.Scanner;
class OneArray3
{
 public static void main(String args[])
 {
  int a[]=new int[10];
  int i,j,k;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter array elements= ");
  for(i=0;i<10;i++)
   a[i]=sc.nextInt();
  System.out.println("Output: ");
  for(i=0;i<10;i++)
  {
   k=0;
   for(j=2;j<=a[i]/2;j++)
   {
	   if(a[i]%j==0)
	   {
		   k=1;
		   break;
	   }   
   }
   if(k==0)
	   System.out.print(a[i]+" ");
  } 
  System.out.println();
 }
}