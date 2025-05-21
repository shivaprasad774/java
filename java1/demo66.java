package demo8demo0;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File obj=new File("C:\\Users\\Shiva Prasad\\Desktop\\sem");
			Scanner r=new Scanner(obj);
			while (r.hasNextLine()) {
				String data = r.nextLine();
				System.out.println(data);
			}
			r.close();
		}catch(FileNotFoundException e) {
			System.out.println("an error has occured");
			e.printStackTrace();
		}
		
	}

}
