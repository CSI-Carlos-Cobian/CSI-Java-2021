package csi.borges.inheritance;

import java.awt.Point;

import csi.borges.inheritance.Dog.Shit;



public class Chocolate extends Dog.Food {

	public Chocolate(Point p) {
		new Dog().super(p);
		this.chocolate=true;
	}
	
	
	public Shit digest() {
		new Dog().die();
		return null;
	}
}
