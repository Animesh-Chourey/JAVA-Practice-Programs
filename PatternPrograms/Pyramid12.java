package PatternPrograms;

public class Pyramid12 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
                System.out.print("\t");
            for(int k=1;k<=(2*i)-1;k++)
            {
               if(i%2==0)
               {
                  if(k%2!=0)
                       System.out.print(i+"\t");
                  else
                       System.out.print("\t");
               }
               else
               {
                   if(k%2!=0)
                       System.out.print(i+"\t");
                  else
                       System.out.print("\t");
               }
            }
            System.out.println();
        }
    }
    
}
