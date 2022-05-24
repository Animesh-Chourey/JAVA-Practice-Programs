package PatternPrograms;

public class Pyramid6 {
    public static void main(String args[])
    {
        int l,m;
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            m=(2*i)-1;
            l=64+m;
            for(int k=1;k<2*i;k++)
            {
                System.out.print((char)l);
                l--;
            }
            System.out.println();
        }
    }
    
}
