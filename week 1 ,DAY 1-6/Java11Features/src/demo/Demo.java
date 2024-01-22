package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {

	public static void main(String[] args) {
		
		
		String str="  Nipurna  ";
		System.out.println(str.isBlank());
		System.out.println(str.length());
		System.out.println(str.strip());
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());
		
		
		try {
			//FileReader reader=new FileReader("resource/input.txt");
		   
		Paths.get("resources/input.txt");
		
		String data;
		Path path = Paths.get("resources/input.txt");

		data = Files.readString(path);
		
		System.out.println(data);
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
