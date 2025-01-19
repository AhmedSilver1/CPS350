
public class CafeMenu {

	//Fields
	private String size;
	private double price;
	private String temp;
	private int qunaitiy;

	//Methods
	CafeMenu(String size, double price, String temp, int qunaitiy){
		this.size = size;
		this.price = price;
		this.temp = temp;
		this.qunaitiy = qunaitiy;
	}
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public int getQunaitiy() {
		return qunaitiy;
	}

	public void setQunaitiy(int qunaitiy) {
		this.qunaitiy = qunaitiy;
	}

	
	
}
