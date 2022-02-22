package csi.borges.inheritance;
import javax.swing.ImageIcon;



public class GermanSheppard extends Dog {
	
		private ImageIcon icon;

		public GermanSheppard() {
			super();
			this.size = 88;
			this.smelly = true;
			this.wild = false;
			this.hair = "golden brown";
			this.gender = true;
			this.icon = new ImageIcon(getClass().getResource("GermanSheppard.png"));
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

