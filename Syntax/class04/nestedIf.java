package Com.Syntax.class04;

public class nestedIf {
public static void main(String[] args) {
	boolean alle = false;
	boolean peanut = true;
	boolean petallergy = true;
	boolean pollenAllergy = true;
	
	if (!alle) {
		System.out.println(" lets do further check");
		if (peanut) {
			System.out.println("it is peanut allergy");
		} else if (pollenAllergy) {
				
				System.out.println("");
			}
		}
	
	else {
		System.out.println("you are lucky");
	}
	
}
}
