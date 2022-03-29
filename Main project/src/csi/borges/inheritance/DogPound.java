
package csi.borges.inheritance;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import csi.borges.inheritance.Dog.Shit;

public class DogPound extends JPanel implements ActionListener {

	private static final double RAND_POS = 0;
	List<Dog> dogs1 = new ArrayList<Dog>();
	List<Dog.Shit> dogshits = new ArrayList<Dog.Shit>();
	List<Dog.Food> dogfoods = new ArrayList<Dog.Food>();
//	List<int,int> dogshitLocation

	private int B_WIDTH = 800;
	private int B_HEIGHT = 800;
	private int DOG_SIZE = 10;
	private int ALL_DOGS = 120;
	private int chocolate_x;
	private int chocolate_y;
	private int dogshits_x;
	private int dogshits_y;
	private final int x[] = new int[ALL_DOGS];
	private final int y[] = new int[ALL_DOGS];

	private int dogs;

	private boolean leftDirection = false;
	private boolean rightDirection = true;
	private boolean upDirection = false;
	private boolean downDirection = false;
	private boolean isRunning = true;
	private boolean isShit = true;
	private boolean shit= true;
	private Timer timer;
	private final int DELAY = 140;

	private int count;
	private int shit_x;
	private int shit_y;

	public DogPound() {
		dogs1.add(new Boxer());
		initBoard();

	}

	private void initBoard() {

		setBackground(new Color(50, 150, 150));
		setFocusable(true);

		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		initSimulation();

	}

	private void initSimulation() {

		dogs = 1;

		for (int z = 0; z < dogs; z++) {
			x[z] = 50 - z * 10;
			y[z] = 50;
		}

		timer = new Timer(DELAY, this);
		timer.start();

	}


	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		doDrawing(g);
	}

	private void doDrawing(Graphics g) {

		for (int z = 0; z < dogs; z++) {
			g.drawImage(dogs1.get(z).icon.getImage(), x[z], y[z], this);
		}

		for (int z = 0; z < dogfoods.size(); z++) {
			g.drawImage(dogfoods.get(z).icon.getImage(),dogfoods.get(z).point.x , dogfoods.get(z).point.y, this);
		}
		for (int z = 0; z < dogshits.size(); z++) {
			g.drawImage(dogshits.get(z).icon.getImage(),dogshits.get(z).point.x , dogshits.get(z).point.y, this);
		}
		Toolkit.getDefaultToolkit().sync();

	}

	private void gameOver(Graphics g) {

		String msg = "Game Over";
		Font small = new Font("Helvetica", Font.ITALIC, 130);
		FontMetrics metr = getFontMetrics(small);

		g.setColor(Color.white);
		g.setFont(small);
		g.drawString(msg, (B_WIDTH - metr.stringWidth(msg)) / 5, B_HEIGHT / 2);

	}

	private void checkChocolate() {

		if ((x[0] == chocolate_x) && (y[0] == chocolate_y)) {
//			locatechocolate();
		}
	}
	
	private void checkDogshits() {

		if ((x[0] == dogshits_x) && (y[0] == dogshits_y)) {

		}
	}
	private void locateFood() {
	    	
	    	
	    	Random rand = new Random();
	    	
	    	boolean isChocolate = rand.nextBoolean();

			int x = rand.nextInt(500);
			int y = rand.nextInt(500);
	    	
			if(isChocolate) {
				dogfoods.add(new Chocolate(new Point(x,y)));
			} else {
			dogfoods.add(new Dog().new Food(new Point(x,y)));
			}
	}
			private void locateDogshits() {
		    	
		    	
		    	Random rand = new Random();
		    	
		    	boolean isShit = rand.nextBoolean();

				int x = rand.nextInt(500);
				int y = rand.nextInt(500);
		    	
				if(isShit) {
					dogshits.add(new Shit(new Point(x,y)));
				} else {
				dogshits.add(new Dog().new Shit(new Point(x,y)));
				}
			}
			
	private void move() {

		for (int z = dogs; z > 0; z--) {
			x[z] = x[(z - 1)];
			y[z] = y[(z - 1)];
		}

		if (leftDirection) {
			x[0] -= DOG_SIZE;
		}

		if (rightDirection) {
			x[0] += DOG_SIZE;
		}

		if (upDirection) {
			y[0] -= DOG_SIZE;
		}

		if (downDirection) {
			y[0] += DOG_SIZE;
		}

		count++;
		Random rd = new Random();
		Random rand = new Random();

		int randomNum = rand.nextInt((20 - 1) + 1) + 1;
		int randomNum1 = rand.nextInt((50 - 1) + 1) + 1;

		if (count % randomNum == 0) {
			upDirection = rd.nextBoolean();
			rightDirection = rd.nextBoolean();
			leftDirection = rd.nextBoolean();
			downDirection = rd.nextBoolean();
		}

		if (upDirection == false && downDirection == false && leftDirection == false && rightDirection == false) {
			rightDirection = false;
		}
		if (upDirection == true && downDirection == true && leftDirection == true && rightDirection == true) {
			rightDirection = true;
			upDirection = false;
			downDirection = false;
			leftDirection = false;
		}

	}

	private void checkCollision() {

		for (int z = dogs; z > 0; z--) {

			if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
				isRunning = false;
			}
		}
		Random rd = new Random();

		if (y[0] >= B_HEIGHT) {
//	            isRunning = false;
			upDirection = rd.nextBoolean();
			rightDirection = rd.nextBoolean();
			leftDirection = rd.nextBoolean();
			downDirection = false;
		}

		if (y[0] < 0) {
//	            isRunning = false;
			leftDirection = rd.nextBoolean();
			upDirection = false;
			downDirection = rd.nextBoolean();
			rightDirection = rd.nextBoolean();
		}

		if (x[0] >= B_WIDTH) {
//	        	isRunning = false;
			upDirection = rd.nextBoolean();
			rightDirection = false;
			leftDirection = rd.nextBoolean();
			downDirection = rd.nextBoolean();
		}

		if (x[0] < 0) {
//	            isRunning = false;
			leftDirection = false;
			upDirection = rd.nextBoolean();
			downDirection = rd.nextBoolean();
			rightDirection = rd.nextBoolean();
		}

		if (!isRunning) {
			timer.stop();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

			if(isRunning) {
				locateFood();
				locateDogshits();
			}
			
			checkChocolate();
			checkDogshits();
			checkCollision();
			move();
		
		repaint();
	}

	
	 public class Shit extends Dog.Shit {

			private int shit_x;
			private int shit_y;
			private boolean shit;
			
			
			public Shit(Point p) {
				new Dog().super(p);
				this.shit =true;
				 
			}
			public Shit digest() {
				new Dog().die();
				return null;
			}
			
		   public Shit(int shit_x, int shit_y) {
			   super();
			   this.shit_x = shit_x;
			   this.shit_y = shit_y;
		   }
	 } 
				
				
				
			

}
