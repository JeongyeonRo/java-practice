package skillCheckLevel1;

public class DayCount {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		int sum = 0;
		String day [] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
		
		for(int i=1; i < a; i=i+1) {

			if(i == 2) {
				sum = sum + 29;
			}else if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 ||
					i == 12) {
				sum = sum + 31;
			}else {
				sum = sum + 30;
			}
			
		}
		
		sum = sum + b;
		
		System.out.println(sum);
		
		System.out.println(sum%7);
		
		String answer = day[sum%7];
		
		System.out.println(answer);
		

	}

}
