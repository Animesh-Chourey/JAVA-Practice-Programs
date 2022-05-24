import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
   int n,r,s=0,m;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number= ");
    n=sc.nextInt();
    m=n;
    while(m>0)
    {
        r=m%10;
        s=s+(r*r*r);
        m=m/10;
    }
    System.out.println("s= "+s);
    if(s==n)
        System.out.println("Number "+n+"is a Armstrong Number");
    else
        System.out.println("Number "+n+"is not a Armstrong Number");
}
    
}
