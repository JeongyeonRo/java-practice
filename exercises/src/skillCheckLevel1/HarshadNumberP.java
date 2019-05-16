package skillCheckLevel1;

public class HarshadNumberP {

	public static void main(String[] args) {
		int x = 10;
		boolean answer = true;
		
		int imsi = x;
		int sum = 0;
		
		while(imsi != 0) {
			int temp = imsi%10;
			sum = sum + temp;
			imsi = imsi/10;
			
			System.out.println("temp:" + temp);
			System.out.println("imsi:" + imsi);
		}
		
		//System.out.println("imsi:" + imsi);
		System.out.println("sum:" + sum);
		System.out.println("x:" + x);
		
		if(x%sum == 0) {
			answer = true;
			System.out.println(answer);
			
		}else {
			answer = false;
			System.out.println(answer);
		}

	}

}
