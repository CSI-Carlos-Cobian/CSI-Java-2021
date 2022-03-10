package csi.borges.sim;

import javax.swing.ImageIcon;

public class Dog {
String hair;
int size;
boolean smelly;
boolean wild = false;
boolean gender = true;
ImageIcon icon;
// int weight;

//constructors

public Dog(String hair, int size, boolean smelly, boolean wild, boolean gender, String icon) {
	super();
	this.hair = hair;
	this.smelly = smelly;
	// this.weight = weight;
	this.size = size;
	this.wild = wild;
	this.gender = gender;
	this.icon = new ImageIcon(new ImageIcon(getClass().getResource(icon)).getImage().getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH));;
}

public Dog() {

}

//functions

public void piss() {
	if (gender == true) {
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
public void digest() {

	return;
}
public void grow() {
	return;
}
//classes

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
		this.size = 30;
		this.shape = "curved";
	}
}

public class Food {
	public Food(String flavor, String color, boolean humanFood) {

	}

	String flavor;
	String color;
	boolean humanFood;
	ImageIcon icon; 

	public Food() {

	}

}

public class Noise {
	public Noise(int i, boolean b) {

	}

	int decibels = 0;
	boolean recurring = false;
}

public Noise bark() {
	// TODO Auto-generated method stub
	return null;
}

}