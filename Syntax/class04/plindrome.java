package Com.Syntax.class04;

import java.util.Scanner;

public class plindrome {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	   	//write your code below
	    String reverse = ""; 
	    givenString=givenString.replaceAll(" ","");
	   	for ( int x=givenString.length()-1; x>=0; x--){
	   		
	   		reverse=reverse +givenString.charAt(x);
	   		
	   	}
	   	
	   	
	   	if (givenString.equalsIgnoreCase(reverse)) {
	   		System.out.println("true");
	   	}
	   	else {
	   		System.out.println("false");
	   	}
	  }
	}