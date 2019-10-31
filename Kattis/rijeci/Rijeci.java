import java.util.Scanner;
class Rijeci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numA  = 1;
		int numB  = 0;
		int i = 0;
		int numPresses = sc.nextInt();
		for(; i < numPresses; i++){
			int temp = numA;
			 numA = numB;
			 numB = temp + numB;
		}
		System.out.println(numA + " " + numB);
	}
}
			
