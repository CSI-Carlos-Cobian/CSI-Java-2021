package csi.borges.inheritance;

import javax.swing.ImageIcon;

public class Dog {
	String hair;
	int size;
	boolean wild = false;
	boolean gender= true; 
	private ImageIcon icon;

	
	
//	constructors

	
	public Dog(String hair, int size, boolean wild, boolean gender, String icon) {
		super();
		this.hair = hair;
		this.size = size;
		this.wild = wild;
		this.gender = gender;
		this.icon = new ImageIcon(getClass().getResource(icon));
	}
	

	
	public Dog() {

	}
	
	
//	functions
	
	public void piss() { 
		if(gender==true) {
			System.out.println("raise leg");
		}
		System.out.println("Tsssss");
		
	}


	public Shit eat(Food f) {
		
		return new Shit();
	}

	public void die() {
	}
	public Noise bark(Noise n) {
		
		
		return new Noise(n.decibels, n.recurring);
	}
	
	void wagTail() {
	}

	public void mate(Dog D) {
	}
	
	
	
//	classes

	public class Shit {
		boolean smelly;
		int weight; 
		int size; 
		String shape; 
		
		
		
		public Shit() {
			Food f;
			return;
		}
		public Shit(boolean hard, int size, String shape) {
			super();
			this.smelly = smelly;
			this.weight = weight; 
			this.size = size;
			this.shape = shape;
		}
	}
	public void digest() {
		
		
		
		
		return;
	}
	public class Food {
		public Food(String flavor, String color, boolean dogFood) {
			
		}
		String flavor;
		String color;
		boolean dogFood;
		

		public Food() {
			
		}
		
	}

	public class Noise {
		public Noise(int i, boolean b) {
			
		}
		int decibels = 0;
		boolean recurring = false;
	}




	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}



}