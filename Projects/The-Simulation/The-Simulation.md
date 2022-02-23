<div style="text-align:center">
        <img    src="https://theawakenedstate.net/wp-content/uploads/2015/02/ThermodynamicHorizon.jpg"
                title="Polar Matrix" 
                width="40%" 
                height="40%" />
</div>
<br>

# The Simulation `(∞pts)`
*Requires Modules 1-9 and Snake*

<br>

1. Create a package inside of your `MainProject` called:
   >*csi.lastname.sim*
2. Create a class file named `Simulation`
   1. Recycle the code used in `Board` within the Snake project. Change all instances of the word `Board` for `Simulation`
   

<br>

## Dog
Define a dog in the scope of our simulation.

<br>

### Create a class file named `Dog`

<br>

#### Define variables.

| Variable | Data Type | Purpose |
|----------|-----------|---------|
| hair | string | Describe the dog's hair. |
| size | int | maximum size for this dog in inches |
| wild | boolean | Is the dog wild or domesticated. Set to `true` by default |
| female | boolean | Is the dog potentially capable of bearing an offspring? |
| icon | `ImageIcon` | A image of the dog.   |

<br>

#### Create Constructors.
Define 3 constructors for your Dog.

1. No argument constructor.
2. Constructor with all variables defined above.
3. A constructor that receives a `string` instead of an `ImageIcon` for the variable `icon`. 
   * Use this string to call a `ImageIcon` constructor. 
   * Assign the value of this constructor to the `icon` variable that is already available.
   * [You must resize it to 50x50 programmatically](https://stackoverflow.com/questions/6714045/how-to-resize-jlabel-imageicon)
   ```java
   // one-line example
   this.icon = new ImageIcon(new ImageIcon(getClass().getResource(directory)).getImage().getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH));
   ```

<br>

#### Define Dog methods.
* Don't code the functionalities of these yet. <u>For now</u> you will `return null;` for each function that **does not specify a void return.** 

| Function Name | Parameters | Return Data Type | Purpose |
|---------------|------------|------------------|---------|
| eat | `Food` | `Shit` | Consume `Food` |
| piss |  | void | make pee pee.  |
| bark |  | `Noise` | Make `Noise` |
| wagTail |  | void | Move tail |
| mate | `Dog` | `Dog` | Don`t use the F-Word |
| die |  | void | Will happen at some point |
| grow |  | void | increase size |

<br>

#### Define classes within your dog.
We must define the data types `Food`, `Shit`, `Noise`. Create internal classes. These belong inside of your `Dog.java` class and file. 
* Create unique descriptive variables for each class.
* Define  2 constructors for each class. One with no parameters and default values, another with every parameter.

| Class name | Variables | Methods |
|------------|-----------|---------|
| `Food` | 3 | public `Shit` digest() {} |
| `Shit` | 3 | public void decompose() {} |
| `Noise` | 2  | public void sound() {} |

<br>

#### Create a specific dog
1. Find a dog breed.
2. Find an image of your dog breed. Save it in your working package.  
3. Create a class file using it's name eg. `Husky.java`
4. Inherit from the class `Dog` by using `extends Dog`
5. Create a no-argument constructor that invokes `super()` with values specific for your breed. 
   * You are expected to pass the image location string into the constructor (3rd constructor defined)

<br>

#### Dog Pound
1. Create a class file named `DogPound`
   * This class should `extends JPanel implements ActionListener` same as the `Board.java` class from Snake.
   * Import any necessary code to ensure functionality of this class.
     * relevant variables such as dimensions, position `x[]`, `y[]`, directional booleans, time, etc
     * constructor
     * init
     * `paintComponent`
     * `actionPerformed`
     * `TAdapter` and `keyPressed`
   * Remove any logic that is specific to the snake game such as:
     * `loadImages`
2. Create an ArrayList of data type `Dog`. Name it dogs.
3. Add 1 or more of *your* `Dog` to the list. Do so in the `DogPound` constructor. eg.
   ```java
   dogs.add(new Husky());
   ```
4. Paint all dogs within using the `paintComponent` function overload and a for-loop.

<br>