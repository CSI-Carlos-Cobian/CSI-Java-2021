package csi.borges.pkg;

public class AnimalFarm {

	static Animal[]animals; 
	
	public static void main(String[] args) {
	
		
		animals= new Animal[5];
	animals[0]= new Animal ("Horse", 3, "Equus caballus", new Taxonomy("Equus caballus","Equus Linnaeus","Equidae Gray","Perissodactyla Owen","Mammalia Linnaeus","	Chordata","	Animalia","Eukaryote"));
	animals[2]= new Animal ("Parrot",50, "Psittaciformes", new Taxonomy("Psittaciformes","Bavaripsitta" , "	Psittacidae","Psittaciformes", "Aves", 	"Chordata", 	"Animalia", "	Bilateria "));
	animals[3]= new Animal ("Shark",5, "Selanchimorpha", new Taxonomy("Eukaryote", "Animalia", "Chordata", "Chondrichthyes", "Lamniformes", "Lamnidae", "Carcharodon carcharias"));
	animals[3]= new Animal ("Parrot",50, "Psittaciformes", new Taxonomy("Psittaciformes","Bavaripsitta" , "	Psittacidae","Psittaciformes", "Aves", 	"Chordata", 	"Animalia", "	Bilateria "));
	animals[4]= new Animal ("Parrot",50, "Psittaciformes", new Taxonomy("Psittaciformes","Bavaripsitta" , "	Psittacidae","Psittaciformes", "Aves", 	"Chordata", 	"Animalia", "	Bilateria "));
	animals[5]= new Animal ("Parrot",50, "Psittaciformes", new Taxonomy("Psittaciformes","Bavaripsitta" , "	Psittacidae","Psittaciformes", "Aves", 	"Chordata", 	"Animalia", "	Bilateria "));
	animals[6]= new Animal ("Parrot",50, "Psittaciformes", new Taxonomy("Psittaciformes","Bavaripsitta" , "	Psittacidae","Psittaciformes", "Aves", 	"Chordata", 	"Animalia", "	Bilateria "));
	
	
	
	}
}
