import java.util.Random;
public class MagicHat {
	static int maxRabbits = 5;
	static Random select = new Random();
	
	//Constructor for a hat
	public MagicHat(String hatName) {
		this.hatName = hatName;
		rabbits = new Rabbit[1+select.nextInt(maxRabbits)];
		
		for (int i=0; i<rabbits.length; ++i) {
			rabbits[i] = new Rabbit();
		}
	}
	
	public String toString() {
		String hatString = "\n" +hatName +"contains:\n";
		for(Rabbit rabbit : rabbits) {
			hatString += " "+rabbit;
		} 
		return hatString;
	}

	private String hatName;
	private Rabbit rabbits[];
	

	static class Rabbit {
		static private String[] rabbitNames={"Floppsy","Moppsy","Gnasher","Thumper"};
		static private int[] rabbitNamesCount = new int[rabbitNames.length];
		private String name;
	
		public Rabbit() {

			int index = select.nextInt(rabbitNames.length);
			name = rabbitNames[index]+(++rabbitNamesCount[index]);
		}

		public String toString() {
			return name;
		}
	}

}
