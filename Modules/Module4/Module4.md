<div style="text-align:center">
        <img    src="../../images/csi.png" 
                title="Colegio San Ignacio" 
                width="20%" 
                height="20%" />
</div>
<br>

# Module 4: Java Class Structure

### Merge origin/master. This is the same as Fetching Upstream. Create a commit. `(1pts)`

<br>

## Classes
The simplest Java class you can write looks like:

```java
package csi.cobian.pkg;

public class Animal{

}
```
* A **package** declaration is necesary as it locates your class.
* **public** is an <u>Access Modifier</u>, and it defines which classes can access **this** class.
* **class** initializes the class.
* **Animal** is the class name. It must start with a capital letter.

<br>

## Fields (Variables)
This class does nothing, so far. For this reason we will add some Fields. Field is another name for variable. In Java, all variables must:
* Have a declared data type
* Have a declaration name that starts with a lower case letter.
* Have a declaration name that does not start with a number, although it may end in one.
* Have a declaration name that is not a [reserved keyword](https://www.thoughtco.com/reserved-words-in-java-2034200). 

```java
package csi.cobian.pkg;

public class Animal{
        String name;
        int age;
        String scientificName;
}
```

<br>

## Methods (Functions)
Although this `Animal` class now has some properties, we are not currently using them. Next we will create some methods. Methods may do anything you define them to do. The simplest and most common methods are getters and setters. These allow a user to retrieve and modify field values.

```java
package csi.cobian.pkg;

public class Animal{
        //	Fields
        String name;
        int age;
        String scientificName;

        //  Getters and Setters  
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
        
        public String getScientificName(){
            return scientificName;
        }
        public void setScientificName(String scientificName){
            this.scientificName = scientificName;
        }
}
```
*<u>Class fields</u> differ from <u>method parameters</u> in that they are accessed by using the '`this.`' keyword.*

<br>

### The format for a method is: 
* `Access Modifier`: eg. <u>public</u>, <u>private</u>, <u>protected</u>
* `Return Data Type`: eg. <u>String</u>, <u>int</u>, or <u>`void`</u> for a null *(Nothing is returned)*
* `Method Name`: eg. getName *uses camelCaseNotation* <br>
<img    src="https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/CamelCase_new.svg/1200px-CamelCase_new.svg.png" 
        width="20%" 
        height="20%" />

* `Parameters` with their defined data types(inside of parenthesis). Multiple parameters are separated by commas.
* A `return` statement at the end. This does not apply to `void` methods.
  * eg. return scientificName;
* In some cases, a `throw` declaration may be included in between the close parenthesis and open brace. eg:
```java
 ) throws InterruptedException {
    ...
```



<br>

### Add the `Animal.java` class to your MainProject.`(5pts)`

<br>

## Main Method.
A Main method is the first method that is executed when a Java file is run. It receives an undetermined amount of string parameters. It's syntax is the following:

```java
...

    //  Main Method
    public static void main(String[] args){
    
    }
//Assume we are defining this method at the end of the Animal class, before it's closing brace.	
}
```



Within this main method we will create an Animal.

```java
...
//  Main Method
public static void main(String[] args){
    Animal a = new Animal(); 
    a.setName("Coqui");
    a.setAge(3);  
    a.setScientificName("Eleutherodactylus coqui");
    
    System.out.println("Name: " + a.getName());
    System.out.println("Age: " + a.getAge());
    System.out.println("Scientific Name: " + a.getScientificName());
}
    
...
```

<br>

## Add a Main method to Animal.java.`(10pts)`
* Select or Discover an exotic animal subspecies. Using **Google** may help. Look up it's scientific name and age range. Initialize it the way i did with the Coqui.
* [If you struggle with creativity or intrigue, a random generator may help!](https://www.randomlists.com/random-animals)
* Wikipedia usually displays an animal's Scientific name.
* I googled "Coqui life expectancy"

<br>

## Constructors.
A constructor is used to create a java object on a single call. It is a method you define. It may take any number of parameters. It's name must be the same as the class you are constructing. A defaut no-parameter constructor is assumed to exist when a cnstructor is not initialized. If you write your own constructor then the default no-parameter constructor must be manually included in order to be used. You may have any number of constructors but none may share the same parameter list. Example:

```java
...
public class Animal {
    //	Fields
    String name;
    int age;
    String scientificName;
	
    //  Constructors
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Animal() {}
...
```
A constructor is then called by passing values directly:

```java
...
Animal a2 = new Animal("Dog",3);
...
```

## Create some Animal constructors.`(10pts)`
* Include the default no-argument constructor seen above.
* Create a constructor that defines all 3 Animal class fields by using parameter values.
* Within your main method, create a secondary Animal whose variable name is `a2`. Construct it using your 3-argument constructor. Print all field values by adding 3 `println` statements after initialization(similar to the main method example) 
* `a2` should not use setter methods.
* Use a common house pet for `a2` values.

<br>

## Nest an Object `(20pts)`
* Create a new class it in the same package `Animal`.
* Name it `Taxonomy`
* Declare it's variables to be [the 8 Major Taxonomic ranks](https://en.wikipedia.org/wiki/Taxonomic_rank)
* Add Getters and Setters using the naming and capitalization conventions you've seen so far.
  * Notice how `class` does not work. This is because it's a `reserved keyword`. 
  * You will need to use a variation of the word for the field name.
  * The Latin classis, for example.
* Declare a constructor with all 8 parameters.
* Declare a no-parameter constructor.
* Add `Taxonomy` as a class variable of `Animal`
* Create another constructor within `Animal` that accepts a `Taxonomy` Object as a Parameter.
* Construct a new taxonomy object within your `Animal` class.
  * It should go at the end of your `main` method, after your `a2` animal. 
  * You may reuse an animal from the previous steps, or discover a new one.
* Create an `Animal` using this taxonomy object as a parameter. Assign it to `a3`
* Print at least 3 of its taxonomic ranks by using getter methods.

[WhAt Is NEstInG?](https://www.bbc.co.uk/bitesize/guides/znh6pbk/revision/7)

<br>

### Commit and push all of the project files and the image before the next lecture.
- [X] It should have all animal class definitions defined above. 
- [X] It's main must construct 3 separate Animals and print their variables.
<br>

# Class Discussion
## Answer the questions on the Markdown file located within your `Module4` directory (Module4.md).`(1pts)`

<!-- This is a comment. It is not processed by the code -->
<!-- Welcome! These are your questions. -->
<!-- Answer using full sentences to receive all points. -->
<!-- 

Include the Link(s) you used to attain information for your selected animal.

 - Answer:

What part of the instructions was incomplete or unclear?

 - Answer:

Type down any class notes below this sentence:




Lackluster responses may result in point deductions.
-->

* ### Save the file, Commit your changes and push them to your remote repository by the end of the class.
* ### You may complete the answers by issuing additional commits and pushing them before the next class.

<br>

## [Next Module ->](/../../tree/main/Modules/Module5/Module5.md)