package gmail.rgo0517.login;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//spring 테스트 클래스를 만들어주는 어노테이션 설정
@RunWith(SpringJUnit4ClassRunner.class)
//spring 설정 파일을 실행하기 위한 설정 
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class LoginTest {
	//테스트할 객체 주입
	private DataSource dataSource;
	//테스트할 메소드
	@Test
	public void conTest() {
		try (Connection con = dataSource.getConnection()){
			System.out.println("con:" + con);
		}catch(Exception e) {
			System.out.println("Connection Exception:" + e.getMessage());
			e.printStackTrace();
		}
	}
}
