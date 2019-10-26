package baekjoon10_04;

public class Idx9498_testScore {
	
	public String testScore(int score) {
		String result = null;
		
		if(score>=90 && score<=100) {
			result = "A";
		}else if(score>=80 && score<=89) {
			result = "B";
		}else if(score>=70 && score<=79) {
			result = "C";
		}else if(score>=60 && score<=69) {
			result = "D";
		}else {
			result = "F";
		}
		
		return result;
	}

}
