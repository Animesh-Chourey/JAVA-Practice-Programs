package arraylisttest3;

import java.util.ArrayList;
public class ArrayListTest3 {

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(5);
        al.add(6);
        al.add(4);
        al.add(2);
        al.add(1);
        System.out.println(al);
        al.remove(new Integer(1));
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        al.remove(1000);
    }
    
}
