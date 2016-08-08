package FileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Random;
import java.util.Scanner;

import Sort.Bubble;
import Sort.Insertion;
import Sort.Selection;

public class Main {

	private static String inputFilePath;
	private static String outputFilePath;
	

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Input Path : ");
		inputFilePath = sc.nextLine();
		
		System.out.print("Enter Output Path : ");
		outputFilePath = sc.nextLine();
		
		FileWrite.FileWriter fw = new FileWrite.FileWriter();
		FileReader fr= new FileReader();
		
		fr.fileReader(inputFilePath);
		fw.setFilePath(outputFilePath);
		
		fw.fileWriter();

	}

}
