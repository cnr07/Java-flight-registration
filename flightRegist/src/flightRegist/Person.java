package cse212_assignment7;

import java.util.Scanner;

public abstract class Person implements Expense{
	String name,surname;
	long ID;
	String password;
	Scanner scan = new Scanner(System.in);
	Person(){
		System.out.println("Your Name:");
		name=scan.nextLine();
		System.out.println("Your Surname:");
		surname=scan.nextLine();
		authenticateID();
		System.out.println("Password:");
		password=scan.next();
		
	}
	public void authenticateID() {
		int repeat=1;
		long fakeidd;
		long kiyas=10000000000L;
		long[] tc = new long[11];
		
		while(true) {
			System.out.println("ID:");
			ID=scan.nextLong();
			try {
				if(ID-kiyas>=0) {// hatasýz için kollarý sývadým..
					fakeidd=ID;
					for(int a=10;a>=0;a--) {
						tc[a]=(fakeidd % 10);
						fakeidd = (fakeidd / 10);
					}
					if(tc[9]==(7*(tc[0]+tc[2]+tc[4]+tc[6]+tc[8])-(tc[1]+tc[3]+tc[5]+tc[7]))%10) {
						if(tc[10]==(tc[0]+tc[1]+tc[2]+tc[3]+tc[4]+tc[5]+tc[6]+tc[7]+tc[8]+tc[9])%10) {
							repeat=0;
							break;
						}
						else{
							
							throw new IDMismatchException(ID);
							
						}
					}
					else{
						
						throw new IDMismatchException(ID);
						
					}
					
				}
				
				else{
					
					throw new IDMismatchException(ID);
					
				}
				
						
			}
			catch(Exception IDMismatchException){
				System.err.println("exception handled");
			}
			
		}
		
		
		
		
		
	}
}
