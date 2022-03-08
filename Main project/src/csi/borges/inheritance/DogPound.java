
package csi.borges.inheritance;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
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
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;




public class DogPound extends JPanel implements ActionListener{
	
	List<Dog> dogs1 = new ArrayList<Dog>();
	List<Dog.Shit> dogshits = new ArrayList<Dog.Shit>();
//	List<int,int> dogshitLocation
	
	private int B_WIDTH = 800;
	private int B_HEIGHT = 800; 
	private int DOG_SIZE = 10;
	private int ALL_DOGS = 120;
	
	private final int x[] = new int[ALL_DOGS];
    private final int y[] = new int[ALL_DOGS];
	
    private int dogs;
    
    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean isRunning = true;
    
    private boolean isShit = true;
    
    private Timer timer;
    private final int DELAY = 140;
    
    private int count; 
    

	
	private Image Boxer; 
	private Image ImageIcon;
	
	  public DogPound() {
	        dogs1.add(new Boxer());
	        initBoard();
	    }
	    
	   private void initBoard() {

	        addKeyListener(new TAdapter());
	        setBackground(new Color(50, 150, 150));
	        setFocusable(true);

	        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
	        initSimulation();
//	        loadImages();
	        
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
		   		   
		   if (isRunning) {
			   
			   
	            for (int z = 0; z < dogs; z++) {
	                if (z == 0) {
	                    g.drawImage(dogs1.get(0).icon.getImage(), x[z], y[z], this);
	                } else {
	                	g.drawImage(dogs1.get(0).icon.getImage(), x[z], y[z], this);
	                }
	            }
	            
	            	
//	            for (int z = 0; z < dogshits.size(); z++) {
//	    	            
//		            g.drawImage(dogshits.get(z).icon.getImage(), dogshits.get(z).getLocation().x,  dogshits.get(z).getLocation().y, null);
//		                    
//		           }
	            
	            
	            Toolkit.getDefaultToolkit().sync();
		   } else {
			   gameOver(g);
		   }
		   

	   }
	   
	   
	   
	   
	   private void gameOver(Graphics g) {
	    	
	        String msg = "Game Over";
	        Font small = new Font("Helvetica", Font.ITALIC, 130);
	        FontMetrics metr = getFontMetrics(small);
	
	        g.setColor(Color.white);
	        g.setFont(small);
	        g.drawString(msg, (B_WIDTH - metr.stringWidth(msg)) / 5, B_HEIGHT / 2);
	        
	    
	    }
	   
	    
//	    public static void main(String[] args) {
//	    	
//	    }
//	   public void randomShit(Dog d, Graphics g) {
////		   int z = dogs;
//		  
//		   Dog.Food f = (new Dog()).new Food();
//		   Dog.Shit s = d.eat(f);
//		   s.setLocation(new Point(x[0],y[0]));
//		   dogshits.add(s);
//		   
//		   
////		   d.eat(f).icon.getImage();
//		 
////		   g.drawImage(s.icon.getImage(), 0, 0, null);
//		   
//		   
//	   }
	   
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
	       
	        if(count % randomNum == 0) {
	        	upDirection = rd.nextBoolean();
		        rightDirection = rd.nextBoolean();
		        leftDirection = rd.nextBoolean();
		        downDirection = rd.nextBoolean();
	        }
	        
//	        if(count % randomNum1 == 0) {
//	        	randomShit(dogs1.get(0), getGraphics());
//	        }
	        
	        if(upDirection == false && downDirection == false && leftDirection == false && rightDirection == false) {
	        	rightDirection = false;
	        }
	        if(upDirection == true && downDirection == true && leftDirection == true && rightDirection == true) {
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

	        if (isRunning) {
	            checkCollision();
	            move();
	        }
	        repaint();
	    }
	   
	   private class TAdapter extends KeyAdapter {

	        @Override
	        public void keyPressed(KeyEvent e) {

	            int key = e.getKeyCode();
	            
	            if ((key == KeyEvent.VK_S) && (!upDirection)) {
	                downDirection = true;
	                rightDirection = false;
	                leftDirection = false;
	            }
	            
	            if ((key == KeyEvent.VK_A) && (!rightDirection)) {
	                leftDirection = true;
	                upDirection = false;
	                downDirection = false;
	            }

	            if ((key == KeyEvent.VK_D) && (!leftDirection)) {
	                rightDirection = true;
	                upDirection = false;
	                downDirection = false;
	            }

	            if ((key == KeyEvent.VK_W) && (!downDirection)) {
	                upDirection = true;
	                rightDirection = false;
	                leftDirection = false;
	            } 
	            if ((key == KeyEvent.VK_ENTER && (!isRunning))) {
	            	
	            	
	            }
	        }
	    }
	

}
