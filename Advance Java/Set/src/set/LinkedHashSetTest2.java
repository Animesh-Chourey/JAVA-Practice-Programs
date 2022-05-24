package set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest2 {
    public static void main(String[] args) {
        LinkedHashSet<Customer> lhs=new LinkedHashSet<Customer>();
        lhs.add(new Customer(1,"Rahil","834590832",26));
        lhs.add(new Customer(2,"Sahil","783443585",24));
        lhs.add(new Customer(3,"Nikhil","982385785",27));
        lhs.add(new Customer(4,"Rahul","945869834",26));
        lhs.add(new Customer(2,"Sahil","783443585",24));
        for(Customer c: lhs)
            System.out.println(c);
    }
}
