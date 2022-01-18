package cse212_assignment7;

public enum PassengerMenu {
	M1("(1) Show Flight Information.",1),
	M2("(2) Buy ticket.",2),
	M3("(3) Request a Check-In",3),
	M4("(4) Switch Users",4),
	M5("(5) Exit.",5);
	
	
	
	String desc;
	int secim;
	
	PassengerMenu(String descr,int secim){
		this.desc=descr;
		this.secim=secim;
		
	}
	public String getDescr() {
		return desc;
	}
	public void setDescr(String canerr123) {
		this.desc=canerr123;
	}
	public int getSecim() {
		return secim;
	}
	public void setSecim(int secimm) {
		this.secim=secimm;
	}

}
