package vector;

import java.util.Vector;
import java.util.Enumeration;
public class VectorTest1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(3,2);
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println(v.capacity());
        v.add(40);
        System.out.println(v.capacity());
        Enumeration<Integer> en=v.elements();
        while(en.hasMoreElements())
            System.out.println(en.nextElement());
    }
    
}
