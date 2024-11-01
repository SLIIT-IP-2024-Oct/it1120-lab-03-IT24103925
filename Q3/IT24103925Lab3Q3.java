import java.util.Scanner;

public class IT24103925Lab3Q3{
	public static void main(String[] args){
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Amount :");
		int amount = sc.nextInt();
		
		int Five_Thousand_Notes = amount / 5000;
		amount = amount - (Five_Thousand_Notes * 5000);
		
		int One_Thousand_Notes = amount / 1000;
		amount = amount - (One_Thousand_Notes * 1000);
		
		int Five_Hundred_Notes = amount / 500;
		amount = amount - (Five_Hundred_Notes * 500);
		
		int Two_Hundred_Notes = amount / 200;
		amount = amount - (Two_Hundred_Notes * 200);
		
		int One_Hundred_Notes = amount / 100;
		amount = amount - (One_Hundred_Notes * 100);
		
		
		int _50_Notes = amount / 50;
		amount = amount - (_50_Notes * 50);
		
		int _20_Notes = amount / 20;
		amount = amount - (_20_Notes * 20);
		
		int _10_Notes = amount / 10;
		amount = amount - (_10_Notes * 10);
		
		int _5_Notes = amount / 5;
		amount = amount - (_5_Notes * 5);
		
		int _2_Notes = amount / 2;
		amount = amount - (_2_Notes * 2);
		
		int _1_Notes = amount / 1;
		amount = amount - (_1_Notes * 1);
		
		
		System.out.println("5000 Notes - " + Five_Thousand_Notes);
		System.out.println("1000 Notes - " + One_Thousand_Notes);
		System.out.println("500 Notes - " + Five_Hundred_Notes);
		System.out.println("200 Notes - " + Two_Hundred_Notes);
		System.out.println("100 Notes - " + One_Hundred_Notes);
		System.out.println("50 Notes - " + _50_Notes);
		System.out.println("20 Notes - " + _20_Notes);
		System.out.println("10 Notes - " + _10_Notes);
		System.out.println("5 Notes - " + _5_Notes);
		System.out.println("2 Notes - " + _2_Notes);
		System.out.println("1 Notes - " + _1_Notes);
		
	}
}
		
		
		