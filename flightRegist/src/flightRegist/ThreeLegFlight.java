package cse212_assignment7;

import java.util.Scanner;

public class ThreeLegFlight extends TwoLegFlight implements Comparable<Flight>{
	DateTime ThreeDepTime;
	DateTime ThreeArrvTime;
	public String ThreeDestCty;
	int thirdTimeZoneDifference;
	int result31,result32,result322;
	Scanner scan = new Scanner(System.in);
	ThreeLegFlight(){
		super();
		System.out.println("Enter the Third Departure Time;");
		ThreeDepTime=new DateTime();
		System.out.println("Enter the Third Arrival Time;");
		ThreeArrvTime=new DateTime();
		System.out.println("Enter the Third Destination City:");
		ThreeDestCty=scan.nextLine();
		System.out.println("Enter the Third Time Zone Difference:");
		thirdTimeZoneDifference=scan.nextInt();
		scan.nextLine();
	}
	 
	@Override
	public String DispToCity() {
		return String.format("From %s to %s", super.GetOrgnCty(),ThreeDestCty);
	}
	@Override
	public String RealDestCty() {
		return ThreeDestCty;
	}
	
	@Override
	public void DispFlightInfo() {
		System.out.printf("Flight (no: %d) %s departs at %s and lands at\n%s ",GetterForFlightNo(),DispToCity(),departureTime.GetTimeToStrng(),ThreeArrvTime.GetTimeToStrng());
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
			//System.out.println("with duration of "+result21+" hour(s)");
		}
		else if(TwoDepTime.day<TwoArrvTime.day) {
			int m = 24*TwoDepTime.day;
			int n = 24*TwoArrvTime.day;
			result22=n-m+secondTimeZoneDifference+result12;
			//System.out.println("with duration of "+result22+" hour(s)");
		}
		else {
			System.out.println("warning !! ");
		}
		if(ThreeDepTime.day==ThreeArrvTime.day) {
			result31=ThreeArrvTime.hour-ThreeDepTime.hour+thirdTimeZoneDifference+result21;
			System.out.println("with duration of "+result31+" hour(s)");
		}
		else if(ThreeDepTime.day<ThreeArrvTime.day) {
			int m = 24*ThreeDepTime.day;
			int n = 24*ThreeArrvTime.day;
			result32=n-m+thirdTimeZoneDifference+result22;
			System.out.println("with duration of "+result32+" hour(s)");
		}
		else {
			System.out.println("warning !! ");
		}
	}
}
