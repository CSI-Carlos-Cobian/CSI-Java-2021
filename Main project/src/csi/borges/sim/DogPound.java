
package csi.borges.sim;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class DogPound extends JPanel implements ActionListener{
	
   List<Dog> dogs1 = new ArrayList<Dog>();
	
	private int B_WIDTH = 800;
	private int B_HEIGHT = 800; 
	private int DOG_SIZE = 120;
	private int ALL_DOGS = 120;
	
	private final int x[] = new int[ALL_DOGS];
    private final int y[] = new int[ALL_DOGS];
	
    private int dogs;
    
    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean isRunning = true;
    
    

	
//	private Image GermanSheppard; 
	
	  public DogPound() {
	        dogs1.add(new GermanSheppard());
	        initBoard();
	    }
	    
	   private void initBoard() {

	        addKeyListener(new TAdapter());
	        setBackground(new Color(201, 201, 46));
	        setFocusable(true);

	        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
	        initSimulation();
//	        loadImages();
	        
	    }
	   
	   private void initSimulation() {

	        dogs = 3;

	        for (int z = 0; z < dogs; z++) {
	            x[z] = 50 - z * 10;
	            y[z] = 50;
	        }
	   }
	   
	   
//	   public void loadImages() {
//
//	        ImageIcon iid = new ImageIcon(getClass().getResource("icon.png"));
//	        GermanSheppard = iid.getImage().getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
//	        iid = new ImageIcon(GermanSheppard);
//	        
//	   }
	  
	   
	   
	   @Override
	   public void paintComponent(Graphics g) {
		   super.paintComponent(g);
		   
//		   g.drawImage(GermanSheppard, 0, 0, null);
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
	            Toolkit.getDefaultToolkit().sync();
		   } else {
			   gameOver(g);
		   }

	   }
	   private void gameOver(Graphics g) {
	    	
	        String msg = "Game Over";
	        Font small = new Font("Arcade Regular", Font.ITALIC, 20);
        FontMetrics metr = getFontMetrics(small);
	
	        g.setColor(Color.white);
	        g.setFont(small);
	        g.drawString(msg, (B_WIDTH - metr.stringWidth(msg)) / 5, B_HEIGHT / 2);
	        
	    
	    }
	   
	    
//	    public static void main(String[] args) {
//	    	
//	    }
	   
	   
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
	    }
	   
	   
	   
	   private void checkCollision() {

	    	for (int z = dogs; z > 0; z--) {

	    	    if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
	    	        isRunning = false;
	    	    }
	    	}

	        if (y[0] >= B_HEIGHT) {
	            isRunning = false;
	        }

	        if (y[0] < 0) {
	            isRunning = false;
	        }

	        if (x[0] >= B_WIDTH) {
	            isRunning = false;
	        }

	        if (x[0] < 0) {
	            isRunning = false;
	        }
	        
	        if (!isRunning) {
	            
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
	   
