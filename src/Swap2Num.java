//Swaping withot temp variable

public class Swap2Num {

	public static void main (String args[]){
		
		int num1,num2;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		System.out.println("Before swap"+"Number1:"+num1+("\n")+"Number2:"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swap"+"Number1:"+num1+("\n")+"Number2:"+num2);
		
	}
	
	
}
