public class TryJackets {
	public static void main(String[] args) {
		Jacket[] jackets = {
			new Jacket(JacketSize.medium,JacketColor.red),
			new Jacket(JacketSize.extra_large,JacketColor.yellow),
			new Jacket(JacketSize.small,JacketColor.green),
			new Jacket(JacketSize.extra_extra_large,JacketColor.blue)
		};
		System.out.println("Jackets colors available are:\n");
		for(JacketColor color:JacketColor.values()) {
			System.out.print(" "+color);
		}
		System.out.println("\n\nJackets sizes available are:\n");
		for(JacketSize size:JacketSize.values()) {
			System.out.print(" "+size);
		}
		
		System.out.println("\n\nJackets in stock are:");
		for(Jacket jacket:jackets) {
			System.out.println(jacket);
		}
	}
}
