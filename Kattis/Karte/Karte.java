import java.util.Scanner;
class Karte{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		boolean[][] discovered = new boolean[4][13];
		String line = sc.nextLine();
		for(int i = 0; i < line.length(); i+=3){
				String s = line.substring(i,i+3);

				String suit = line.substring(0,1);

				String rank = line.substring(1,3);

				int col = Integer.valueOf(rank) - 1;

				int row = getRowNumber(suit.charAt(0));
		}
	}			
		

		static int getRowNumber(char c){
			char suits[]= {'P','H','T','K'};
				for(int i = 0; i < suits.length; i++){
					if(suits[i] == c){
						System.out.println("Greska");
						return i;
					}




					else{ discovered[][]=true;
					}

				
				}
		}
					
}	
		


		
				
				










