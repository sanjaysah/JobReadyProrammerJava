package com.sanjay.learningFileReader;

import java.io.*;

public class Application2 {

	public static void main(String[] args) {
		
		File file = new File("myfile.txt");
		String input = "";
		
		try (FileReader fReader = new FileReader(file);
			 BufferedReader bReader = new BufferedReader(fReader);){
			
			input = bReader.readLine();
			while(input!=null) {
				System.out.println(input);
				input = bReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found - "+file.getName());
		} catch (IOException e) {
			System.out.println("Problem reading the file - "+file.getName());
		}

	}

}
