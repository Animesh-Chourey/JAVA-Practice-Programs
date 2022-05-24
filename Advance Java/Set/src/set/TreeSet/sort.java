package set.TreeSet;
import java.util.Arrays;
public class sort {
    public static void main(String[] args) {
   String s[]={"Ani","Rishi","Aki"};
   /*int j,k;
   for(int i=0;i<3;i++)
   {
       k=0;
       j=0;
       while(k==0)
       {
           if(j>lastIndexOf(s[i]))
          if(s[i].charAt(j)>s[i+1].charAt(j))
          {
            String temp= s[i];
            s[i]=s[i+1];
            s[i+1]=temp;
            k=1;
            break;
          }
          else
              j++;
       }
   }
*/
   Arrays.sort(s);
   for(int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }
}
  


