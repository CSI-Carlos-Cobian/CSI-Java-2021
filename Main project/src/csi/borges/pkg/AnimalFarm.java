package csi.borges.pkg;

public class AnimalFarm {

	static Animal[]animals; 
	
	public static void main(String[] args) {
	
		
		animals= new Animal[10];
		
	animals[0]= new Animal ("Horse", 3, "Equus caballus", new Taxonomy("Equus caballus","Equus Linnaeus","Equidae Gray","Perissodactyla Owen","Mammalia Linnaeus","	Chordata","	Animalia","Eukaryote"));
	animals[2]= new Animal ("Parrot",50, "Psittaciformes", new Taxonomy("Psittaciformes","Bavaripsitta" , "	Psittacidae","Psittaciformes", "Aves", 	"Chordata", 	"Animalia", "	Bilateria "));
	animals[3]= new Animal ("Shark",5, "Selanchimorpha", new Taxonomy("Eukaryote", "Animalia", "Chordata", "Chondrichthyes", "Lamniformes", "Lamnidae", "Carcharodon carcharias", args));
	animals[3]= new Animal ("Lion",5, "Panthera leo", new Taxonomy("Eukaryote","Animalia" , "Chordate","Mammal", "Carnivora", 	"Felidae", 	"Panthera", " Panthera leo "));
	animals[4]= new Animal ();
	animals[5]= new Animal ("Dog",3, "Canis lupus familiaris");
	animals[6]= new Animal ("Frog",2, "Anura", new Taxonomy(null, null, null, null, null, null, null, args));
	
	
	
	// animals[4] = new Animal("Monkey", 3, "Cercopithecidae", new Taxonomy("Proboscis Monkey","	Nasalis", "	Cercopithecidae Gray", "	Primates", 	"Mammalia Linnaeus", "	Chordata", 	"Animalia"));
	// animals[4] = new Animal("Crocodile", 3, "Crocodylinae", new Taxonomy("	Crocodylus porosus Schneider","		Crocodylus Laurenti", "		Crocodylidae", "		Crocodilia", 	"	Reptilia Laurenti", "		Chordata", 	"	Animalia"));
	
	printAnimals();
	
	}
	
	public static void printAnimals() { 
		for (int i = 0; i < animals.length; i ++) {
			
			System.out.println("Animal: " + i);
			
			System.out.println(animals[i]);
			
			for(Animal a : animals) {
				System.out.println(a);
			}
			
			
		}
	}
	
	
	
	//domain, kingdom, phylum, class, order, family, genus, species 
	
	}


