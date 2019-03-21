package java0320;

import java.util.Scanner;

public class CharcterTriangle {

	public static void main(String[] args) {
		//삼각형의 높이 N을 입력받아서 아래와 같이 문자 'A'부터 차례대로 왼쪽 대각선으로 채워서 삼각형 모양을 출력하는 프로그램을 작성하시오.
		//오른쪽 위부터 왼쪽 아래쪽으로 이동하면서 문자 'A'부터 차례대로 채워나간다.
		//N번 행까지 채워지면 다시 오른쪽 둘째 행부터 왼쪽 아래로 채워나간다.
		//삼각형이 모두 채워질 때까지 반복하면서 채워 나간다. (문자 'Z'다음에는 'A'부터 다시 시작한다.)

		Scanner sc = new Scanner(System.in);
		
		//삼각형의 높이가 될 정수를 입력받기
		System.out.println("100이하의 정수를 입력하세요\n");
		int n = sc.nextInt();
		if (n > 100) {
			//100이상의 정수를 입력받을 경우 다시 입력
			System.out.printf("100이하의 정수를 입력하세요\n");
			n = sc.nextInt();
		}
		for (int i = 0; i < n; i = i + 1) {
			for (int j = 0; j < n - i; j = j + 1) {
				System.out.printf(" ");
				//앞부분 공백 삼각형을 만들기
			}
			for (int k = 0; k < 1 + i; k = k + 1) {
				//문자로 출력 될 삼각형 만들기
				char c = 65;
				char ch = (char) (c + i + (4 * k));
				//'Z'를 넘어가면 다시 'A'부터 출력
				if (ch > 'Z') {
					ch = (char) (ch - 26);
				}
				System.out.printf("%c", ch);
			}
			System.out.printf("\n");
		}
	}

}
