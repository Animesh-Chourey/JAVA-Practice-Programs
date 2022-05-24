package arraylisttest5;
import java.util.ArrayList;
public class ArrayListTest5 {
public static void main(String[] args) {
    ArrayList<Integer>al=new ArrayList<Integer>();
    al.add(100);
    al.add(200);
    al.add(300);
    al.add(100);
    al.add(400);
    al.add(500);
    al.add(100);
    
    ArrayList<Integer>al2=new ArrayList<Integer>();
    al2.add(100);
    al2.add(400);
    al2.add(500);
    al2.addAll(al);
    System.out.println(al2);
    ArrayList<Integer>al3=new ArrayList<Integer>();
    al3.add(100);
    al3.add(600);
    al3.add(700);
    al3.addAll(al2);
    al3.removeAll(al);
    System.out.println(al3);  
      

    }
    
}
