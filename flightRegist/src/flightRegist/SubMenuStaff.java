package cse212_assignment7;
public enum SubMenuStaff {
	AddAdmin("(1) Add Admin",1),
	AddCheckinCounter("(2) Add Check-in Counter",2);

	
	String Dsc;
	int Secm;
	
	SubMenuStaff(String Dsc,int Secm){
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
