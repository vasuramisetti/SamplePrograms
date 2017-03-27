import java.util.Scanner;

public class DyanamicIn {
	
	public static void main(String args[]){
		
		String name;
		int age;
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter name");
		System.out.println("Enter Age" );
		name=s.next();
		age=s.nextInt();
		
		System.out.println("Enter name:" +name);
		System.out.println("Enter Age:" +age);
		
		

		
	}

}
