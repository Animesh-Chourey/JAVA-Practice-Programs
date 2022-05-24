package set.TreeSet;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>{
    @Override
    public int compare(Employee o1,Employee o2)
    {
        int x=o1.getName().compareTo(o2.getName());
        if(x==0)
            return 1;
        return x;
    }
}
