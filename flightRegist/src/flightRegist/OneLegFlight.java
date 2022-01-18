package cse212_assignment7;

import java.util.Locale;
import java.util.Scanner;

public class OneLegFlight extends Flight {
	DateTime OneDepTime;
	DateTime OneArrvTime;
	public String OneDestCty;
	int timeZoneDifference;
	int result11,result12;
	Scanner scan = new Scanner(System.in);
	double flightDistance1;//km
	double distanceRate1;//[$/km]
	int flightPrice1;//$
	
	OneLegFlight(){
		super();
		scan.useLocale(Locale.US);
		System.out.println("Enter the Time Zone Difference:");
		timeZoneDifference=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Flight Distance:");
		flightDistance1=scan.nextDouble();
		System.out.println("Enter the Distance Rate :");
		distanceRate1=scan.nextDouble();
		System.out.println("Enter the Flight Price:");
		flightPrice=scan.nextDouble();
	}
	@Override
	public String DispToCity() {
		return String.format("From %s to %s", super.GetOrgnCty(),super.getDestCty());
	}
	public String RealDestCty() {
		return OneDestCty;
	}
	
	@Override
	public void DispFlightInfo() {
		
		System.out.printf("Flight (no: %d) %s departs at %s and lands at\n%s ",GetterForFlightNo(),DispToCity(),departureTime.GetTimeToStrng(),arrivalTime.GetTimeToStrng());
		calculateDuration();
		//System.out.println("Flight (no:"+GetterForFlightNo()+")"+ DispToCity()+ "departs at "+departureTime.GetTimeToStrng()+" and lands at "+TwoArrvTime.GetTimeToStrng());
	} 
	
	@Override
	public void calculateDuration() {
		
		if(departureTime.day==arrivalTime.day) {
			result11=arrivalTime.hour-departureTime.hour+timeZoneDifference;
			System.out.println("with duration of "+result11+" hour(s)");
		}
		else if(departureTime.day<arrivalTime.day) {
			int m = 24*departureTime.day;
			int n = 24*arrivalTime.day;
			result12=n-m+timeZoneDifference;
			System.out.println("with duration of "+result12+" hour(s)");
		}
		else {
			System.out.println("warning !! ");
		}
	}
	@Override
	public int computeExpense() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getterforTicketno() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(Flight fg) {
		// TODO Auto-generated method stub
		if(departureTime.year==fg.departureTime.year&&departureTime.month==fg.departureTime.month&&departureTime.day==fg.departureTime.day&&departureTime.hour==fg.departureTime.hour&&departureTime.minute==fg.departureTime.minute) {
			return 0;
		}
		if(departureTime.year>fg.departureTime.year) {
			return 1;
		}
		if(departureTime.year==fg.departureTime.year&&departureTime.month>fg.departureTime.month) {
			return 1;
		}
		if(departureTime.year==fg.departureTime.year&&departureTime.month==fg.departureTime.month&&departureTime.day>fg.departureTime.day) {
			return 1;
		}
		if(departureTime.year==fg.departureTime.year&&departureTime.month==fg.departureTime.month&&departureTime.day==fg.departureTime.day&&departureTime.hour>fg.departureTime.hour) {
			return 1;
		}
		if(departureTime.year==fg.departureTime.year&&departureTime.month==fg.departureTime.month&&departureTime.day==fg.departureTime.day&&departureTime.hour==fg.departureTime.hour&&departureTime.minute>fg.departureTime.minute) {
			return 1;
		}
		else
			return -1;
		
		
	}

}
