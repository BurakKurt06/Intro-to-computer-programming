//Header
// Name: Burak Kurt
//Project name: Ingredient Adjuster
// Date: 4/12/2021

import java.util.Scanner;
public class Main {
    public static void main (String args[]){ 
      
      int sizeOfWall= 100;
      int gallon= 1;
      int hoursOfLabor= 10;
      int laborCostPerHour= 20;

      Scanner scan= new Scanner(System.in);
      System.out.print("\nEnter the number of rooms:");
      double numberOfRooms= scan.nextDouble();

      System.out.print("\nEnter the amount of wall space in"+"each room (square feet please):");
      double sizeRoom = scan.nextDouble();

      System.out.print("\nEnter the price of paint per gallon:");
      double priceOfPaint = scan.nextDouble();

      double roomCostUnit = (sizeRoom * numberOfRooms)/sizeOfWall;
      double numberOfGallons = (gallon * roomCostUnit);

      System.out.print("\nThe number of Gallons of paint is:"+ numberOfGallons);
      double hoursRequired = (hoursOfLabor * roomCostUnit);
      System.out.print("\nThe hours of labor required is:"+ hoursRequired);

      double answer1 =  (priceOfPaint * numberOfGallons);
      System.out.print("\nThe cost of the paint is:" + answer1 +"$");
      double answer2 =  (hoursRequired * laborCostPerHour);
      System.out.print("\nThe labor fee will be:"+ answer2 +"$");
      double answer3 = answer1 + answer2 ;
      System.out.print("\nThe total cost of the paint job is:" + answer3 +"$");
    }
     }
