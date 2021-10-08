package csi.borges.pkg;

import java.util.Arrays;

public class Lax3D {

	int[][][] arr = new int[2][9][9];

	System.out.println("--------------------------------");
	for (int j = 0; j < arr[0].length; j++) {
	  for (int k = 0; k < arr[0][j].length; k++) {

	    // X Logic Here
	    // Can be done in 2 lines

	  }
	  System.out.println(Arrays.toString(arr[0][j]));

	}

	System.out.println("--------------------------------");
	for (int j = 0; j < arr[1].length; j++) {
	  for (int k = 0; k < arr[1][j].length; k++) {

	    // Inverted X Logic Here
	    // Can be done in 1 line

	  }
	  System.out.println(Arrays.toString(arr[1][j]));
	}