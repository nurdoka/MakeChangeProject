package makechange;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter how much does item cost: ");
		double cost = kb.nextDouble();
		
		System.out.println("Enter how much money was tendered by the customer: ");
		double tendered = kb.nextDouble();
		
		if(tendered < cost) {
			System.out.println("Not enough money was tendered by the customer!");
		}
		else if(tendered == cost) {
			System.out.println("Exact amount was tendered by the customer and no change is required.");
		}
		else {
			int temp = (int)((tendered-cost) * 100);
			
			if(temp/2000 > 0) {
				System.out.println(temp/2000 + " : twenty dollar bill.");
				temp %= 2000;
			}
			if(temp/1000 > 0) {
				System.out.println(temp/1000 + " : ten dollar bill.");
				temp %= 1000;
			}
			if(temp/500 > 0) {
				System.out.println(temp/500 + " : five dollar bill.");
				temp %= 500;
			}
			if(temp/100 > 0) {
				System.out.println(temp/100 + " : one dollar bill.");
				temp %= 100;
			}
			if(temp/25 > 0) {
				System.out.println(temp/25 + " :  quarter.");
				temp %= 25;
			}
			if(temp/10 > 0) {
				System.out.println(temp/10 + " : dime.");
				temp %= 10;
			}
			if(temp/5 > 0) {
				System.out.println(temp/5 + " : nickel.");
				temp %= 5;
			}
			if(temp/1 > 0) {
				System.out.println(temp/1 + " : pennies.");
				temp %= 1;
			}
		}
		
	}
}
