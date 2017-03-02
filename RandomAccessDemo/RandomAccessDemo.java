import java.io.*;

class RandomAccessDemo {
	public static void main(String[] args) {
		double data[] = {19.4,10.1,123.54,33.0,87.9,74.25};
		double d;

		//open and user a random access file.
		try (RandomAccessFile raf = new RandomAccessFile("random.dat","rw")){
			//write values to the file
			for (int i=0;i<data.length;i++){
				raf.writeDouble(data[i]);
			}
			//now,read back specific values
			raf.seek(0);
			d = raf.readDouble();
			System.out.println("First value is "+d);
			
			raf.seek(8);
			d = raf.readDouble();
			System.out.println("First value is "+d);

			raf.seek(8*3);
			d = raf.readDouble();
			System.out.println("First value is "+d);

			System.out.println();

			//now,read every other value.
			System.out.println("Here is every other value:");
			for(int i=0;i<data.length;i+=2){

				raf.seek(8*i);
				d = raf.readDouble();
				System.out.print(d+" ");
			}
			System.out.println();		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
