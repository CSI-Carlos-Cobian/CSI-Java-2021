package csi.borges.pkg;

public class AnimalFarm {

	static Animal[] animals;

	public static void main(String[] args) {

		animals = new Animal[10];

		animals[0] = new Animal("Horse", 3, "Equus caballus",
				new Taxonomy("Equus caballus", "Equus Linnaeus", "Equidae Gray", "Perissodactyla Owen",
						"Mammalia Linnaeus", "	Chordata", "	Animalia", "Eukaryote"));
		animals[1] = new Animal("Parrot", 50, "Psittaciformes", new Taxonomy("Psittaciformes", "Bavaripsitta",
				"	Psittacidae", "Psittaciformes", "Aves", "Chordata", "Animalia", "	Bilateria "));
		animals[2] = new Animal("Shark", 5, "Selanchimorpha", new Taxonomy("Eukaryote", "Carcharodon carcharias",
				"Animalia", "Chordata", "Chondrichthyes", "Lamniformes", "Lamnidae", "Carcharodon carcharias"));
		animals[3] = new Animal("Lion", 5, "Panthera leo", new Taxonomy("Eukaryote", "Animalia", "Chordate", "Mammal",
				"Carnivora", "Felidae", "Panthera", " Panthera leo "));

		animals[5] = new Animal();
		animals[6] = new Animal("Dog", 3, "Canis lupus familiaris");
		animals[7] = new Animal("Frog", 2, "Anura", new Taxonomy());

		// animals[4] = new Animal("Monkey", 3, "Cercopithecidae", new
		// Taxonomy("Proboscis Monkey"," Nasalis", " Cercopithecidae Gray", " Primates",
		// "Mammalia Linnaeus", " Chordata", "Animalia"));
		// animals[5] = new Animal("Crocodile", 3, "Crocodylinae", new Taxonomy("
		// Crocodylus porosus Schneider"," Crocodylus Laurenti", " Crocodylidae",
		// "Crocodilia", "Reptilia Laurenti", " Chordata", "Animalia"));

		//	printAnimals();
		printEachAnimal();

	}

	public static void printAnimals() {
		for (int i = 0; i < animals.length; i++) {
			System.out.println("Animal: " + i);
			System.out.println(animals[i]);

		}
	}

	public static void printEachAnimal() {
		for (Animal a : animals) {
			System.out.println(a);
		}
	}

	// domain, kingdom, phylum, class, order, family, genus, species

}
