package csi.borges.pkg;

import java.util.Arrays;
public class EvenOdd2D {
	
	public static void main (String[] args) {
		int[][] arr = new int[10][10];  
		
		for(int i = 0; i < arr.length; i++) {
		    for(int j = 0; j < arr[i].length; j++) {
		    	if (i%2==1 ) {
		    	if (i%2==1 ) {
		    		arr [i][j]= 1; 
		    	}
		    	
		    	}else { 
		    		if(j%2== 0) {
		    			arr[i][j]= 1; 
		    		}
		    	}
		    	
		    	
		    	
		    	System.out.println(Arrays.toString(arr[i]));
			    System.out.println(arr[i]); 
			    
	
	}
 
	      
	    }
	}
}
