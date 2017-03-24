
public class Swipe2Numbers {
	
	
	public static void main(String args[]){
		
		int num1,num2,num;
		num1= Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		
		System.out.println("before swaping:"+num1+("\n")+ "Number2:"+""+num2);
		
		num=num1;
		num1=num2;
		num2=num;
		System.out.println("After swaping:"+num1+("\n")+ "Number2:"+""+num2);
		
	}

}
