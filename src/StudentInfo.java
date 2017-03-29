// instance method and instance variable
public class StudentInfo {
	//instance variable 
	String StudentName;
	int id;
	int marks1,marks2,marks3,total,avg;
	
	//instance method
	public void setData(){
		StudentName = "vasu";
		id=17;
		marks1=90;
		marks2=85;
		marks3=91;
		total=marks1+marks2+marks3;
		avg= total/3;
		
		
	}
	
	//instance method
	public void display(){
		System.out.println("Student Name:"+StudentName);
		System.out.println("Student Id:"+id);
		System.out.println("M1 marks:"+marks1);
		System.out.println("M2 marks:"+marks2);
		System.out.println("MM marks:"+marks3);
		System.out.println("Total:"+total);
		System.out.println("Average marks:"+avg);
		
	}

	//main method
	public static void main(String args[]){
		StudentInfo std;
		std= new StudentInfo();
		std.setData();
		std.display();
		
	}
	
	
	
}
