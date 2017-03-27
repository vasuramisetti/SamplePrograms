
public class ArrayEx {
int arr[]={1,2,3,4,5,6,7,8,9};
int i;

 void Arr(){
	 System.out.println("Display numbers");
	 
	for(i=0;i<arr.length;i++){
		System.out.println("number" +arr[i]);
		
	}
	 
 }
	
 public static void main(String args[]){
	ArrayEx ex = new ArrayEx();
	ex.Arr();
	 
 }
 
}
