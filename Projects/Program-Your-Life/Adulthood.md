# Adulthood

<div style="text-align:center">
        <img    src="https://media.npr.org/assets/img/2011/02/28/man1-5e5441bc39872d1f6601006c212026e8c717365e-s1100-c50.jpg"
                title="Life" 
                width="40%" 
                height="40%" />
</div>

<br>

Hope you were able to reach all your educational goals. They may take a little longer than you originally expected but the important thing is to persevere and never give up. Now what?
* Enjoy your financial stability.
  * Retain 10% of your salary for taxes. Do so by multiplying your salary by 90%.
  * Subtract your expenses from your cash.
  * Determine the quality of life you'd like to purchase with your salary. 
  * Look up real values for the location in which you'd like to live.
  * Your student loans are no longer differed.
* You won't earn an average salary on your first years working in the field. Look up entry level salaries.
* You may design another block for when you have attained industry experience and are eligible for a senior salary (average).

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

  loans.get(0).differed = false;
}

```

<br>

## [Next](/../../tree/main/Projects/Program-Your-Life/Decision-Forest.md)

## [Return to Project](/../../tree/main/Projects/Program-Your-Life/Program-Your-Life.md)