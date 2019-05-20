package step01_0515;


public class StoreVariable {

	public static void main(String[] args) {
		//정수로 된 변수 저장
		//변수를 생성하지 마자 대입
		int num = 100;
		//변수를 선언만 하면 공간은 할당되지 않는다.
		int su;
		//선언한 변수에 초기값을 대입
		su=50;
		//변수는 자신이 저장할 수 있는 크기보다 더 큰 숫자는 저장할 수 없습니다.
		//int: 4byte 정수를 저장하는 자료형, 기본형, +-21억까지 저장 가능
		//overflow, underflow 발생
		//실수를 저장하는 자료형은 float와 double이 있습니다
		//float: 4byte 실수
		float f = 3.7f;
		System.out.println("f: "+f);
		//double: 8byte 실수
		double d = 3.7;
		System.out.println("d: "+d);
		
		//변수가 사용되고 있는 데이터의 위치 확인
		int a = 10;
		int b = 20;
		System.out.println("a:"+System.identityHashCode(a));
		System.out.println("b:"+System.identityHashCode(b));
	}
}



