package baekjoon10_04;

public class Idx10817_compareABC {
	
	public int compareABC(int a, int b, int c) {
		int max = 0;
		
		if(a > b && b < c || a < b && a > c) {
			max = a;
		}else if(b > a && b < c || b < a && b > c) {
			max = b;
		}else {
			max = c;
		}
		
		return max;
	}

}
