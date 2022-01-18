package cse212_assignment7;

import java.util.Scanner;

public class DateTime {
	int day;
	int month;
	int year;
	int hour;
	int minute;
	public DateTime() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Year:");
		year=scan.nextInt();
		scan.nextLine();
		System.out.println("Month:");
		month=scan.nextInt();
		scan.nextLine();
		System.out.println("Day:");
		day=scan.nextInt();
		scan.nextLine();
		System.out.println("Hour:");
		hour=scan.nextInt();
		scan.nextLine();
		System.out.println("Minute:");
		minute=scan.nextInt();
		scan.nextLine();
	}
	public String GetTimeToStrng() {
		return String.format(" %02d/%02d/%02d %02d:%02d",day,month,year,hour,minute);
	}

}
