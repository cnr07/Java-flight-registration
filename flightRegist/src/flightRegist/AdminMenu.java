package cse212_assignment7;

public enum AdminMenu {
	M1("(1) Add a New Flight.",1),
	M2("(2) Show Flight Information.",2),
	M3("(3) Calculate Take-Off Load.",3),
	M4("(4) Calculate Expenses",4),
	M5("(5) Switch Users.",5),
	M6("(6) Exit.",6);
	
	
	
	String desc;
	int secim;
	
	AdminMenu(String descr,int secim){
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
