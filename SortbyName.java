import java.util.Comparator;
public class SortbyName implements Comparator<Employee>
{
    @Override
    public int compare(Employee e1,Employee e2)
    {
        int x=e2.getName().compareTo(e1.getName());
        if(x==1)
            return 1;
        else if(x==-1)
            return -1;
        else 
            return 0;
    }
}
