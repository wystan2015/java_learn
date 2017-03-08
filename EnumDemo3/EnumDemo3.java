class EnumDemo3{
	public static void main(String[] args){
		Transport tp;
	
		System.out.println("Typical speed for an airplane is "+Transport.AIRPLANE.getSpeed()+" miles per hour.\n");
		System.out.println("All Transport speeds:");
		for(Transport t:Transport.values()){
			System.out.println(t+" typical speed is "+t.getSpeed()+" miles per hour.");
		}	
	}
}
