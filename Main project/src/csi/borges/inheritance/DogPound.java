
package csi.borges.inheritance;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class DogPound extends JPanel implements ActionListener {

	
	private boolean inGame = true;
	private static final long serialVersionUID = 1L;
	private static final ActionEvent ActionEvent = null;
		
	
		//List<Dog> dogs = new ArrayList<Dog>();
	
		private int B_WIDTH = 800;
		private int B_HEIGHT = 800; 
	    private final int DOG_SIZE = 50;
	    private final int ALL_DOGS = 50;


	    private final int x[] = new int[ALL_DOGS];
	    private final int y[] = new int[ALL_DOGS];
		
	    private int dogs;
	    
	    private boolean leftDirection = false;
	    private boolean rightDirection = true;
	    private boolean upDirection = false;
	    private boolean downDirection = false;
	    private boolean isRunning = true;
	    
	    
	    private Image dog;
	    private Image background;
	    private Image GermanSheppard; 
	    
	public DogPound() {
	
	initBoard(); 
	}
	private void initBoard() {
			addKeyListener(new TAdapter());
		 	setBackground(new Color(240, 240, 200));
	        setFocusable(true);

	        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

	     //   addKeyListener(new TAdapter());
	        actionPerformed(ActionEvent);
	        setFocusable(true); 

	        setPreferredSize(new Dimension(WIDTH, HEIGHT));
	        loadImages();
	        initGame();
	        initSimulation();
			return;
	 }
	 private void initSimulation() {

	        dogs = 3;

	        for (int z = 0; z < dogs; z++) {
	            x[z] = 50 - z * 10;
	            y[z] = 50;
	        }
	   }
	 public void loadImages() {

	        ImageIcon iid = new ImageIcon(getClass().getResource("GermanSheppard.png"));
	        GermanSheppard = iid.getImage().getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
	        iid = new ImageIcon(GermanSheppard);
	        
	   }
	  
	

	@Override
    public void actionPerformed(ActionEvent e) {

        repaint();
        //move;
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
	            //	   private void addKeyListener(TAdapter tAdapter) {
	            			// TODO Auto-generated method stub
	            			
	            				private void initGame() {
	            			// TODO Auto-generated method stub
	            			
	            		}
				
			//	private class TAdapter

	        //    public TAdapter() {
						// TODO Auto-generated constructor stub
					

			//	public void keyPressed(KeyEvent e) {

	              //  int key = e.getKeyCode();
				
			}

	    

