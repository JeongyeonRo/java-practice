package java0228;

public class Eros {

	public static void main(String[] args) {
		//String 클래스에서 charAt과 length만을 이용해서 1초마다
		//EROS -> ROSE -> OSER -> SERO -> EROS -> ROSE순으로 출력되도록 작성
		String str = "EROS";
		int idx = 0;
		
		while(true) {
			try {
				Thread.sleep(1000);
				for(int i=0; i<str.length(); i=i+1) {
					char ch = str.charAt((idx+i)%str.length());
					System.out.printf("%c", ch);
				}
				System.out.printf("\n");
				idx=idx+1;
			}catch(Exception e) {}
		}
	}

}
