package Com.Syntax.class04;

public class repl116 {
 
	static int instances;
	public static void main (String [] args ){
	  repl116 obj = new repl116();
	  obj.instances++;
	   repl116 obj1 = new repl116();
	  obj1.instances++;
	   repl116 obj2 = new repl116();
	  obj2.instances++;
	  System.out.println(obj2.instances);
	}
	}