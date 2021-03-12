package Com.Syntax.class04;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Does the store has sale?");
		boolean sale = scan.nextBoolean();
		double discount=0;
		if (sale) {
			System.out.println("how much is the price?");
			double price = scan.nextDouble();
			if (price >= 10 && price <= 50) {
				discount = (price * 10) / 100;
			} else if (price >= 50 && price <= 100) {
				discount = (price * 20) / 20;
			} else if (price >= 100 && price <= 500) {
				discount = (price * 30) / 100;
			} else if (price >= 500) {
				discount = (price * 50) / 100;
			} 
				
			double total  = price- discount;
			System.out.println(" you shopping cost is $"+ price +" and you get $"+ discount + " you total pay is " + total);
		}     else {
			System.out.println("No shopping!");
			discount =0;
		}
		
		
	}
}