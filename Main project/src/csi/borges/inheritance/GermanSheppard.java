package csi.borges.inheritance;

import java.awt.EventQueue;

import javax.swing.JFrame;

import csi.borges.snake.Board;

public class GermanSheppard extends Dog {
	
		public GermanSheppard() {
			super();
			this.size = 88;
			this.wild = false;
			this.hair = "brown";
			this.gender = true;
			this.icon = new ImageIcon(getClass().getResource("germansheppard.png"));
		}
	
//	private void Super(Object bark) {
//		// TODO Auto-generated method stub
//		
//	}
	
	@Override
	public Noise bark() {

		return new Noise(120, true);
	}
	
	public Shit eat() {

		return new Shit(true, 3, "Apple");
	}
	
	class simulation extends JFrame {
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	public void Dog() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("GermanSheppard");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            Dog ex = new Dog();
        });
    }
}
}

