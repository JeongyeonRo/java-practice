
public class diamondArray {

	public static void main(String[] args) {
		int A[][]= new int[5][5];
		int V = 1;
		int M = 2;
		int CL = M, CR = M;
		for(int R=0; R<=4; R++) {
			for(int C=CL; C<=CR; C++) {
				A[R][C] =V;
				V = V+2;
			}
			if(R < M) {
				CL--;
				CR++;
			}else {
				CL++;
				CR--;
			}
		}
		
		for(int R=0; R<5; R++) {
			for(int C=0; C<5; C++) {
				System.out.print(A[R][C]+"\t");
			}
			//ÁÙ¹Ù²Þ
			System.out.println();
		}
//		0	0	1	0	0	
//		0	3	5	7	0	
//		9	11	13	15	17	
//		0	19	21	23	0	
//		0	0	25	0	0

	}

}
