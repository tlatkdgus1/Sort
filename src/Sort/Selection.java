package Sort;


public class Selection {
	public void selection(int[] index){
	    int i, j, min;
	    int temp = 0;
		long selectionStart = System.currentTimeMillis();
		
		FileWrite.FileWriter fw = new FileWrite.FileWriter();
		
	    for (i = 0; i < index.length; i++) {
	      min = index[i];
	      for (j = i; j < index.length - 1; j++) {
	        if (min > index[j + 1]) {
	          min = index[j + 1];
	          temp = j + 1;
	        }
	      }
	      index[temp] = index[i];
	      index[i] = min;
	    }
	    
	    long selectionEnd = System.currentTimeMillis();
	    Double selectionTime = ((selectionEnd - selectionStart )/1000.0 );
	    
	    fw.setSelectionResult(index);
	    fw.setSelctionTime(selectionTime);
		
	}
}
