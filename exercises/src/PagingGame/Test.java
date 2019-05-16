package PagingGame;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] pobi = {1321,1322};
		int[] crong = {211,212};
		
		int result = 0;
		
		int suml = 0;
		int mull = 1;
		int sumr = 0;
		int mulr = 1;
		int[] pobibook = new int[4];
		int[] crongbook = new int[4];
		int pobiscore = 0;
		int crongscore = 0;

		if (pobi[1] - pobi[0] != 1 || crong[1] - crong[0] != 1) {
			result = -1;

			}

		else {

			for (int i = 0; i < pobi.length; i = i + 1) {
				int p = pobi[i];
				// System.out.println(p);
				if(p > 400 && p < 1 ) {
					result = -1;
				}
				else if (i == 0) {
					while (p != 0) {
						int su = p % 10;
						suml = suml + su;
						mull = mull * su;
						p = p / 10; 
						
						pobibook[0] = suml;
						pobibook[1] = mull;
					}
				} else if (i == 1) {
					while (p != 0) {
						int su = p % 10;
						sumr = sumr + su;
						mulr = mulr * su;
						p = p / 10;
						pobibook[2] = sumr;
						pobibook[3] = mulr;
					}
				}
			}

				suml = 0;
				mull = 1;
				sumr = 0;
				mulr = 1;


				for (int j = 0; j < crong.length; j = j + 1) {
					int c = crong[j];
					
					if(c > 400 && c < 1 ) {
						result = -1;
					}
					if (j == 0) {
						while (c != 0) {
							int su = c % 10;
							suml = suml + su;
							mull = mull * su;
							c = c / 10;
							crongbook[0] = suml;
							crongbook[1] = mull;
						}
					} else if (j == 1) {
						while (c != 0) {
							int su = c % 10;
							sumr = sumr + su;
							mulr = mulr * su;
							c = c / 10;
							crongbook[2] = sumr;
							crongbook[3] = mulr;
						}
					}
					
				}
				Arrays.sort(pobibook);
				Arrays.sort(crongbook);
				

				pobiscore = pobibook[3];
				crongscore = crongbook[3];
				
				
				
				if(pobiscore > crongscore) {
					result =1;
				}else if(pobiscore <crongscore) {
					result = 2;
				}else if(pobiscore == crongscore) {
					result = 0;
				}
		}

		
		
		
		System.out.println(result);
	}

}
