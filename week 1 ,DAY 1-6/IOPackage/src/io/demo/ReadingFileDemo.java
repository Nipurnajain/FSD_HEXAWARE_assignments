package io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFileDemo {

	public static void main(String[] args) {

		FileReader reader = null;
		FileWriter writer=null;
		
		
		try {
			
			// FileInputStream reader= new FileInputStream("resources/input.txt");
			
			
			reader = new FileReader("resources/input.txt"); // both inputstream and reader gives same output
			writer= new FileWriter("resources/output.txt"); //writing to output file
			
			int n = 0;

			while ((n = reader.read()) != -1) {
				System.out.print((char) n);
				
				writer.write(n);
				
				}
			writer.flush();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
