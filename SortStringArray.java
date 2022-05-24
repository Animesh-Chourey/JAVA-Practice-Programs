public class SortStringArray {
public static void main(String[] args) {
   String city[]={"Delhi","Agra","Pune","Indore","Bhopal"};
   int i,m,j;
   for(i=0;i<city.length;i++)
   {
   for(j=i+1;j<city.length;j++)
   { 
       if(i==4)
        break;
    else
    {
       m=city[i].compareTo(city[j]);
      if(m>0)
      {
          String temp=city[i];
          city[i]=city[j];
          city[j]=temp;
      }
    } 
   }
   }
   for(i=0;i<5;i++)
           System.out.println(city[i]);
}
    
}
