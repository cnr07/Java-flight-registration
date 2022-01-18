package cse212_assignment7;

import java.util.Locale;
import java.util.Scanner;

public class Elite extends Passenger{
	double yearRate11;//[$/year]
	double miles11;
	double mileRate11;
	double memberYears11;
	Scanner scan = new Scanner(System.in);
	
	Elite(){
		
		super();
		scan.useLocale(Locale.US);
		System.out.println("Miles: ");
		miles11=scan.nextDouble();
		System.out.println("Member Years:");
		memberYears11=scan.nextDouble();
		System.out.println("Mile Rate:");
		mileRate11=scan.nextDouble();
		
		System.out.println("Year Rate:");
		yearRate11=scan.nextDouble();
		
		
	}
	@Override
	public int computeExpense() {
		// TODO Auto-generated method stub
		return (int) ((int) (miles11*mileRate11)+(memberYears11*yearRate11));
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
