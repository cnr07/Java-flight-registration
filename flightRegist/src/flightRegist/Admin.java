package cse212_assignment7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Admin extends Staff{
	int bonusSalary;//$
	Scanner scan = new Scanner(System.in);
	Admin(){
		super();
		System.out.println("Bonus Salary:");
		bonusSalary=scan.nextInt();
	}

	@Override
	public int computeExpense() {
		return Salary+bonusSalary;
		// TODO Auto-generated method stub
		
		
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
	public long getterID() {
		return ID;
	}
	public String getterpassword() {
		return password;
	}
	
	

}
