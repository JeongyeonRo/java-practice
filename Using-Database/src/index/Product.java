package index;

//여러개의 데이터를 묶어서 하나로 표현하기 위한 DTO 클래스를 생성
//DTO(Data Transfer Object) = VO(Variable Object)
public class Product {
	//Product 클래스 내부에서만 접근가능한 변수 설정
	private int num;
	private String name;
	private int price;
	//외부에서 데이터를 사용할 수 있도록 getter, setter 설정
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
