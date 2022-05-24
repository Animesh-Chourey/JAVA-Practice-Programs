// Creating an abstract class

import java.util.Scanner;
abstract class School
{
 int code;
 String name;
 Scanner sc=new Scanner(System.in);
 
 public void getSchool()
 {
  System.out.print("Enter School Code,Name= ");
  code=sc.nextInt();
  name=sc.next();
 }
 
 public void showSchool()
 {
  System.out.println("School Code= "+code);
  System.out.println("School Name= "+name);
 }
}
class Student extends School
{
 int rno;
 String stname;
 int marks;
 
 public void getStudent()
 {
  System.out.print("Enter Roll No,Student Name,Marks= ");
  rno=sc.nextInt();
  stname=sc.next();
  marks=sc.nextInt();
 }
 
 public void showStudent()
 {
  System.out.println("Roll No= "+rno);
  System.out.println("Students Name= "+stname);
  System.out.println("Marks= "+marks);
 }
}
class AbstractClass 
{
 public static void main(String args[])
 {
  Student s1=new Student();
  s1.getSchool();
  s1.getStudent();
  s1.showSchool();
  s1.showStudent();
 } 
}