import java.util.TreeSet;
public class TreeSetComparatorExample 
{
    public static void main(String args[])
    {
        Employee e1=new Employee(101,"Ani",60000.4);
        Employee e2=new Employee(105,"Aki",60000.5);
        Employee e3=new Employee(103,"Abc",30000.6);
        Employee e4=new Employee(104,"Xyz",50000.6);
        Employee e5=new Employee(102,"Lmn",76000.6);
        
        TreeSet<Employee> ts=new TreeSet<Employee>(new SortById());
      // TreeSet<Employee> ts=new TreeSet<Employee>(new SortbyName());
        ts.add(e1);
        ts.add(e2);
        ts.add(e3); 
        ts.add(e4);
        ts.add(e5);
        
        for(Employee e: ts)
        {
            System.out.println(e.getId()+"\t"+e.getSalary()+"\t"+e.getName());
        }
    }
}
