## Calculate your expenses

<div style="text-align:center">
  <img    src="https://thumbor.forbes.com/thumbor/fit-in/1200x0/filters%3Aformat%28jpg%29/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F5f1e55e18ba283c9ad86684a%2F0x0.jpg"
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
  // Grandma's christmas gift!
  double salary = 100;
  cash += salary;
} 
...
```

<br>

## Review how your life plan went! Add a `Print` statement before finalizing your loop.
* We don't have `debt` or `invested` yet so we will create temporary variables to use.

```java
  double debt = 0;
  double invested = 0;

  // Output year-end review
  System.out.println("Balance at age: " + age + " is: " + cash + " with a debt of " + debt + " and " + invested + " invested.");

  // Did you make it?
  if(cash < 0) {
    System.out.println("Out of cash. You Died!");
    break;
  }

} // End of loop
```

You don't necessarily have to die if you run out of cash. Some people may move back in with their parents or rely on another. You may modify the behavior of this script, but you may not go below 0 `cash` without triggering a response.

<br>

## [Next](/../../tree/main/Projects/Program-Your-Life/Early-Adulthood.md)

## [Return to Project](/../../tree/main/Projects/Program-Your-Life/Program-Your-Life.md)