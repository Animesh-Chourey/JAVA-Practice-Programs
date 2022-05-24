package iteratortest1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest1{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        
        Iterator<Integer> itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    
}
