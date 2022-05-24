class PrintWithoutMainMethod {
    static int i=methodOne(); 
    public static int methodOne()
    {
        System.out.println("I can print without main() method");
        System.exit(0);
        
       return 1;
    }   
}