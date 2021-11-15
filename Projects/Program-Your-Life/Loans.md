# Loans 

<div style="text-align:center">
  <img    src="https://static.wikia.nocookie.net/super-smash-flash-3/images/a/aa/Mr._Monopoly.gif/revision/latest/scale-to-width-down/228?cb=20140322211421"
          title="Life" 
          width="25%" 
          height="25%" />
</div>

<br>

The word mortgage originates from latin and means `Death Pledge`. Mortgages may be used to acquire property, equipment, and tangible assets. Your bank will be more than happy to lend you money, given that you have a good credit score. This is not free as you must pay compounded interest.

<br>

Some of us are not born with access to capital. For this reason we take loans from the bank. Loans can both be beneficial and dangerous. Opening loan accounts and being responsible in payments will increase your credit score. Be careful with interest rates, their compounding nature can make you end up paying twice or more of your original loan amount.
* Create a new file called `Loan.java`
* Define the variables for:
  * name
  * principal
  * annualInterestRate
  * numberOfYears
* Create a constructor with the parameters above.
  
* Back at your `Calculator` 
  * Import Java Util with: `import java.util.*`
  * Create an ArrayList of `Loan`s **outside of your loop**.
  * [Populate it with some common types of loans](https://www.creditkarma.com/calculators/loan).
```java
List<Loan> loans = new ArrayList<Loan>();

loans.add( new Loan("Student Loans", 0, 0.0466, 30) );
loans.add( new Loan("Personal Loans", 0, 0.16, 10) );
loans.add( new Loan("Mortgage Loans", 0, 0.03125, 30) );
loans.add( new Loan("CreditCard", 0, 0.29, 0, 1) );
```

* Now that you have created your loans you will need to pass your balance on to the object.

```java

double salary = 0;
// Tuition + fees - scholarship
double tuition = 54_000 + 4_000 - 10_000;
// rent + food + expenses
double costOfLiving = 17_000;

cash += salary;
loans.get(0).principal += costOfLiving;
loans.get(0).principal += tuition;
```

<br>

## Time to pay back those loans
* We will make 2 new functions on out `Loan` class.
  * makePayment()
  * getBalance()
  * getMonthlyPayment()
  * getTotalPayment()
* You must implement them to properly pay of a loan.
* Differed loans don't have to be paid until a certain date. eg. `student loans until you graduate`
  * Implement a differed payment flag
* [Consider this implementation for reference.](https://github.com/seycileli/Loan-Calculator/blob/master/src/Loan.java)
* An example of what a functional `Loan` class within your loop should look like this.

```java
// -----=====88888=====-----
//           Loans
// -----=====88888=====-----

//Iterate over all loans
for (Loan loan : loans) {
  // Carry out 12 payments (monthly)
  for (int month = 0; month < 12; month++) {
    // If this loan is still due and has not been differed
    if (loan.getBalance() > 0 && loan.differed == false) {
      cash -= loan.makePayment();
    }
  }
}

// Calculate Debt Balance
double debt = 0;
for(Loan loan : loans)
  debt += loan.principal;
```
<br>


<br>

### Asking for money
When lacking the capital to invest in yourself, you may have the option to ask someone for money. Some may refuse to do so due to pride or refusal of being in debt to another. Your parents may be more than willing to help out with your educational expenses. Consider how you are studying in the best high-school around. 

Others may not have the option at all. 

If you plan on asking someone for money instead of taking a loan they you must write a function to do so. This function should add the needed money into your `cash` deposit. *Remember, **nothing** is free and everything has a price.*
* Write the function outside of your `main`, but within your `Calculator`.

```java
private static double askForMoney(double amount){
  System.out.println("You have been spared by someone who gave you: " + amount);
  return amount;
}
```

You must now implement this function into your loop. 

```java
...

  cash += askForMoney(tuition);
  cash -= tuition;

  cash += askForMoney(costOfLiving);
  cash -= costOfLiving;
}
```


## [Back to Project](/../../tree/main/Projects/Program-Your-Life/Program-Your-Life.md)