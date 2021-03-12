package Com.Syntax.class04;

import java.util.Scanner;

public class even {
	public static void main(String [] args){
//		   Scanner inp = new Scanner(System.in);
//		   String name= inp.next();
//		   System.out.println("The first 3 letters of "+ name+ " is " + name.substring(0,3));
//		}
//		}
		
		 Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter the browser name to proceed further with execution");
		    String browser = sc.nextLine(); 
		   if (browser.equalsIgnoreCase("chrome")){
					    System.out.println("Proceed with Chrome browser");
					  }
					  else if (browser.equalsIgnoreCase("firefox"))
							  {
					    System.out.println("Proceed with Firefox browser");
					  }
					  else if (browser.equalsIgnoreCase("ie")){
					    System.out.println("Proceed with IE browser");
					  }
					   else {
					    System.out.println("Invalid browser");
					  }
					  
	}
}
					