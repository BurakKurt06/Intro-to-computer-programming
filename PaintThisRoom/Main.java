//Header
// Name: Burak Kurt
//Project name: Paint This Room
// Date: 4/12/2021

import java.util.Scanner;
public class Main{
public static void main(String[] args){

int COVERAGE = 350;
int doorSquareFeet = 25, windowSquareFeet = 20;
int length, width, height, doors, windows;
double totalSqFt;
double paintNeeded; 

Scanner scan = new Scanner (System.in);

System.out.println("Enter the length of the room in square feet");
length = scan.nextInt();

System.out.println("Enter the width of the room in square feet");
width = scan.nextInt();

System.out.println("Enter the height of the room in square feet");
height = scan.nextInt();

System.out.println("Enter the amount of doors in the room");
doors = scan.nextInt();

System.out.println("Enter the amount of windows in the room");
windows = scan.nextInt();

totalSqFt = 2*(length*height) + 2*(width+height) - doors*doorSquareFeet -windows*windowSquareFeet ;

paintNeeded = (totalSqFt/COVERAGE);

System.out.println ("Length of the room is " + length + ", the width of the room is " +
width + "and the height of the room is " + height + ".");

System.out.println ("There are " + doors + " doors and " + windows + " windows in the room.");

System.out.println ("You need " + paintNeeded + " gallons of paint to fill the room");
}
}