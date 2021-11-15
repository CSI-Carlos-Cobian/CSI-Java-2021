# Early adulthood
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
  loans.get(0).principal += costOfLiving;
  loans.get(0).principal += tuition;
}
```
  * Repeat this process for all other degrees and/or goals segmented above (eg. masters, medicine school, law school, etc.)



## [Back to Project](/../../tree/main/Projects/Program-Your-Life/Program-Your-Life.md)