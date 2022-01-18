package cse212_assignment7;

public enum MainMenu {
	M1("(1) Add a Staff",1),
	M2("(2) Add a Passenger",2),
	M3("(3) Staff Login.",3),
	M4("(4) Passenger Login",4),
	M5("(5) Exit.",5);
	
	
	
	String desc;
	int secim;
	
	MainMenu(String descr,int secim){
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
