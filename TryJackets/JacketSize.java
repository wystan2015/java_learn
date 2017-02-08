public enum JacketSize {
	small(36),medium(40),large(42),extra_large(46),extra_extra_large(48);
	JacketSize(int chestSize) {
		this.chestSize = chestSize;
	}
	
	public int chestSize() {
		return chestSize;
	}
	
	@Override
	public String toString() {
		switch(this) {
			case small:
				return "S";
			case medium:
				return "M";
			case large:
				return "L";
			case extra_large:
				return "XL";
			default:
				return "XXL";
		}
	}
		
	private int chestSize;
}
