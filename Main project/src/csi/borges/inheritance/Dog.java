package csi.borges.inheritance;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

import csi.borges.inheritance.Boxer.Food;
import csi.borges.inheritance.Dog.Shit;

public class Dog {
	String hair;
	int size;
	boolean smelly;
	boolean wild = false;
	boolean gender = true;
	ImageIcon icon;
	Point location;
	Point point;
	// int weight;

//	constructors

	public Dog(String hair, int size, boolean smelly, boolean wild, boolean gender, String icon) {
		super();
		this.hair = hair;
		this.smelly = smelly;
		this.size = size;
		this.wild = wild;
		this.gender = gender;
		this.icon = new ImageIcon(new ImageIcon(getClass().getResource(icon)).getImage().getScaledInstance(100, 100,
				java.awt.Image.SCALE_SMOOTH));
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

	public Noise bark(Noise n) {
		return new Noise(n.decibels, n.recurring);
	}

	public void die() {

	}

	public void grow() {
	}

	void wagTail() {
	}

	public void mate(Dog D) {
	}

	public Shit eat(Food f) {
		if (f.chocolate) {
			this.die();
			return null;
		}
		return new Shit();

	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

//	classes
// Shit Class
	public class Shit {
		boolean smelly;
		// int weight;
		int size;
		String shape;
		ImageIcon icon;
		Point point;

		public Shit(Point p) {
			super();
			this.smelly = true;
			this.size = 30;
			this.shape = "short";
			this.point = p;
			this.icon = new ImageIcon(new ImageIcon(getClass().getResource("shit.png")).getImage().getScaledInstance(50,
					50, java.awt.Image.SCALE_SMOOTH));

			return;
		}

		public Shit(boolean smelly, int size, String shape, Point point) {
			super();
			this.smelly = smelly;
			// this.weight = weight;
			this.size = size;
			this.shape = shape;	 
			this.point= point;			}

			public Shit() {
			// TODO Auto-generated constructor stub
		}

			public Point getLocation() {
				return location;
			}

			public void setLocation(Point point) {
				this.point = point;
			}
			
			public Shit digest() {

				return new Shit();
			}

		}
	

	

// Noise Class
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

		public Noise bark() {

			return new Noise();
		}

	}

//	Food CLass
	public class Food {
		boolean chocolate;
		String flavor;
		String color;
		boolean humanFood;
		ImageIcon icon;
		Point point;

		public Food(Point p) {
			super();
			this.flavor = "sweet";
			this.color = "brown";
			this.humanFood = true;
			this.chocolate = false;
			this.point = p;
			this.icon = new ImageIcon(new ImageIcon(getClass().getResource("chocolate.png")).getImage()
					.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
		}

		public Food(String flavor, String color, boolean humanFood, boolean chocolate, Point point) {
			super();
			this.flavor = flavor;
			this.color = color;
			this.humanFood = humanFood;
			this.chocolate = chocolate;
			this.point = point;
		}

		public Point getLocation() {
			return location;
		}

		public void setLocation(Point point) {
			this.point = point;
		}

		
	}
}

