
package csi.borges.pkg;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Rockpsperscissors {

	public static void main(String[] args) {

		String[] choices = { "Rock", "Paper", "Scissors" };
		Random r = new Random();

		// int randomnumber= r.nextInt(arr.length);
		String computerChoice = choices[r.nextInt(choices.length)];
		Scanner sc = new Scanner(System.in);


		System.out.println("type your choice: ");
		int inputInt = Arrays.asList(choices).indexOf(sc.nextLine());
		
		String userChoice = choices[inputInt];

		System.out.println("computer chose:  " + computerChoice);
		System.out.println("User chose: " + userChoice);

		if (computerChoice == userChoice) {
			System.out.println("It's a Tie!");
		} else if (computerChoice == choices[0] && userChoice == choices[1]) {
			System.out.println("You Win!");
		}
		else if(computerChoice == choices[1] && userChoice == choices[0]) { 
			{
			System.out.println("Something went wrong!");
		}
	}
}
}