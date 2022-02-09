package csi.borges.inheritance;

public class Dog {
	String hair;
	int size;
	boolean wild = false;
	boolean gender= true; 

	public void piss(Food f) {
		return f.digest(); 
	}

	public Shit eat() {
		return null;
	}

	public void die() {
	}

	public Noise bark() {
		return null;
	}

	void wagTail() {
	}

	public class Shit {
		int smelly;
		int mushy; 
		int heavy; 
		
		
		public Shit() {
			
		}
		
	}
	public void Piss() {
		if(gender==true) {
			System.out.println("raise leg");
		}
		System.out.println("Tsssss");
		
	}

	public class Noise Bark(){
		return new Noise();
	}
	public void Die() {}
	public void wagTail() {}
	public void mate(Dog D) {
	}
		public Noise() {
			
		}
		
	
	public class Food {
		int tasty; 
		int colorful;
		int sweet; 
		
		

		public Food() {
			
		}
		
	}
}
