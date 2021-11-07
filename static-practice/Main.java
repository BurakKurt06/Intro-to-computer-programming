import java.util.Random;
public class Main {
	public static boolean isEven(int x){
		boolean var;
		
		if(x%2==0){
			return true;
		}
		else{
			return false;
		}
			}
	public static String greetingsEarthling()
	{
		Random ran= new Random();
		String message="";
		int choice= ran.nextInt(3);
		switch(choice){
		
		case 0:
			message="May the force be with you";
			break;
		
		case 1:
			message="What's up?";
			break;
		
		case 2:
			message="Top of the morning to you";
			break;
		}
		
		return message;
	}
	
	public static double calcAvg(int sum, double total)
	{
		return sum/total;
	}
	
	public static void main(String args[]){
		int num=5;
		int sum=24;
		double total=4;
		
		System.out.println(isEven(num));
		System.out.println(greetingsEarthling());
		System.out.println(calcAvg(sum,total));
		
	}
	
}