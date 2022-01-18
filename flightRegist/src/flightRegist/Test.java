package cse212_assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Flight[] flightArray = new Flight[10];
		//Ticket[] ticketArray = new Ticket[10];
		//CheckIn[] checkInArray = new CheckIn[10];
		int indexflight=0;
		int indexticket=0;
		int indexcheckin=0;
		
		ArrayList<Flight> al = new ArrayList<Flight>();
		int alsize=0;
		ArrayList<Expense> expensee = new ArrayList<Expense>();
		//Expense[] expensee = new Expense[20];
		int indexexp=0;
		double flightDistanceTOTAL=0;//km
		double distanceRateTOTAL=0;//[$/km]
		double flightPriceTOTAL=0;//$
		int sum1=0,sum2=0,sum3=0,sum4=0,sum5=0;
		
		int[] cont=new int[10];
		int indexcont=0;
		
		while(true) {
			int i;
			int adminn=0;
			int checkýncounterr=0;
			int passengerr=0;
			for(MainMenu m: MainMenu.values()) {
				System.out.println(m.getDescr());
			}
			
			/*for(Menu m : Menu.values()) {
				System.out.println(m.getDescr());
			}*/
			int brkSelect=0;
			System.out.print("Your choice: ");
			int ii = scan.nextInt();
			//i = scan.nextInt();
			i=0;
			
			if(MainMenu.M1.getSecim()==ii) {
				System.out.printf("\n");
				for(SubMenuStaff nnn2 : SubMenuStaff.values()) {
					System.out.println(nnn2.getDsc());
				}
				System.out.print("Your choice: ");
				int zi2=scan.nextInt();
				System.out.printf("\n");
				if(SubMenuStaff.AddAdmin.getSecm()==zi2) {
					//yazcan
					Admin Admin1 = new Admin();
					expensee.add(Admin1);
					expensee.set(indexexp, Admin1);
					//expensee[indexexp]=Admin1;
					indexexp++;
				}
				else if(SubMenuStaff.AddCheckinCounter.getSecm()==zi2) {
					//yazcan..
					CheckInCounter CheckInCounter1 = new CheckInCounter();
					expensee.add(CheckInCounter1);
					expensee.set(indexexp, CheckInCounter1);
					//expensee[indexexp]=CheckInCounter1;
					indexexp++;
				}
			} 
			if(MainMenu.M2.getSecim()==ii) {
				System.out.printf("\n");
				for(SubMenuPassenger nnn1 : SubMenuPassenger.values()) {
					System.out.println(nnn1.getDsc());
				}
				System.out.print("Your choice: ");
				int zi1=scan.nextInt();
				System.out.printf("\n");
				if(SubMenuPassenger.AddClassicPassenger.getSecm()==zi1) {
					//yazcaksýn
					Classic Classic1 =new Classic();
					expensee.add(Classic1);
					expensee.set(indexexp, Classic1);
					//expensee[indexexp]=Classic1;
					indexexp++;
					
				}
				else if(SubMenuPassenger.AddElitePassenger.getSecm()==zi1) {
					//yazcan
					Elite Elite1 = new Elite();
					expensee.add(Elite1);
					expensee.set(indexexp, Elite1);
					//expensee[indexexp]=Elite1;
					indexexp++;
				}
				else if(SubMenuPassenger.AddElitePlusPassenger.getSecm()==zi1) {
					//yazcan
					ElitePlus ElitePlus1 = new ElitePlus();
					expensee.add(ElitePlus1);
					expensee.set(indexexp, ElitePlus1);
					//expensee[indexexp]=ElitePlus1;
					indexexp++;
				}
			}
			if(MainMenu.M3.getSecim()==ii) {
				long id;
				String pw;
				System.out.println("Enter Id:");
				id=scan.nextLong();
				System.out.println("Enter Password:");
				pw=scan.next();
				for(Expense e:expensee) {
					if(e instanceof Admin) {
						Admin ad=(Admin) e;
						if(ad.getterID()==id && ad.getterpassword().contentEquals(pw)) {
							adminn++;
						}
					}
				}
				for(Expense e:expensee) {
					if(e instanceof CheckInCounter) {
						CheckInCounter cýc=(CheckInCounter) e;
						if(cýc.getterID()==id && cýc.getterpassword().contentEquals(pw)) {
							checkýncounterr++;
						}
					}
				}
			}
			if(MainMenu.M4.getSecim()==ii) {
				long id;
				String pw;
				System.out.println("Enter Id:");
				id=scan.nextLong();
				System.out.println("Enter Password:");
				pw=scan.next();
				for(Expense e:expensee) {
					if(e instanceof Passenger) {
						Passenger psg=(Passenger) e;
						if(psg.getterID()==id && psg.getterpassword().contentEquals(pw)) {
							passengerr++;
						}
					}
				}
			}
			if(MainMenu.M5.getSecim()==ii) {
				break;
			}
			if(adminn!=0) {
				while(true) {
					
					int iiA;
					for(AdminMenu m: AdminMenu.values()) {
						System.out.println(m.getDescr());
					}
					System.out.print("Your choice: ");
					iiA = scan.nextInt();
					
					if(AdminMenu.M1.getSecim()==iiA) {
						System.out.printf("\n");
						for(SubMenu nnn : SubMenu.values()) {
							System.out.println(nnn.getDsc());
						}
						System.out.print("Your choice: ");
						int zi=scan.nextInt();
						System.out.printf("\n");
						if(SubMenu.OneLegFlight.getSecm()==zi) {
							//flightArray[indexflight]=new OneLegFlight();
							OneLegFlight OneLegFlight1 = new OneLegFlight();
							expensee.add(OneLegFlight1);
							expensee.set(indexexp, OneLegFlight1);
							//expensee[indexexp]=OneLegFlight1;
							indexexp++;
							al.add(OneLegFlight1);
							al.set(alsize, OneLegFlight1);
							alsize++;
							indexflight++;
							flightDistanceTOTAL+=OneLegFlight1.flightDistance1;
							distanceRateTOTAL+=OneLegFlight1.distanceRate1;
							flightPriceTOTAL+=OneLegFlight1.flightPrice;
						}
						else if(SubMenu.TwoLegFlight.getSecm()==zi) {
							//flightArray[indexflight]=new TwoLegFlight();
							TwoLegFlight TwoLegFlight1 = new TwoLegFlight();
							expensee.add(TwoLegFlight1);
							expensee.set(indexexp, TwoLegFlight1);
							//expensee[indexexp]=TwoLegFlight1;
							indexexp++;
							al.add(TwoLegFlight1);
							al.set(alsize, TwoLegFlight1);
							alsize++;
							indexflight++;
							flightDistanceTOTAL+=TwoLegFlight1.flightDistance1;
							distanceRateTOTAL+=TwoLegFlight1.distanceRate1;
							flightPriceTOTAL+=TwoLegFlight1.flightPrice;
						}
						else if(SubMenu.ThreeLegFlight.getSecm()==zi) {
							//flightArray[indexflight]=new ThreeLegFlight();
							ThreeLegFlight ThreeLegFlight1 = new ThreeLegFlight();
							expensee.add(ThreeLegFlight1);
							expensee.set(indexexp, ThreeLegFlight1);
							//expensee[indexexp]=ThreeLegFlight1;
							indexexp++;
							al.add(ThreeLegFlight1);
							al.set(alsize, ThreeLegFlight1);
							alsize++;
							indexflight++;
							flightDistanceTOTAL+=ThreeLegFlight1.flightDistance1;
							distanceRateTOTAL+=ThreeLegFlight1.distanceRate1;
							flightPriceTOTAL+=ThreeLegFlight1.flightPrice;
						}
					}
					if(AdminMenu.M2.getSecim()==iiA) {
						int checkflightno1;
						int op1=0;
						/*System.out.println("Enter the Flight No:");
						checkflightno1=scan.nextInt();*/
						
						Collections.sort(al);
						for(Flight st:al) {
							st.DispFlightInfo();
							op1++;
						}
						if(op1==0)
							System.out.println("No such flight is found!");
						else
							op1=0;
					}
					if(AdminMenu.M3.getSecim()==iiA) {
						int flgNu;
						System.out.println("Enter flightNo: ");
						flgNu=scan.nextInt();
						for(Expense e:expensee) {
							if(e instanceof CheckIn) {
								CheckIn chckkin=(CheckIn) e;
								if(chckkin.GetterForValid()==true && chckkin.ticket.flight.GetterForFlightNo()==flgNu) {
									chckkin.sumweight+=chckkin.weightOfLuggage;
									chckkin.sumweight+=80;
									if(chckkin.getterSumWeight()>chckkin.ticket.flight.getterMaxLoadOfPlane()) {
										System.out.println("Plane cannot take off");
									}
									else
										System.out.println("Plane can take off. ("+chckkin.getterSumWeight() +" <= " + chckkin.ticket.flight.getterMaxLoadOfPlane()+")");
									
								}
							}
						}
						
						
						
						
						
					
					}
					if(AdminMenu.M4.getSecim()==iiA) {
						for(Expense e:expensee) {
							if(e instanceof Admin) {
								Admin Admin1=(Admin) e;
								sum1=Admin1.computeExpense();
							}
						}
						for(Expense e:expensee) {
							if(e instanceof CheckInCounter) {
								CheckInCounter CheckInCounter1=(CheckInCounter) e;
								sum2=CheckInCounter1.computeExpense();
							}
						}
						for(Expense e:expensee) {
							if(e instanceof Classic) {
								Classic Classic1=(Classic) e;
								sum3=Classic1.computeExpense();
							}
						}
						for(Expense e:expensee) {
							if(e instanceof Elite) {
								Elite Elite1=(Elite) e;
								sum4=Elite1.computeExpense();
							}
						}
						for(Expense e:expensee) {
							if(e instanceof ElitePlus) {
								ElitePlus ElitePlus1=(ElitePlus) e;
								sum5=ElitePlus1.computeExpense();
							}
						}
						for(Expense e:expensee) {
							if(e instanceof Flight) {
								Flight flght1 =(Flight) e;
								//System.out.println("Total Expenses: "+((flght1.flightPrice)-(flght1.flightDistance*flght1.distanceRate)));
								System.out.println("Total Expenses: "+((sum1+sum2+sum3+sum4+sum5)+(flightPriceTOTAL-(flightDistanceTOTAL*distanceRateTOTAL))));
								
							}
						}
					}
					if(AdminMenu.M5.getSecim()==iiA) {
						break;
					}
					if(AdminMenu.M6.getSecim()==iiA) {
						//brkSelect=1;
						break;
					}
					
					
				}
				adminn=0;
			}
			if(checkýncounterr!=0) {
				while(true) {
					int iiC;
					for(CheckInCounterMenu m: CheckInCounterMenu.values()) {
						System.out.println(m.getDescr());
					}
					System.out.print("Your choice: ");
					iiC = scan.nextInt();
					
					if(CheckInCounterMenu.M1.getSecim()==iiC) {
						int checkflightno1;
						int op1=0;
						/*System.out.println("Enter the Flight No:");
						checkflightno1=scan.nextInt();*/
						
						Collections.sort(al);
						for(Flight st:al) {
							st.DispFlightInfo();
							op1++;
						}
						if(op1==0)
							System.out.println("No such flight is found!");
						else
							op1=0;
					}
					if(CheckInCounterMenu.M2.getSecim()==iiC) {
						int TCkEtNo;
						System.out.print("Enter ticket no: ");
						TCkEtNo = scan.nextInt();
						
						
						for(Expense e:expensee) {
							if(e instanceof CheckIn) {
								CheckIn Chckin1 = (CheckIn) e;
								if(Chckin1.ticket.getterforTicketno()==TCkEtNo) {
									if((Chckin1.ticket.flight.departureTime.hour)<(Chckin1.checkInTime.hour)) {
										System.out.println("Check is declined!!");
									}
									
									if((Chckin1.ticket.flight.departureTime.hour)==(Chckin1.checkInTime.hour)) {
							
										if(((Chckin1.ticket.flight.departureTime.minute)-(Chckin1.checkInTime.minute))<30) {
											System.out.println("Check is declined!!");
										}
										else
											Chckin1.SetterValid();
									}
									
									if((Chckin1.ticket.flight.departureTime.hour)>(Chckin1.checkInTime.hour)) {
										if(((Chckin1.ticket.flight.departureTime.minute)==0) && (Chckin1.checkInTime.minute)>30) {
											System.out.println("Check is declined!!");
										}
										else if(((Chckin1.ticket.flight.departureTime.minute)==0) && (Chckin1.checkInTime.minute)<=30) {
											Chckin1.SetterValid();
										}
										else if(((Chckin1.ticket.flight.departureTime.minute)>=29)) {
											Chckin1.SetterValid();
										}
										else if(((Chckin1.ticket.flight.departureTime.minute)!=0) && ((Chckin1.ticket.flight.departureTime.minute)<29)) {
											if((((Chckin1.ticket.flight.departureTime.minute)+60)-(Chckin1.checkInTime.minute))<30) {
												System.out.println("Check is declined!!");
											}
											else
												Chckin1.SetterValid();
										}
										
									}
									
									
								}
							}
						}
						
						
						
					
					}
					if(CheckInCounterMenu.M3.getSecim()==iiC) {
						for(Expense e:expensee) {
							if(e instanceof CheckIn) {
								CheckIn chckkin=(CheckIn) e;
								if(chckkin.GetterForValid()==true) {
									chckkin.CheckInDisp();
									System.out.printf("\n");
								}
							}
						}
					}
					if(CheckInCounterMenu.M4.getSecim()==iiC) {
						break;
					}
					if(CheckInCounterMenu.M5.getSecim()==iiC) {
						break;
					}
					
				}
				checkýncounterr=0;
				
				
			}
			if(passengerr!=0) {
				while(true) {
					int iiP;
					for(PassengerMenu m: PassengerMenu.values()) {
						System.out.println(m.getDescr());
					}
					System.out.print("Your choice: ");
					iiP = scan.nextInt();
					
					if(PassengerMenu.M1.getSecim()==iiP) {
						int checkflightno1;
						int op1=0;
						/*System.out.println("Enter the Flight No:");
						checkflightno1=scan.nextInt();*/
						
						Collections.sort(al);
						for(Flight st:al) {
							st.DispFlightInfo();
							op1++;
						}
						if(op1==0)
							System.out.println("No such flight is found!");
						else
							op1=0;
					}
					if(PassengerMenu.M2.getSecim()==iiP) {
						int checkflightno;
						int op=0;
						System.out.println("Enter the Flight No:");
						checkflightno=scan.nextInt();
						
						for(Expense e:expensee) {
							if(e instanceof Flight) {
								Flight flghtt=(Flight)e;
								if(flghtt.GetterForFlightNo()==checkflightno) {
									Ticket Ticket1 = new Ticket(indexticket+1,flghtt);
									expensee.add(Ticket1);
									expensee.set(indexexp, Ticket1);
									//expensee[indexexp]=Ticket1;
									indexexp++;
									indexticket++;
									op++;
								}
							}
						}
						
						if(op==0)
							System.out.println("No such flight is found!");
						else
							op=0;
					}
					if(PassengerMenu.M3.getSecim()==iiP) {
						int aaa=0;
						int b=0;
						int checkticketnoo;
						int op1=0;
						System.out.println("Enter your ticket no:");
						checkticketnoo=scan.nextInt();
						
						for(int mur=0;mur<indexcont;mur++) {
							if(cont[mur]==checkticketnoo) {
								System.out.println("Check is declined!!");
								aaa++;
								break;
							}
						}
						
						if(aaa==0) {
							for(Expense e:expensee) {
								if(e instanceof Ticket) {
									Ticket tcktt=(Ticket) e;
									if(tcktt.getterforTicketno()==checkticketnoo) {
										CheckIn CheckIn1 = new CheckIn(tcktt);
										expensee.add(CheckIn1);
										expensee.set(indexexp, CheckIn1);
										//expensee[indexexp]=CheckIn1;
										indexexp++;
										op1++;
										b++;
									}
								}
							} 
							
							if(op1==0)
								System.out.println("No such ticket!");
						}
						if(aaa==0 && b!=0) {
							cont[indexcont]=checkticketnoo;
							indexcont++;
							b=0;
						}
					}
					if(PassengerMenu.M4.getSecim()==iiP) {
						break;
					}
					if(PassengerMenu.M5.getSecim()==iiP) {
						break;
					}
					
				}
				passengerr=0;
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			if(Menu.M9.getSecim()==i) {// 9
				System.out.printf("\n");
				for(SubMenuPassenger nnn1 : SubMenuPassenger.values()) {
					System.out.println(nnn1.getDsc());
				}
				System.out.print("Your choice: ");
				int zi1=scan.nextInt();
				System.out.printf("\n");
				if(SubMenuPassenger.AddClassicPassenger.getSecm()==zi1) {
					//yazcaksýn
					Classic Classic1 =new Classic();
					expensee.add(Classic1);
					expensee.set(indexexp, Classic1);
					//expensee[indexexp]=Classic1;
					indexexp++;
					
				}
				else if(SubMenuPassenger.AddElitePassenger.getSecm()==zi1) {
					//yazcan
					Elite Elite1 = new Elite();
					expensee.add(Elite1);
					expensee.set(indexexp, Elite1);
					//expensee[indexexp]=Elite1;
					indexexp++;
				}
				else if(SubMenuPassenger.AddElitePlusPassenger.getSecm()==zi1) {
					//yazcan
					ElitePlus ElitePlus1 = new ElitePlus();
					expensee.add(ElitePlus1);
					expensee.set(indexexp, ElitePlus1);
					//expensee[indexexp]=ElitePlus1;
					indexexp++;
				}
			}
			if(Menu.M8.getSecim()==i) {// 8
				System.out.printf("\n");
				for(SubMenuStaff nnn2 : SubMenuStaff.values()) {
					System.out.println(nnn2.getDsc());
				}
				System.out.print("Your choice: ");
				int zi2=scan.nextInt();
				System.out.printf("\n");
				if(SubMenuStaff.AddAdmin.getSecm()==zi2) {
					//yazcan
					Admin Admin1 = new Admin();
					expensee.add(Admin1);
					expensee.set(indexexp, Admin1);
					//expensee[indexexp]=Admin1;
					indexexp++;
				}
				else if(SubMenuStaff.AddCheckinCounter.getSecm()==zi2) {
					//yazcan..
					CheckInCounter CheckInCounter1 = new CheckInCounter();
					expensee.add(CheckInCounter1);
					expensee.set(indexexp, CheckInCounter1);
					//expensee[indexexp]=CheckInCounter1;
					indexexp++;
				}
			}
			if(Menu.M10.getSecim()==i) {// 10
				//yazcan..
				
				
				for(Expense e:expensee) {
					if(e instanceof Admin) {
						Admin Admin1=(Admin) e;
						sum1=Admin1.computeExpense();
					}
				}
				for(Expense e:expensee) {
					if(e instanceof CheckInCounter) {
						CheckInCounter CheckInCounter1=(CheckInCounter) e;
						sum2=CheckInCounter1.computeExpense();
					}
				}
				for(Expense e:expensee) {
					if(e instanceof Classic) {
						Classic Classic1=(Classic) e;
						sum3=Classic1.computeExpense();
					}
				}
				for(Expense e:expensee) {
					if(e instanceof Elite) {
						Elite Elite1=(Elite) e;
						sum4=Elite1.computeExpense();
					}
				}
				for(Expense e:expensee) {
					if(e instanceof ElitePlus) {
						ElitePlus ElitePlus1=(ElitePlus) e;
						sum5=ElitePlus1.computeExpense();
					}
				}
				for(Expense e:expensee) {
					if(e instanceof Flight) {
						Flight flght1 =(Flight) e;
						//System.out.println("Total Expenses: "+((flght1.flightPrice)-(flght1.flightDistance*flght1.distanceRate)));
						System.out.println("Total Expenses: "+((sum1+sum2+sum3+sum4+sum5)+(flightPriceTOTAL-(flightDistanceTOTAL*distanceRateTOTAL))));
						
					}
				}
				
			} 
			if(Menu.M11.getSecim()==i) { // 11
				break;
			}
			
			if(Menu.M1.getSecim()==i) { // 1
				System.out.printf("\n");
				for(SubMenu nnn : SubMenu.values()) {
					System.out.println(nnn.getDsc());
				}
				System.out.print("Your choice: ");
				int zi=scan.nextInt();
				System.out.printf("\n");
				if(SubMenu.OneLegFlight.getSecm()==zi) {
					//flightArray[indexflight]=new OneLegFlight();
					OneLegFlight OneLegFlight1 = new OneLegFlight();
					expensee.add(OneLegFlight1);
					expensee.set(indexexp, OneLegFlight1);
					//expensee[indexexp]=OneLegFlight1;
					indexexp++;
					al.add(OneLegFlight1);
					al.set(alsize, OneLegFlight1);
					alsize++;
					indexflight++;
					flightDistanceTOTAL+=OneLegFlight1.flightDistance1;
					distanceRateTOTAL+=OneLegFlight1.distanceRate1;
					flightPriceTOTAL+=OneLegFlight1.flightPrice;
				}
				else if(SubMenu.TwoLegFlight.getSecm()==zi) {
					//flightArray[indexflight]=new TwoLegFlight();
					TwoLegFlight TwoLegFlight1 = new TwoLegFlight();
					expensee.add(TwoLegFlight1);
					expensee.set(indexexp, TwoLegFlight1);
					//expensee[indexexp]=TwoLegFlight1;
					indexexp++;
					al.add(TwoLegFlight1);
					al.set(alsize, TwoLegFlight1);
					alsize++;
					indexflight++;
					flightDistanceTOTAL+=TwoLegFlight1.flightDistance1;
					distanceRateTOTAL+=TwoLegFlight1.distanceRate1;
					flightPriceTOTAL+=TwoLegFlight1.flightPrice;
				}
				else if(SubMenu.ThreeLegFlight.getSecm()==zi) {
					//flightArray[indexflight]=new ThreeLegFlight();
					ThreeLegFlight ThreeLegFlight1 = new ThreeLegFlight();
					expensee.add(ThreeLegFlight1);
					expensee.set(indexexp, ThreeLegFlight1);
					//expensee[indexexp]=ThreeLegFlight1;
					indexexp++;
					al.add(ThreeLegFlight1);
					al.set(alsize, ThreeLegFlight1);
					alsize++;
					indexflight++;
					flightDistanceTOTAL+=ThreeLegFlight1.flightDistance1;
					distanceRateTOTAL+=ThreeLegFlight1.distanceRate1;
					flightPriceTOTAL+=ThreeLegFlight1.flightPrice;
				}
				
			}
			if(Menu.M2.getSecim()==i) {// 2
				
				int checkflightno;
				int op=0;
				System.out.println("Enter the Flight No:");
				checkflightno=scan.nextInt();
				
				for(Expense e:expensee) {
					if(e instanceof Flight) {
						Flight flghtt=(Flight)e;
						if(flghtt.GetterForFlightNo()==checkflightno) {
							Ticket Ticket1 = new Ticket(indexticket+1,flghtt);
							expensee.add(Ticket1);
							expensee.set(indexexp, Ticket1);
							//expensee[indexexp]=Ticket1;
							indexexp++;
							indexticket++;
							op++;
						}
					}
				}
				
				if(op==0)
					System.out.println("No such flight is found!");
				else
					op=0;
				
			}
			if(Menu.M3.getSecim()==i) {// 3
				
				int checkflightno1;
				int op1=0;
				/*System.out.println("Enter the Flight No:");
				checkflightno1=scan.nextInt();*/
				
				Collections.sort(al);
				for(Flight st:al) {
					st.DispFlightInfo();
					op1++;
				}
				if(op1==0)
					System.out.println("No such flight is found!");
				else
					op1=0;
				
				/*for(Expense e:expensee) {
					if(e instanceof Flight) {
						Flight flghttt = (Flight) e;
						if(flghttt.GetterForFlightNo()==checkflightno1 ) {
							flghttt.DispFlightInfo();
							op1++;
						}
					}
				}
				
				if(op1==0)
					System.out.println("No such flight is found!");
				else
					op1=0;*/
				
			}
			if(Menu.M4.getSecim()==i) {// 4
				
				int aaa=0;
				int b=0;
				int checkticketnoo;
				int op1=0;
				System.out.println("Enter your ticket no:");
				checkticketnoo=scan.nextInt();
				
				for(int mur=0;mur<indexcont;mur++) {
					if(cont[mur]==checkticketnoo) {
						System.out.println("Check is declined!!");
						aaa++;
						break;
					}
				}
				
				if(aaa==0) {
					for(Expense e:expensee) {
						if(e instanceof Ticket) {
							Ticket tcktt=(Ticket) e;
							if(tcktt.getterforTicketno()==checkticketnoo) {
								CheckIn CheckIn1 = new CheckIn(tcktt);
								expensee.add(CheckIn1);
								expensee.set(indexexp, CheckIn1);
								//expensee[indexexp]=CheckIn1;
								indexexp++;
								op1++;
								b++;
							}
						}
					}
					
					if(op1==0)
						System.out.println("No such ticket!");
				}
				if(aaa==0 && b!=0) {
					cont[indexcont]=checkticketnoo;
					indexcont++;
					b=0;
				}
			}
			
			if(Menu.M5.getSecim()==i) {// 5
				
				int TCkEtNo;
				System.out.print("Enter ticket no: ");
				TCkEtNo = scan.nextInt();
				
				
				for(Expense e:expensee) {
					if(e instanceof CheckIn) {
						CheckIn Chckin1 = (CheckIn) e;
						if(Chckin1.ticket.getterforTicketno()==TCkEtNo) {
							if((Chckin1.ticket.flight.departureTime.hour)<(Chckin1.checkInTime.hour)) {
								System.out.println("Check is declined!!");
							}
							
							if((Chckin1.ticket.flight.departureTime.hour)==(Chckin1.checkInTime.hour)) {
					
								if(((Chckin1.ticket.flight.departureTime.minute)-(Chckin1.checkInTime.minute))<30) {
									System.out.println("Check is declined!!");
								}
								else
									Chckin1.SetterValid();
							}
							
							if((Chckin1.ticket.flight.departureTime.hour)>(Chckin1.checkInTime.hour)) {
								if(((Chckin1.ticket.flight.departureTime.minute)==0) && (Chckin1.checkInTime.minute)>30) {
									System.out.println("Check is declined!!");
								}
								else if(((Chckin1.ticket.flight.departureTime.minute)==0) && (Chckin1.checkInTime.minute)<=30) {
									Chckin1.SetterValid();
								}
								else if(((Chckin1.ticket.flight.departureTime.minute)>=29)) {
									Chckin1.SetterValid();
								}
								else if(((Chckin1.ticket.flight.departureTime.minute)!=0) && ((Chckin1.ticket.flight.departureTime.minute)<29)) {
									if((((Chckin1.ticket.flight.departureTime.minute)+60)-(Chckin1.checkInTime.minute))<30) {
										System.out.println("Check is declined!!");
									}
									else
										Chckin1.SetterValid();
								}
								
							}
							
							
						}
					}
				}
				
				
				
			}
			if(Menu.M6.getSecim()==i) {// 6
				
				for(Expense e:expensee) {
					if(e instanceof CheckIn) {
						CheckIn chckkin=(CheckIn) e;
						if(chckkin.GetterForValid()==true) {
							chckkin.CheckInDisp();
							System.out.printf("\n");
						}
					}
				}
				
				
			}
			
			if(Menu.M7.getSecim()==i) {// 7
				
				int flgNu;
				System.out.println("Enter flightNo: ");
				flgNu=scan.nextInt();
				for(Expense e:expensee) {
					if(e instanceof CheckIn) {
						CheckIn chckkin=(CheckIn) e;
						if(chckkin.GetterForValid()==true && chckkin.ticket.flight.GetterForFlightNo()==flgNu) {
							chckkin.sumweight+=chckkin.weightOfLuggage;
							chckkin.sumweight+=80;
							if(chckkin.getterSumWeight()>chckkin.ticket.flight.getterMaxLoadOfPlane()) {
								System.out.println("Plane cannot take off");
							}
							else
								System.out.println("Plane can take off. ("+chckkin.getterSumWeight() +" <= " + chckkin.ticket.flight.getterMaxLoadOfPlane()+")");
							
						}
					}
				}
				
				
				
				
				
			}
			
			
			
			
		}
		
		
		
	}
	

}
