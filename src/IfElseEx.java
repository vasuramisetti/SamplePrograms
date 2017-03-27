import java.util.Scanner;

public class IfElseEx {
	public static void main(String args[]){
	double m1,m2,physics,social,total,avg,grade;
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter M1 marks");
	m1=s.nextDouble();
	System.out.println("Enter M2 marks");
	m2=s.nextDouble();
	System.out.println("Enter physics marks");
	physics=s.nextDouble();
	System.out.println("Enter social marks");
	social=s.nextDouble();
	
	total=m1+m2+physics+social;
	avg=total/4;
	System.out.println("M1 marks:" +m1);
	System.out.println("M2 marks:" +m2);
	System.out.println("Physics marks:" +physics);
	System.out.println("social marks:" +social);
	
	System.out.println("Total marks:" +total);
	System.out.println("Avg marks:" +avg);
	
	
	if(avg>=80){
		
		System.out.println("A garde");	
	}
	else if(avg>=70 && avg<=80){
	
		System.out.println("B grade");
	}
   
	else if(avg>=60 && avg<=70){
		
		System.out.println("C grade");
	}
	
	else{
		System.out.println("Fail");
		
	}
	
	}
	

}
