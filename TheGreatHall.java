package hw1;
import java.util.Random;

public class TheGreatHall implements Rooms, Charc, Things {
	public String Roomname(){
		return "TheGreatHall";
		}
	
	public void enterRoom() {
		System.out.println("The Entrance Hall was so big you could have fitted the whole of the Dursleys� house in\r\n"
				+ "it. The stone walls were lit with flaming torches like the ones at Gringotts, the ceiling was too high to make out,\r\n"
				+ "and a magnificent marble staircase facing them led to the upper floors.");
	}
	public void use(String Usething, String CurrentRoom) {
		if(CurrentRoom.equals("TheGreatHall")) {
		String[] hat = {"Slytherin","Gryffindor","Hufflepuf","Ravenclaw"};
		String[] food = {"bacon and steak", "beef casserole", "black pudding", "some kind of strange blancmange",
				"bouillabaisse", "Cornish pasties", "lamb chops", "pork chops", "roast beef", "roast chicken"};
		if(Usething.equals("sorting")) {
			Random ran= new Random();
			int i = ran.nextInt(3);
			System.out.println(hat[i]);
		}
		else if(Usething.equals("food")){
			System.out.println("Here's all that available to eat: \n");
			for(int i = 0;i<food.length;i++) {
				System.out.print(" "+ food[i] );
			}
		}
		}
		else {
			System.out.println("This item does not exist in this room");
		}
	}
	public boolean checkObj(String obj) {
		if(obj.equals("sorting")  || obj.equals("food"))
			return true;
		else
			return false;
	}
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Hogwarts\n"+"The start-of-term banquet will begin shortly, but before\r\n"
				+ "you take your seats in the Great Hall, interact with the sorting hat and you will be sorted into your houses."  );
	}
	

	public boolean checkChar(String charC) {
		// TODO Auto-generated method stub
		if(charC.equals("McGonagall")) {
			//talk();
			return true;
		}
		else {
			System.out.println("This character is not present in the room");
			return false;
		}
	}
	int Ncount = 0;
	public void North() {
		// TODO Auto-generated method stub
		if(Ncount == 0) {
		System.out.println("You have entered the Great Hall!");
		Ncount++;
		enterRoom();
		}
		else {
			System.out.println("You cannot walk through these walls!");
		}
		
	}
	
	public void lookaround() {
		// TODO Auto-generated method stub
		System.out.println("The staff table was at the front, where the entire Hogwarts staff sat. \n" 
				+" There was a throne-like chair in the centre of the table where the current Headmaster or Headmistress sat. \n"
				+ " To the right there was the Sorting Hat and to the left there was the Feast,\n" 
				+ " hundreds of plates are set on each of the four House tables and are filled with food magically appearing on the empty plates, \n" 
				+ " prepared by house-elves working in the kitchens below. \n");
	}
	
	@Override
	public void South() {
		// TODO Auto-generated method stub
		System.out.println("You left The Great Hall");
	}

	@Override
	public void East() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void West() {
		// TODO Auto-generated method stub
		
	}

	

}
