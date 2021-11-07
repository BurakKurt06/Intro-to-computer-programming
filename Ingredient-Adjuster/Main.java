//Header
// Name: Burak Kurt
//Project name: Ingredient Adjuster
// Date: 4/7/2021
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

double sugar = 1.5;
double butter = 1.0;
double flour = 2.75;
double cookies = 48.0;

System.out.println("How many cookies would you like to make?");
double num_of_cookies =scanner.nextDouble();

double sugar2 = (sugar/cookies) * num_of_cookies;
double butter2 = (butter/cookies) * num_of_cookies;
double flour2 = (flour/cookies) * num_of_cookies;

System.out.print("\nYou will need " + sugar2 + " cups of sugar, "
 + butter2 + " cups of butter and " + flour2 + " cups of flour.");
  }
}