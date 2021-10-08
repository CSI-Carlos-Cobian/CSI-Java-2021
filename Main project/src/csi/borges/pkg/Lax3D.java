package csi.borges.pkg;

import java.util.Arrays;

public class LaX3D {
	public static void main(String[] args) {

		int[][][] arr = new int[2][9][9];

		System.out.println("--------------------------------");
		for (int j = 0; j < arr[0].length; j++) {
			for (int k = 0; k < arr[0][j].length; k++) {

				arr[0][j][j] = 1;
				arr[0][j][arr[0].length - 1 - j] = 1;

			}
			System.out.println(Arrays.toString(arr[0][j]));

		}

		System.out.println("--------------------------------");
		for (int j = 0; j < arr[1].length; j++) {
			for (int k = 0; k < arr[1][j].length; k++) {
				
		
				arr[1][j][k]= 1;
				arr[1][j][j]= 0;
				arr[1][j][arr[0][j].length -j -1] = 0;

			}
			System.out.println(Arrays.toString(arr[1][j]));
		}

	}
}
