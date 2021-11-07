import java.util.Scanner;
import java.text.DecimalFormat;

public class PizzaOrder {
  public static void main (String [] args) { 
    Scanner keyboard = new Scanner (System.in);
    PizzaOrder order = new PizzaOrder ();

    String firstName;
    int inches; 
    int crustType; 
    double cost; 
    double tax_rate = .0625;
    double tax; 
    char choice; 
    String input; 
    String toppings;
    int numberOfToppings = 0;

    inches = setSize;
    inches = setSize;
    public Main (String toppings, int numberOfToppings, double cost, int inches, int crustType) {
      
      this.numberOfToppings = numberOfToppings;
      this.toppings = toppings;
      this.cost = cost;
      this.inches = inches;
      this.crustType = crustType;
}
//setters  
    public void setnumberOfToppings(int setNumToppings) { 
    numberOfToppings = setNumToppings; 
    }
    public void settoppings(String setToppingList){
    toppings = setToppingList; 
    }
    public void setcost(double setCost){
    cost = setCost; 
    }
    public void setcost(int setSize){
    inches = setSize;
    }
    public void setcost(int setCrust){
    crustType = setCrust; 
    }
//getters
    public int getNumToppings(){
    return numberOfToppings;
    }   
    public String getToppingList(){
    return toppings;   
    }     
    public int getCost(){
    return cost;
    }     
    public String getSize(){
    return inches;
    }
    public int getCrust(){
    return crustType;
    }


//==================================================

//==================================================
    //Greeting
    System.out.println("Welcome to pizzeria");
    System.out.print("Enter your first name: ");
    firstName = keyboard.nextLine();
//==================================================

//==================================================
    //Size
    System.out.println("Pizza Size (inches) Cost");
    System.out.println(" 10 - $10.99");
    System.out.println(" 12 - $12.99");
    System.out.println(" 14 - $14.99");
    System.out.println(" 16 - $16.99");
    System.out.println("What size pizza would you like?");
    System.out.print("10, 12, 14, or 16\n(enter the number only): ");
    inches = keyboard.nextInt();

    if (inches == 10)
    { order.setCost(+10.99); }
    else if (inches == 12)
    { order.setCost(+12.99); }
    else if (inches == 14)
    { order.setCost(+14.99); }
    else if (inches == 16)
    { order.setCost(+16.99); }
//==================================================

//==================================================
    //CRUST
    System.out.println("What type of crust do you want? ");
    System.out.print("(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D): ");
    input = keyboard.nextLine();
    crustType = keyboard.nextInt();
//==================================================
  
//==================================================
    //TOPPINGS
    System.out.println("All pizzas come with cheese and sauce.");
    System.out.println("Additional toppings are $1.25 each, choose from: ");
    System.out.println("Pepperoni, Sausage, Onion, Mushroom");

//========== Pepperoni    
    System.out.print("Do you want Pepperoni? (Y/N): ");
    input = keyboard.nextLine();
    choice = Character.toUpperCase(input.charAt(0));
    if (choice == 'Y') {
      numberOfToppings += 1;
      toppings = toppings + "Pepperoni ";
    }

//========== Sausage
    System.out.print("Do you want Sausage? (Y/N): ");
    input = keyboard.nextLine();
    choice = Character.toUpperCase(input.charAt(0));
    if (choice == 'Y') {
      numberOfToppings += 1;
      toppings = toppings + "Sausage ";
    }

//========== Onion
    System.out.print("Do you want Onion? (Y/N): ");
    input = keyboard.nextLine();
    choice = Character.toUpperCase(input.charAt(0));
    if (choice == 'Y') {
      numberOfToppings += 1;
      toppings = toppings + "Onion ";
    }

//========== Mushroom
    System.out.print("Do you want Mushroom? (Y/N): ");
    input = keyboard.nextLine();
    choice = Character.toUpperCase(input.charAt(0));
    if (choice == 'Y') {
      numberOfToppings += 1;
      toppings = toppings + "Mushroom ";
    }

//========== Calculate
    order.setNumToppings(numberOfToppings);
    order.setToppingList(toppings);
    order.setCost(1.25*numberOfToppings);

//==================================================

//==================================================
//========== Order Confirmation    
    System.out.println();
    System.out.println("Your order is as follows: ");
    System.out.println(order.getSize() + " inch pizza");
    System.out.println(order.getCrust() + " crust");
    System.out.println(order.getToppingList());

//========== Calculate
    cost = order.getCost();
    tax = (cost * tax_rate); 
    
//========== Order Info
    System.out.println("The cost of your order is: $" + cost);
    System.out.println("The tax is: $" + tax);
    System.out.println("The total due is: $" + tax + cost);
    System.out.println("Your order will be ready for pickup in 30 minutes.");
  }
}
