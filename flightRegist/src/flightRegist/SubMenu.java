package cse212_assignment7;

public enum SubMenu {
	OneLegFlight("(1) Create non-stop flight.",1),
	TwoLegFlight("(2) Create a two-leg flight.",2),
	ThreeLegFlight("(3) Create a three-leg flight.",3);
	
	String Dsc;
	int Secm;
	
	SubMenu(String Dsc,int Secm){
		this.Dsc=Dsc;
		this.Secm=Secm;
	}
	public String getDsc() {
		return Dsc;
	}
	public int getSecm() {
		return Secm;
	}
	public void setDsc(String cnr) {
		this.Dsc=cnr;
	}
	public void setSecm(int cnr1) {
		this.Secm=cnr1;
	}

}
