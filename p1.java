//examole for loop
import java.util.Scanner;
class A
{
 public static void main(String args[])
 {
  int i,a,b,c,rev;
  Scanner sc=new Scanner(System.in);
  for(i=101;i<=200;i++)
  {
   a=i%10;
   b=(i%100)/10;
   c=i/100;
   rev=(100*a)+(10*b)+c;
   if(rev==i)
    System.out.println(i);
  }
 }
 
}