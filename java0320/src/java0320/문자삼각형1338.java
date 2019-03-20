package java0320;

import java.util.Scanner;

public class 문자삼각형1338 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		if (n > 100) {
			System.out.printf("100이하의 정수를 입력하세요\n");
			n = sc.nextInt();
		}
		for (int i = 0; i < n; i = i + 1) {
			for (int j = 0; j < n - i; j = j + 1) {
				System.out.printf(" ");
			}
			for (int k = 0; k < 1 + i; k = k + 1) {
				char c = 65;
				char ch = (char) (c + i + (4 * k));

				if (ch > 'Z') {
					ch = (char) (ch - 26);
				}
				System.out.printf("%c", ch);

			}

			System.out.printf("\n");

		}
	}

}
