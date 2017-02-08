public class Flea extends Animal {
	public Flea(String aName,String aSpecies) {
		super("Flea");
		name = aName;
		species = aSpecies;	
	}
	
	public Flea (Flea flea) {
		super(flea);
		name = flea.name;
		species = flea.species;
	}
	
	public void setName(String aName) {
		name = aName;
	}

	public String getSpecies() {
		return species;
	}

	@Override
	public void sound() {
		System.out.println("Psst");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nIt's "+name + " the " +species;
	}
	
	protected String name;
	protected String species;
}
