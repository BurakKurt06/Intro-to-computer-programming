import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int i, num;
        double total=0, avg;
        Scanner scanner = new Scanner(System.in);
    
        for(i=0; i<6; i++) { 
           System.out.print(" Enter Marks of Subject "+(i+1)+":");
           num = scanner.nextInt();
           total = total + num;
        }
        avg = total/6;
        System.out.print(" The student Grade is: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=70 && avg<80)
        {
            System.out.print("C");
        }
         else if(avg>=60 && avg<70)
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("F");
        }
    }
}