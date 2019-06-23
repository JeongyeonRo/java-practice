package gmail.tjsdnwls813.SpringBoard.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
   @Autowired
   private SqlSession sqlSession;
   
   //email 중복 체크를 수행해주는 메소드
   public String emailcheck(String email) {
	   return sqlSession.selectOne("user.emailcheck",  email);
   }
}
