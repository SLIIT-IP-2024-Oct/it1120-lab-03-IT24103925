import java.util.Scanner;

public class IT24103925Lab3Q1B{
	public static void main(String args[]){
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice :");
		int price = sc.nextInt();
		
		System.out.print("Number of kilograms you want :");
		int amount = sc.nextInt();
		
		double pay_amount = price * amount ;
		
		double discount = pay_amount/100*10;
		
		double final_pay_amount = pay_amount - discount;
		
		System.out.print("Amount you have to pay - " + final_pay_amount);
		
	}
}
		
		
		