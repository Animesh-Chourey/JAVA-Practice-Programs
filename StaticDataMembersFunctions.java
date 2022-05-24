//Static Data Members and Static Method

import java.util.Scanner;
class Bank
{
 int acno;
 String cname;
 int cbal,wm,dm;
 static int bbal;
 
 Scanner sc=new Scanner(System.in);
 public void getDetails()
 {
  System.out.print("Enter Account No, Customer Name, Opening Balance= ");
  acno=sc.nextInt();
  cname=sc.next();
  cbal=sc.nextInt();
  bbal=bbal+cbal;
 }
 public void showDetails()
 {
  System.out.println("Account No= "+acno);
  System.out.println("Customer Name= "+cname);
  System.out.println("Balance= "+cbal);
 }
 public void deposit()
 {
  System.out.print("Enter the amount u want to deposit= ");
  dm=sc.nextInt();
  cbal=cbal+dm;
  bbal=bbal+dm;
 }
 public void withdraw()
 {
  System.out.print("Enter amount to withdraw= ");
  wm=sc.nextInt();
  if(bbal>wm)
  {
   cbal=cbal-wm;
   bbal=bbal-wm;
  }
  else
   System.out.println("Insufficient Fund"); 
 }
 public static void showTotal()
 {
  System.out.println("Total Balanc of the bank= "+bbal);
 }
 
 public static void main(String args[])
 {
  Bank cust1=new Bank();
  Bank cust2=new Bank();
  cust1.getDetails();
  cust2.getDetails();
  cust1.showDetails();
  cust2.showDetails();
  cust1.deposit();
  cust2.deposit();
  cust1.withdraw();
  cust2.withdraw();
  cust1.showDetails();
  cust2.showDetails();
  Bank.showTotal();
 }
}
 





