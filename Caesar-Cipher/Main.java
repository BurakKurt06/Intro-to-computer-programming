//Ceaser
import java.util.Scanner;
class Main { 
    public static StringBuffer encrypt(String text, int num) { 
    StringBuffer result= new StringBuffer(); 
    for (int i=0; i<text.length(); i++) 
    { 
    if (Character.isUpperCase(text.charAt(i)))
    {  
    char ch = (char)(((int)text.charAt(i) + num - 65) % 26 + 65); 
    result.append(ch);
    } 
    else { 
    char ch = (char)(((int)text.charAt(i) + 
    num - 97) % 26 + 97); 
    result.append(ch); 
    } } 
    return result; 
    } 
    public static void main(String[] args) 
    { 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the message: ");
    String text = scanner.next(); 
    int number = 4; 
    System.out.println("Text  : " + text); 
    System.out.println("Cipher: " + encrypt(text, number)); 
    } 
}