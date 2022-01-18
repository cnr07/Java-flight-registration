package cse212_assignment7;

import java.util.Scanner;

public class CheckInCounter extends Staff{
	int overTimeHours;
	int  overTimeRate;//[$/h]
	Scanner scan = new Scanner(System.in);
	CheckInCounter(){
		System.out.println("overTimeHours:");
		overTimeHours=scan.nextInt();
		System.out.println("overTimeRate:");
		overTimeRate=scan.nextInt();
		
	}
	@Override
	public int computeExpense() {
		// TODO Auto-generated method stub
		return (Salary+(overTimeHours*overTimeRate));
	}
	@Override
	public int GetterForFlightNo() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void DispFlightInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getterforTicketno() {
		// TODO Auto-generated method stub
		return 0;
	}
	public long getterID() {
		return ID;
	}
	public String getterpassword() {
		return password;
	}
	
	

}
