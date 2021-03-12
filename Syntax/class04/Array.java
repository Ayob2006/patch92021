package Com.Syntax.class04;

import java.util.Scanner;

public class Array {

		public static void main(String[] args) {
			
			
			int [] numbers = new int[3];
			numbers[0] = 2;
			numbers [1] =5;
			numbers [2]= 8;
			
			int [] nums = { 
					10,14,13,67,38
			};
			System.out.println(nums[2]);
			//length
			// index= length-1
			String[] names = { "Anna", "Jack", "John", "Rosa", "Dan", "Issac"};
			
			for (int x=0; x<=names.length-1; x++) {
				System.out.print(names[x]+ " ");
				// when i use arrayname.length; arrayname.length();
			}
		}
		
	}
