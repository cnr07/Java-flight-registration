package cse212_assignment7;

public enum SubMenuPassenger {
	AddClassicPassenger("(1) Add Classic Passenger.",1),
	AddElitePassenger("(2) Add Elite Passenger.",2),
	AddElitePlusPassenger("(3) Add Elite Plus Passenger.",3);
	
	String Dsc;
	int Secm;
	
	SubMenuPassenger(String Dsc,int Secm){
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
