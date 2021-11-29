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
				cash += Investment;

			} else if (age < 19) { //// Penn state University

				String location = "PA";
				double salary = 28_000;
				double tuition = 25_000 + 35_000 - 15_000;
				double costOfLiving = 12_000;
//				double Investment = 16_000;
				double LoanInterest = 2.0;

				cash += salary;
//				cash += Investment;
				cash += askForMoney(tuition / 2);
				cash -= tuition;
				cash += askForMoney(costOfLiving / 2);
				cash -= costOfLiving;
				cash += (LoanInterest * cash) * 12;
				  cash += salary; 
				  
				  // Add cost to Student Loans
				  loans.get(0).principal += costOfLiving;
				  loans.get(0).principal += tuition;
				  loans.get(0).differed = true;
				}

				
			else if (age < 24) { // Working finished studies
				
				loans.get(0).differed = false;
				String location = "PA";
				double salary = 75_000;
				double tuition = 350;
				double costOfLiving = 24_000;
				double Investment = 50_000;
				double rent = 12 * (1_100 * 350);
				double food = 20 * 365;
				double InvestmentInterest = 2.00;
				double LoanInterest = 2.00;

				cash += salary;
				cash += Investment;
				cash -= food;
				cash -= rent;
				cash -= costOfLiving;
				cash -= InvestmentInterest;
				cash -= LoanInterest;
				cash -= tuition;
				cash += askForMoney(tuition);
				cash -= tuition;
				cash += askForMoney(costOfLiving);
				cash -= costOfLiving;

				if (age == 24 && cash > 15_000) {
					double usedCarPrice = 18_000.00;
					cash -= usedCarPrice;
				}
			}

			else if (age < 38) {// work

				String location = "PR";
				double salary = 135_000;
				double costOfLiving = 50_000;
				double Investment = 115_000;
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
				double Investment = 300_000;
				// 2 bedroom house with 2 bathrooms + electric/ water/ wi-fi bills
				double rent = 12 * (3000 + 800);

				// 30$ daily food stipend
				double food = 55 * 365;

				// 100 monthly dollars o gas
				// 4,000 a year on car fixes
				// montly car payment 500
				double carAndExpenses = 2_600* 12 + 4_000;

				cash += salary;
				cash += Investment;
				cash -= food;
				cash -= rent;
				cash -= carAndExpenses;

			} else {// Living the dream
			}
			// -----=====88888=====-----
//		     Additional Logic
			// -----=====88888=====-----

			// Buy a used car after college. Could you afford it?
			if (age == 24 && cash >= 15_000) {
				double usedCarPrice = 5_000.00;
				cash -= usedCarPrice;
			} // New cars with loan interest are a bad investment!
			else if (age == 44 && cash < 250_000) {
				double newCarPrice = 190_000;
				double downPayment = 25_000;
				// Loan interest is Based on your credit score
				// It is higher if you're under 25, have debt, are unemployed, etc.
				double interestRate = 0.05;
				double payment = 2_600;

				loans.add(new Loan("Car Loan", (newCarPrice - downPayment), interestRate, payment, age));
				// Monthly loan payments
				for (Loan loan : loans) {
					for (int month = 0; month < 12; month++) {
						if (loan.getBalance() > 0 && loan.differed == false) {
							cash -= loan.makePayment();

						}
					}
				}

				// -----=====88888=====-----
//		     Additional Logic
				// -----=====88888=====-----

				// Buy a House at 50
				if (age == 50 && cash >= 750_000) {
					double cashPrice = 500_000;
					cash -= cashPrice;

					System.out.println("Bought a House for: " + newCarPrice);
				} else if (age == 35 && cash >= 750_000) {
					double housePrice = 500_000;
					cash -= housePrice;

					System.out.println("Bought an house for: " + newCarPrice);
				} else if (age == 35 && cash > 750_000) {
					double housePrice = 500_000;
					double yearlyInterestRate = housePrice * 0.15;
					double montlyInterestRate = 0.03;
					// int repaymentYears = 15;
					int repaymentYears = 15;

					cash -= yearlyInterestRate;
					cash -= montlyInterestRate;

					Loan mortgageLoan = new Loan("My first home", (housePrice - downPayment), interestRate,
							repaymentYears, repaymentYears);
					loans.add(mortgageLoan);

					System.out.println("House mortgage: " + mortgageLoan.getMontlyPayment() + " For a total of "
							+ mortgageLoan.getTotalPayment());
				}

			}
			
			
			// Calculate Debt Balance
			double debt = 0;
			for (Loan loan : loans)
				debt += loan.getBalance();
			
			// Output year-end review
			System.out.println("Balance at age: " + age + " is: " + cash + " with a debt of " + debt + " and "
					+ invested + " invested.");
			// Did you make it?
			if (cash < 0) {
				System.out.println("Out of cash. You Died!");
			}
		}

	}

}
