package csi.borges.inheritance;
import javax.swing.ImageIcon;



public class GermanSheppard extends Dog {
	
		private ImageIcon icon;

		public GermanSheppard() {
			super();
			this.size = 88;
			this.wild = false;
			this.hair = "golden brown";
			this.gender = true;
			this.icon = new ImageIcon(getClass().getResource("germansheppard.png"));
		}
	
//	private void Super(Object bark) {
//		// TODO Auto-generated method stub
//		
//	}
	
	public Noise bark() {

		return new Noise(120, true);
	}
	
	public Shit eat() {

		return new Shit(true, 3, "chocolate");
	}
}

