
public class snailArray {

	public static void main(String[] args) {
		int A [][] = new int[5][5];
		int N = 0, S=1, i=0, j=-1, K=5;
		while(true) {
			for(int P=0; P<K; P++) {
				N=N+1;
				j=j+S;
				A[i][j] = N;
			}
			K=K -1;
			if(K <= 0)
				break;
			for(int P=0; P<K; P++) {
				N=N+1;
				i=i+S;
				A[i][j] = N;
			}
			S = S * (-1);
		}
		//배열 A[5][5] 출력
		for(i=0; i<5; i++) {
			for(j=0;j<5;j++) {
				System.out.print(A[i][j]+"\t");
			}
			//줄바꿈
			System.out.println();
		}
		
		//출력값
//		1	2	3	4	5	
//		16	17	18	19	6	
//		15	24	25	20	7	
//		14	23	22	21	8	
//		13	12	11	10	9

	}

}
