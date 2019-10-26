package baekjoon10_04;

public class Idx2562_maxNO {
	
	public int max(int[] ar) {
		 int max = ar[0];
		 
		 for(int i=0; i<ar.length; i++) {
			 if(max < ar[i]) {
				 max = ar[i];
			 }
		 }
		 return max;
		
	}

}
