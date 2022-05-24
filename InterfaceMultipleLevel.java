// Multiple Level Inheritence

interface A
{
 void show();
 int dsum(int n);
}
interface B
{
 void check(int n);
 void table(int n);
}
class C
{
 public void print(String s)
 {
  System.out.println("Welcome "+s);
 }
}
class D extends C implements A,B
{
 public void myfun()
 {
  System.out.println("My Finction of Class D");
 }
 
 @Override
 public void show()
 {
  System.out.println("Show Function");
 }
 
 @Override
 public int dsum(int n)
 {
  int r,s=0;
  while(n>0)
  {
   r=n%10;
   s=s+r;
   n=n/10;
  }
  return (s);
 }
 
 @Override
 public void check(int n)
 {
  if(n%2==0)
	System.out.println("Even");
  else
	System.out.println("Odd");  
 }
 
 @Override
 public void table(int n)
 {
  int i,t;
  for(i=1;i<=10;i++)
  {
   t=n*i;
   System.out.println(t);  
  }
 }
}
class InterfaceMultipleLevel
{
 public static void main(String args[])
 {
  D obj=new D();
  obj.print("Rahul");
  obj.show();
  int k=obj.dsum(4836);
  System.out.println("Sum Of Digits= "+k);
  obj.check(34);
  obj.table(5);
 }
}