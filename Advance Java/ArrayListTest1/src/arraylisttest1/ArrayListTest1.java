//Not Type Safe Example

package arraylisttest1;

import java.util.ArrayList;
        
public class ArrayListTest1 {
    
    public static void main(String[] args) {
        ArrayList al=new ArrayList(3);
        al.add(100);
        al.add("Rahil");
        al.add(true);
        al.add(20.5f);
        al.add(50.5);
        al.add('A');
        System.out.println(al);
        System.out.println(al.size());
       
    }
   
}