
class SuperEx {
	
	int i;
	
	SuperEx(){
	System.out.println("hai i am default class");	
	}
	
 SuperEx(int num){
		
		i = num;
	}

}



class SuperEx2 extends SuperEx{
	 
	int i;
	
	//default const
	SuperEx2(){
		System.out.println("hai i am ex2 default class");	
		
	}
	//parametarizer const
	
	SuperEx2(int num, int num2){
	    super(num);
		i=num2;
	}
	public void display(){
		System.out.println("hai i am derived  class"+i);	
		System.out.println("hai i am base class"+super.i);	
		
	}
	
	
}




