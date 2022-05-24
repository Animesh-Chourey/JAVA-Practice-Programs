public class StringVsStringBufferClass2 {
    public static void main(String args[])
    {
        //equals() method difference
        
        String s1=new String("Animesh");
        String s2=new String("Animesh");
        System.out.println(s1.equals(s2));//equals() method here is overridden, so content is cheched of objects
        
        StringBuffer sb1=new StringBuffer("Animesh");
        StringBuffer sb2=new StringBuffer("Animesh");
        System.out.println(sb1.equals(sb2));//equals() method here is  not overridden, so reference is cheched of objects
    }
}
