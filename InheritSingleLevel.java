// Single Level Inheritence

import java.util.Scanner;
class College
{
 int ccode;
 String cname;
 Scanner sc=new Scanner(System.in);
 
 public void getCollege()
 {
  System.out.print("Enter College Code,Name= ");
  ccode=sc.nextInt();
  cname=sc.next();
 }
 public void showCollege()
 {
  System.out.println("College Name= "+cname);
  System.out.println("College Code= "+ccode);
 }
}

class Student extends College
{
 int rno;
 String sname;
 int marks;
 
 public void getStudent()
 {
  System.out.print("Enter Roll NO, Name, Marks= ");
  rno=sc.nextInt();
  sname=sc.next();
  marks=sc.nextInt();
 }
 public void showStudent()
 {
  System.out.println("Roll No= "+rno);
  System.out.println("Name= "+rno);
  System.out.println("Marks= "+marks);
 }
}

class InheritSingleLevel
{
 public static void main(String args[])
 {
  Student s1=new Student();
  s1.getCollege();
  s1.getStudent();
  s1.showCollege();
  s1.showStudent();
 }
}
