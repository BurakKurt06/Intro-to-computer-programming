import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double totalEarnings = 500;
double withdrawal;
while(totalEarnings>100) {
System.out.println("In your bank account right now, you have "+ totalEarnings+" dollars. How much would you like to withdraw?");
withdrawal= scan.nextDouble();
totalEarnings-=withdrawal;
}
 }
} 