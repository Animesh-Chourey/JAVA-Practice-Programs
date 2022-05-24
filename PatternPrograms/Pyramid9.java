package PatternPrograms;

public class Pyramid9 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                
                if(k==i)
                {
                    for(int l=k;l>=1;l--)
                        System.out.print(l);
                }
                else 
                    System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
