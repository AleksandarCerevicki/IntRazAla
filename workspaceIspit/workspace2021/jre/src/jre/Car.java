package jre;

public class Car {

	private int productionYear;
	private boolean locked;
	
	public int getProductionYear() {
		return productionYear;
}

	public void setProductionYear() {
		extracted(productionYear);
}

	private void extracted(int productionYear) {
		this.productionYear = productionYear;
	}
    public boolean isLocked() {
	return locked;
}

	
	/*
	 * getProductionYear
	 * getFuelAmount
	 * isLocked
	 * setProductionYear
	 * addFuel
	 * setLocked
	 */
}
