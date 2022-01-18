package cse212_assignment7;

import java.util.Scanner;

public abstract class Staff extends Person{
	int Salary;//$
	Scanner scan = new Scanner(System.in);
	Staff(){
		super();
		System.out.println("Salary:");
		Salary=scan.nextInt();
		
	}

}
