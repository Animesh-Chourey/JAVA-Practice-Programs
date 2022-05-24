public class String2 
{
    public static void main(String args[])
    {
        String s="AnimeshChourey";
        
        System.out.println(s.substring(5));
        System.out.println(s.substring(4,9));
     
        System.out.println(s.indexOf('e'));
        System.out.println(s.indexOf('a'));
        
        System.out.println(s.lastIndexOf('e'));
        
        String s1=" Ani mesh ";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
    }
}
