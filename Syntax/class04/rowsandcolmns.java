package Com.Syntax.class04;

public class rowsandcolmns {

	public static void main(String[] args) {
		char [] grade = {'A', 'B', 'C', 'D', 'E','F'};
	System.out.println(grade );
	System.out.println("==========================");
	char [] grades =  new char[6];
			grades [0] = 'A';
			grades [1] = 'B';
			grades [2] = 'C';
			grades [3] = 'D';
			grades [4] = 'E';
			grades [5] = 'F';
	
	System.out.println(grades);
	
	System.out.println("==============================");
	String [] name= {"Ayob", "Ayman", "Akrm"};
	System.out.println(name[0] );
	System.out.println("==========================");
	String [] names =  new String[6];
			names [0] = "Ayman";
			names [1] = "Ahmed";
			names [2] = "Akram";
			names [3] = "Ayob";
			names [4] = "Ehab";
			
	
	System.out.println(names[3]);
	
	System.out.println("==============================");
	String [] classDay= {" Java", "Saturday ", " day", " coding", "is"};
	System.out.print(classDay[1]+ classDay[4]+classDay[0] +classDay[3] +classDay[2]);
	
}
}
