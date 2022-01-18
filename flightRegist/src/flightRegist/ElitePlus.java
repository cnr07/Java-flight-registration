package cse212_assignment7;

import java.util.Locale;
import java.util.Scanner;

public class ElitePlus extends Passenger{
	double yearRate;//[$/year]
	double yearlyFixedMiles;//km
	//double yearRate11;//[$/year]
	double miles111;
	double mileRate111;
	double memberYears111;
	Scanner scan = new Scanner(System.in);
	
	ElitePlus(){
		super();
		scan.useLocale(Locale.US);
		System.out.println("Miles: ");
		miles111=scan.nextDouble();
		System.out.println("Member Years:");
		memberYears111=scan.nextDouble();
		System.out.println("Mile Rate:");
		mileRate111=scan.nextDouble();
		
		System.out.println("Year Rate:");
		yearRate=scan.nextDouble();
		
		System.out.println("Yearly fixed miles:");
		yearlyFixedMiles=scan.nextDouble();
		
		
	}
	@Override
	public int computeExpense() {
		// TODO Auto-generated method stub
		return (int) ((int) ((int) (miles111*mileRate111)+(memberYears111*yearRate))+(yearlyFixedMiles*yearRate));
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

}
