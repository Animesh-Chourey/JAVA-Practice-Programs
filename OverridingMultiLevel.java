// Overriding Multiple Inheritence

class A
{
 public void show()
 {
  System.out.println("Hello show function of class A");
 }
}
class B extends A
{
 public void show()
 {
  super.show();
  System.out.println("Hello show function of class B");
 }
}
class C extends B
{
 public void show()
 {
  super.show();
  System.out.println("Hello show function of class C");
 }
}
class OverridingMultiLevel
{
 public static void main(String args[])
 {
  C obj=new C();
  obj.show();
 } 
}
