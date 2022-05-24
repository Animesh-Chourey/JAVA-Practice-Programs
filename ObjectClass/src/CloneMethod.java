public class CloneMethod implements Cloneable
{
    int i=10,j=20;
    
    public static void main(String args[]) throws CloneNotSupportedException
    {
        CloneMethod obj=new CloneMethod();
        CloneMethod obj2=(CloneMethod)obj.clone();
        obj2.i=100;
        obj2.j=200;
        System.out.println(obj.i+"----------"+obj.j);
        System.out.println(obj2.i+"-----------"+obj2.j);
    }
}