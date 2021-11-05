package csi.borges.life;

public class Loan {
	String name;

	double balance;
	double rate;
	double paymentAmount;

	int startAge;

	public Loan(String name, double balance, double rate, double paymentAmount, int startAge) {
		super();
		this.name = name;
		this.balance = balance;
		this.rate = rate;
		this.paymentAmount = paymentAmount;
		this.startAge = startAge;
	}

	public double makePayment() {
		balance -= paymentAmount;

		if (balance < 0) {
			double actualPayment = paymentAmount + balance;
			balance = 0;
			return actualPayment;
		}
		return paymentAmount;

	}

	public void accureInterest() {
		balance += balance * rate;
		
		// -----=====88888=====-----
//      Loans
//-----=====88888=====-----

//Monthly loan payments
for(int month = 0; month < 12; month++) {
for(Loan loan: loans) {
if(age >= loan.startAge) {
 cash -= loan.makePayment();	
 loan.accrueInterest();
}
}
}

//Calculate Debt Balance
double debt = 0;
for(Loan loan : loans)
debt += loan.balance;
	}

}
