package baekjoon10_04;

public class Idx1330_compareAB {
	
	public String compareAB(int a, int b) {
		String result = null;
		
		if(a > b) {
			result = ">";
		}else if(a < b) {
			result = "<";
		}else if(a == b) {
			result = "==";
		}
		 
		return result;
	}

}
