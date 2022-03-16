package com.myapp.practices;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResourceManagement {
	public static void main(String[] args) throws FileNotFoundException {

	}
	//java 7 try with resource management
	public void java7Meth() {
		try (FileOutputStream fileStream = new FileOutputStream("example.txt")) {
			String greeting = "Welcome to ex.";
			byte b[] = greeting.getBytes();
			fileStream.write(b);

			System.out.println("File written");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	//java 9 try with resource management
	public void java9Meth() throws FileNotFoundException {
		FileOutputStream fileStream = new FileOutputStream("example.txt");
		try (fileStream) {
			String greeting = "Welcome to ex.";
			byte b[] = greeting.getBytes();
			fileStream.write(b);
			System.out.println("File written");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
