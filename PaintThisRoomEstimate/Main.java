//Header
// Name: Burak Kurt
//Project name: Paint This Room Estimate
// Date: 4/12/2021

import java.util.Scanner;
public class Main {
public static void main(String[] args) {

Scanner scan = new Scanner (System.in);

int play = 1;
int COVERAGE = 350;
int doorSquareFeet = 25;
int windowSquareFeet = 20;
int sizeOfWall= 100;
int gallon= 1;
int hoursOfLabor= 10;
int laborCostPerHour= 20;
int length; 
int width; 
int height; 
int doors; 
int windows;
double totalSqFt;
double paintNeeded;
double priceOfPaint = 25;
double sizeRoom;
double roomCostUnit;
double numberOfGallons;
double hoursRequired;
double answer1;
double answer2;
double answer3;
double bill;
double tipPercentage; 
double tip; 
double billTip;
while (play == 1){

System.out.println("\nEnter the length of the room in square feet");
 length = scan.nextInt();

System.out.println("\nEnter the width of the room in square feet");
 width = scan.nextInt();

System.out.println("\nEnter the height of the room in square feet");
 height = scan.nextInt();

System.out.println("\nEnter the amount of doors in the room");
 doors = scan.nextInt();

System.out.println("\nEnter the amount of windows in the room");
 windows = scan.nextInt();

 totalSqFt = 2*(length*height) + 2*(width+height) - doors*doorSquareFeet -windows*windowSquareFeet ;
 paintNeeded = (totalSqFt/COVERAGE);
 sizeRoom = paintNeeded;
 roomCostUnit = sizeRoom * sizeOfWall;
 numberOfGallons = (gallon * roomCostUnit);

System.out.print("\nThe number of Gallons of paint is:"+ numberOfGallons);
 hoursRequired = (hoursOfLabor * roomCostUnit);
System.out.print("\nThe hours of labor required is:"+ hoursRequired);

 answer1 = (priceOfPaint * numberOfGallons);
 answer2 = (hoursRequired * laborCostPerHour);
 answer3 = answer1 + answer2;

System.out.println ("Length of the room is " + length + ", the width of the room is " + width + "and the height of the room is " + height + ".");
System.out.println ("There are " + doors + " doors and " + windows + " windows in the room.");
System.out.println ("You need " + paintNeeded + " gallons of paint to fill the room");

System.out.print("\nThe cost of the paint is:" + answer1 +"$");
System.out.print("\nThe labor fee will be:"+ answer2 +"$");
System.out.print("\nThe total cost of the paint job is:" + answer3 +"$");

 bill = answer3;
System.out.println("What percentage would you like to tip the worker?");
 tipPercentage = scan.nextDouble(); 
 tip = bill * (tipPercentage/100);
 billTip = bill * (tipPercentage/100) + bill; 
System.out.println("Your tip amount is $" + tip); 
System.out.println("Your bill + tip is $" + billTip);

System.out.println("Would you like to use the Paint Job Calculator again? (1 for Yes, 2 for No)");
 play = scan.nextInt();
}
}
}