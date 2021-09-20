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
	public Taxonomy(String species, String genus, String family, String order, String classs, String phylum,
			String kingdom, String domain) {
		this.species = species;
		this.genus = genus;
		this.family = family;
		this.order = order;
		this.classs = classs;
		this.phylum = phylum;
		this.kingdom = kingdom;
		this.domain = domain;

	}
	public Taxonomy() {


	}

	// Getters and Setters

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * @return the genus
	 */
	public String getGenus() {
		return genus;
	}

	/**
	 * @param genus the genus to set
	 */
	public void setGenus(String genus) {
		this.genus = genus;
	}

	/**
	 * @return the family
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * @param family the family to set
	 */
	public void setFamily(String family) {
		this.family = family;
	}

	/**
	 * @return the order
	 */
	public String getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(String order) {
		this.order = order;
	}

	/**
	 * @return the classs
	 */
	public String getClasss() {
		return classs;
	}

	/**
	 * @param classs the classs to set
	 */
	public void setClasss(String classs) {
		this.classs = classs;
	}

	/**
	 * @return the phylum
	 */
	public String getPhylum() {
		return phylum;
	}

	/**
	 * @param phylum the phylum to set
	 */
	public void setPhylum(String phylum) {
		this.phylum = phylum;
	}

	/**
	 * @return the kingdom
	 */
	public String getKingdom() {
		return kingdom;
	}

	/**
	 * @param kingdom the kingdom to set
	 */
	public void setKingdom(String kingdom) {
		this.kingdom = kingdom;
	}

	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}
	// no-argument constructor
	 public String toString() {
	    	String s = String.format("""
	    			Genus: %s
	    			Species: %s
	    			Classs: %s
	    			Domain: %s
	    			Kingdom: %s
	    			Phylum: %s
	    			Order: %s
	    			Family: %s
	    			""",
	    			genus,
	    			species,
	    			classs,
	    			domain,
	    			kingdom,
	    			phylum,
	    			order,
	    			family);
	    	return s;	
	    }
}