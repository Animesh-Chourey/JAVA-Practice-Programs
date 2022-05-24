package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(100);
        hs.add(200);
        hs.add(600);
        hs.add(500);
        hs.add(1000);
        hs.add(300);
        hs.add(1000);
        
        Iterator<Integer> itr=hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        } 
    }
}
