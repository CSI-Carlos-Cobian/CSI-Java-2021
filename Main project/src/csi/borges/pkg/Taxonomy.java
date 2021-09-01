/**
 * 
 */
package csi.borges.pkg;

/**
 * @author user
 *
 */
public class Taxonomy {
//	Fields
    String species;
    String genus;
    String family;
    String order;
    String classs;
    String phylum;
    String kingdom;
    String domain;
//  Constructors
	public Taxonomy(String species, String genus, String family, String order, String classs,String phylum,String kingdom,String domain) {
		this.species = species;
		this.genus = genus;
		this.family = family;
		this.order = order;
		this.classs = classs;
		this.phylum = phylum;
		this.kingdom = kingdom;
		this.domain = domain;
		
	}
	
	  //  Getters and Setters  
    public String getName(String species,String genus, String family, String order, String classs,String phylum,String kingdom,String domain ){
        return getName();
        
    }
    public void setName(String species, String genus, String family, String order, String classs,String phylum,String kingdom,String domain){
    	this.species = species;
		this.genus = genus;
		this.family = family;
		this.order = order;
		this.classs = classs;
		this.phylum = phylum;
		this.kingdom = kingdom;
		this.domain = domain;
    }
    
    
    public void setname(String species, String genus, String family, String order, String classs,String phylum,String kingdom,String domain ){
    	this.species = species;
		this.genus = genus;
		this.family = family;
		this.order = order;
		this.classs = classs;
		this.phylum = phylum;
		this.kingdom = kingdom;
		this.domain = domain;
    }
    
    public String getName(String species, String genus, String family, String order, String classs,String phylum,String kingdom,String domain){
        return name;
    }
   
}