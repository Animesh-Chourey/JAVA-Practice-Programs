package arraylisttest4;

import java.util.ArrayList;

public class ArrayListTest4 {

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(100);
        al.add(400);
        al.add(500);
        al.add(100);
        
        al.remove(new Integer(100));
        System.out.println(al);
                
        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(100);
        al2.add(400);
        al2.add(500);
        al2.addAll(al);
        System.out.println(al2);
    }
    
}
