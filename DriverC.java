package hw1;

import java.util.Scanner;

public class DriverC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String currentR="Entrance";
		TheGreatHall TGH = new TheGreatHall();
		Library lib = new Library();
		HeadMasterOffice HMO = new HeadMasterOffice();
		
		System.out.println("Messrs Moony, Wormtail, Padfoot, and Prongs Purveyors of Aids to Magical Mischief-Makers "
				+ "are proud to present THE MARAUDER'S MAP!" + " Say thee magic phrase to reveal thus map! \n");
		String checker = scan.next();
		if(checker.equals("open")) { //change statement condition to this: I solemnly swear that I am up for no good 
			System.out.println("The map is now visible.\n" + "In this map contains the locations of three rooms: The Great Hall,"
					+" the Library and the Head Master's Office.\n" + "The door to the north leads you to the Great Hall."
					+"The door to the west leads you to the Library. And the door to the east leads you to the Head Master's Office. " );
			//int x= 0;}
			while(scan.nextLine() != null){
			
			String nav = scan.next();
			String nav1 = scan.next();
			switch(nav) {
			case "walk":
				//String nav1 = scan.next();
				if(nav1.equals("north") && currentR.equals("Entrance")) {
					TGH.North();
					currentR = TGH.Roomname();
				}
				else if(nav1.equals("west") && currentR.equals("Entrance")) {
					lib.West();
					currentR = lib.Roomname();
				}
				else if(nav1.equals("east") && currentR.equals("Entrance")) {
					HMO.East();
					currentR = HMO.Roomname();
				}
				else if((nav1.equals("north") || nav1.equals("east") || nav1.equals("west")) && !currentR.equals("Entrance")) {
					System.out.println("Can't walk through walls mate");
				}
				else if(nav1.equals("south") && !currentR.equals("Entrance")) {
					switch(currentR) {
					case "HeadMasterOffice":
						HMO.South();
						currentR = "Entrance";
						break;
					case "Library":
						lib.South();
						currentR = "Entrance";
						break;
					case "TheGreatHall":
						TGH.South();
						currentR = "Entrance";
						break;
					default:
							System.out.println("Go where eh?");
					}
				}
				break;
			case "talk":
				nav1 =  scan.next();
				switch(nav1) {
				case "McGonagall":
					if(currentR.equals(TGH.Roomname() )) {
						TGH.talk();
					}
					else if(currentR.equals(lib.Roomname())) {
						lib.talk();
					}
					else if(currentR.equals(HMO.Roomname())) {
						HMO.talk();
					}
					else {
						//System.out.println("This character is not present in the room");
					}
					break;
				case "Hermione":
					if(currentR.equals(TGH.Roomname() )) {
						TGH.talk();
					}
					else if(currentR.equals(lib.Roomname())) {
						lib.talk();
					}
					else if(currentR.equals(HMO.Roomname())) {
						HMO.talk();
					}
					else {
						//System.out.println("This character is not present in the room");
					}
					break;
				case "Dumbledore":
					if(currentR.equals(TGH.Roomname() )) {
						TGH.talk();
					}
					else if(currentR.equals(lib.Roomname())) {
						lib.talk();
					}
					else if(currentR.equals(HMO.Roomname())) {
						HMO.talk();
					}
					else {
						//System.out.println("This character is not present in the room");
					}
					break;
				default: 
					System.out.println("This character is currently unavailable, wait for the DLCs");
					break;
				}
				
			case "look":
				if(currentR.equals(TGH.Roomname())  ) {
					TGH.lookaround();
				}
				else if(currentR.equals(lib.Roomname())) {
					lib.lookaround();
				}
				else if(currentR.equals(HMO.Roomname())) {
					HMO.lookaround();
				}
				else {
					
				}
				break;
			case "use":
				//String obj=scan.next();
				if(TGH.checkObj(nav1)) {
					TGH.use(nav1);
				}
				else if(lib.checkObj(nav1)) {
					lib.use(nav1);
				}
				else if(HMO.checkObj(nav1)) {
					HMO.use(nav1);
				}
				else {
					System.out.println("This item does not currently exist. Please wait for the DLC. ");
				}
				break;
			default:
				System.out.println("Enter valid command: use, look around, talk or walk");
				}
			}
			
		}//if statement ends
		else {
			System.out.println("Enter valid command: use, look around, talk or walk " + checker);
		}
	}

}
