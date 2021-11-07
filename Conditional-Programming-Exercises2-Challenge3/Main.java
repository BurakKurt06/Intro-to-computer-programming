import java.util.Scanner;
public class Main
{
  public static void main (String[] args)  

  {
    //
		Scanner input = new Scanner(System.in);
		double cost, bolts, nuts, washers, washers2;

		//Ejecucion

		System.out.println("\nPlease introduce the number of bolts you wish to buy");
		bolts = input.nextDouble();

		System.out.println("Please introduce the number of nuts you wish to buy");
		nuts = input.nextDouble();

		System.out.println("Please introduce the number of washers you wish to buy");
		washers = input.nextDouble();

    washers2 = (washers * washers);
if ((bolts + nuts) < washers2)
			System.out.println("Check the order");
			System.out.println("Total amount will not be calculated");

else
       cost = (bolts * .05) + (nuts * .03) + (washers * .01);
			System.out.println("Order is OK");
			System.out.println("The total cost is:" + cost);

}
}
