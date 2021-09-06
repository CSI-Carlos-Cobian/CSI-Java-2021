package csi.borges.pkg;

public class Animal{
		//	Fields
        String name;
        int age;
        String scientificName;
        String Taxonomy;
    //  Constructors
    	public Animal(String name,int age,String scientificName,String Taxonomy) {
    		this.name = name;
    		this.age = age;
    		this.scientificName = scientificName;
    		this.Taxonomy = Taxonomy;
    	}
    	public Animal() {}

        //  Getters and Setters  
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
        
        public String getScientificName(){
            return scientificName;
        }
        public void setScientificName(String scientificName){
            this.scientificName = scientificName;
        }
        
        public String getTaxonomy(){
            return Taxonomy;
        }
        public void setTaxonomy(String Taxonomy){
            this.Taxonomy = Taxonomy;
        }


            //  Main Method 
            public static void main(String[] args){
            	Animal a = new Animal(); 
                a.setName("Koala");
                a.setAge(13);  
                a.setScientificName("Phascolarctos cinereus");
                
                System.out.println("Name: " + a.getName());
                System.out.println("Age: " + a.getAge());
                System.out.println("Scientific Name: " + a.getScientificName());
           
               
                Animal a2 = new Animal("Parrot",50,"Psittaciformes","phylum");

                
                System.out.println("Name: " + a2.getName());
                System.out.println("Age: " + a2.getAge());
                System.out.println("Scientific Name: " + a2.getScientificName());
                System.out.println("Taxonomy: " + a2.getTaxonomy());
                
                public String toString(String Taxonomy) {
                	String s = String.format("""
                			Name:Parrot %s
                			Age:50 %d
                			Taxonomy:phylum %s
                			""", 
                			name,
                			age,
                			taxonomy);
                	return s;	
                }

                
                Animal a3 = new Animal("Horse",3,"Equus caballus","species");
               
                System.out.println("Name: " + a3.getName());
                System.out.println("Age: " + a3.getAge());
                System.out.println("Scientific Name: " + a3.getScientificName());
                System.out.println("Taxonomy: " + a3.getTaxonomy());
            
                public String toString("Taxonomy"); 
                {
                	String s = String.format("""
                			Name:Horse %s
                			Age:3 %d
                			Taxonomy:species %s
                			""", 
                			name,
                			age,
                			Taxonomy);
                	return s;	
                }
            
            }
            
        

}
