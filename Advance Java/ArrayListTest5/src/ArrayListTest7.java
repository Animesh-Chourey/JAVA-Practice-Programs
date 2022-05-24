import java.util.ArrayList;
//import java.util.Collections;
public class ArrayListTest7 {
    public static void main(String[] args) {
        ArrayList<Customer> al=new ArrayList<>();
        al.add(new Customer(1,"Chiku","2345095",20));
        al.add(new Customer(4,"Piku","7845095",21));
	al.add(new Customer(2,"Tinku","5647095",22));
	al.add(new Customer(3,"Rinku","672342550",23));
        for(Customer c:al)
            System.out.println(c);
    }
    
}
