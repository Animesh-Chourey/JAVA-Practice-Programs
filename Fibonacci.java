import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n,a=-1,b=1,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit = ");
        n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            System.out.print(c+"\t");
            a=b;
            b=c;
        }
    }
}
