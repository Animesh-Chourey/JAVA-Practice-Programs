package PatternPrograms;

public class Pyramid3 {
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
                int l=64+i;
                System.out.print((char)l);
            }
            System.out.println();
        }
    }
    
}
