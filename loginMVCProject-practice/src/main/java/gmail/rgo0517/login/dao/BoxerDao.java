package gmail.rgo0517.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gmail.rgo0517.login.domain.Boxer;

@Repository
public class BoxerDao {
	@Autowired
	private SqlSession sqlSession;
	//로그인 처리 메소드
	public Boxer login(Boxer boxer) {
		return sqlSession.selectOne("boxer.login",boxer);
	}
}
