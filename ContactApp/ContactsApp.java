import java.util.Scanner;
import java.util.*
class ContactsApp{
	private static int numContacts = 0;
	private static String[] contacts = new String[10];
	private static Scanner kb = new Scanner(System.in);

	public static void main(String[] args){

		Scanner sc;
		try{
			sc = new Scanner(new FileInputStream("contacts.txt"));		
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			return;
		}
	
		while(sc.hasNext()){
			if(numContacts < 10){
				contacts[numContacts++] = sc.nextLine();
			}
		}

		sc.close();
	
		while(true){

			printMenu();
			System.out.println("Make a Selection 1-4");
			int selection = kb.nextInt();
			kb.nextLine();

			switch (selection){
				case 1:
					add();
					break;
				case 2:
					remove();
					break;
				case 3:
					printContacts();
					break;
				case 4:
					terminate();
					return;
			}	
		}


	}

	static void add() {
		System.out.println("Enter String");
		String name = kb.nextLine();

		for(int i = 0; i < numContacts; i++){
			if(contacts[i].equals(name)){
				System.out.println("Name already exists");
				return;
			}
		}

		try {
			contacts[numContacts++] = name;
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Database is full");
		}
	}

	static void remove(){
		System.out.println("Enter name");
		String name = kb.nextLine();

		for(int i = 0; i < numContacts; i++){
			if (contacts[i].equals(name)){
				for (int j = i; j < numContacts - 1; j++) {
					contacts[j] = contacts[j+1];
				}
				System.out.println("Name has been removed");
				numContacts --;
				return;
			}
		}
		System.out.println("Name not found");
	}

	static void printContacts(){
		System.out.println("Contacts");
		for(int i = 0; i < numContacts; i++){
			System.out.println(contacts[i]);
		}
	}

	static void printMenu(){
		System.out.println("1." + " " + "add");
		System.out.println("2." + " " + "remove");
		System.out.println("3." + " " + "print contacts");
		System.out.println("4." + " " + " exit");
	}

	static void terminate(){
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileOutputStream("contacts.txt")); 
		} catch (FileNotFoundException e){
			System.out.println("File not found");
			return;
		}

		for(int i = 0; i < numContacts; i++) {
			System.out.println("writing" + contacts[i]);
			pw.println(contacts[i]);
		}
		
		pw.close();
	}

}

