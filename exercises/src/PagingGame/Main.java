package PagingGame;

public class Main {

	public static void main(String[] args) {
		
		
		int[]pobi1= {97,98,99};
		int[]pobi2= {1321,1322};
		int[]pobi3= {99,102};
		int[]crong1= {197,198,199};
		int[]crong2= {2331,2332};
		int[]crong3= {211,212};
		
		pagingGame test = new pagingGame();

		System.out.println(test.practice1(pobi1, crong1));
		System.out.println(test.practice1(pobi2, crong2));
		System.out.println(test.practice1(pobi3, crong3));
		

	}

}
