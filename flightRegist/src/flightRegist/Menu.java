package cse212_assignment7;

public enum Menu {
	
	M1("(1) Add a new flight.",1),
	M2("(2) Buy ticket.",2),
	M3("(3) Show Flight Information.",3),
	M4("(4) Request a Check-In.",4),
	M5("(5) Process a Check-In.",5),
	M6("(6) Display Valid Check-Ins.",6),
	M7("(7) Calculate Take-Off Load.",7),
	M8("(8) Add a Staff",8),
	M9("(9) Add a Passenger",9),
	M10("(10) Calculate Expenses",10),
	M11("(11) Exit.",11);
	
	
	
	String desc;
	int secim;
	
	Menu(String descr,int secim){
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
