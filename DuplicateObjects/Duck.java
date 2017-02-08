public class Duck extends Animal {

	public Duck(String aName) {
		super("Duck");
		name = aName;
		breed = "Unknown";
	}
	
	public Duck(String aName,String aBreed) {
		super("Duck");
		name = aName;
		breed = aBreed;	
	}

	@Override public String toString() {
		return super.toString() +"\nIt's "+
		name+" the "+breed;
	}
	
	@Override public void sound() {
		System.out.println("Auack quackquack");
	}
	
	protected String name;
	protected String breed;

}
