package PatternPrograms;

public class Pyramid7 {
    public static void main(String[] args) {
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
                System.out.print(m);
                if(m==0)
                {
                    for(int n=m+1;n<i;n++)
                    {
                      
                        System.out.print(n);
                    }
                }
            }
            System.out.println();
        }
    }
    
}
