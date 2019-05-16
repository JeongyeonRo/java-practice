package step01_0515;

public class Operators {

	public static void main(String[] args) {
		int a=5;
		//단항연산자
		// ~(틸드연산자): 정수데이터를 받아서 1의 보수(원래 값에 절대값이 +-1)를 구하여 리턴
		System.out.println("~a:" + ~a);
		//++,--: 증감연산자,정수 변수에서만 사용 가능하며 변수 앞/뒤에 따라 다르게 적용됩니다.
		//변수 앞에 있을 경우 먼저 증감하고 뒤에 있을 경우 명령문 이후 증감합니다.
		a = 10;
		System.out.println("a++: " + (a++));
		System.out.println("++a: " + (++a));
		int b = 5;
		System.out.println("b--: " + (b--));
		System.out.println("--b: " + (--b));
		
		//이항연산자
		//사칙연산자: int를 기준으로 더 작은 자료형으로 연산하면 int로 변경해서 수행
		//다른 자료형끼리 연산하는 경우 표현범위가 더 큰 자료형으로 변경해서 수행
		//boolean < byte < short < char < int < long < float < double
		//overflow, underflow에 주의
		//shift 연산자: int형 데이터를 가지고 bit단위로 밀어내 결과를 int로 리턴하는 연산자
		System.out.println("a<<b: " + (a<<b));
		//a를 b bit만큼 첫번째 비트를 제외하고 이동
		System.out.println("a<<<b: " + (a>>b));
		
		//삼항연산자
		//조건식?식1:식2 - 조건식이 true이면 식1, false이면 식2
		boolean result = a>b?true:false;
		System.out.println(result);
		
		

	}

}
