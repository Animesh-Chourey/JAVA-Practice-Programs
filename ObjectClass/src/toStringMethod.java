public class toStringMethod {
    String name;
    int rno;
    
    toStringMethod(int rno,String name)
    {
        this.name=name;
        this.rno=rno;
    }
           public static void main(String args[])
           {
               toStringMethod obj=new toStringMethod(101,"Ani");
               System.out.println(obj);
               System.out.println(obj.toString());
           }
}
