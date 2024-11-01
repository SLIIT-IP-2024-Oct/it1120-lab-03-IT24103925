import java.util.Scanner;

public class IT24103925Lab3Q2{
	public static void main(String args[]){
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your monthly salary :");
		double Monthly_Salary = sc.nextInt();
		
		System.out.print("Enter your OT hours :");
		double OT_hours = sc.nextInt();
		
		System.out.print("Enter OT Hourly Rate :");
		double OT_Hourly_Rate = sc.nextInt();
		
		double OT_Amount = OT_hours * OT_Hourly_Rate;
		double Total_Salary = Monthly_Salary + OT_Amount;
		
		
		System.out.println("Your Total Monthly Salary - " + Total_Salary);
		
	}
}
		
		
		