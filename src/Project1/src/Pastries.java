
public class Pastries extends CafeMenu {

	//Fields
	String pastrieName;
	
		//Constructor
	Pastries(String pastrieName, String size, double price, int qunaitiy) {
		super(size, price, qunaitiy);
		this.pastrieName = pastrieName;
	}

	public String getPastrieName() {
		return pastrieName;
	}


	public void setPastrieName(String pastrieName) {
		this.pastrieName = pastrieName;
	}

	
	@Override
	public String toString() {
		return "Pastries [pastrieName=" + pastrieName + "]";
	}

	

}
