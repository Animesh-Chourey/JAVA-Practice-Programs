package linkedlisttest1;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTest1 {

    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ani");
        ll.add("Aki");
        ll.add("Abhyu");
        ll.add("Rishi");
        System.out.println(ll.size());
        Iterator<String> itr=ll.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
    
}
