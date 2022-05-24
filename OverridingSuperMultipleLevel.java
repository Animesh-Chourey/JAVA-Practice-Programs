// super() with paramerterized constructor in derieved and base class

class School
{
 int scode;
 String sname;
 
 public School(int code,String name)
 {
  scode=code;
  sname=name;
  System.out.println("Para Constructor called of base class");
 }	
 
 public void showSchool()
 {
  System.out.println("School Code= "+scode);
  System.out.println("School Name= "+sname);
 }
}
class Student extends School
{
 int rno;
 String stname;
 int fees;
 
 public Student(int no,String nm,int f,int code,String name)
 {
  super(code,name);
  rno=no;
  stname=nm;
  fees=f;
  System.out.println("Para onstructor of child class");
 }
 
 public void shoeStudent()
 {
  System.out.println("Roll No= "+rno);
  System.out.println("Name= "+stname);
  System.out.println("Fees= "+fees);
 }
}
class OverridingSuperMultipleLevel
{
 public static void main(String args[])
 {
  Student s1=new Student(1,"XYZ",500000,101,"ABC");
  s1.showSchool();
  s1.shoeStudent();
 }
}