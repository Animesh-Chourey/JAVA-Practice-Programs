package PatternPrograms;

public class Pyramid8 {
    public static void main(String args[])
    {
        int k;
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            
            for(k=i;k>0;k--)
            {
                int m=k;
                m--;
                System.out.print((char)(65+m));
                if(m==0)
                {
                    for(int n=m+1;n<i;n++)
                    {
                      
                        System.out.print((char)(65+n));
                    }
                }
            }
            System.out.println();
        }
    }
    
}
