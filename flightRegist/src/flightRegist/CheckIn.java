package cse212_assignment7;
import java.util.Scanner;

public class CheckIn implements Expense  {
	Ticket ticket;
	int weightOfLuggage;
	DateTime checkInTime;
	Boolean valid=false;
	int sumweight;
	public CheckIn(Ticket ticket) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Enter your weight of luggage:");
		weightOfLuggage=scan.nextInt();
		System.out.println("Enter your check in time;");
		checkInTime=new DateTime();
		//valid=true;
		this.ticket=ticket;
		
	}
	public void CheckInDisp() {
		System.out.printf("Check-In of %s %s\n",ticket.passengerInfo.getterforName(),ticket.passengerInfo.getterforSurName());
		System.out.printf("Ticket No# %d\n",ticket.getterforTicketno());
		ticket.getfromtoCity();
		ticket.flight.DispFlyTime();
		System.out.printf("Check-In Time: %s",checkInTime.GetTimeToStrng());
		System.out.printf("\n");
		System.out.println("Luggage Weight:"+weightOfLuggage);
		
		
	}
	/*public void getterTicktt() {
		ticket.getterforTicketno();
	}*/
	public void SetterValid() {
		this.valid=true;
	}
	public boolean GetterForValid() {
		return valid;
	}
	public int getterSumWeight() {
		return sumweight;
	}
	@Override
	public int computeExpense() {
		// TODO Auto-generated method stub
		return 0;
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