import java.util.Scanner;

public class IT24103925Lab3Q1A{
	public static void main(String args[]){
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice :");
		int price = sc.nextInt();
		
		System.out.print("Number of kilograms you want :");
		int amount = sc.nextInt();
		
		int pay_amount = price * amount;
		
		System.out.print("Amount you have to pay - " + pay_amount);
		
	}
}
		
		
		