# Purchase a House
Buying a house allows you to retain your monthly rent bill. Purchasing a house using a mortgage loan for 30 years will cost you almost twice the value of the house, but most anyone with a consistent paycheck will have access to it. Taking a 15 year loan will bring this to a bout 1.5x the original cost, but requires thicc monthly payments. 


```java
// -----=====88888=====-----
//     Additional Logic
// -----=====88888=====-----

// Buy a House at 35
if(age == 35 && cash >= 200_000){
        double cashPrice = 150_000;
        cash -= cashPrice;

        System.out.println("Bought a House for: " + usedCarPrice);
}
else if(age == 35 && cash >= 100_000){
        double apartmentPrice = 75_000;
        cash -= cashPrice;

        System.out.println("Bought an  Apartment for: " + usedCarPrice);
}
else if(age == 35 &&  cash > 15_000){
        double apartmentPrice = 75_000;
        double downPayment = housePrice * 0.15;
        double interestRate = 0.03;
        // int repaymentYears = 15;
        int repaymentYears = 30;

        Loan mortgageLoan = new Loan("My first home", 
                (apartmentPrice - downPayment),
                interestRate, 
                repaymentYears);
        loans.add( mortgageLoan );

        System.out.println("House mortgage: " + mortgageLoan.getMonthlyPayment() + " For a total of " + mortgageLoan.getTotalPayment() );
}
```

<br>

## [Back to Decisions](/../../tree/main/Projects/Program-Your-Life/Decision-Forest.md)