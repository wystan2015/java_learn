public abstract class Animal {
    public Animal(String aType) {
        type = new String(aType);
    }
	public Animal (Animal animal) {
		type = animal.type;
	}
	
    public String toString() {
        return "This is a "+type+".";
    }
	
	public abstract void sound();
	
    private String type;
}
