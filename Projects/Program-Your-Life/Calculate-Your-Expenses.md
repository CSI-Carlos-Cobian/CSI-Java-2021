## Calculate your expenses

<br>

<div style="text-align:center">
        <img    src="https://lh3.googleusercontent.com/proxy/IB5Enns-9Q26ZqybtVp0WIYkXmkcXqOGIaJHxw7gg9udd37sFxvYuNyfVi7l_iSaoMo025dof6Dqshrm4emVZF3UzTo4DMv4DA"
                title="Life" 
                width="30%" 
                height="30%" />
</div>

<br>



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
    * eg. salary
  * Sum the variables you've created in your formative years, to the ones created outside of your loop.
  
```java
// Formative years
if(age < 18){
        double salary = 0;
        cash += salary;
} 
...
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
} // End of loop
```
You don't necessarily have to die if you run out of cash. Some people may move back in with their parents. If you're willing to do so and planing to get back in your feet then you may modify the text.

## [Back to Project](/../../tree/main/Projects/Program-Your-Life/Program-Your-Life.md)