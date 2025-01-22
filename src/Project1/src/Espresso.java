
public class Espresso  extends CafeMenu{
	
	//Fields
	private String esspressoName;
	private int shots;
	
	//Constructor
	Espresso(String esspressoName,int shots,String size, double price, String temp, int qunaitiy) {
		super(size, price, temp, qunaitiy);
		this.setEsspressoName(esspressoName);
		this.setShots(shots);
	}




	public String getEsspressoName() {
		return esspressoName;
	}


	public void setEsspressoName(String esspressoName) {
		this.esspressoName = esspressoName;
	}


	public int getShots() {
		return shots;
	}


	public void setShots(int shots) {
		this.shots = shots;
	}	
	
	@Override
	public String toString() {
		return "Espresso [esspressoName=" + esspressoName + ", shots=" + shots + "]";
	}

}
