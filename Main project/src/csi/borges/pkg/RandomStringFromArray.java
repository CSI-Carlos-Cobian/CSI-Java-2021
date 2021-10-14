package csi.borges.pkg;

import java.util.Random; 
public class RandomStringFromArray
{

	public static void main(String[] args) 
{
 
		String[] arr = {"1", "2", "3", "4", "5"}; 
		Random r= new Random(); 
		int randomnumber= r.nextInt(arr.length); 
		System.out.println(arr[randomnumber]); 
	
}
}
