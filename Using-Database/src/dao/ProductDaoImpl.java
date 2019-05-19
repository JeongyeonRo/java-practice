package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import index.Product;
//ProductDao를 구현한 ProductDaoImpl 클래스를 생성
public class ProductDaoImpl implements ProductDao {
	//싱글톤 패턴을 위한 코드 생성
	private static ProductDao productDao = null;
	private ProductDaoImpl() {}
	//생성자를 외부에서 호출할수 없도록 private으로 생성자를 구성
	public static ProductDao getInstance() {
		//외부에서 한번 생성자 호출기 가능하도록 인스턴스의 유무를 확인
		if(productDao == null) {
			productDao = new ProductDaoImpl();
		}
		return productDao;
	}
	@Override
	public int insertProduct(Product product) {
		int result = -1;
		//데이터 삽입이 성공하면 양수를 리턴하기 때문에 결과를 리턴할 변수를 음수로 설정
		try (
			//데이터 연결 설정
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521/ORCLPDB","SYSTEM","0000");
			PreparedStatement pstmt = con.prepareStatement(
					"insert into sample(num, name, price) values(?,?,?)");
			){
			//?에 실제 데이터를 바인딩
			pstmt.setInt(2, product.getNum());
			pstmt.setString(3, product.getName());
			pstmt.setInt(4,product.getPrice());
			//sal을 실행하고 그 결과를 result에 저장
			System.out.println(result);
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("Insert Exception: "+e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
}
