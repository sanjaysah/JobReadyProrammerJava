package com.sanjay.learningFileReader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
		
		File file = null;
		FileReader fReader = null;
		BufferedReader bReader = null;
		String input = "";
		
		try {
			file = new File("myfile.txt");
			fReader = new FileReader(file);
			bReader = new BufferedReader(fReader);
			input = bReader.readLine();
			while(input!=null) {
				System.out.println(input);
				input = bReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found - "+file.getName());
		} catch (IOException e) {
			System.out.println("Problem reading the file - "+file.getName());
		} finally {
			try {
				// if this condition not handled null pointer exception if file not found
				if(fReader!=null) { 
					fReader.close();
				}
				if(fReader!=null) {
					bReader.close();
				}
			} catch (IOException e) {
				System.out.println("Unable to close file - "+file.getName());
			}
		}

	}

}
