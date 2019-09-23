class StringPractice{
	public static void main(String args []){
		int age = 20;
	// strl holds "Age: 20" which is the concatenation of the
	// string literal "Age: " and the value stored in the variable
	// age.
	String str1 = "Age: " + age ;
	
	System.out.println(str1);
	// Printing the age to the screen with a concatenation of plus 1(201)	
	
	String str2 = "Age: " + age + 1;
	
	System.out.println(str2);
	// Printing the age to the screen with a concatenation of plus 2
	
	String str3 = "Age:" + ( age + 2);
	
	System.out.println(str3);
	// prints the name 
	
	String player = "Bob";
	
	System.out.println(player);
	// length of player's name
	int len = player.length();
	
	System.out.println(player.length());
	
	String str4 = "scattered";
	
	System.out.println("scattered");
	
	String str5 = str4.substring(6); 
	
	System.out.println(str5);
	
	String str6 = str4.substring(1,4);
	
	System.out.println(str6);
	// replaces c's with h's
	
	String str7 = str4.replace('c', 'h');
	
	System.out.println(str7);
	// replaces sc's with ch's
	
	String str8 = str4.replace("sc", "ch");
	
	System.out.println (str8);
	
	String str9 = "    something before me and after me      ";
	
	System.out.println(str9);
	
	String str10 = str9.trim();
	
	System.out.println(str10);  
	//takes out the numbers 1,2,3
	String str11 = "one:two:three";
	
	System.out.println(str11);
	char ch = str11.charAt(4);

	String str12 = "peanut butter";
	
	System.out.println(str12);  
	// find words that start with pea
	
	boolean found = str12.startsWith("pea");
	//found a word that ended with nut but started with pea
	found = str12.startsWith("nut");

	int index = str12.indexOf('u');

	index = str12.indexOf("nut");

	index = str12.indexOf('u', 6);
	}
}

