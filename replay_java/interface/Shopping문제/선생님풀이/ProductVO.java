package shopping;

public class ProductVO{
	
	private String productName; //상품이름
	private int price; //상품가격
	
	public ProductVO(String productName, int price) {
		this.price = price;
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName += productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price += price;
	}
	
}
