import java.util.Date;

public class Employee
{
	String name;
	Date date;

	Employee(String emName,Date appDate)
	{
		name=emName;
		date=new Date();
		date=appDate;
	}
	
	
	void display()
		{
	 
		System.out.println("Employee Name:" +name+ "\n"+"Date of birth::" +date.getDay()+ "/"+date.getMonth()+"/"+date.getYear());
		}
	
	public static void main(String args[])
	{
	
	   Employee em[];
	   em = new Employee[5];
	   
	 em[0]= new Employee ("vasudev", new Date(1993,04,25));
	 em[1]=new Employee ("Veera", new Date(1992,06,01));
	 em[2]= new Employee("Chintu", new Date(1992,10,02));
	 em[3]= new Employee("Chaitanya", new Date(1992,02,9));
	 em[4]=new Employee("Mahesh", new Date(1992,11,9));
	 
	 
	 
	 	for(int i=0;i<=4;i++)
	 	{
		 
	 		for(int j=i+1;j<5;j++)
	 		{
			 
	 			if(em[i].date.after(em[j].date))
	 			{
				 
	 				Date tempdate;
	 				String tempname;
				 
	 				tempdate = em[i].date;
	 				em[i].date= em[j].date;
	 				em[j].date= tempdate;
			
			
	 				tempname=em[i].name;
	 				em[i].name= em[j].name;
	 				em[j].name= tempname;
			
			 
				 
	 			}
			 
	 		}
		 
	 	}
	 
	 
	 	for(int k=0;k<5;k++)
	 	{
	 		em[k].display();
	 		
	 	}
	 	
	 	
	 
	 
	}
	
	
	

}
