
public class Tea  extends CafeMenu{
	
	
	
	//Fields
	String teaName;
	String teaType;
	
	//Constructor
	Tea(String teaName, String teaType, String size, double price, String temp, int qunaitiy) {
		super(size, price, temp, qunaitiy);
		this.teaName = teaName;
	}

	
	public String getTeaName() {
		return teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	public String getTeaType() {
		return teaType;
	}

	public void setTeaType(String teaType) {
		this.teaType = teaType;
	}


	@Override
	public String toString() {
		return "Tea [teaName=" + teaName + ", teaType=" + teaType + "]";
	}

	
	
}
