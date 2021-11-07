// Affine
import java.util.Scanner;
  class Main{  
    public static String encryption(String cipher)
    { 
    String affine = "";
    int a = 3, b = 6;
    for (int i = 0; i < cipher.length(); i++)
    {
    affine = affine + (char) ((((a * cipher.charAt(i)) + b) % 26) + 65);
    }
    return affine;
    }
    public static String decryption(String affine)
    {
    String cipher = "";
    int a = 3, b = 6, c = 0, flag = 0;
    for (int i = 0; i < 26; i++)
    {
    flag = (a * i) % 26;
    if (flag == 1)
    {
    c = i;
    System.out.println(i);
    }
    }
    for (int i = 0; i < affine.length(); i++)
    {
    cipher = cipher + (char) (((c * ((affine.charAt(i) - b)) % 26)) + 65);
    }
    return cipher;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String message = scanner.next();
        System.out.println("Message is :" + message);
        System.out.println("Encrypted : "+ encryption(message));
        System.out.println("Decrypted : " + decryption(message));
        scanner.close();
    }
}