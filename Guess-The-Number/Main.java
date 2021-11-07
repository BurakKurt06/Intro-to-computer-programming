import java.util.Scanner;

public class Main
{
public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    int count = 0;
    int a = 1 + (int)(Math.random() * 99);
    int guess = 0;

    System.out.println("I am thinking of a number from 1 to 99 ... Guess what it is ?");
    while (guess != a) {
      count++;
        guess = keyboard.nextInt();
        if (guess > a) {
            System.out.println("Your number is high!");
        } else if (guess < a) {
            System.out.println("Your number is low!");
        }
    }
    System.out.println("Congratulations. You guessed in " + count + " tries!");
}
}