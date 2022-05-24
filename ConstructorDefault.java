//Default Constructor

class Student
{
 int rno;
 String sname;
 int marks;
 
 public Student()
 {
  rno=101;
  sname="ABC";
  marks=96;
  System.out.println("Default Constructor");
 }
 public void showDetails()
 {
  System.out.println("Roll No= "+rno);
  System.out.println("Name= "+sname);
  System.out.println("Marks= "+marks);
 }
}
class ConstructorDefault
{
 public static void main(String args[])
 {
  Student s1=new Student();
  s1.showDetails();
  Student s2=new Student();
  s2.showDetails();
 }
}