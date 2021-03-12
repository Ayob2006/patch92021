package Com.Syntax.class04;

import java.util.Scanner;

public class names {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	
	/*
	 * Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
	 */
	
	
	System.out.println("Mom’s first name?");
	String mother= input.next();
	
	System.out.println("Dad’s first name?");
	String father= input.next();
	System.out.println("what is the gender of the baby?");
	String gender= input.next();
	if(gender.equalsIgnoreCase("boy")) {
		System.out.println("suggesteed baby name: "+ father.substring(0,father.length()/2)+mother.substring(0,mother.length()/2));
	}
	
	else if(gender.equalsIgnoreCase("girl")) {
		System.out.println("suggesteed baby name: "+ mother.substring(0,mother.length()/2)+father.substring(0,father.length()/2) );
	}
}

}
