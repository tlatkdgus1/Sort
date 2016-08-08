package FileWrite;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileWriter {
	private static int[] bubbleResult;
	private static int[] insertionResult;
	private static int[] selectionResult;
	private static Double bubbleTime;
	private static Double insertionTime;
	private static Double selectionTime;
	private static String filePath;
	
	public void setBubbleResult(int[] bubbleResult){
		this.bubbleResult = bubbleResult;
	}
	
	public void setInsertonResult(int[] insertionResult){
		this.insertionResult = insertionResult;
	}
	
	public void setSelectionResult(int[] selectionResult){
		this.selectionResult = selectionResult;
	}
	
	public void setBubbleTime(Double bubbleTime){
		this.bubbleTime = bubbleTime;
	}
	
	public void setInsertionTime(Double insertionTime){
		this.insertionTime = insertionTime;
	}
	
	public void setSelctionTime(Double selectionTime){
		this.selectionTime = selectionTime;
	}
	
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}
	
	public void fileWriter() throws IOException{
		File file = new File(filePath);
		java.io.FileWriter fw = new java.io.FileWriter(file);
		
		System.out.println("test");
		System.out.println(bubbleTime);
		
		fw.write("Bubble Sort : Time = "+bubbleTime+" Result = "+Arrays.toString(bubbleResult) + "\n");
		fw.write("Insertion Sort : Time = "+insertionTime+" Result = "+Arrays.toString(insertionResult)+"\n");
		fw.write("Selection Sort : Time = "+selectionTime+" Result = "+Arrays.toString(selectionResult)+"\n");
		
		fw.close();
		
		
	}
	
}
