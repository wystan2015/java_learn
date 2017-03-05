import java.io.*;

class AvgNums {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n=0;
		double sum = 0.0;
		double avg=0;
		double t=0;
		System.out.println("How many numbers whill you enter: ");
		str = br.readLine();
		try{
			n = Integer.parseInt(str);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		System.out.println("Enter "+n+" values:");
		for(int i=0;i<n;i++){
			System.out.print(": ");
			str=br.readLine();
			try{
				t = Double.parseDouble(str);
			}catch(NumberFormatException e){
				e.printStackTrace();
			}
			sum += t;
		}
		avg = sum/n;
		System.out.println("Average is "+avg);
	}
}
