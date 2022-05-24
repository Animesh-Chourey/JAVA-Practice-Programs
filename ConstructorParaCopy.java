//Parametrized and Copy Constructor

class Student
{
 int rno;
 String sname;
 int marks;
 
 public Student(int rno,String sname,int marks)
 {
  this->rno=rno;
  this->sname=sname;
  this->marks=marks;
  System.out.println("Para Constructor Called");
 }
 public Student(Student obj)
 {
  rno=obj.rno;
  sname=obj.sname;
  marks=obj.marks;
  System.out.println("Copy constructor called");
 }
 public void showDetails()
 {
 System.out.println("Roll No= "+rno);
 System.out.println("Name= "+sname);
 System.out.println("Marks= "+marks);
 }
}
class ConstructorParaCopy
{
 public static void main(string args[])
 {
  Student s1=new Student(101,"Ani",86);
  s1.showDetails();
  Student s2=new Student(101,"Aki",87);
  s2.showDetails();
  Student s3=new Student(s1);
  s3.showDetails();
 }
}