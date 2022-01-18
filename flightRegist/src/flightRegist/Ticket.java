package cse212_assignment7;
import java.util.Scanner;



public class Ticket implements Expense {
	int ticketNo;
	Flight flight;
	Passenger passengerInfo;
	String seat;
	String classs;
	int idd;
	public Ticket(int ticketNo,Flight flight) {
		Scanner scan = new Scanner(System.in);
		
		
		 
		System.out.println("Enter your Passenger Information:");
		System.out.println("ID:");
		idd=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter your Seat number:");
		seat=scan.nextLine();
		System.out.println("Enter your Class:");
		classs=scan.nextLine();
		this.ticketNo=ticketNo;
		System.out.println("Your ticket no is:"+ticketNo);
		this.flight=flight;
	}
	public int getterforTicketno() {
		return ticketNo;
	}
	public void getfromtoCity() {
		flight.DispToCity();
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
	

}
