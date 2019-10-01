
public class parityBitCheck {

	public static void main(String[] args) {
		int P [] = {0,1,0,0,1,0,0,0,1}; 
		int PN = 0; 
		for(int i=1; i<9; i++) {
			if(P[i] == 1) {
				PN++;
			}
			int E =PN%2;
			if(P[0] == E) {
				System.out.println("오류미발견");
			}else {
				System.out.println("오류 발견");
			}
		}

	}

}
