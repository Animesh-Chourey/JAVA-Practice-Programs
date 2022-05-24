import java.util.ArrayList;
import java.util.Iterator;

class ArrList2
{
 public static void main(String args[])
 {
  ArrayList<Integer> al=new ArrayList<Integer>();
  al.add(100);
  al.add(200);
  al.add(300);
  al.add(400);
  
  Iterator<Integer> itr=al.iterator();
  while(itr.hasNext())
  {
   System.out.println(itr.hasNext()+" "+itr.next());
  }
 }
}