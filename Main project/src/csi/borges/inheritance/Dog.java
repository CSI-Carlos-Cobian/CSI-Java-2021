package csi.borges.inheritance;

import csi.borges.inheritance.Dog.Noise;

public class Dog {
	String hair;
	int size;
	boolean wild = false;
	boolean gender= true; 

	
	
//	constructors
	
	
	
//	functions
	
	public void piss() { 
	}
	
	public void Piss() {
		if(gender==true) {
			System.out.println("raise leg");
		}
		System.out.println("Tsssss");
		
	}

	public Shit eat(Food f) {
		return f.digest();
	}

	public void die() {
	}

	public Noise bark() {
		return new Noise();
	}

	void wagTail() {
	}
	
	public void Die() {}
	public void wagTail() {}
	public void mate(Dog D) {
	}
	public Noise bark() {
		return new Noise();
	}
	
	
//	classes

	public class Shit {
		int smelly;
		int mushy; 
		int heavy; 
		
		
		public Shit() {
			Food f;
			return;
		}
		
	}

	public class Food {

		public Shit digest() {
			// TODO Auto-generated method stub
			return null;
	}
		

		public Food() {
			
		}
		
	}

	public class Noise{
		public Noise bark() {
			return new Noise();
		}
		
		
		
	}
}
