package set.TreeSet;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{
    @Override
    public int compare(Employee o1,Employee o2)
    {
        double x=o1.getSalary()- o2.getSalary();
        if(x==0)
            return 1;
        else if(x<0)
            return -1;
        return 1;
               
    }
    
}
