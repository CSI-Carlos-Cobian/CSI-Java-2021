package csi.borges.pkg;

public class Animal{
        //	Fields
        String name;
        int age;
        String scientificName;
    //  Constructors
    	public Animal(String name,int age) {
    		this.name = name;
    		this.age = age;
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
                Animal a2 = new Animal("Parrot",3);
           
            }
            
        

        }
