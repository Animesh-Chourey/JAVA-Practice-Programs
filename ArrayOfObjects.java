//Example of array of objects

import java.util.Scanner;
class Student
{
 private int rno;
 private String sname;
 private int marks;
 
 public void getDetails()
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Roll No, Name, Marks: ");
  rno=sc.nextInt(); 
  sname=sc.next();
  marks=sc.nextInt();
 }
 public void showDetails()
 {
  System.out.println("Name= "+sname);
  System.out.println("Roll no= "+rno);
  System.out.println("Marks= "+marks);
 }
}
class ArrayOfObjects
{
 public static void main(String args[])
 {
  Student s[]=new Student[3];
  int i;
  for(i=0;i<3;i++)
   s[i]=new Student();
  for(i=0;i<3;i++)
   s[i].getDetails();
  for(i=0;i<3;i++)
   s[i].showDetails();
 }
} 