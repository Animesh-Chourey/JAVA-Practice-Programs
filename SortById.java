import java.util.Comparator;
public class SortById implements Comparator<Employee> 
{
    @Override
    public int compare(Employee e1,Employee e2)
    {
         return e2.getId()- e1.getId();
    }
}
