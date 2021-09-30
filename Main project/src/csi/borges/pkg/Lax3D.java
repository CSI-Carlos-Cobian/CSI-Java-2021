package csi.borges.pkg;

import java.util.Arrays;

public class Lax3D {

	int[][][] arr = new int [2][9][9]; 

		for(int i = 0;i<arr.length;i++) {
			System.out.println("--------------------------------");
			
			for(int j = 0; j < arr[i].length; j++) {
				
			    for(int k = 0; k < arr[i][j].length; k++) {
	
			    	arr[i][j][j] = 1;
			    	arr[i][j][ arr[i][j].length - j - 1 ] = 1;
			    }
			    System.out.println(Arrays.toString(arr[i][j]));
			    
			}
			
		}
	}
	
}
