package practice;

import java.util.Arrays;

public class pobi {

	public static void main(String[] args) {
		int[] pobi = {131, 133};
		int suml = 0;
		int mull = 1;
		int sumr = 0;
		int mulr = 1;
		int [] pobibook = new int[4];
		int pobiscore = 0;
		
		if(pobi[1]-pobi[0] != 1) {
			System.out.println(-1);
		}
		
		else {
		
		for (int i = 0; i < pobi.length; i = i + 1) {
			int p = pobi[i];
			// System.out.println(p);
			if (i == 0) {
				while (p != 0) {
					int su = p % 10;
					suml = suml + su;
					mull = mull * su;
					p = p / 10;
					// System.out.println(su);
					pobibook[0]=suml;
					pobibook[1]=mull;
				}
			} else if (i == 1) {
				while (p != 0) {
					int su = p % 10;
					sumr = sumr + su;
					mulr = mulr * su;
					p = p / 10;
					pobibook[2]=sumr;
					pobibook[3]=mulr;
				}
			}
			

		}
		//System.out.printf("suml: %d\n", suml);
		//System.out.printf("mull: %d\n", mull);
		//System.out.printf("sumr: %d\n", sumr);
		//System.out.printf("mulr: %d\n", mulr);
		Arrays.sort(pobibook);
		//System.out.println(Arrays.toString(pobibook));
		
		pobiscore = pobibook[3];
		System.out.println(pobiscore);
		}
	}

}
