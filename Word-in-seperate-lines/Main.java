import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int a;
        a = 0;
        System.out.println("Please enter your words");
        String word = scan.nextLine();

for(char c : word.toCharArray())
  System.out.println(c);
 }        
    }  
