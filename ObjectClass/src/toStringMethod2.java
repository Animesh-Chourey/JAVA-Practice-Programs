public class toStringMethod2 
{
    int rno;
    String name;

    public toStringMethod2(int rno, String name) 
    {
        this.rno = rno;
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return name+"\t"+rno;
    }
    
    public static void main(String args[])
    {
        toStringMethod2 obj=new toStringMethod2(101, "Ani");
        System.out.print(obj);
    }
}