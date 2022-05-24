package set.TreeSet;
//Practice program not related to this folder
public class Pyramid {
 public static void main(String args[])
 {
  int i,j,k,a=0;
  for(i=71;i>=65;i--)
  {
	  for(j=65;j<=i;j++)//To print the first half of the output
	  {
		  System.out.print((char)j+"\t");
	  }
          for(int l=1;l<2*a;l++) //to leave white space
           System.out.print("\t");
          if(i==71)//to print second half of the output
          {
              for(k=i-1;k>=65;k--)
		  System.out.print((char)k+"\t");
          }
          else//to print second half of the output
          {
              for(k=i;k>=65;k--)
		  System.out.print((char)k+"\t");
          }
          System.out.println();
          a++;
  }
 }   
}
