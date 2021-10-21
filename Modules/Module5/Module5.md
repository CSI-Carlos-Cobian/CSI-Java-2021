<div style="text-align:center">
        <img    src="../../images/csi.png" 
                title="Colegio San Ignacio" 
                width="20%" 
                height="20%" />
</div>
<br>

# Module 5: Boolean Logic

### Merge origin/master. This is the same as Fetching Upstream. Create a commit. `(1pts)`

<br>

## If-else logic
One of the most common statements in programming is the `if` statement. It is often followed by an `else` statement. If statements evaluate a boolean predicate and execute code depending on the propositional statement response. An `else` statement is used when you would like another piece of code to execute of a false response. An `else if` statement may be used when you'd like a piece of code to run when an alternate condition IS met. An example using a mathematical proposition is displayed below.

```java
int x = 45;

if(x == 0){ // Evaluate if x is 0 
    System.out.print("The value of x is 0");
}
else if(x > 50){ // Assumes x is not 0.
    System.out.print("The value of x is more than 50");
}
else{ // In the case that x is less than 50 and not 0.
    System.out.print("The value of x is lower than 50, and is not 0");
}
```

<br>

Let's call `x > 0` <u>**A**</u> and `x < 100` <u>**B**</u>. A is true and so is B. They are both then denoted the value of 1(true). The logical operator **AND** will combine these two true values and produce a single boolean value of true. 

<br>

## [Truth tables and Boolean Operators](https://www.mcckc.edu/tutoring/docs/br/math/reasoning/Logic_and_Truth_Tables.pdf)

<img    src="https://www.researchgate.net/profile/Seth-Abels/publication/291418819/figure/fig3/AS:718510820962304@1548317737478/Summary-of-the-common-Boolean-logic-gates-with-symbols-and-truth-tables.png"
                title="Boolean operators" 
                width="60%" 
                height="60%" />


## Compound Logic
Multiple logical statements can be combined using the logical operators seen above. These take 2 boolean values and produce a single one. An example of using the logical operator `AND` is seen below.

```java
int x = 45;
if( x > 0 and x < 100 ):
  print("Will run.")
```


Let's call `x > 0` <u>**A**</u> and `x < 100` <u>**B**</u>. A is true and so is B. They are both then denoted the value of 1(true). The logical operator **AND** will combine these two true values and produce a single boolean value of true. 

<br>

## Implement a rock-paper-scissors game using if-else logic.`(15pts)`
* Create a file called `RockPaperScissor.java`
* Create an array with all 3 possible values.
* Have your opponent select a random value from this list by a code similar to the one below:


```java
public class RockPaperScissors {
	public static void main(String[] args) {
		String[] choices = {"Rock", "Paper", "Scissors"};
		Random r = new Random();    
		String computerChoice = choices[r.nextInt(choices.length)];
		Scanner sc = new Scanner(System.in);


		System.out.print("Type your choice: ");
		int inputInt = Arrays.asList(choices).indexOf(sc.nextLine());
		String userChoice = choices[inputInt];

		System.out.println("Computer chose: " + computerChoice);
		System.out.println("User chose: " + userChoice);

		if(computerChoice == userChoice) {
			System.out.println("It's a Tie!");
		}
		else if(computerChoice == choices[0] && userChoice == choices[1]) {
                // Computer chose Rock and user chose Paper
			System.out.println("You Win!");
		}
		//Other else if go here **
		
                // Finally
		else {
			System.out.println("Something went wrong!");
		}
	}

}
```

<br>

## Upload a screenshot of the full output produced by running `RockPaperScissors.java` `(1pts)`
* ### Use the name format: `Module5.png`
* ### Store it within your Module5 directory.
* ### Commit and push the file before next class.

<br>


# Class Discussion
## Answer the questions on the Markdown file located within your `Module5` directory (Module5.md).`(6pts)`

<!-- This is a comment. It is not processed by the code -->
<!-- Welcome! These are your questions. -->
<!-- Answer using full sentences to receive all points. -->
<!-- 

Give a python example for each logic operator in the module image.

 - Answers:
   - OR:
   - AND: 
   - NOT: 


What part of the instructions was incomplete or unclear?

 - Answer:

Type down any class notes below this sentence:




Lackluster responses may result in point deductions.
-->

* ### Save the file, Commit your changes and push them to your remote repository by the end of the class.
* ### You may complete the answers by issuing additional commits and pushing them before the next class.

<br>

## [Next Module ->](/../../tree/main/Modules/Module6/Module6.md)