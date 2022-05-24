// Function Overriding

import java.util.Scanner;
class Bank
{
 int bcode;
 String bname;
 
 Scanner sc=new Scanner(System.in);
 public void getDetails()
 {
  System.out.print("Enter Bank Code Bank Name= ");
  bcode=sc.nextInt();
  bname=sc.next();
 }
 
 public void showDetails()
 {
  System.out.println("Bank Code= "+bcode);
  System.out.println("Bank Name= "+bname);
 }
}
class Customer extends Bank
{
 int cid;
 String cname;
 int balance;
 
 public void getDetails()
 {
  super.getDetails();
  System.out.print("Enter Customer ID Name and Balance= ");
  cid=sc.nextInt();
  cname=sc.next();
  balance=sc.nextInt();
 }
 public void showDetails()
 {
  super.showDetails();
  System.out.println("Customer ID= "+cid);
  System.out.println("Customer Name= "+cname);
  System.out.println("Balance= "+balance);
 }
}
class OverridingSingleLevel
{
 public static void main(String args[])
 {
  Customer c1=new Customer();
  c1.getDetails();
  c1.showDetails();
 }
}
