import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SampleController {

	public static void main(String[] args) {
		//데이터베이스 연결 코드 작성
		//1.7이상의 버전에서 try()안에 데이터 연결 구문 Connection con = null;을 생성하면 따로
		//close()를 하지 않아도 자동으로 호출됩니다. 
		try(Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/ORCL","System","0000");
				//"접속위치()","사용자계정","비밀번호");
				PreparedStatement pstmt = con.prepareStatement(
						"insert into sample(num, name, price) values (?,?,?)");){
			//드라이버 클래스 로드: 접속할 데이터베이스의 종류를 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//연결 확인
			System.out.println("Connection Successed\n");
			//? 자리에 삽입할 데이터를 바인딩
			pstmt.setInt(1,  10);
			pstmt.setString(2, "java");
			pstmt.setInt(3, 120);
			int result = pstmt.executeUpdate();
			//데이터가 성공할 경우 양수를 출력 
			if(result > 0) {
				System.out.println("Data Insert Successed");
			}
		} catch (Exception e) {
			System.out.println("Connection Information Exception: " + e.getMessage());			
			e.printStackTrace();
		}

	}

}
