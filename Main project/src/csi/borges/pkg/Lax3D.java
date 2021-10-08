package csi.borges.pkg;

public class LaX3D {
	public static void main(String[] args) {

	int[][][] arr = new int[2][9][9];

	System.out.println("--------------------------------");
	for (int j = 0; j < arr[0].length; j++){
	  for (int k = 0; k < arr[0][j].length; k++) {

		  arr [j][j] = 1; 
	      	arr [j][arr.length-1-j] = 1 ;

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

	}
}
