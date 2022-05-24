//Merge two arrays into third array
import java.util.Scanner;
class OneArray4
{
 public static void main(String args[])
 {
  int a[]=new int[5];
  int b[]=new int[5];
  int c[]=new int[10];
  int i,j;
  Scanner sc =new Scanner(System.in);
  System.out.print("Enter array elements of a= ");
  for(i=0;i<5;i++)
   a[i]=sc.nextInt();
  System.out.print("Enter array elements of b= ");
  for(i=0;i<5;i++)
   b[i]=sc.nextInt();
   j=0; 
  for(i=0;i<5;i++)
  {
	   c[j]=a[i];   
	   j++;
	   c[j]=b[i];	   
	   j++;
  }
  for(i=0;i<10;i++)
	  System.out.print(c[i]+" ");
  System.out.print("\n");
 }
}