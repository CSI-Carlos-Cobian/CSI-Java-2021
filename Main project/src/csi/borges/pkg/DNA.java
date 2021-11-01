package csi.borges.pkg;

import java.util.Arrays;

public class DNA {

public static void main (String []args) throws InterruptedException{
		
		
		
		while (true) {
			int [][] arr = new int [9][9]; 
			
			for(int i = 0; i< arr.length; i++) {
				
				for(int j = 0; j<arr[i].length; j++) {
					
					arr[i][i]= 1; 
					arr[i][ arr[i].length -i -1 ] = 1; 
					Thread.sleep(75);
					
					
					
				}
				System.out.println(Arrays.toString(arr[i])); 
			}
		}
	}
	
}
