<div style="text-align:center">
        <img    src="../../images/csi.png" 
                title="Colegio San Ignacio" 
                width="20%" 
                height="20%" />
</div>
<br>

# Module 4: Java Class Structure

### Merge origin/master. This is the same as Fetching Upstream. Create a commit. `(1pts)`

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

## Fields (Variables)
This class does nothing. For this reason we will add some Fields. Field is another name for variable. In Java all variables must:
* Have a declared data type
* Have a declaration name that starts with a lower case letter.
* Not start with a number, although it may end in one.
* Not be named using [reserved keywords](https://www.thoughtco.com/reserved-words-in-java-2034200). 

```java
package csi.cobian.pkg;

public class Animal{
        String name;
        int age;
        String scientificName;
}
```



## Methods (Functions)
Although this `Animal` class now has some properties, we do not use them. Next we will create some methods. Methods may do anything you define them to do. The simplest and most common methods are getters and setters. These allow a user to retrieve and modify the values in the fields. 

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

<br>

### The format for a method is: 
* `Access Modifier`: eg. <u>public</u>, <u>private</u>
* `Return Data Type`: eg. <u>String</u>, <u>int</u>, or <u>`void`</u> for a null(Nothing is returned)
* `Method Name`: uses camelCaseNotation <br>
<img    src="https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/CamelCase_new.svg/1200px-CamelCase_new.svg.png" 
        width="20%" 
        height="20%" />

* `Parameters` with their defined data types(inside of parenthesis). They are separated by commas.
* A `return` statement at the end. This does not apply to `void` methods.

*You may diferentiate <u>class fields</u> from parameters that share a name by using the '`this.`' keyword.*

<br>

### Take a screenshot of the console output and save it in the Module4 directory as: `CSI-Name-Lastname-Module4.png`.

<br>

### Commit and push all of the project files and the image before the next lecture.

<br>

# Class Discussion
## Answer the questions on the Markdown file located within your `Module4` directory (Module4.md). `(2pts)`

<!-- This is a comment. It is not processed by the code -->
<!-- Welcome! These are your questions. -->
<!-- Answer using full sentences to receive all points. -->
<!-- 

What is a benefit of using Markdown?
https://www.markdownguide.org/getting-started/

 - Answer:

What is a java class and what is a java package?

 - Answer:

What part of the instructions was incomplete or unclear?

 - Answer:

Type down any class notes below this sentence:




Lackluster responses may result in point deductions.
-->

* ### Save the file, Commit your changes and push them to your remote repository by the end of the class. `(1pts)`
* ### You may complete the answers by issuing additional commits and pushing them before the next class.

<br>

## [Next Module ->](/../../tree/main/Modules/Module4/Module4.md)