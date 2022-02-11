
package csi.borges.inheritance;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

public class DogPound extends JPanel {

	 private void initDogPound() {

	        addKeyListener(new TAdapter());
	        setBackground(new Color(0, 131, 22));
	        setFocusable(true); 

	        setPreferredSize(new Dimension(WIDTH, HEIGHT));
	        loadImages();
	        initGame();
	 }
	        public void actionPerformed(ActionEvent e) {

	            if (inGame) {
	                checkCollision();
	                // move();
	            }
	            
	            @Override
	            public void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                g.drawImage(background, 0, 0, null);
	                doDrawing(g);
	            }       
	 }

	private void checkCollision() {
				// TODO Auto-generated method stub
				
			}
	private void initGame() {
		// TODO Auto-generated method stub
		
	}

	private void loadImages() {
		// TODO Auto-generated method stub
		
	}
	    }

