package cse212_assignment7;

import java.util.Locale;
import java.util.Scanner;

public abstract class Flight implements Expense,Comparable<Flight>{
	int flightNo;
	DateTime departureTime,RealDeparturTime;
	DateTime arrivalTime;
	String originCity;
	String destinationCity,destinationCity2,destinationCity3;
	int timeZoneDifference;
	//String RealDestination;
	int maxLoadOfPlane;
	
	double flightDistance;//km
	double distanceRate;//[$/km]
	double flightPrice;//$
	public Flight() {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		System.out.println("Enter the flight no:");
		flightNo=scan.nextInt();
		System.out.println("Enter the Departure Time;");
		departureTime=new DateTime();
		RealDeparturTime=departureTime;
		System.out.println("Enter the Arrival Time;");
		arrivalTime=new DateTime();
		scan.nextLine();
		System.out.print("Enter the Origin City:");
		originCity=scan.nextLine();
		System.out.print("Enter the Destination City:");
		destinationCity=scan.nextLine();
		System.out.print("Enter the Max Load:");
		maxLoadOfPlane=scan.nextInt();
		scan.nextLine();
		//RealDestination=destinationCity;
		
		
	}
	public Flight(int a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the flight no:");
		flightNo=scan.nextInt();
		System.out.println("Enter the Departure Time;");
		departureTime=new DateTime();
		RealDeparturTime=departureTime;
		System.out.println("Enter the Arrival Time;");
		arrivalTime=new DateTime();
		scan.nextLine();
		System.out.print("Enter the Origin City:");
		originCity=scan.nextLine();
		System.out.print("Enter the Destination City:");
		destinationCity=scan.nextLine();
		System.out.print("Enter the Max Load:");
		maxLoadOfPlane=scan.nextInt();
		scan.nextLine();
		///////
		
		///////
		System.out.println("Enter the second Departure Time;");
		departureTime=new DateTime();
		System.out.println("Enter the second Arrival Time;");
		arrivalTime=new DateTime();
		System.out.println("Enter the second Destination City:");
		destinationCity2=scan.nextLine();
		//RealDestination=destinationCity2;
		
	}
	public Flight(String cncn) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the flight no:");
		flightNo=scan.nextInt();
		System.out.println("Enter the Departure Time;");
		departureTime=new DateTime();
		RealDeparturTime=departureTime;
		System.out.println("Enter the Arrival Time;");
		arrivalTime=new DateTime();
		scan.nextLine();
		System.out.print("Enter the Origin City:");
		originCity=scan.nextLine();
		System.out.print("Enter the Destination City:");
		destinationCity=scan.nextLine();
		System.out.print("Enter the Max Load:");
		maxLoadOfPlane=scan.nextInt();
		scan.nextLine();
		/////
		
		/////
		System.out.println("Enter the second Departure Time;");
		departureTime=new DateTime();
		System.out.println("Enter the second Arrival Time;");
		arrivalTime=new DateTime();
		System.out.println("Enter the second Destination City:");
		destinationCity2=scan.nextLine();
		
		System.out.println("Enter the third Departure Time;");
		departureTime=new DateTime();
		System.out.println("Enter the third Arrival Time;");
		arrivalTime=new DateTime();
		System.out.println("Enter the third Destination City:");
		destinationCity3=scan.nextLine();
		//RealDestination=destinationCity3;
		
	}
	public String DispToCity() {
		return "From " + originCity + " to "+ destinationCity;
	}
	public void DispFlyTime() {
		System.out.println("Departure Time:"+departureTime.GetTimeToStrng());
		System.out.println("Arrival Time:"+arrivalTime.GetTimeToStrng());
	}
	public  int GetterForFlightNo() {
		return flightNo;
	}
	public int getterMaxLoadOfPlane() {
		return maxLoadOfPlane;
	}
	public void DispFlightInfo() {
		
		System.out.println("Flight (no:"+flightNo+") from "+originCity+" to "+destinationCity+" departs at "+RealDeparturTime.GetTimeToStrng()+" and lands at "+arrivalTime.GetTimeToStrng());
		
	}
	public String GetOrgnCty() {
		return originCity;
	}
	public String getDestCty() {
		return destinationCity;
	}
	public DateTime GetDepTime() {
		return departureTime;
	}
	public DateTime GetArrvTime() {
		return arrivalTime;
	}
	
	public void calculateDuration() {
		if(departureTime.year==arrivalTime.year && departureTime.month==arrivalTime.month && departureTime.day>arrivalTime.day  ) {
			System.out.println("Warning !! ");
		}
		if(departureTime.year==arrivalTime.year && departureTime.month==arrivalTime.month && departureTime.day==arrivalTime.day && departureTime.hour>arrivalTime.hour  ) {
			System.out.println("Warning !! ");
		}
		if(departureTime.year==arrivalTime.year && departureTime.month==arrivalTime.month && departureTime.day==arrivalTime.day && departureTime.hour==arrivalTime.hour && departureTime.minute>arrivalTime.minute ) {
			System.out.println("Warning !! ");
		}
		if(departureTime.year==arrivalTime.year && departureTime.month>arrivalTime.month ) {
			System.out.println("Warning !! ");
		}
		if(departureTime.year>arrivalTime.year) {
			System.out.println("Warning !! ");
		}
		else if(departureTime.day==arrivalTime.day) {
			System.out.printf("with duration of %d hour(s)",((arrivalTime.hour-departureTime.hour) + timeZoneDifference)); 
			System.out.printf("\n");
		}
		else if(departureTime.day!=arrivalTime.day) {
			int a=departureTime.day*24;
			int b=arrivalTime.day*24;
			int res=b-a;
			int res1=arrivalTime.hour-departureTime.hour;
			int result=res+res1+timeZoneDifference;
			System.out.printf("with duration of %d hour(s)",result);
		}
		
		
		
	}
	

}
