// Single Level Inheritence

import java.util.Scanner;

interface A
{
 void sum(int x,int y);
 void fact(int n);
}
class B implements A
{
 public void multi(int x,int y)
 {
  int mul=x*y;
  System.out.println("Multiplication= "+mul);
 }
 @Override
 public void sum(int x,int y)
 {
  int s=x*y;
  System.out.println("Sum= "+s);
 }
 @Override
 public void fact(int n)
 {
  int f=1;
  while(n>0)
  {
   f=f*n;
   n--;
  }
  System.out.println("Factorial= "+f);
 }
}
class InterfaceSingleLevel
{
 public static void main(String args[])
 {
  B obj=new B();
  obj.sum(43,3);
  obj.fact(5);
  obj.multi(5,7);
 }
}
