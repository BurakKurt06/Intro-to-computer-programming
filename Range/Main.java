import java.util.Scanner;
class Main {
  public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
int number;
System.out.print("Enter a number in the range of 10 - 24: ");
number = keyboard.nextInt();
while (number < 10 || number > 24)
{
System.out.println("That number is not in the range.");
System.out.print("Enter a number in the range of 10 - 24: ");
number = keyboard.nextInt();
}
  }
}