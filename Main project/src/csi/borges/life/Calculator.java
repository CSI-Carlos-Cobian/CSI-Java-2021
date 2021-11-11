package csi.borges.life;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	private static double askForMoney(double amount) {
		System.out.println("You have been spared by someone who gave you: " + amount);
		return amount;
			
	}

	public static void main(String[] args) throws InterruptedException {

		double initial = 15_000;
		double cash = initial;

		double invested = 5_000;

		List<Loan> loans = new ArrayList<Loan>();

		loans.add(new Loan("Student Loan", 0, 0.0466, 0, 10));
		loans.add(new Loan("Personal Loans", 0, 0.16, 0, 10));
		loans.add(new Loan("Mortgage Loans", 0, 0.03125, 0, 30));
		loans.add(new Loan("CreditCard", 0, 0.29, 0, 99));

		for (int age = 0; age <= 81; age++) {

			if (age < 17) {// highschool

				String location = "PR";
				double salary = 4_000;
				double Investment = 6_000; 
				cash += salary;
				cash+= Investment; 

			} else if (age < 19) { //// Penn state University

				String location = "PA";
				double salary = 35_000;
				double tuition = 25_000 +35_000 - 15_000;
				double costOfLiving = 12_000;
				double Investment = 16_000; 
				double LoanInterest = 2.0;

				cash += salary;
				cash+= Investment;
				cash += askForMoney(tuition/2);
				cash -= tuition;
				cash += askForMoney(costOfLiving/2);
				cash -= costOfLiving;
				cash += (LoanInterest * cash) * 12;
				
				loans.get(0).balance += costOfLiving/2;
				loans.get(0).balance += tuition/2;

			} else if (age < 24) { // residency

				String location = "PA";
				double salary = 60_000;
				double tuition = 350;
				double costOfLiving = 24_000;
				double Investment = 41_000;
				double rent = 12 * (1_100 * 350);
				double food = 20 * 365;
				double InvestmentInterest = 2.00;
				double LoanInterest = 2.00;

				cash += salary;
				cash+= Investment; 
				cash -= food;
				 cash -= rent;
				cash -= costOfLiving;
				cash -= InvestmentInterest;
				cash-= LoanInterest; 
				

				loans.get(0).balance += costOfLiving;
				loans.get(0).balance += tuition;

				if (age == 24 && cash > 15_000) {
					double usedCarPrice = 18_000.00;
					cash -= usedCarPrice;
				}
			}

			else if (age < 38) {// work

				String location = "PR";
				double salary = 125_000;
				double costOfLiving = 50_000;
				double Investment = 65_000;
				double food = 500 * 12;
				double carAndExpenses = 25_000 + 200 * 12 * 2000 + 1000 * 12;
				double rent = 12 * (2000 + 600);

				cash += salary;
				cash += Investment; 
				cash -= food;
				cash -= rent;
				cash -= costOfLiving;
				cash -= carAndExpenses;

			} else if (age < 65) { // retire
				// salary - 12% tax
				double salary = 200_000 * 1.0;
				double Investment = 100_000; 
				// 2 bedroom house with 2 bathrooms + electric/ water/ wi-fi bills
				double rent = 12 * (3000 + 800);

				// 30$ daily food stipend
				double food = 55 * 365;

				// 100 monthly dollars o gas
				// 4,000 a year on car fixes
				// montly car payment 500
				double carAndExpenses = 800 * 12 + 4_000;
				
				 cash += salary;
				 cash += Investment; 
				  cash -= food;
				  cash -= rent;
				  cash -= carAndExpenses;
				
				
			} else {// Living the dream
			}
			
			double debt = 0;
			for (Loan loan : loans) {
				debt += loan.balance;
			}

			// Output year-end review
			System.out.println("Balance at age: " + age + " is: " + cash + " with a debt of " + debt + " and "
					+ invested + " invested.");

			// Did you make it?
			if (cash < 0) {
				System.out.println("Out of cash. You Died!");
				break;
			}

		}

	}
}
