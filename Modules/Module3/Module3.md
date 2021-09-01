<div style="text-align:center">
        <img    src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105111644/Data-types-in-Java.jpg" 
                title="Colegio San Ignacio" 
                width="70%" 
                height="70%" />
</div>
<br>

# Module 3: Data Types and Variables

### Merge origin/master. This is the same as Fetching Upstream. Create a commit. `(1pts)`

### Create an eclipse project called MainProject in the root directory of your CSI-Java-2021 directory.`(4pts)`
eg: 
>C:\Users\carlos.cobian\Documents\Courses\CSI-Java-2021\MainProject
* Create a new folder called MainProject. Select it as your Location when creating the project.
* Create a package using the same name from Module2
* Create a Java Class called DataTypes.java
* [Copy and run this code from GitHub.](https://gist.github.com/Aivirth/ff7cb6cf88d3edd77edad8fa6221b20b)
* This code provides usage information and examples on all primitive data-types

<br>

# Data Types
In Java, there are [8 primitive data types](https://www.w3schools.com/java/java_data_types.asp). Primitive data types use less memory than complex objects. The largest one is 8-bytes. Complex objects vary in size and cary many other characteristics. 

<br>

### Integer
Whole numbers are called `integers`. Programmers usually count using integers. 
>Example: -2, -1, 0, 1, 2, 14, 2019

<br>

### Float
In coding, numbers with a decimal point are known as `floats`. It's Full name is <u>Decimal Floating Point Number</u>. It uses 32 bits to store a fractional number. 
>Example: -1.25, -1.0, 0.5, 1.0, 1.33

<br>

### Double
A `double`'s full name is <u>Double Precision Decimal Floating Point Number</u>(float64). It holds decimals with a larger number of fractional digits(numbers at the right side of the decimal point). It uses 64 bits
>Example: -1.25, -1.0, 0.5, 1.0, 1.33

<br>

### String
Programmers use the word strings to refer to blocks of text or any data made up of a sequence of characters. Strings are a single data object; They are surrounded by double quote (") characters. 
>Example: "a", "aa", "Hello!", "101 Dalmatians"

<br>

### Char 
Stores a single character/letter or ASCII values.
>Example: 'c'

<br>

### Boolean
A Boolean is a value that is represented by a single bit. This means that it is either true or false. Booleans are used as a part of logic. Various operators may determine whether a statement is true or false such as equals(`==`) or greater than(`>`).
>Example:
>
>i = 10
>
>(i == 15) is False
>
>(i < 15) is True

<br>

### Object
You may define your own data type. In <u>object oriented languages</u> such as Java or C#, everything is an object.

<br>

### Null
A null or None type represents the absence of a value. This differs from, say 0, in that 0 is present value. 

<br>

### Array
An array is a list, or collection, of a certain data type. An array is treated as its own data type since it acts like a container. Array indices start at 0.

<br>

## Data Types

| Data Type | Syntax | 
|-----------|--------|
| Integer | `int i = 42;` primitive integer<br> `int x,y = 42;` Assign multiple variables <br> `Integer i = 42;` Integer Object |
| Float | `float f = 5.2f;` <br> `float f = 5f;` is equal to 5.0 |
| Double | `double d = 5.2;` Primitive data type <br> `Double d = 5.0;` Double Object |
| char | `char c = 's';` |
| String | `String s = "Hello World!";` |
| Boolean | `true, false, >, <, ==, >=, <=, !, \|\|, &&` |
| Object | `Object o = new Object();` <br> This is called the default constructor for an object. <br> It initializes an object without any values. |
| Void/Null | `Object o = null;` |
| Array | `int[] integerArray = new int[5];` <br> initializes an empty(null) array of length 5 <br> `int[] arr = {4, 3, -1, 4, 34};` <br> `arr[0] = 44;`|

*These are just a few examples of common usage.*

<br>

## Variables

A variable can store a value. Programmers assign variables by using the equals sign "`=`". 

Example: 

```java
int i = 42;
int[] arr = {4, 3, -1, 4, 34};
Object o = new Object();

System.out.println(i);
System.out.println(arr[0]);
System.out.println(o);
// Sum 3 integer values
System.out.println(arr[0] + arr[1] + i);
// Including a string before them will concatenate the integers.
System.out.println("concatenation: " + arr[0] + arr[1] + i);
```
>42
>
>4
>
>java.lang.Object@1c4af82c
>
>49
>
>concatenation: 4342

<br>

#### As opposed to a primitive data type, an Object variable holds a ***reference*** to the actual value. This is why printing an Object `o` returns a data-type and the address of where the object is stored in memory.

<br>

### Commit and push all of the project files before the next lecture.

<br>

# Class Discussion
## Answer the questions on the Markdown file located within your `Module3` directory (Module3.md). `(5pts)`

<!-- This is a comment. It is not processed by the code -->
<!-- Welcome! These are your questions. -->
<!-- Answer using full sentences to receive all points. -->
<!-- 

What is the diference between a Java object and a primitive data type? 

 - Answer:

Describe what an array is in your own words.

 - Answer:

How do you address an index in an array? Write a code that assigns 34 to a new variable by accessing the value stored in:  
        int[] arr = {4, 3, -1, 4, 34};

 - Answer:

What is the first index of a list? Why?

 - Answer:

Provide an original example of a null value. It must prove your understanding of the concept.

 - Answer:

What part of this instructions was incomplete or unclear?

 - Answer:

Type down any class notes below this sentence:




Lackluster responses may result in point deductions.
-->

* ### Save the file, Commit your changes and push them to your remote repository by the end of the class.
* ### You may complete the answers by issuing additional commits and pushing them before the next class.

<br>

## [Next Module ->](/../../tree/main/Modules/Module4/Module4.md)