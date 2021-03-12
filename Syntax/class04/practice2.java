package Com.Syntax.class04;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter name of the instructor");
	String name = input.nextLine();
	switch(name) {
	  case "Asghar": 
	  System.out.println("Will take care of Java Assignment");
	  break;
	  case "Moazam": 
	  System.out.println("Will take care of SDLC Assignment");
	  break;
	  case "Weqas": 
	  System.out.println("Will take care of Selenium Assignment");
	  break;

	  case "Asel": 
	  System.out.println("Will take care of every Assignment");
	  break;
	  
	  
	  default:{
	  System.out.println("Invalid instructor selected");
	  break;
	}
}
}}