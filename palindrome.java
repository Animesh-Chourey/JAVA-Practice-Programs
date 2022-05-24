//examole for loop
import java.util.Scanner;
class Palindrome
{
 public static void main(String args[])
 {
  int i,a=-1,b=1,c;
  Scanner sc=new Scanner(System.in);
  for(i=1;i<=10;i++)
  {
   c=a+b;
   System.out.println(c);
   a=b;
   b=c;
  }
 }
 
}