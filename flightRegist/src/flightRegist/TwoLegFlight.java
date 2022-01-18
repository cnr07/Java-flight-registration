package cse212_assignment7;

import java.util.Scanner;

public class TwoLegFlight extends OneLegFlight implements Comparable<Flight>{
	DateTime TwoDepTime;
	DateTime TwoArrvTime;
	public String TwoDestCty;
	int secondTimeZoneDifference;
	int result21,result22,result222;
	Scanner scan = new Scanner(System.in);
	TwoLegFlight(){
		super();
		
		System.out.println("Enter the second Departure Time;");
		TwoDepTime=new DateTime();
		System.out.println("Enter the second Arrival Time;");
		TwoArrvTime=new DateTime();
		System.out.println("Enter the second Destination City:");
		TwoDestCty=scan.nextLine();
		System.out.println("Enter the Second Time Zone Difference:");
		secondTimeZoneDifference=scan.nextInt();
		scan.nextLine();
	}
	
	@Override
	public String DispToCity() {
		return String.format("From %s to %s", super.GetOrgnCty(),TwoDestCty);
	}
	public String RealDestCty() {
		return TwoDestCty;
	}
	
	@Override
	public void DispFlightInfo() {
		System.out.printf("Flight (no: %d) %s departs at %s and lands at\n%s ",GetterForFlightNo(),DispToCity(),departureTime.GetTimeToStrng(),TwoArrvTime.GetTimeToStrng());
		calculateDuration();
		//System.out.println("Flight (no:"+GetterForFlightNo()+")"+ DispToCity()+ "departs at "+departureTime.GetTimeToStrng()+" and lands at "+TwoArrvTime.GetTimeToStrng());
	}
	@Override
	public void calculateDuration() {
		if(departureTime.day==arrivalTime.day) {
			result11=arrivalTime.hour-departureTime.hour+timeZoneDifference;
			//System.out.println("with duration of "+result11+" hour(s)");
		}
		else if(departureTime.day<arrivalTime.day) {
			int m = 24*departureTime.day;
			int n = 24*arrivalTime.day;
			result12=n-m+timeZoneDifference;
			//System.out.println("with duration of "+result12+" hour(s)");
		}
		else {
			System.out.println("warning !! ");
		}
		if(TwoDepTime.day==TwoArrvTime.day) {
			result21=TwoArrvTime.hour-TwoDepTime.hour+secondTimeZoneDifference+result11;
			System.out.println("with duration of "+result21+" hour(s)");
		}
		else if(TwoDepTime.day<TwoArrvTime.day) {
			int m = 24*TwoDepTime.day;
			int n = 24*TwoArrvTime.day;
			result22=n-m+secondTimeZoneDifference+result12;
			System.out.println("with duration of "+result22+" hour(s)");
		}
		else {
			System.out.println("warning !! ");
		}
	}
	
}
