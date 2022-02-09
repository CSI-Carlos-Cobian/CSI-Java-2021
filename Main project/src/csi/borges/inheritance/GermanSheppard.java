package csi.borges.inheritance;

import csi.borges.inheritance.Dog.Noise;

public class GermanSheppard extends Dog {

	public GermanSheppard() {
	Super(Bark);{
		
	}
		this.size = 88; 
	this.wild = false; 
}
	@Override
	public Noise bark() {
		return new Noise();
	}
}
