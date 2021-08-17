<div style="text-align:center">
        <img    src="../../images/csi.png" 
                title="Colegio San Ignacio" 
                width="20%" 
                height="20%" />
</div>
<br>

# Module 2: Using Eclipse IDE

### Create a commit merging master into your current branch(Fetch Upstream). `(1pts)`

<br>

## What is [Markdown](https://www.markdownguide.org/getting-started/)?
### Markdown is a lightweight markup language that you can use to add formatting elements to plaintext text documents.

<br>

### The first thing you will see on the left-most side of Eclipse IDE is the file system for the class.

### Expand your working tree to locate Module2.md

<br>

<img    src="eclipsegit.png" 
        title="Files available on the directory may vary from the time of the screenshot" 
        width="60%" 
        height="60%" />

<br>

### By pushing a markdown file into GitHub a nice HTML webpage is rendered.

<br>

### Eclipse fails to load images in the local markdown preview. For this reason i edit them using [Visual Studio Code](https://code.visualstudio.com/). I personally prefer it to view the module files.

<br>

# Create a Java project and store it on this Module2 directory.

<img    src="NewProject.png" 
        title="Files available on the directory may vary from the time of the screenshot" 
        width="80%" 
        height="80%" />

<br>

* ### Select `Java Project`
* ### Name it `Module2`
* ### Disable default location and select your Module2 directory
* ### Do not create `module-info.java`



<img    src="ProjectOptions.png" 
        title="This is what the settings should look like." 
        width="80%" 
        height="80%" />


 ### Click `Finish`
 
 <br>

 ### Locate or open your `Project Explorer`. It should now reference your project directory.


<img    src="LocateProject.png" 
        title="This is what the settings should look like." 
        width="50%" 
        height="50%" />

* Right click `src`
* `New` > `Package`
* Name it `csi.lastname.pkg`. eg.

<img    src="Package.png" 
        title="This is what the settings should look like." 
        width="50%" 
        height="50%" />
* Right click `csi.lastname.pkg`
* `New` > `Class`
* Name it `Main`
* [X] Generate the main method  `public static void main(String[] args)`
* [X] Generate Comments

<img    src="MakeClass.png" 
        title="This is what the settings should look like." 
        width="50%" 
        height="50%" />

<br>

### This is the bare minimum to have a working Java project in Eclipse. Next up we will add some code and functionality. 

<br>

# Hello World! `(5pts)`
### `Hello World!` Is known by all programmers as the initial confirmation that a development environment is functional. Lets test ours by adding some `Hello World!` code into our Main.java!

<br>

### Open your Main.java file.

<br>

### Type into your **Auto-generated method stub**
>System.out.println("Hello, World");

<br>

### Run your Java File by right clicking on main and running it as a Java Application. Alternatively use the similar "Play" button located on the top toolbar.

<img    src="RunJava.png" 
        title="This is what the settings should look like." 
        width="70%" 
        height="70%" />



<br>

### Make the console print out your full name and student number in separate lines below `Hello World!`.
### Take a screenshot of the console output and save it in the Module2 directory as: `CSI-Name-Lastname-Module2.png`. eg.  `CSI-Carlos-Cobian-Module2.png` 







<br>

### Commit and push the project and the image before the next lecture`(2pts)`

<br>

# Class Discussion
## Answer the questions on the Markdown file located within your `Module2` directory (Module2.md). `(4pts)`

<!-- This is a comment. It is not processed by the code -->
<!-- Welcome! These are your questions. -->
<!-- Answer using full sentences to receive all points. -->
<!-- 

What is a benefit of using Markdown?
https://www.markdownguide.org/getting-started/

 - Answer:

What does "cd" stand for?

 - Answer:

Did you get stuck at any point or become confused with your console? (yes/no) 
If so, what happened? How did you solve it? (optional)

 - Answer:

Did you consider searching google for other commands to run? What did you try? 

 - Answer:

What would you like to program? 

 - Answer:

Lackluster responses may result in point deductions.
-->

* ### Save the file. Commit your changes and push them to your remote repository by the end of the class. `(1pts)`
* ### You may complete the answers by issuing aditional commits and pushing them before the next class.