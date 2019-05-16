package skillCheckLevel1;

public class Calendar {

	public static void main(String[] args) {
	
		int a = 5;
		int b = 24;
		int day = 0;
		
		int month[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=1 ; i< a; i=i+1) {
			day = day + month[i];
		}
		
		day = day + b;
		
		day = day%7;
		
		switch(day) {
		case 1:
			System.out.println("FRI");
			break;
		case 2:
			System.out.println("SAT");
			break;
		case 3:
			System.out.println("SUN");
			break;
		case 4:
			System.out.println("MON");
			break;
		case 5:
			System.out.println("TUE");
			break;
		case 6:
			System.out.println("WED");
			break;
		case 0:
			System.out.println("THU");
		}
		
	}

}
