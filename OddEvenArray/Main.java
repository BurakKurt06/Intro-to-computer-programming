import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter numbers in array : ");
        numbers = scanner.nextInt();
        int[] arrayNum = new int[numbers];
        System.out.println("Enter " + numbers + " numbers :\n*Please switch to a new line after each number.* ");
        for(int array = 0; array < numbers; array++) {
            arrayNum[array] = scanner.nextInt();
        }

        System.out.print("Odd numbers : ");
        for(int array = 0 ; array < numbers ; array++)
        {
            if(arrayNum[array] % 2 != 0)
            {
                System.out.print(arrayNum[array]+",");
            }
        }
        System.out.println("");

        System.out.print("Even numbers : ");
        for(int array = 0 ; array < numbers ; array++)
        {
            if(arrayNum[array] % 2 == 0)
            {
                System.out.print(arrayNum[array]+",");
            }
        }
        scanner.close();
    }
}