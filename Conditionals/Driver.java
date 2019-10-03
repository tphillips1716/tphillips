import java.util.Scanner;
class Driver{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int maxAge = sc.nextInt();
		int curAge = sc.nextInt();
		boolean process;
		if(curAge!=maxAge){
			process=true;
		}
		else {
			process=false;
		}
		System.out.println("Process:"+process);

		double average = sc.nextDouble();
		boolean pass;
		if(average>=65){
			pass=true;
		}
		else {
			pass=false;
		}
		System.out.println("Pass:"+pass);
		char letterGrade = sc.next().charAt(0);
		int points = letterGrade;
		System.out.println("Points:"+points);
			
		if(letterGrade=='A'){
			points = 5;
		}		
		 else if (letterGrade=='B'){
			points= 4;
		}
		 else if (letterGrade=='C'){
			points=3;
		}
		 else if (letterGrade=='D'){
			points=2;
		}
		 else if (letterGrade=='F'){
			points=0;
		}
		
		double score1 = sc.nextDouble();
		double score2 = sc.nextDouble();
		double result=0 ;		
		System.out.println("Result:"+result);
		if(score1>0&&score1>score2){
			result = score1;
		}
		 else if (score2>=score1)  {
			result = score2;
		} 
		 else if (score1<0)        {
			result = 0;
		}
	}
}
