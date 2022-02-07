package csi.borges.inheritance;

public class GermanSheppard extends Dog {

	public GermanSheppard() {
	this.size = 88; 
	this.wild = false; 
}
	
	@Override 
	NoiseBark(){
	
	return new Noise(Loud);

}
