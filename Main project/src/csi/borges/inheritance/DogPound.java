
package csi.borges.inheritance;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DogPound extends JPanel implements ActionListener {

	
	 private boolean inGame = true;
	 private static final long serialVersionUID = 1L;
		private static final ActionEvent ActionEvent = null;
		
		List<Dog> dogs = new ArrayList<Dog>();
		private int B_WIDTH = 800;
		private int B_HEIGHT = 800; 
	    private final int DOT_SIZE = 50;
	    private final int ALL_DOTS = 50;


	    private final int x[] = new int[ALL_DOTS];
	    private final int y[] = new int[ALL_DOTS];
	    
	    private Image dog;
	    private Image background;
	    
	    private Image GermanSheppard; 
	    
	private void initDogPound() {

		 setBackground(new Color(240, 240, 200));
	        setFocusable(true);

	        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

	        addKeyListener(new TAdapter());
	        actionPerformed(ActionEvent);
	        setFocusable(true); 

	        setPreferredSize(new Dimension(WIDTH, HEIGHT));
	        loadImages();
	        initGame();
	 }
			
	@Override
    public void actionPerformed(ActionEvent e) {

        repaint();
        //move;
    }
	            private void checkCollision() {
				// TODO Auto-generated method stub
				
			}
	            @Override
	            public void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                
	                g.drawImage(background, 0, 0, null);
	                doDrawing(g);
	            }
	            private void doDrawing(Graphics g) {
	                
	                   Toolkit.getDefaultToolkit().sync();

	        }
	            	   private void addKeyListener(TAdapter tAdapter) {
	            			// TODO Auto-generated method stub
	            			
	            		}
	            				private void loadImages() {
	            			// TODO Auto-generated method stub
	            			
	            		}
	            				private void initGame() {
	            			// TODO Auto-generated method stub
	            			
	            		}
				}
				private class TAdapter

	            public TAdapter() {
						// TODO Auto-generated constructor stub
					}

				public void keyPressed(KeyEvent e) {

	                int key = e.getKeyCode();
	 }

	private void checkCollision() {
				// TODO Auto-generated method stub
				
			}
	private void initGame() {
		// TODO Auto-generated method stub
		
	}

	private void loadImages() {
		
	}
	    }

