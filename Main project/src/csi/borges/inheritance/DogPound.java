
package csi.borges.inheritance;


import java.awt.Color;
import java.awt.Dimension;

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

	private void initGame() {
		// TODO Auto-generated method stub
		
	}

	private void loadImages() {
		// TODO Auto-generated method stub
		
	}
	    }

