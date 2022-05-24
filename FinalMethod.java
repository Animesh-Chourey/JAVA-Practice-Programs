//Parent Class with final function cannot be overridden in child class

class Parent
{
    final void print()
    {
        System.out.println("Parent class function");
    }
    void normal()
    {
        System.out.println("Normal Function");
    }    
}
class Child extends Parent
{
    void print()
    {
        System.out.println("Child class function");
    }
}
public class FinalMethod {
    public static void main(String[] args) {
      Child obj=new Child();
      obj.print();
    }    
}
