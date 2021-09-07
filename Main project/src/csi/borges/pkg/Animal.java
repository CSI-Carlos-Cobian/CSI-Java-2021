package csi.borges.pkg;

public class Animal{
		//	Fields
        String name;
        int age;
        String scientificName;
        Taxonomy taxonomy;
    //  Constructors
    	public Animal(String name,int age,String scientificName,String Taxonomy) {
    		this.name = name;
    		this.age = age;
    		this.scientificName = scientificName;
    		
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
               
                Taxonomy t = new Taxonomy ("phylum","animalia","chordata","vertebrata");
                
               
                
                Animal a3 = new Animal("Horse",3,"Equus caballus","species");
               
                System.out.println("Name: " + a3.getName());
                System.out.println("Age: " + a3.getAge());
                System.out.println("Scientific Name: " + a3.getScientificName());
                
                a3.getTaxonomy().getorder(); 
            }
            public Animal(String name,int age, String scientificName) {
        		this.name = name;
        		this.age = age;
        		this.scientificName = scientificName;
        		
            
               

            }
