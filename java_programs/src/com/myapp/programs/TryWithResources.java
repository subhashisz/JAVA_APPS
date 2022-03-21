package com.myapp.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TryWithResources {
	public static void main(String args[]) throws Exception {
		writeFile();
		readFile();
	}

	public static void writeFile() throws IOException {
		boolean writeToEnd = true;
		try (FileWriter fw = new FileWriter(new File("E:/temp.txt"), writeToEnd);
				BufferedWriter bw = new BufferedWriter(fw)) {

			bw.write("this is some text to be written in the file");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readLineFromFile() throws IOException {
		try (FileReader fr = new FileReader(new File("E:/temp.txt")); BufferedReader br = new BufferedReader(fr);) {
			String s = br.readLine();
			System.out.println(s);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFile() {
		try {
			Stream<String> stream = Files.lines(Paths.get("E:/temp.txt"));
			stream.forEach(System.out::println);
		} catch (Exception e) {

		}
	}
}