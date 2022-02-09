<div style="text-align:center">
        <img    src="https://www3.minijuegosgratis.com/v3/games/thumbnails/1295_1.jpg"
                title="Original Snake Game" 
                width="40%" 
                height="40%" />
</div>
<br>

# Snake `(80 pts)`

<br>

## [This website contains a basic implementation of the game *Snake*](https://zetcode.com/javagames/snake/)
 
<br>

1. Create a package inside of your `MainProject` called:
>*csi.lastname.snake*
2. Copy the `Board.java` and `Snake.java` classes into this package.`(5pts)`


You will notice that when you try to run the code it does not succeed. This is because the project is missing some resources. Notice how `Board.java` has a method called loadImages(). In here you will see which images are expected and in which location they should be stored.

3. Find images for the head, body and apple. They must be appropriate for a classroom. `(10pts)`
   - [Resize the images to be 50 pixels by 50 pixels.](https://resizeimage.net/)
   - Take advantage of PNG transparency.
4.  Set `B_WIDTH` and `B_HEIGHT` to **800**.
5.  Set `DOT_SIZE` and `ALL_DOTS` to **50**.
6.  Set `RAND_POS` to 10.
   
<br>

### You should now be able to run the snake game. `(5pts)`

<br>

## Objectives:
1. Modify background color. `(10pts)`
   * It may be a visually appealing image that compliments playability or a changing color.
2. Implement a score counter.`(15pts)`
3. Implement a key to reset the game.`(15pts)`
4. Export your project into a Runnable JAR File`(20pts)`
   1. Move your Resources(images) into your code package `csi.lastname.snake`. 
   2. Update the strings referencing these images (`loadImages()`).
   3. Modify your image loading function to use class resources.
      > ImageIcon iid = new ImageIcon( getClass().getResource("dot.png") );
   4. Right click `MainProject` and select `Export`: `Java > RunnableJar`
      - Launch Configuration: `Snake - MainProject`
      - Extract Required Libraries into generated JAR
      - > Finish 
<br>

### Implement a Bomb. `(5 Bonus)`

