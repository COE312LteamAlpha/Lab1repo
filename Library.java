package hw1;

import java.util.Scanner;

public class Library implements Rooms, Charc, Things{
	public String Roomname(){
		return "Library";
		}
	
	public void enterRoom() {
		System.out.println("contained tens of thousands of books on thousands of shelves. Overseen by Madam Irma Pince,"
				+" the library was where students could go to peruse or borrow books to supplement their studies (or for personal enjoyment)"
				+"The library closed at 8:00 pm." + "Among the students is Hermione studying for exams which are months away. ");
	}
	String quill;
	public void use(String Usething) {
		
		if(Usething.equals("books")) {
			System.out.println("The books here include: many sections such as the Invisibility Section, a section with information about dragons," 
					+ " and a Restricted Section at the back, set off with a rope. A signed note from a teacher is required to peruse that section of the library; " 
					+ "it contains books of Dark Magic only used by older students studying advanced Defence Against the Dark Arts."
					+" One of the books in this section screams when opened ");
		}
		else if(Usething.equals("quill")) {
		System.out.println("Write your notes below: ");
		Scanner scan = new Scanner(System.in);
		quill = scan.nextLine();
		
		}
		else {
			System.out.println("This item does not exist in this room");
		}
	}

	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Do not disturb me right now, can't you see that I'm busy! \nGo and read some book from the shelves. ");
	}
	
	public boolean checkObj(String obj) {
		if(obj.equals("quill") || obj.equals("books"))
			return true;
		else
			return false;
	}
	public boolean checkChar(String charC) {
		// TODO Auto-generated method stub
		if(charC.equals("Hermione")) {
			//talk();
			return true;
		}
		else {
			System.out.println("This character is not present in the room");
			return false;
		}
	}
	int Wcount = 0;
	public void North() {
		// TODO Auto-generated method stub	
	}
	
	public void lookaround() {
		// TODO Auto-generated method stub
		System.out.println("The staff table was at the front, where the entire Hogwarts staff sat." 
				+" There was a throne-like chair in the centre of the table where the current Headmaster or Headmistress sat."
				+ " To the right there was the Sorting Hat and to the left there was the Feast," 
				+ " hundreds of plates are set on each of the four House tables and are filled with food magically appearing on the empty plates," 
				+ " prepared by house-elves working in the kitchens below.");
	}
	
	@Override
	public void South() {
		// TODO Auto-generated method stub
		System.out.println("You left The Library");
	}

	@Override
	public void East() {
		// TODO Auto-generated method stub
	}

	@Override
	public void West() {
		// TODO Auto-generated method stub
		if(Wcount == 0) {
		System.out.println("You have entered the Library!");
		Wcount++;
		enterRoom();
		}
		else {
			System.out.println("You cannot walk through these walls!");
		}
		
	}

}
