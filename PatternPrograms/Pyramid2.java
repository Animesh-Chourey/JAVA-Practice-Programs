package PatternPrograms;

public class Pyramid2 {
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print(" ");
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++)
            {
                int l=(2*i)-1;
                System.out.print(l);
            }
            System.out.println();
        }
    }
    
}
