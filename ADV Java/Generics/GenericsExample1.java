class Gen<T>
{
 T obj;
 public Gen(T obj)
 {
  this.obj=obj;
 }
 public void show()
 {
  System.out.println("The type of object is : "+obj.getClass());
 }
 public T getObject()
 {
  return obj;
 }
}
class GenericDemo
{
 public static void main(String args[])
 {
  Gen<Integer> iobj=new Gen<Integer>(20);
  iobj.show();
  System.out.println(iobj.getObject());
 }
}