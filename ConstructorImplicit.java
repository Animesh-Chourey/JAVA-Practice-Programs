//Implicit Constructor

class Student
{
 int rno;
 String sname;
 int marks;
 
 public void showDetails()
 {
  System.out.println("Roll No= "+rno);
  System.out.println("Name= "+sname);
  System.out.println("Marks= "+marks);
 }
}
class ConstructorImplicit
{
 public static void main(String args[])
 {
  Student obj=new Student();
  obj.showDetails();
 }
}