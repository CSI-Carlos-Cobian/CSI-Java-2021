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
        // Housing fees and meal plan
        double costOfLiving = 10_000; 

        // Federal Loans are waived while you study. 
        // Some loans are not
        double loanInterest = 0.00; 
        
        cash += salary;
        debt -= costOfLiving;
        debt -= tuition;
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
        double rent = 12 * (1500 + 400);

        // 30$ daily food stipend
        double food = 30 * 365; 

        // 60$ per month on gas.
        // Approximately 1000$ a year on car reparations, tolls, licenses, oil and tire changes.
        // Monthly car payment of 400$
        double carAndExpenses = 60*12 + 1_000 + 400*12; 
                
        cash += salary;
        cash -= food;
        cash -= rent;
        cash -= carAndExpenses;
}

```


<br>


### [Don't keep on wanting money, people have loads and they're never happy.](https://www.youtube.com/watch?v=-sNWKbnaFkg&list=RD-sNWKbnaFkg)