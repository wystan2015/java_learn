public class PetDog extends Dog {
	public PetDog(String name,String breed,String fleaName,String flesSpecies) {
		super(name,breed);
		petFlea=new Flea("Max","circus flea");
	}

	public PetDog(PetDog pet) {
		super(pet);
		petFlea = new Flea(pet.petFlea);
	}

	public Flea getFlea() {
		return petFlea;
	}
	@Override
	public void sound() {
		System.out.println("Woof");
	}

	@Override
	public String toString() {
		return super.toString() + " - a pet dog.\nIt has a flea:\n"+petFlea;
	}
	protected Flea petFlea;

}
