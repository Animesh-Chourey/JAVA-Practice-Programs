import java.util.*;
import java.util.TreeSet;
import java.util.Comparator;
class ComparatorInterfaceExample
{
 public static void main(String args[])
 { 
  TreeSet ts=new TreeSet();
  ts.add(10);
  ts.add(30);
  ts.add(5);
  System.out.println(ts);
 }
}
class MyComparator implements Comparator
{
 public int compare(Object o1,Object o2)
 {
	 Integer i1=(Integer)o1;
	 Integer i2=(Integer)o2;
  if(i1<i2)
   return 1;
  else if(i1>i2)
   return -1;
  else
   return 0;  
 }
}