package cse212_assignment7;
import java.util.Locale;
import java.util.Scanner;

public class Classic extends Passenger{
	
	double miles1;
	double memberYears1;
	double mileRate1;
	Scanner scan = new Scanner(System.in);
	Classic(){
		super();
		scan.useLocale(Locale.US);
		//System.out.println("ID: ");
		//super.ID=scan.nextInt();
		System.out.println("Miles: ");
		miles1=scan.nextDouble();
		System.out.println("Member Years:");
		memberYears1=scan.nextDouble();
		System.out.println("Mile Rate:");
		mileRate1=scan.nextDouble();
		
		
	}

	@Override
	public int computeExpense() {
		// TODO Auto-generated method stub
		return (int) (miles1*mileRate1);
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
