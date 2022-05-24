public class StringVsStringBufferClass1 {
    public static void main(String args[])
    {
        //Immutability Case
        String s=new String("Animesh");
        s.concat("Chourey");
        System.out.println("s= "+s);//Here the string Chourey won't be appended to Animesh because a new object that was created  that isn't referred to anyone(String class flaw) 
        
        StringBuffer sb=new StringBuffer("Animesh");
        sb.append("Chourey");
        System.out.println("sb="+sb);
    }
}
