package benko.com;

import java.util.regex.Pattern;

public class Logins {

	public static void main(String[] args) {
		
		String[] names = {"Piotr Budynek", 
				"Jan nowak",
				"karolina Mirek",
				"Zenon Piwko",
				"Maria Kamena"};
		
		for(int i=0; i<names.length; i++) {
			String[] splited = names[i].split(" ");
			String subn = splited[0].substring(0, 2);
			String subs = splited[1].substring(0, 3);
			String subname = subn.toLowerCase();
			String subsurname = subs.toLowerCase();
			
			System.out.println(splited[0] + " " + splited[1]);	
			System.out.println(subname + subsurname + "@gmail.com");
		}
		
		 
			
		
		
		
			
		
	}
}





