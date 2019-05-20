package dao;

import index.Sample;

//클라이언트의 요구 사항의 메소드 원형을 작성할 인터페이스 생성
public interface SampleDao {
	//public 리턴타입 이름(매개변수)
	//리턴타입은 작업의 결과를 확인할 수 있는 값으로 설정
	//이름은 어떤 작업을 수행하는지 알 수 있도록 작성
	
	//데이터를 삽입하는 메소드
	public int insertSample(Sample sample);
	//삽입, 수정, 삭제 등의 리턴타입은 int로 설정
}


