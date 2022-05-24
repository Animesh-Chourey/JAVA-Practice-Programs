//Example of class and object

import java.util.Scanner;
class Student
{
 private int rno;
 private int marks;
 private String name;
  
 public void getDetails()
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Roll No, Name, Marks: ");
  rno=sc.nextInt();
  name=sc.next();
  marks=sc.nextInt();
 }
 public void showDetails()
 {
  System.out.println("Name= "+name);
  System.out.println("Roll no= "+rno);
  System.out.println("Marks= "+marks);
 }
}
class ObjectDemo
{
 public static void main(String args[])
 {
  Student obj1=new Student();
  Student obj2=new Student();
  obj1.getDetails();
  obj2.getDetails();
  obj1.showDetails();
  obj2.showDetails();
 }
}