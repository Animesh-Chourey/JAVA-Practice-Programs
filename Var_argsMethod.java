public class Var_argsMethod {
    public static void method(int i)
    {
        System.out.println("general method");
    }
    public static void method(int... i)
    {
        System.out.println("var-args method");
    }
    public static void main(String[] args) {
   
        method();
        method(10,20);
        method(10);
}
}
