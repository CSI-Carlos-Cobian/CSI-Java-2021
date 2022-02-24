package csi.borges.sim;
import javax.swing.ImageIcon;



public class GermanSheppard extends Dog {
	
	

		public GermanSheppard() {
			super("Golden Brown",88,true,false, true,"GermanSheppard.png");
//			this.size = 88;
//			this.smelly = true;
//			this.wild = false;
//			this.hair = "golden brown";
//			this.gender = true;
//			this.icon = new ImageIcon(getClass().getResource("GermanSheppard.png"));
		}
	
		@Override
		public Noise bark() {

			return new Noise(120, true);
		}
		public void wagTail() {
			
			System.out.println("Wiggle side to side");
			
		}
	
	public Shit eat() {

		return new Shit(true, 3, "Chocolate");
	}
}

