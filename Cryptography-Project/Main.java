import java.util.Scanner;

 class Main
{
     public static void main(String[] args)
     {
		Scanner scan = new Scanner (System.in);       
          String answer;               
          System.out.println("Do you want?");
          answer=scan.nextLine();
//==================================================
//Ceaser
if(answer.equals("Ceaser")){
public static StringBuffer encrypt(String text, int num){ { 
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
    String text = "ATTACKATONCE"; 
    int number = 4; 
    System.out.println("Text  : " + text); 
    System.out.println("Cipher: " + encrypt(text, number)); 
    } 
}
     }
//==================================================
// Affine
if(answer.equals("Affine")){
public static String encryption(String cipher){
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
        System.out.println("Encrypted Message is : "+ encryption(message));
        System.out.println("Decrypted Message is: " + decryption(message));
        scanner.close();
    }
}
     }
//==================================================
//Atbash
if(answer.equals("Atbash")){
public static void main(String[] args)  {
    {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to the Atbash decoder!\n" + "Enter a message to decode: ");
    String message = keyboard.nextLine();
    System.out.println("\nDECRYPTED: " + decrypt(message).toUpperCase());
    }
    public static String decrypt(String message)
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
    }
//==================================================
     }
}