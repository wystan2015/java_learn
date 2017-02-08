public class Cat extends Animal {

	public Cat(String aName) {
		super("Cat");
		name = aName;
		breed = "Unknown";
	}
	
	public Cat(String aName,String aBreed) {
		super("Cat");
		name = aName;
		breed = aBreed;	
	}

	@Override public String toString() {
		return super.toString() +"\nIt's "+
		name+" the "+breed;
	}
	
	@Override public void sound() {
		System.out.println("Miiaooww");
	}
	
	protected String name;
	protected String breed;

}
