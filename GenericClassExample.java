class Gen<T>
{
    T obj;
    public Gen(T obj)
    {
        this.obj=obj;
    }
    public void show()
    {
        System.out.println(obj.getClass());
    }
    public T getObject()
    {
        return obj;
    }
}
class GenericClassExample
{
    public static void main(String args[])
    {
        //Integer Type Object
        Gen<Integer> i=new Gen<>(10);
        i.show();
        System.out.println(i.getObject());
        
        //String Type Object
        Gen<String> s=new Gen<>("ABC");
        s.show();
        System.out.println(s.getObject());
    }
} 
