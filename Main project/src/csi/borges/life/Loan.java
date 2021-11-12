package csi.borges.life;

public class Loan {
	String name;
	double principal; 
	double anualInterestRate;
	int numberOfYears;
	double paid; 
	boolean differed= false;
	
	public Loan(String name, double principal, double anualInterestRate, double paymentAmount, int numberOfYears) {
		super();
		this.name = name;
		this.principal = principal;
		this.anualInterestRate = anualInterestRate;
		this.numberOfYears = numberOfYears;
	}

	public double makePayment() {
		paid+= getMontlyPayment();
		return getMontlyPayment();
	}
	
	public double getBalance() {
		return getTotalPayment()- paid;
	}
	
		//Find montly payment
	public double getMontlyPayment() {
		double montlyInterestRate = anualInterestRate/ 1200;
		double montlyPayment = principal* montlyInterestRate/ 1-1/Math.pow 
				(1+ montlyInterestRate, numberOfYears* 12);
				return montlyPayment;
	}

	//Find total payment 
	public double getTotalPayment () {
		return ( getMontlyPayment()* numberOfYears* 12); 
		}

}
