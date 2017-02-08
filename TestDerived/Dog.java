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
   
	public String toString (){
		return super.toString()+" It's " +name + " the " +breed;
	} 
    protected String name;
    protected String breed;
}


