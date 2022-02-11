package csi.borges.inheritance;

public class GermanSheppard extends Dog {

	public GermanSheppard() {
		super("thick","88","wild","male");

		
	
		this.size = 88; 
	this.wild = false; 
	}
//	private void Super(Object bark) {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public Noise bark() {
		return new Noise();
	}
}
