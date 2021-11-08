<div style="text-align:center">
        <img    src="https://qph.fs.quoracdn.net/main-qimg-ae0a2ce4aec587462504183c6b8af811"
                title="Life" 
                width="50%" 
                height="50%" />
</div>

<br>

# Program your Life `(∞pts)`

* Create a package on your `MainProject` named `csi.lastname.life`.
* Create a JAVA class named Calculator
  * With a main.

### [Determine your life expectancy based on your geolocation.](https://www.macrotrends.net/countries/PRI/puerto-rico/life-expectancy#:~:text=The%20current%20life%20expectancy%20for,a%200.21%25%20increase%20from%202018.)       

### Create a for loop that runs this many times.
* Well the years start coming and they don't stop coming.
* Use the variable name `age` instead of `i`.

<br>

### Make your choices
* How much thought have you put into what you're going to use your time for?
* Segment your expected phases using `if else` statements and age ranges.
  * This will vary by person. 
    * Some may chose to study Engineering, Medicine or Law amongst many other professions.
    * Some may not.  
  * Lets start with our formative years
```java
// -----=====88888=====-----
//    Lifetime accounting
// -----=====88888=====-----
if(age<18){
}
```
  * Add the years you intent to study and the degrees you would like to accumulate. 
    * Research the degrees and practice years expected for your profession.
    * I studied a Bachelors of Engineering and it took me 5 years. I worked for a few years and would now like to do a masters.
```java
// Formative years
if(age < 18){
} 
// Engineering Baccalaureate
else if ( age < 23){
}
// Industry Experience
else if (age < 25){
}
// Masters Degree
else if (age < 28){
}
```   
  * Include the amount of years you expect to work. The standard age for retirement is 65.
  * Add a retirement gap.
```java
...
// Masters Degree
else if (age < 28){
}
// Work
else if (age < 55){
}
// Retirement
else {

}
```

<br>

## Calculate your expenses
### Start of life
* During your formative years you may have had a job or christmas gifts. I hope you've been saving up!
  * Create these `double` variables **outside of your for loop**. They may all be `0.0` for this exercise.
    * startingAmount
    * cash
    * debt
    * invested
  * Sum your starting amount to your cash.
```java
double cash = 0.0;
double startingAmount = 1_000;
cash += startingAmount;
```
  * Create variables inside your formative years. 
    * salary
  * Sum the variables you've created in your formative years, to the ones created outside of your loop.
```java
// Formative years
if(age < 18){
        double salary = 0;
        cash += salary;
} 
```

<br>

### Loans 
* Some of us are not born with access to capital. For this reason we take loans from the bank. Loans can both be beneficial and dangerous. Opening loan accounts and being responsible in payments will increase your credit score. Be careful with interest rates, their compounding nature can make you end up paying twice or more of your original loan amount.
* Create a new file called `Loan.java`
* Define the variables for:
  * name
  * balance
  * [rate](https://www.investopedia.com/ask/answers/100314/what-difference-between-interest-rate-and-annual-percentage-rate-apr.asp)
  * paymentAmount
  * startAge
* Create a constructor with the parameters above.
  
* Back at your `Calculator` 
  * Import Java Util with: `import java.util.*`
  * Create an ArrayList of `Loan`s.
  * [Populate it with some common types of loans](https://www.creditkarma.com/calculators/loan).
  * Leave the startAge at 0 for all loans until you determine it further on.
```java
List<Loan> loans = new ArrayList<Loan>();

loans.add( new Loan("Student Loans", 0, 0.0466, 0, 23) );
loans.add( new Loan("Personal Loans", 0, 0.16, 0, 0) );
loans.add( new Loan("Mortgage Loans", 0, 0.03125, 0, 0) );
loans.add( new Loan("CreditCard", 0, 0.29, 0, 0) );
```
* Now that you have created your loans you will need to pass your balance on to the object.

```java
... 

double salary = 0;
// Tuition + fees - scholarship
double tuition = 54_000 + 4_000;
// rent + food + expenses
double costOfLiving = 17_000;

cash += salary;
loans.get(0).balance += costOfLiving;
loans.get(0).balance += tuition;
```


<br>

### Asking for money
When lacking the capital to invest in yourself, you may have the option to ask someone for money. Some may refuse to do so due to pride or refusal of being in debt to another. Others may not have the option at all.
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

<br>

### Early adulthood
* If you're going straight to college after high school, you need to plan out your expenses. [Research which institution you would be interested in attending](https://www.petersons.com/college-search.aspx).
  * Consider the class size, acceptance rate, location and price.
  * Find out the out-of-state tuition.
  * Search for the average cost of living in this location. 
    * On-Board attendance to some schools bundles this into a flat rate. Investigate on your institution's offerings.
    * [The average cost by state may work.](https://thehill.com/changing-america/respect/poverty/568405-the-cost-of-living-in-each-state) 

```java
// College years 
else if(age < 23) { 
  String location = "IA";
  double salary = 0;

  //Tuition + fees - scholarship
  double tuition = 23_000 + 4_000 - 31_000; 
  // Dorm fees and meal plan
  double costOfLiving = 10_000; 
  
  cash += salary;
  // Federal Loans are waived while you study. 
  // Some loans are not. You may create multiple loans 
  // with different rates and repayment periods. 
  loans.get(0).balance += costOfLiving;
  loans.get(0).balance += tuition;
}
```
  * Repeat this process for all other degrees and/or goals segmented above (eg. masters, medicine school, law school, etc.)

<br>

### Adulthood
* Hope you were able to reach all your educational goals. They may take a little longer than you originally expected but the important thing is to persevere and never give up. Now what?
* Enjoy your financial stability.
  * Determine the quality of life you'd like to purchase with your salary. 
  * Look up real values for the location in which you'd like to live.
```java
else if(i<55) {
  String location = "PR";

  // salary - 10% tax
  double salary = 50_000 * 0.9; 

  // 2 bedroom apartment + electric/water/wi-fi bills
  double rent = 12 * (1_500 + 400);

  // 30$ daily food stipend
  double food = 30 * 365; 

  // 60$ per month on gas.
  // Approximately 1000$ a year on car reparations, tolls, licenses, oil and tire changes.
  // Expensive vehicles have an insurance cost.
  // Trucks are more expensive.
  double carExpenses = 60*12 + 1_000 ; 
  
  cash += salary;
  cash -= food;
  cash -= rent;
  cash -= carExpenses;
}

```

<br>

## Multiple decision trees
Adding `if` statements that are *detached* from your primary `else if` **decision tree** will allow you to make <u>specific</u> decisions on separate occasions.

### Purchase a Car
* The average lifespan of a new car can be approximated to be 10 years. Accidents and damages may shorten these while frequent oil changes and careful driving may extend them.
* expect a used car to last less.
```java
// -----=====88888=====-----
//     Additional Logic
// -----=====88888=====-----

// Buy a used car after college. Could you afford it? 
if(age == 24 && cash >= 15_000){
        double usedCarPrice = 5_000.00;
        cash -= usedCarPrice;
} // New cars with loan interest are a bad investment! 
else if(age == 24 && cash < 15_000){
        double newCarPrice = 35_000;
        double downPayment = 5_000;
        // Loan interest is Based on your credit score
        //It is higher if you're under 25, have debt, are unemployed, etc.
        double interestRate = 0.05;
        double payment = 400;

        loans.add( new Loan("Car Loan", 
                  (newCarPrice - downPayment), 
                  interestRate, 
                  payment , 
                  age) );
}
```

* Purchase a new car every 10 or so years until you retire.

### Purchase a House
Buying a house allows you to retain your monthly rent bill. Purchasing a house using a mortgage loan for 30 years will cost you almost twice the value of the house, but most anyone with a consistent paycheck will have access to it. Taking a 15 year loan will bring this to a bout 1.5x the original cost, but requires thicc monthly payments. 


<br>

## Time to pay back those loans
* We will make 2 new functions on out `Loan` class.
  * makePayment()
  * accrueInterest()
* You must implement them to properly deduce from balance and accumulate interest until they are paid off.
* [Consider this implementation for reference.](https://github.com/seycileli/Loan-Calculator/blob/master/src/Loan.java)

```java
// -----=====88888=====-----
//           Loans
// -----=====88888=====-----

// Monthly loan payments
for(int month = 0; month < 12; month++) {
  for(Loan loan: loans) {
    if(age >= loan.startAge) {
      cash -= loan.makePayment();	
      loan.accrueInterest();
    }
  }
}

// Calculate Debt Balance
double debt = 0;
for(Loan loan : loans)
  debt += loan.balance;
```
<br>

## Review how your life plan went! Add a `Print` statement before finalizing your loop.
```java
// Output year-end review
System.out.println("Balance at age: " + age + " is: " + cash + " with a debt of " + debt + " and "
    + invested + " invested.");

// Did you make it?
if(cash < 0) {
  System.out.println("Out of cash. You Died!");
  break;
}

```


<br>


### [Don't keep on wanting money, people have loads and they're never happy.](https://www.youtube.com/watch?v=-sNWKbnaFkg&list=RD-sNWKbnaFkg)