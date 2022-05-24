//Exception Created by array

package exceptionarray;

public class ExceptionArray 
{ 
    public static void main(String[] args) 
    {
     try
     {
          int a[]={5,6,3,4,9,34,2};
          int i;
          for(i=0;i<10;i++)
           System.out.println(a[i]+" ");
     }catch(ArrayIndexOutOfBoundsException ex)
     {
       System.out.println(ex.getMessage());
     }
    }
}
