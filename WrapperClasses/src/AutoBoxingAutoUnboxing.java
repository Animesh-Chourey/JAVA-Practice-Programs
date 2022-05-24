public class AutoBoxingAutoUnboxing 
{
    public static void main(String args[])
    {
        //AutoUnboxing
        Integer iobj=new Integer(20);
        int i=iobj;
        System.out.println(i);
        
        //AutoBoxing
        int x=10;
        Integer xobj=x;
        System.out.println(xobj);
    }
}
