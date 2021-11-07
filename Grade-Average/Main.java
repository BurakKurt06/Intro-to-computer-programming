import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); {
 double a, b, c, d, e, f, ab, cd, ef;
 System.out.print("How much is the a ");
 a = input.nextDouble();

 System.out.print("How much is the b ");
 b = input.nextDouble();

 System.out.print("How much is the c ");
 c = input.nextDouble();

 System.out.print("How much is the d ");
 d = input.nextDouble();

 System.out.print("How much is the e ");
 e = input.nextDouble();

 System.out.print("How much is the f ");
 f = input.nextDouble();

 ab = ((a*b)/2);
 cd = ((c*d)/2);
 ef = ((e*f)/2);

 if (ab <= cd <= ef);
       System.out.println(" ab < cd < ef "); 
if  (ab <= ef <= cd); 
       System.out.println(" ab < ef < cd "); 
 if  (cd <= ab <= ef); 
       System.out.println(" cd < ab < ef "); 
 if  (cd <= ef <= ab); 
       System.out.println(" cd < ef < ab "); 
 if  (ef <= cd <= ab);
       System.out.println(" ef < cd < ab "); 
 if  (ef <= ab <= cd); 
       System.out.println(" ef < ab < cd "); 
      

  }
}