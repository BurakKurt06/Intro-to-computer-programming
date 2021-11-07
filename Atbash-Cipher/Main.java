//Atbash
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to the Atbash decoder!\n" + "Enter a message to decode: ");
    String message = keyboard.nextLine();
    System.out.println("\nDECRYPTED: " + decrypt(message).toUpperCase());
    }
    public static String decrypt( String message )
    {
    StringBuilder decoded = new StringBuilder();
    for (char c : message.toCharArray()) {
    if (Character.isLetter(c)) {
    int newChar = ('A' - c) + 'Z';
    decoded.append((char) newChar);
    } else {
    decoded.append(c);
    }
    }
    return decoded.toString();
    }
}