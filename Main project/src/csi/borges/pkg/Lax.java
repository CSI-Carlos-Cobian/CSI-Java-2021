package csi.borges.pkg;

import java.util.Arrays;

public class Lax {
	

	public static void main (String[] args) {
		int[][] arr = new int[9][9];  
		
		for(int i = 0; i < arr.length; i++) {
		    for(int j = 0; j < arr[i].length; j++) {

		    	
		    	arr [i][i] = 1; 
		      	arr [j][j] = 1-0 ;
		      	
		    
		    	
		    
		    	
		    			       
		    }
		    System.out.println(Arrays.toString(arr[i]));

		}
	}
}
		

