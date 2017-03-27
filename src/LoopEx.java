import java.util.Scanner;

public class LoopEx {
public static void main(String args[]){
	
	int two[][] = new int[4][];
	
    int i,j,k=1;

    two[0]=new int[1];
    two[1]=new int[2];
    two[2]=new int[3];
    two[3]=new int[4];
    
    for(i=0;i<4;i++)
    	for(j=0;j<=i;j++){
    	two[i][j]=k;
    	k++;
    	}
    	for(i=0;i<4;i++){
    		
    		for(j=0;j<two[i].length;j++)
    			System.out.println(two[i][j]+"");
    		System.out.println();
    			
    	}
    
    }
    
    
	
}
	
	
	
	

