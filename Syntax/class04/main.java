package Com.Syntax.class04;

public class main {
String Color;
int Year;
String Make; 
	public static void main(String[] args) {
		main car1= new main();
		main car2 = new main();
		
		car1.Color= "BLACK";
		car1.Year=2019;
		car1.Make ="BMW";
		
		car2.Color= "White";
		car2.Year=2018;
		car2.Make ="Toyota";
		System.out.println(car1.Color.length());
		System.out.println(car1.Color.toLowerCase());
		System.out.println(car2.Color.toUpperCase());
		System.out.println("Car color is "+ car1.Color +" and car year is "+ car1.Year +" and car model is "+ car1.Make);
		System.out.println("Car color is "+ car2.Color +" and car year is "+ car2.Year +" and car model is "+ car2.Make);
	}
	public void syntaxTechnologies() {
		// TODO Auto-generated method stub
		
	}
	
}
