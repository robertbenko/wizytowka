package benko;

public class BusinessCard {
	
	public static void main(String[] args) {
	
	String name = "Robert";
	String surname = "Ben";
	int number = 1234;
	String city = "Krw";
	String upperLine = name + " " + surname;
	String underline = number + " " + city;
	String star = "*";
	int i;
	int licznik = 0;
	int stars;


	int underlineLength = underline.length();
	int upperLineLength = upperLine.length();
	String empty = "";
	
	
	while(licznik<=underlineLength){
		 System.out.print(star);
		 licznik++;
	  }
	
	System.out.println();
	System.out.println(star + name + " " + surname);
	System.out.println(star + underline);
	
	for(i=0; i<=underlineLength; i++) {
		System.out.print(star);
	}
	
	}
}