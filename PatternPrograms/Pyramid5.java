package PatternPrograms;

public class Pyramid5 {
    public static void main(String args[])
    {
        int l;
        for(int i=1;i<=5;i++)
        {
            System.out.print(" ");
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            l=(2*i)-1;
            for(int k=1;k<2*i;k++)
            {
                System.out.print(l);
                l--;
            }
            System.out.println();
        }
    }
    
}
