//List Iterator Example

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorTest2ListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        
        ListIterator<Integer> lit=al.listIterator(al.size());
        while(lit.hasPrevious())
            System.out.println(lit.previous());
        System.out.println("hello .....");
        Iterator<Integer> itr=al.iterator();
        while(itr.hasNext())
        {
            int x=itr.next();
            if(x==500)
                itr.remove();
            System.out.println(x);
            System.out.println(al);
        }
    }
    
}
