package csi.borges.snake;

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
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final ActionEvent ActionEvent = null;
	private final int B_WIDTH = 800;
    private final int B_HEIGHT = 800;
    private final int DOT_SIZE = 50;
    private final int ALL_DOTS = 50;
    private final int RAND_POS = 10;
    private final int DELAY = 120;

    private final int x[] = new int[ALL_DOTS];
    private final int y[] = new int[ALL_DOTS];

    private int dots;
    private int apple_x;
    private int apple_y;
   // private int bomb_x;
   // private int bomb_y;
    
    
    private int score = 0;

    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean restartButton = true; 
    private boolean inGame = true;

    private Timer timer;
    private Image ball;
    private Image apple;
    private Image head;
    private Image background;
    //private Image bomb; 
	private Color randomColor;
	private String[] colorLists;

    
    public Board() {
        
        initBoard();
    }
    
    private void initBoard() {

        addKeyListener(new TAdapter());
//        setBackground(new Color(0, 131, 22));
//        changeBackground(new Color(153, 102, 0));
//        if (inGame) {
        	actionPerformed(ActionEvent);
//        }
        setFocusable(true); 

        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        loadImages();
        initGame();
        
    }

//    private void changeBackground(Color color) {
//		// TODO Auto-generated method stub
//		
//	}

	private void loadImages() {

        ImageIcon iid = new ImageIcon(getClass().getResource("dot50.png"));
        ball = iid.getImage();

        ImageIcon iia = new ImageIcon(getClass().getResource("banana50.png"));
        apple = iia.getImage();

        //ImageIcon iia1 = new ImageIcon("src/resources/bomb50.png");
       // bomb = iia1.getImage();
        
        ImageIcon iih = new ImageIcon(getClass().getResource("head50.png"));
        head = iih.getImage();
        
        ImageIcon back = new ImageIcon(getClass().getResource("background2.png"));
        setBackground(back.getImage());

        
    }

    private void initGame() {

    	  dots = 3;

          for (int z = 0; z < dots; z++) {
              x[z] = 50 - z * 10;
              y[z] = 50;
          }
          
          locateApple();

          timer = new Timer(DELAY, this);
          timer.start();
      }

  
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        doDrawing(g);
    }
    
 private void doDrawing(Graphics g) {
        
        if (inGame) {
        	g.drawImage(background, 0, 0, null);
            g.drawImage(apple, apple_x, apple_y, this);
            //g.drawImage(bomb, bomb_x, bomb_y, this);

            for (int z = 0; z < dots; z++) {
                if (z == 0) {
                    g.drawImage(head, x[z], y[z], this);
                } else {
                    g.drawImage(ball, x[z], y[z], this);
                }
            }
            scoreBoard(g);

            Toolkit.getDefaultToolkit().sync();

        } else {
        	
            gameOver(g);
        }        
    }

    private void gameOver(Graphics g) {
        
    	 String msg = "Game Over";
         Font small = new Font("Arcade Regular", Font.ITALIC, 130);
         FontMetrics metr = getFontMetrics(small);

         g.setColor(Color.white);
         g.setFont(small);
         g.drawString(msg, (B_WIDTH - metr.stringWidth(msg)) / 2, B_HEIGHT / 2);
         
         
         String msgB = "          Press Enter to Restart";
         Font smallB = new Font("Arcade Regular", Font.ITALIC, 50);
         g.setColor(Color.white);
         g.setFont(smallB);
         g.drawString(msgB, (B_WIDTH - metr.stringWidth(msgB)) / 30 * 2 /30 , B_HEIGHT * 2 / 3);
     
     }

    private void checkApple() {

        if ((x[0] == apple_x) && (y[0] == apple_y)) {
        //	 if ((x[0] == bomb_x) && (y[0] == bomb_y)) {
        	setBackground(randomColor);
        	setRandomColor(randomColor);
        	changeRandomColor();
        	changeRandomColor();
            dots++;
            score++; 
           // locateBomb(); 
            locateApple();
     //   }
        }
    }
    
    private void scoreBoard(Graphics g) {

   	 String msgA = "Current Score: " + score + "     ";
   	 Font smallA = new Font("Arcade Regular", Font.ITALIC, 20);
        FontMetrics metrA = getFontMetrics(smallA);

        g.setColor(Color.white);
        g.setFont(smallA);
        g.drawString(msgA, (B_WIDTH - metrA.stringWidth(msgA)) / 1 , B_HEIGHT / 10 );
        
    }
    
    public void restart() {

    	inGame = true;
    	initGame();
    	score = 0; 
    	
    	 rightDirection = true;
         upDirection = false;
         downDirection = false;
         leftDirection = false;

    	
    	
    }

    private void changeRandomColor() {
    	setColorLists(new String[] {"yellow","Green","brown" });
    	randomColor= (new Color(0, 131, 22));
    	randomColor= (new Color(153, 102, 0));
    	randomColor= (new Color(238, 246, 0));
    	
    	
	}

	private void move() {

        for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (leftDirection) {
            x[0] -= DOT_SIZE;
        }

        if (rightDirection) { 
            x[0] += DOT_SIZE;
        }

        if (upDirection) {
            y[0] -= DOT_SIZE;
        }

        if (downDirection) {
            y[0] += DOT_SIZE;
        }
    }

    private void checkCollision() {

        for (int z = dots; z > 0; z--) {

            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        }

        if (y[0] >= B_HEIGHT) {
            inGame = false;
        }

        if (y[0] < 0) {
            inGame = false;
        }

        if (x[0] >= B_WIDTH) {
            inGame = false;
        }

        if (x[0] < 0) {
            inGame = false;
        }
        
        if (!inGame) {
            timer.stop();
        }
    }

    private void locateApple() {

        int r = (int) (Math.random() * RAND_POS);
        apple_x = ((r * DOT_SIZE));

        r = (int) (Math.random() * RAND_POS);
        apple_y = ((r * DOT_SIZE));
    }
    //private void locateBomb() {

       // int r = (int) (Math.random() * RAND_POS);
        //bomb_x = ((r * DOT_SIZE));

       // r = (int) (Math.random() * RAND_POS);
      //  bomb_y = ((r * DOT_SIZE));
    //}
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (inGame) {

            checkApple();
            //checkBomb();
            checkCollision();
            move();
        }

        repaint();
    }

   // private void checkBomb() {
		// TODO Auto-generated method stub
		
	//}

	public Color getRandomColor(Color color) {
		return randomColor;
	}

	public void setRandomColor(Color randomColor) {
		this.randomColor = randomColor;
	}

	public String[] getColorLists() {
		return colorLists;
	}

	public void setColorLists(String[] colorLists) {
		this.colorLists = colorLists;
	}

	public boolean isRestartButton() {
		return restartButton;
	}

	public void setRestartButton(boolean restartButton) {
		this.restartButton = restartButton;
	}

//	public void getBackground(Image background) {
//		this.background = background;
//	}

	public void setBackground(Image background) {
		this.background = background;
	}

	private class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_UP) && (!downDirection)) {
                upDirection = true;
                rightDirection = false;
                leftDirection = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
                downDirection = true;
                rightDirection = false;
                leftDirection = false;
                
            }
            if ((key == KeyEvent.VK_ENTER && (!inGame))) {
            	restart(); 
            	
            }
        }
    }
}