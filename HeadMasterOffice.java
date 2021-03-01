package hw1;

public class HeadMasterOffice implements Rooms, Charc, Things {

	public String Roomname(){
		return "HeadMasterOffice";
		}
	
	public void enterRoom() {
		System.out.println("This room has a number of spindly tables upon which were set delicate looking silver instruments "
				+"that whirred and emitted small puffs of smoke,"
				+" as well as an incredible collection of books, a Pensieve, and Fawkes the phoenix.");
	}
	String quill;
	public void use(String Usething) {
		
		if(Usething.equals("portraits")) {
			System.out.println("Here's a portrait of a former headmaster, Phineus Nigellus Black. (also the great-great grandfather of Sirius Black)");
		}
		else if(Usething.equals("pensieve")) {
			System.out.println("It has the appearance of a shallow stone or metal basin, into which runes and strange symbols were carved and precious stones were fitted. "
					+ "It was filled with a silvery substance that appears to be a cloudy liquid/gas; "
					+"the collected memories of people who had siphoned their recollections into it.");
		}
		else {
			System.out.println("This item does not exist in this room");
		}
	}

	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Nice to meet you student! Have a look around the office. There are portraits," 
		+ " a pensieve and Fawkes the phoenix. I would advise you to not wake him up. ");
	}
	
	public boolean checkObj(String obj) {
		if(obj.equals("portraits") || obj.equals("pensieve"))
			return true;
		else
			return false;
	}

	public boolean checkChar(String charC) {
		// TODO Auto-generated method stub
		if(charC.equals("Dumbledore")) {
			//talk();
			return true;
		}
		else {
			System.out.println("This character is not present in the room");
			return false;
		}
	}
	int Ecount = 0;
	
	public void lookaround() {
		// TODO Auto-generated method stub
		System.out.println("The headmaster Professor Dumbledore is present at front. On to his right there is a portrait. Near that is a phoenix sleeping."
		+"There's a silver bowl on a stand on to the left filled with some sort of liquid. ");
	}
	
	@Override
	public void South() {
		// TODO Auto-generated method stub
		System.out.println("You left The Head Master's Office");
	}

	@Override
	public void East() {
		// TODO Auto-generated method stub
		if(Ecount == 0) {
		System.out.println("You have entered the Head Master's Office!");
		Ecount++;
		enterRoom();
		}
		else {
			System.out.println("You cannot walk through these walls!");
		}
	}
	public void North() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void West() {
		// TODO Auto-generated method stub
	}
}
