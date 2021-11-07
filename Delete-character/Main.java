import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
		String deleteSTRING;
		char deleteCHAR;
		
		sc= new Scanner(System.in);

		System.out.print("\nPlease write down the word you want a letter to be deleted.: ");
		deleteSTRING = sc.nextLine();
		
		System.out.print("\nPlease write a letter to be deleted from the word:");
		deleteCHAR = sc.next().charAt(0);
		
		StringBuilder sb = new StringBuilder(deleteSTRING);
		int i = deleteSTRING.lastIndexOf(deleteCHAR);
		sb.deleteCharAt(i);
		
		System.out.println( deleteCHAR + " Character: " + sb);
  }
}