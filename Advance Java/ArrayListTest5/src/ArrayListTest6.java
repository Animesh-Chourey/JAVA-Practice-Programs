//Directly add an element to the certain index 

import java.util.ArrayList;

public class ArrayListTest6 
{
   public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<>();
      al.add(100);
      al.add(200);
      al.add(300);
      al.add(50);
      al.add(150);
      System.out.println(al);
      al.add(7, 1000);
      System.out.println(al);      
      //System.out.println(al.size());
  }
  
}
/*
  al.add(7,1000)
                        7           1000 
  public void add(int index, Integer ele)
  {
     if(index > this.size())
      throw new IndexOutOfBoundsException()
  }
*/

