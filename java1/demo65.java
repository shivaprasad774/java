package demo8demo0;
import java.io.*;
public class demo10 {
	public static void main(String[] args) throws IOException {
	/*	File f1=new File("C:\\Users\\Shiva Prasad\\Desktop\\sem");
		if(f1.createNewFile()) {
			System.out.println("file created successfully");
		}else {
			System.out.println("not created");
		}*/
		FileWriter f1=new FileWriter("C:\\Users\\Shiva Prasad\\Desktop\\sem");
		f1.write("how much do u need");
		f1.close();
		System.out.println("success");
	}

}
