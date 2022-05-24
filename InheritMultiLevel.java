// Multi Level Inheritence

import java.util.Scanner;
class Company
{
 int compcode;
 String compname;
 
 Scanner sc=new Scanner(System.in);
 
 public void getComp()
 {
  System.out.print("Enter Company Code, Name= ");
  compcode=sc.nextInt();
  compname=sc.next();
 }
 public void showComp()
 {
  System.out.println("Comapany Code= "+compcode);
  System.out.println("Company Name= "+compname);
 }
}

class Department extends Company
{
 int dno;
 String dname;
 
 public void getDept()
 {
  System.out.print("Enter Department Number, Name= ");
  dno=sc.nextInt();
  dname=sc.next();
 }
 public void showDept()
 {
  System.out.println("Department Number= "+dno);
  System.out.println("Department Name= "+dname);
 }
}

class Employee extends Department
{
 int ecode;
 String ename;
 int esal;
 
 public void getEmp()
 {
  System.out.print("Enter Employee Code, Name, Salary= ");
  ecode=sc.nextInt();
  ename=sc.next();
  esal=sc.nextInt();
 }
 public void showEmp()
 {
  System.out.println("Employee Code= "+ecode);
  System.out.println("Employee Name= "+ename);
  System.out.println("Employee Salary= "+esal);
 }
}

class InheritMultiLevel
{
 public static void main(String args[])
 {
  Employee e1=new Employee();
  e1.getComp();
  e1.getDept();
  e1.getEmp();
  e1.showComp();
  e1.showDept();
  e1.showEmp();
 }
}







