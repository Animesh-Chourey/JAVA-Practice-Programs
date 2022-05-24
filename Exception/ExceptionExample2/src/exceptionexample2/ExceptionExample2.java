// Example of every pre-defined exception classes

import java.util.Scanner;
import java.util.InputMismatchException;
package ExceptionExample2;

public class ExceptionExample2 
{
    public static void main(String[] args) 
    {
     try
     {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter values of a and b= ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a/b;
        System.out.println("Result= "+c);
     }catch(InputMismatchException ex1)
     {
         System.out.println(ex1.getMessage());
     }
     catch(ArithmeticException ex2)
     {
         System.out.println(ex2.getMessage());
     }     
     finally
     {
         System.out.println("Thanks");
     }    
    }
}