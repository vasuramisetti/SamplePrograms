

public class Temp {
	
 public static void main(String args[]){
	 double celsius,fahrenheit;
	 fahrenheit = Double.parseDouble(args[0]);
	// celsius = Double.parseDouble(args[1]);	
	//
	 
	 System.out.println("Given Fahrenheit:"+fahrenheit);
	 
	 celsius =(fahrenheit- 32)* 5/9;
	 
	 
	System.out.println("Celsius:" +celsius); 
	 
	 
 }

}
