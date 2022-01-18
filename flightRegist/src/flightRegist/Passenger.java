package cse212_assignment7;

import java.util.Scanner;

public abstract class Passenger extends Person{
	String name;
	String surname;
	double miles;//km
	double mileRate;//[$/km]
	double memberYears;
	public Passenger() {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Your Name:");
		//name=scan.nextLine();
		//System.out.println("Your Surname:");
		//surname=scan.nextLine();
	}
	public String getterforName() {
		return name;
	}
	public String getterforSurName() {
		return surname;
	}
	public long getterID() {
		return ID;
	}
	public String getterpassword() {
		return password;
	}

}
