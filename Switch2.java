//Since java doesnot accept single character then to accept single charcacter as switch case
 
import java.util.Scanner;
class Switch2
{
 public static void main(String args[])
 {
  char ch;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter an alphabet= ");
  ch=sc.next().charAt(0);
  switch(ch)
  {
   case 'a':
    System.out.println("Vowel");
	break;
   case 'e':
    System.out.println("Vowel");
	break;
   case 'i':
    System.out.println("Vowel");
	break;
   case 'o':
    System.out.println("Vowel");
	break;
   case 'u':
    System.out.println("Vowel");
	break;
   default:
    System.out.println("Consonant");   
  }
 }
}