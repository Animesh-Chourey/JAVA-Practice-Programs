// User Defined Exception 

package exceptionuserdefined;

import java.util.Scanner;
class MyException extends Exception
{
    public MyException(String msg)
    {
        super(msg);
        System.out.println("User Defined Exception executed");        
    }
}
public class ExceptionUserDefined 
{
    public static void main(String[] args) 
    {
     try
     {
      int age;
      String name;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter name= ");
      name=sc.next();
      System.out.print("Enter age= ");     
      age=sc.nextInt();
      if(age<18)
         throw new MyException("Invalid Age");
      else
         System.out.println("Welcome "+name);
     }catch(Exception ex)
    {
         System.out.println(ex.getMessage());
    }
   }    
}
