// Simple example of Exception Base Class

package exceptionexample1;

import java.util.Scanner;

public class ExceptionExample1 
{
  public static void main(String[] args) 
  {
   try
   {
     int a,b,c;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter value of a= ");
     a=sc.nextInt();
     System.out.print("Enter value of b= ");
     b=sc.nextInt();
     c=a/b;
     System.out.println("Result= "+c);
   }catch(Exception ex)
   {
       System.out.println(ex.getMessage());
   }
   System.out.println("Thanks");
  }
}
