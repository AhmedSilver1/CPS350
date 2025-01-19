
public class Espresso  extends CafeMenu{
	

	private String esspressoName;
	private int shots;
	
	
	Espresso(String esspressoName,int shots,String size, double price, String temp, int qunaitiy) {
		super(size, price, temp, qunaitiy);
		this.esspressoName = esspressoName;
		this.shots= shots;
	}
}
