public class Dog extends Animal {
    public Dog(String aName) {
        super("Dog");
        name = aName;
        breed = "Unknown";
    }
    
    public Dog(String aName,String aBreed) {
		super("Dog");
        name = aName;
        breed = aBreed;
    }

	public Dog(Dog dog) {
		super(dog);
		name = dog.name;
		breed = dog.breed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	 
	public String getBreed() {
		return breed;
	}
	  
	@Override
	public void sound() {
		System.out.println("Woof Woof");
	}

	public String toString (){
		return super.toString()+" It's " +name + " the " +breed;
	} 
    protected String name;
    protected String breed;
}


