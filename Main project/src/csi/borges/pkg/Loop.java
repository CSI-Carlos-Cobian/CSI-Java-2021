package csi.borges.pkg;

import java.util.Arrays;

public class Loop {

	public static void main (String[] args) {
		for (int i = 0; i< 10; i++) {
			
			System.out.println(i);
		}
			
			int[][] arr =  {
					{1, 2, 3, 4, 5}, 
					{6, 7, 8, 9, 10},
					{11, 12, 13, 14, 15}
					}; 
			System.out.println((arr[2][4] ));
			System.out.println(Arrays.toString(arr[0] ));
			
			nestedPrint(arr); 
	}
	public static void nestedPrint(int[][] arr) {
		
		for(int i = 0; i <arr.length; i++) {
			for(int  j = 0 ; j< arr[i]. length; j++) {
				System.out.println(arr[i][j]); 
				
				}
			}
		}
	}

