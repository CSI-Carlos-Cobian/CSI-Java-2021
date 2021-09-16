<div style="text-align:center">
        <img    src="../../images/csi.png" 
                title="Colegio San Ignacio" 
                width="20%" 
                height="20%" />
</div>
<br>

# Module 6: Loops

### Merge origin/master. This is the same as Fetching Upstream. Create a commit. `(1pts)`

<br>

# `For` Loops
For loops are designed to run a finite amount of times. A Basic for loop in java starts with the keyword `for`. It consists of 3 segments separated by semicolons `;` encapsulated within parenthesis. 

### Iterator
The fist segment is where you declare your [Iterator](https://en.wikipedia.org/wiki/Iteration) variable. This variable is only accessible within your for loops and seizes to exist once the execution has terminated. Usually, the variable is called `i` as it stands for iterator. On most cases you will initialize i to be the value of 0, since it is the initial index in programming. The syntax for this segment on most cases will therefore be `ìnt i = 0;`

### Termination condition
The second segment of your for loop will be what tells your loop when to stop. This can be any boolean value, but on most cases we use a mathematical operator such as `<, >, <=` etc. If you want your loop to wun 10 times, you will use the syntax `i < 10;`. You may use more relative or dynamic values. An example would be iterating over an array of variable length. This may look like `i < arrayName.length;`

### Variable increment
Finally, the last statement is the variable increment. On most cases we will use `i++`. This will increment `i` by 1 at the end of every execution. 

### Code block
After the 3 primary components of the for loop are encapsulated into parenthesis, a code block of what is to be executed must be included. Note that a for loop does not use a semicolon at the end.

### Example
An example of a full for-loop that will run 100 times and print each value of i will look like this:

```java
for(int i = 0; i < 100; i++){
  System.out.println(i);
}
```

<br>

## Create a `for` iterator on your `AnimalFarm` class. `(10 pts)`
* Define a new method called `printAnimals()`
* Create an iterator that loops through your `animals` list and calls `toString()` for each animal. 
  * Remember that printing the object **reference** automatically calls this method.
* Add a header to each animal. Print what index of the array holds the animal value before printing the `Animal`'s data.

<br>

# For-Each Loops
A simpler version of the for loop is available. It is called for-each. This is often used when iterating through an entire list of `Object`s. It's syntax is similar, but varies slightly. It contains 2 statements separated by a `:` instead. The first statement is a temporary variable that represents what item of the array you are currently working on. The second represents the list that you are addressing.
An example of the syntax using `animals` looks like this:

```java
for(Animal a : animals){
  System.out.println(a);
}
```

## Create a `for-each` iterator on your `AnimalFarm` class. `(10 pts)`
* Define a new method called `printEachAnimal()`
* Create an iterator that loops through your `animals` list and calls `toString()` for each animal. 
  * Remember that printing the object **reference** automatically calls this method.

<br>

<br>

# `While` Loops
A while loop is a slightly more customizable loop. It is a bit more complex as you must **explicitly** terminate it. A while loop only contains a termination condition within it's parenthesis. An example similar to the one above will look like this:


```java
int i = 0;

while(i<100) {
  System.out.println(i);
  i++;
}
```

A while loop has more flexibility that na for loop. It may run infinitely if you wish it to. An example of this would be:

```java
int i = 0;

while(true) {
  System.out.println(i);
  i++;
}
```

In order to force ourselves out of a for loop we may use a `break;` statement. An example of breaking at the 56th execution will look like:

```java
int i = 0;

while(true) {
  System.out.println(i);
  i++;
  if(i==56)
    break;
}
```

I am using basic boolean mathematic operators, but any type of boolean operator works on while loop conditions.

<br>

# Do-While
A do-while will execute the code within the code block before evaluating the termination condition. It is useful for when you need a block of code to run at least once, regardless of the termination condition.

```java
int i=1;    

do{    
    System.out.println(i);    
i++;    
}while(i<=10);  
```

<br>

# Class Discussion
## Answer the questions on the Markdown file located within your `Module6` directory (Module6.md).`(0pts)`

<!-- This is a comment. It is not processed by the code -->
<!-- Welcome! These are your questions. -->
<!-- Answer using full sentences to receive all points. -->
<!-- 


What part of the instructions was incomplete or unclear?

 - Answer:

Type down any class notes below this sentence:




Lackluster responses may result in point deductions.
-->

* ### Save the file, Commit your changes and push them to your remote repository by the end of the class.
* ### You may complete the answers by issuing additional commits and pushing them before the next class.

<br>

## [Next Module ->](/../../tree/main/Modules/Module7/Module7.md)