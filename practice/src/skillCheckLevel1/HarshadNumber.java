package skillCheckLevel1;

public class HarshadNumber {
	
		public boolean solution(int x) {
			boolean answer = true;
			int sum = 0;
			int imsi = x;
			
			while(imsi != 0) {
				int temp = imsi%10;
				sum = sum + temp;
				imsi = imsi/10;
			}
			if(x%sum == 0) {
				return answer;
			}else {
				return answer = false;
			}
			
		}

	}
