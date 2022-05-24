// super() Function

class School
{
 int scode;
 String sname;
 
 public School()
 {
  scode=101;
  sname="ABC";
  System.out.println("Default Constructor Called of Base Class");
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
 
 public Student()
 {
  super();
  rno=1;
  stname="XYZ";
  fees=500000;
  System.out.println("Default Constructor Called of Derieved Class");
 }
 
 public void showDetails()
 {
  System.out.println("Roll No= "+rno);
  System.out.println("Student Name= "+stname);
  System.out.println("Fees= "+fees);
 }
}

class OverridingSuperSingleLevel
{
 public static void main(String args[])
 {
  Student s1=new Student();
  s1.showSchool();
  s1.showDetails();
 }
}







