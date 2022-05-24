package set.TreeSet;

import java.util.TreeSet;

public class TreeSetTest1 {
    public static void main(String[] args) {
         
        System.out.println("Objects Created");
        Employee e1=new Employee(100,"Chiku", 98000.50);
        Employee e2=new Employee(105,"Piku", 97000.50);
        Employee e3=new Employee(102,"Rinku", 59000.50);
        Employee e4=new Employee(104,"Tinku", 60000.50);
        Employee e5=new Employee(103,"Chinku", 35000.50);
        Employee e6=new Employee(109,"Tinku", 60000.50);
        
     // TreeSet<Employee> ts=new TreeSet<>();   //If we want to sort with the help of comparable interface
     // TreeSet<Employee> ts = new TreeSet<>(new SortById());  //If we want to sort according to comaparator interface and sort with ID 
     // TreeSet<Employee> ts = new TreeSet<>(new SortBySalary());  //If we want to sort according to comaparator interface and sort with Salary
        TreeSet<Employee> ts = new TreeSet<>(new SortByName());
        System.out.println("After Objects Created");
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        ts.add(e6);
        
        for(Employee e : ts)
        {
            System.out.println(e.getId()+"\t"+e.getSalary()+"\t"+e.getName());
        }
    }
}