package csi.borges.sim;
	import java.awt.EventQueue;
	import javax.swing.JFrame;

import csi.borges.inheritance.DogPound;

	public class Simulation extends JFrame {

	    public Simulation() {
	        
	        initUI();
	    }
	    
	    private void initUI() {
	        
	        add(new DogPound());
	        
	        setResizable(false);
	        pack();
	        
	        setTitle("DogPound");
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	    
	    public static void main(String[] args) {
	        
	        EventQueue.invokeLater(() -> {
	            JFrame ex = new Simulation();
	            ex.setVisible(true);
	        });
	    }
	}

