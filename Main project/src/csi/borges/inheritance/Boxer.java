package csi.borges.inheritance;
import javax.swing.ImageIcon;



public class Boxer extends Dog {
	
	

		public Boxer() {
			super("White",69,true,false, true,"Boxer.png");
//			this.size = 88;
//			this.smelly = true;
//			this.wild = false;
//			this.hair = "golden brown";
//			this.gender = true;
//			this.icon = new ImageIcon(getClass().getResource("GermanSheppard.png"));
		}
		
		public Noise bark() {

			return new Noise(120, true);
		}
		public void wagTail() {
			
			System.out.println("Wiggle side to side");
			
		}
		public class Food {
			public Food(String flavor, String color, boolean humanFood, boolean ischocolate) {
				this.flavor= flavor;
				this.color= color;
				this.humanFood= humanFood;
				this.ischocolate = ischocolate; 
				
			}
			public Food() {
				// TODO Auto-generated constructor stub
			}
			String flavor;
			String color;
			boolean humanFood;
			boolean ischocolate;
			
			public Shit digest() {
				
				return new Shit();
			}
		}
	public Shit eat() {
		return null;

	//	return new Shit(true, 3, "Chocolate");
	}
		
		public void mate(Dog d) {
			
		}
		
		public void grow() {
			
		}
}
