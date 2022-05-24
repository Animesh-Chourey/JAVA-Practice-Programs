import java.util.LinkedHashSet;

public class LinkedHashSetTest1 {
    public static void main(String[] args) {
        LinkedHashSet<StringBuffer> lhs=new LinkedHashSet<>();
        lhs.add(new StringBuffer("Rinku"));
        lhs.add(new StringBuffer("Tinku"));
        lhs.add(new StringBuffer("Chiku"));
        lhs.add(new StringBuffer("Piku"));
        
        for(StringBuffer item:lhs)
            System.out.println(item);
    }
}
