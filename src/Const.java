
public class Const {
	//instance variable
	String name;
	int id,marks1,marks2,sum;
	
	//default constr
	Const(){
		name="Vasudev";
		id=20;
		marks1=85;
		marks2=83;
		sum=marks1+marks2;
		System.out.println("Default const Details::"+name+("\n") +id+("\n")+marks1+("\n")+marks2+("\n")+sum);
		
	}
	
	//parametarized const
	Const(String nam,int idnum,int m1,int m2){
		name=nam;
		id=idnum;
		marks1=m1;
		marks2=m2;
		sum=marks1+marks2;
		
	}
	
	//instance method
	void display(){
		
		System.out.println("Parametarized Details::"+name+("\n") +id+("\n")+marks1+("\n")+marks2+("\n")+sum);
	}
	
// main method
	public static void main(String args[]){
		
		Const d1 =new Const();
		Const p1 = new Const("Sai",24,95,95);
		p1.display();
		
		
	}
	
}
