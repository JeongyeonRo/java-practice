package baekjoon10_04;

public class Main {

	public static void main(String[] args) {
		
		//Idx1000
		Idx1000_sumAB sumAB = new Idx1000_sumAB();
		System.out.println("sumAB : " + sumAB.sumAB(1,2));

		
		//Idx1330
		Idx1330_compareAB compareAB = new Idx1330_compareAB();
		System.out.println("compareAB : " + compareAB.compareAB(1, 1));
		System.out.println("compareAB : " + compareAB.compareAB(1, 2));
		System.out.println("compareAB : " + compareAB.compareAB(2, 1));
		
		//Idx9498
		Idx9498_testScore testScore = new Idx9498_testScore();
		System.out.println("testScore : " + testScore.testScore(88));
		System.out.println("testScore : " + testScore.testScore(65));
		System.out.println("testScore : " + testScore.testScore(40));
		
		//Idx10817
		Idx10817_compareABC compareABC = new Idx10817_compareABC();
		System.out.println("secondLargeNo : " + compareABC.compareABC(1, 2, 3));
		System.out.println("secondLargeNo : " + compareABC.compareABC(3, 5, 7));
		
		
		//Idx2562
		Idx2562_maxNO max = new Idx2562_maxNO();
		int [] ar = {1,2,3,4,5,6,7};
		System.out.println("maxNo : " + max.max(ar));
		int [] br = {6,8,3,9,4,1,6};
		System.out.println("maxNo : " + max.max(br));
		
		
		
	}

}
