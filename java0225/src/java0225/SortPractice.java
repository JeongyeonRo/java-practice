package java0225;

public class SortPractice {

	public static void main(String[] args) {
		// Selection Sort
		int[] ar = { 30, 40, 50, 10, 20 };
		int len = ar.length;
		for (int i = 0; i < len; i = i + 1) {
			for (int j = 0; j < len; j = j + 1) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			//중간 확인
			for (int imsi : ar) {
				System.out.printf("%d, ", imsi);
		}
			System.out.printf("\n");
		
		}
		for (int temp : ar) {
			System.out.printf("%d ", temp);

	}

	}}
