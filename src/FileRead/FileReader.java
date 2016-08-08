package FileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import Sort.Bubble;
import Sort.Insertion;
import Sort.Selection;

public class FileReader {
	
	private static String form;
	
	public void fileReader(String filePath) throws IOException{
		File file = new File(filePath);

		FileWriter fw = new FileWriter(file);
		Random random = new Random();
		
		for (int i = 0; i < 10000; i++) {
			fw.write(random.nextInt(100)+1 + "\n");
		}
		fw.close();
		
		BufferedReader br = new BufferedReader(new java.io.FileReader(filePath));
		int i = 0;
		
		int[] index = new int[10000];
		while (true) {
			form = br.readLine();
			if (form == null) {
				break;
			}
			index[i] = Integer.parseInt(form);
			i++;
		}
		
		Bubble bubble = new Bubble();
		bubble.bubble(index);
		
		Insertion insertion = new Insertion();
		insertion.insertion(index);
		
		Selection selection = new Selection();
		selection.selection(index);
	}
}
