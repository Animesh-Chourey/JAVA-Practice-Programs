public class StaticInnerClass3 {
    int x=10;
    static int y=20;
    static class Inner
    {
        public void method()
        {
            //System.out.println(x); cannot access non static member of outer class in static inner class
            System.out.println(y);
        }
    }
}
