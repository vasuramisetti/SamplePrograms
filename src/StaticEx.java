
public class StaticEx {
	//static variables 
	static int num1,num2,sum;
	
	
	//static method
	
	static void setData(int n1,int n2){
		int num1=n1;
		int num2=n2;
		sum=num1+num2;
		System.out.println("Num1 is::"+num1+" "+ "Num2 is::" +num2 +" "+"Sum is " +sum);		
	}
	
	//instance method
	
	void display(){
		
		sum=num1+num2;
		System.out.println("Sum is ::"+sum);
		
	}
	
	// main method 
	public static void main(String args[]){
	
	StaticEx.setData(22, 43);
	StaticEx dis = new  StaticEx();
	dis.display();
	
	}

}
