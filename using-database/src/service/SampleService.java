package service;

import dao.SampleDao;
import dao.SampleDaoImpl;
import index.Sample;

public interface SampleService {
	//데이터를 한개만 가져오는 경우에는  Wrapper Class,String, Map, DTO
	//데이터를 여러개 가져오는 경우에는 List
	//삽입, 수정 등의 경우에는 int, boolean 을 이용하여 변화과 있으면 1, true
	SampleDao dao = SampleDaoImpl.getInstance();
	//추가할 데이터를 생성 
	Sample sample = new Sample();
}

