# Purchase a Car
* The average lifespan of a new car can be approximated to be 10 years. Accidents and damages may shorten these while frequent oil changes and careful driving may extend them.
* Expect a used car to last less.
* In the code below, you will make a choice at the age of 24. If you don't have a lot of money you'll buy a used car. Otherwise you will mortgage a car at a interest rate of 5%.
* Loan interest is based on your credit score.
* It is higher if you're under 25, have debt, are unemployed, have no credit history, etc.

```java
// -----=====88888=====-----
//     Additional Logic
// -----=====88888=====-----

// Buy a used car after college. Could you afford it? 
if(age == 24 && cash >= 15_000) {
        double usedCarPrice = 5_000.00;
        cash -= usedCarPrice;

        System.out.println("Bought a car for: " + usedCarPrice);
} // New cars with loan interest are a bad investment! 
else if(age == 24 && cash > 6_000) {
        double newCarPrice = 35_000;
        double downPayment = newCarPrice * 0.15;
        double interestRate = 0.05;
        int repaymentYears = 6;

        Loan carLoan = new Loan("Car Loan", 
                                (newCarPrice - downPayment),
                                interestRate, 
                                repaymentYears);
        loans.add( carLoan );

        System.out.println("Monthly car Payment: " + carLoan.getMonthlyPayment() + " For a total of " + carLoan.getTotalPayment() );
}
```

* Purchase a new car every 10 or so years until you retire.
* You must have a transportation method from the time you finish college. 
* If you do not wish to buy a car, then you may purchase a bicycle for `400$`. 

<br>

## [Back to Decisions](/../../tree/main/Projects/Program-Your-Life/Decision-Forest.md)