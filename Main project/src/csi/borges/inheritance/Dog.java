package csi.borges.inheritance;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

import csi.borges.inheritance.Boxer.Food;

public class Dog {
	String hair;
	int size;
	boolean smelly;
	boolean wild = false;
	boolean gender = true;
	ImageIcon icon;
	Point location; 
	// int weight;

//	constructors

	public Dog(String hair, int size, boolean smelly, boolean wild, boolean gender, String icon) {
		super();
		this.hair = hair;
		this.smelly = smelly;
		this.size = size;
		this.wild = wild;
		this.gender = gender;
		this.icon = new ImageIcon(new ImageIcon(getClass().getResource(icon)).getImage().getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH));
	}

	public Dog() {

	}

//	functions

	public void piss() {
		if (gender == true) {
			System.out.println("raise leg");
		}
		System.out.println("Tsssss");

	}

	public Shit eat(Food f) {
if Food = chocolate;
	Dog die= true;
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

	public void digest() {

		return;
	}
	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}
//	classes
	
	public class Shit {
		boolean smelly;
		// int weight;
		int size;
		String shape;
		private Food f;

		public Shit() {
			return;
		}

		public Shit(boolean smelly, int size, String shape) {
			super();
			this.smelly = smelly;
			// this.weight = weight;
			this.size = size;
			this.shape = shape;
			
		}
	}
	public class Noise {
		int decibels;
		boolean recurring;
		
		
		public Noise() {
			
		}


		public Noise(int decibels, boolean recurring) {
			super();
			this.decibels = decibels;
			this.recurring = recurring;
		}
	public class Food {
		public Food(String flavor, String color, boolean humanFood, String chocolate) {
			super();
			this.flavor = flavor;
			this.color = color;
			this.humanFood = humanFood;
			this.chocolate = new Image(new ImageIcon(getClass().getResource(chocolate)).getImage().getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH));
		}

		String flavor;
		String color;
		boolean humanFood;
		private Image chocolate;

		public Food() {

		}

	}

public Noise bark() {
		
		return new Noise();
	}
	
	public void mate(Dog d) {
		
	}
	
	public void grow() {
		
	}
	public class chocolate extends Food {
		
	}
	public void chocolate() {

	}
public void die() {
		
	}
}
}