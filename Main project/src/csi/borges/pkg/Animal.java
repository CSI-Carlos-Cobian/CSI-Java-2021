package csi.borges.pkg;

public class Animal {

	// Fields
	String name;
	int age;
	String scientificName;
	Taxonomy taxonomy;

	// Constructors

	public Animal(String name, int age, String scientificName) {
		this.name = name;
		this.age = age;
		this.scientificName = scientificName;
	}

	public Animal(String name, int age, String scientificName, Taxonomy taxonomy) {
		this.name = name;
		this.age = age;
		this.scientificName = scientificName;
		this.taxonomy = taxonomy;
	}

	public Animal() {
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	private Taxonomy getTaxonomy() {
		return this.taxonomy;
	}

	 public String toString() {
	    	String s = String.format("""
	    			Name: %s
	    			Age: %d
	    			Scientific name %s
	    			Taxonomy: %s
	    			""", name, age, scientificName, taxonomy);
	    	
	    	return s;	
	    }
	

	// Main Method
	public static void main(String[] args ) {
		Animal a = new Animal();
		a.setName("Koala");
		a.setAge(13);
		a.setScientificName("Phascolarctos cinereus");

		System.out.println("Name: " + a.getName());
		System.out.println("Age: " + a.getAge());
		System.out.println("Scientific Name: " + a.getScientificName());

		Animal a2 = new Animal("Parrot", 50, "Psittaciformes");

		System.out.println("Name: " + a2.getName());
		System.out.println("Age: " + a2.getAge());
		System.out.println("Scientific Name: " + a2.getScientificName());

		Taxonomy t = new Taxonomy("Equus caballus","Equus Linnaeus","Equidae Gray","Perissodactyla Owen","Mammalia Linnaeus","	Chordata","	Animalia","Eukaryote");
		
		
		
				
				
				
		Animal a3 = new Animal("Horse", 3, "Equus caballus",t);

		System.out.println("Name: " + a3.getName());
		System.out.println("Age: " + a3.getAge());
		System.out.println("Scientific Name: " + a3.getScientificName());
		
		System.out.println("genus: "+ a3.getTaxonomy().getGenus());
		System.out.println("domain: "+ a3.getTaxonomy().getDomain());
		System.out.println("species: "+ a3.getTaxonomy().getSpecies());
		System.out.println("classs: "+ a3.getTaxonomy().getClasss());

		
		a3.getTaxonomy().getOrder();
	}

	
}