package Com.Syntax.class04;

import java.util.Scanner;

public class AyobMetry {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String [] array = new String [7];
		for (int x=0; x <array.length; x++) {
			System.out.println("Please enter day "+(x+1)+ " of the week");
		array [x] = inp.next();
		
		}
		for (int x=0; x <array.length; x++) {
		System.out.println(array[x]);
		}
		
	}

}
