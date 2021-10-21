<div style="text-align:center">
        <img    src="https://beginnersbook.com/wp-content/uploads/2017/09/for_loop_C.jpg" 
                title="Colegio San Ignacio" 
                width="50%" 
                height="50%" />
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


## Draw an X on a 2D Array using a For Loop `(10pts)`
* Create a Java class in the package you have been using so far named `LaX.java`
* Create a main method
* Within the main method, create a 2D integer array filled with 0 values.
  * it should have 9 columns and 9 rows
* Fill in the question marks in the code to draw an X like the one displayed below..

Sample snippet of code:
```java
int[][] arr = new int[9][9];

for(int i = 0; i < arr.length; i++) {
    arr[?][?]=1;
    arr[?][?]=1;
    System.out.println(Arrays.toString(arr[i]));
}
```
Expected Output

```java
[1, 0, 0, 0, 0, 0, 0, 0, 1]
[0, 1, 0, 0, 0, 0, 0, 1, 0]
[0, 0, 1, 0, 0, 0, 1, 0, 0]
[0, 0, 0, 1, 0, 1, 0, 0, 0]
[0, 0, 0, 0, 1, 0, 0, 0, 0]
[0, 0, 0, 1, 0, 1, 0, 0, 0]
[0, 0, 1, 0, 0, 0, 1, 0, 0]
[0, 1, 0, 0, 0, 0, 0, 1, 0]
[1, 0, 0, 0, 0, 0, 0, 0, 1]
```

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
  * You must use for-each syntax.

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

# Nested Loops
We have previously studied nesting. Now we will apply that concept into looping. By creating a loop within a loop, we may iterate over multidimensional arrays. an example for the syntax is displayed below.

```java
int[][] arr = 	{
                  {1,2,3,4,5}, 
                  {6,7,8,9,10}, 
                  {11,12,13,14,15}
                };

for(int i = 0; i < arr.length; i++) {
  for(int j = 0; j < arr[i].length; j++) {
    System.out.println( arr[i][j] );
  }
}

```

The code above prints every value of a 2 dimensional array. A 2D array is essentially an array of arrays. We may observe in the example above that a for loop using the variable `i` traverses the top level array. This is an array that contains 3 arrays. The second loop using the variable `j` will traverse each of these arrays mentioned above. In this case, they contain 5 integers each. 

<br>

## Create a 2D Nested Loop `(10pts)`
* Create a Java class in the package you have been using so far named `EvenOdd2D.java`
* Create a main method
* Within the main method, create a 2D integer array filled with 0 values.
  * it should have 10 columns and 10 rows
* Create a nested `for` loop.
  * The for loop should use `i` and `j` as variables respectively.
  * On odd rows **(`i` is odd)**, set odd indexed columns **(`j` is odd)** as 1.
  * On even rows **(`i` is even)**, set even indexed columns **(`j` is even)** as 1.
  * Remember from class that we determine whether a number is odd or even by using the modulus `%` operator.

Sample snippet of code:
```java
int[][] arr = new int[10][10];

for(int i = 0; i < arr.length; i++) {
    for(int j = 0; j < arr[i].length; j++) {
      //Implement if-else logic here.
    }
    System.out.println(Arrays.toString(arr[i]));
}
```
Expected Output

```java
[1, 0, 1, 0, 1, 0, 1, 0, 1, 0]
[0, 1, 0, 1, 0, 1, 0, 1, 0, 1]
[1, 0, 1, 0, 1, 0, 1, 0, 1, 0]
[0, 1, 0, 1, 0, 1, 0, 1, 0, 1]
[1, 0, 1, 0, 1, 0, 1, 0, 1, 0]
[0, 1, 0, 1, 0, 1, 0, 1, 0, 1]
[1, 0, 1, 0, 1, 0, 1, 0, 1, 0]
[0, 1, 0, 1, 0, 1, 0, 1, 0, 1]
[1, 0, 1, 0, 1, 0, 1, 0, 1, 0]
[0, 1, 0, 1, 0, 1, 0, 1, 0, 1]
```

<br>


## Draw an inverted X using 3D arrays `(10pts)`
* Create a Java class in the package you have been using so far named `LaX3D.java`
* Create a main method
* Within the main method, create a 3D integer array filled with 0 values.
  * It should have 2 grids of 9 columns and 9 rows
* Create a nested `for` loop.
  * The for loops should use `i`, `j` and `k` as variables respectively.
* The first dimension should display the LaX code worked on the last class.
* The second code should display a negation of the first array's output.

Sample snippet of code:

```java
int[][][] arr = new int[2][9][9];

System.out.println("---------------------------");
for (int j = 0; j < arr[0].length; j++) {
  for (int k = 0; k < arr[0][j].length; k++) {

    // X Logic Here
    // Can be done in 2 lines

  }
  System.out.println(Arrays.toString(arr[0][j]));

}

System.out.println("---------------------------");
for (int j = 0; j < arr[1].length; j++) {
  for (int k = 0; k < arr[1][j].length; k++) {

    // Inverted X Logic Here
    // Can be done in 1 line

  }
  System.out.println(Arrays.toString(arr[1][j]));
}
```

### Expected Output:

```java
---------------------------
[1, 0, 0, 0, 0, 0, 0, 0, 1]
[0, 1, 0, 0, 0, 0, 0, 1, 0]
[0, 0, 1, 0, 0, 0, 1, 0, 0]
[0, 0, 0, 1, 0, 1, 0, 0, 0]
[0, 0, 0, 0, 1, 0, 0, 0, 0]
[0, 0, 0, 1, 0, 1, 0, 0, 0]
[0, 0, 1, 0, 0, 0, 1, 0, 0]
[0, 1, 0, 0, 0, 0, 0, 1, 0]
[1, 0, 0, 0, 0, 0, 0, 0, 1]
---------------------------
[0, 1, 1, 1, 1, 1, 1, 1, 0]
[1, 0, 1, 1, 1, 1, 1, 0, 1]
[1, 1, 0, 1, 1, 1, 0, 1, 1]
[1, 1, 1, 0, 1, 0, 1, 1, 1]
[1, 1, 1, 1, 0, 1, 1, 1, 1]
[1, 1, 1, 0, 1, 0, 1, 1, 1]
[1, 1, 0, 1, 1, 1, 0, 1, 1]
[1, 0, 1, 1, 1, 1, 1, 0, 1]
[0, 1, 1, 1, 1, 1, 1, 1, 0]
```

<br>

## [DNA Project corresponds to this lecture. ->](/../../tree/main/Projects/DNA/DNA.md)

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