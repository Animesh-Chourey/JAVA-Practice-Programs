//instanceof Operator 

    
public class instanceofOperator {
    public static void main(String[] args) {
        String s=new String();
        if(s instanceof String)
            System.out.println("s object is instance of String");

        Thread t =new Thread();
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Object);//true //because THread extends Object class
        System.out.println(t instanceof Runnable);//true //because THread implements Runnable interface
}    
}
