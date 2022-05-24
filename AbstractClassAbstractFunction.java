// Abstract Class and Abstract Method

import java.util.Scanner;
abstract class Shape
{
 int b,h;
 double a;
 Scanner sc=new Scanner(System.in);
 
 public void getDetails()
 { 
  System.out.print("Enter value of a and b= ");
  b=sc.nextInt();
  h=sc.nextInt();
 }
 
 public abstract void Area(); //Abstract Method
}
class Triangle extends Shape
{
 public void show()
 {
  System.out.println("Show Function Triangle");
 }
 
 @Override
 public void Area()
 {
  a=0.5*b*h;
  System.out.println("Area of Triangle= "+a);
 }
}
class Rectangle extends Shape
{
 public void show()
 {
  System.out.println("Show Function Rectangle");
 }
 
 @Override
 public void Area()
 {
  a=b*h;
  System.out.println("Area of Rectangle= "+a);
 }
}
class AbstractClassAbstractFunction
{
 public static void main(String args[])
 {
  Triangle t=new Triangle();
  Rectangle r=new Rectangle();
  t.getDetails();
  t.Area();
  r.getDetails();
  r.Area();
 }
}