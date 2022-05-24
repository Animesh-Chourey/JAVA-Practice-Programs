public class FinalVariable {
    final int i; //Way to declare final variable inside instance block
    {
        i=0;
    }
    final int j;
    public FinalVariable() { //Way to declare final variable inside constructor
        this.j = 10;
    }
    final int k=20; //Way to declare final variable inside constructor
    public static void main(String args[])
    {
        FinalVariable v=new FinalVariable();
        System.out.println(v.i);
        System.out.println(v.j);
        System.out.println(v.k);
    }    
}