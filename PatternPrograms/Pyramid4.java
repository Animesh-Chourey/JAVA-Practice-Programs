package PatternPrograms;

public class Pyramid4 {
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
                int m=64+l;
                System.out.print((char)m);
            }
            System.out.println();
        }
    }
    
}
