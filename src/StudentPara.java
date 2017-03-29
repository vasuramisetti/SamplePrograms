
public class StudentPara {
 
	 String StudentName;
	 int id;
	 int marks1,marks2,marks3,total,avg;
	 
	 
	 public void SetData(String name,int idnum,int m1,int m2,int mm){
		 
		 StudentName=name;
		 id=idnum;
		 marks1=m1;
		 marks2=m2;
		 marks3=mm;
		 total=marks1+marks2+marks3;
		 avg=total/3;
	 }
	 
	 public void display(){
		 
		 System.out.println("Student Name:"+StudentName);
			System.out.println("Student Id:"+id);
			System.out.println("M1 marks:"+marks1);
			System.out.println("M2 marks:"+marks2);
			System.out.println("MM marks:"+marks3);
			System.out.println("Total:"+total);
			System.out.println("Average marks:"+avg);
			
	 }
	
	
	 public static void main(String args[]){
		 StudentPara std =new StudentPara();
		 std.SetData("vasu", 25, 53, 93, 95);
		 std.display();
		 
		 
	 }
}
