package demo0;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class demo3 {
	public static void main(String[] args) throws FileNotFoundException {
		File obj = new File("C:\\Users\\Shiva Prasad\\Desktop\\demo.txt\\");
		Scanner reader=new Scanner(System.in);{
		while(reader.hasNextLine()) {
			String data=reader.nextLine();
		System.out.println("data");
		throw new FileNotFoundException("file");
		}
		reader.close();
	}
	}
}

