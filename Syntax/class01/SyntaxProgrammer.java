package Com.Syntax.class01;
class Main {
	  public static void main(String[] args) {
	    int num1 = 5;
	    int num2 = 4;
	    int num3 = 3;
	    
	    int num4 = 7; 
	    int num5 = 10;
	    int num6 = 5;
	    
	    //start coding here
	   
	   
	    int add= num1+num2;
	    int sub = add-num3;
	     int result1=sub;
	     int mult = num4*num5;
	     int div= mult/num6;
	     int result2= div;
	     int result3= result2%result1;
	   
	     System.out.print(result2 + " modded by "+result1 +" is " + result3);
	  }
}
