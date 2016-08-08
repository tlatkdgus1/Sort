package Sort;

public class Insertion {
	public void insertion(int[] index){
		int i, j, temp, in;
		long insertionStart = System.currentTimeMillis();
		FileWrite.FileWriter fw = new FileWrite.FileWriter();
		
	    for (i = 1; i < index.length; i++) {
	      in = index[i];
	      for (j = i - 1; (j >= 0) && (in < index[j]); j--) {
	        index[j + 1] = index[j];
	      }
	      index[j + 1] = in;
	    }

	    long insertionEnd = System.currentTimeMillis();
		Double insertionTime = (( insertionEnd - insertionStart )/1000.0 );
		System.out.println(insertionTime);
		fw.setInsertonResult(index);
		fw.setInsertionTime(insertionTime);
	}
}
