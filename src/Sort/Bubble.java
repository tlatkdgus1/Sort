package Sort;


public class Bubble {
	public void bubble(int[] index) {
		int i, j, temp;
		long bubbleStart = System.currentTimeMillis();
		FileWrite.FileWriter fw = new FileWrite.FileWriter();
		
		for (i = 0; i < index.length - 1; i++) {
			for (j = 0; j < index.length - 1 - i; j++) {
				if (index[j] > index[j + 1]) {
					temp = index[j];
					index[j] = index[j + 1];
					index[j + 1] = temp;
					
				}
			}
		}

		long bubbleEnd = System.currentTimeMillis();
		Double bubbleTime = (( bubbleEnd - bubbleStart )/1000.0 );
		
		fw.setBubbleResult(index);
		fw.setBubbleTime(bubbleTime);
	
	}
}
