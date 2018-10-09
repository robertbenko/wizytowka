package benko;
import java.util.Scanner;

public class BusinessCard {
	
	public static void main(String[] args) {
	
// WCZYTYWANIE DANYCH STANDARDOWE WEJŚCIE		
//		Scanner skaner = new Scanner(System.in);
//		
//		System.out.println("Podaj imię");
//		String name = skaner.next();
//		System.out.println("Nazwisko");
//		String surname = skaner.next();
//		System.out.println("Numer telefonu");
//		int number = skaner.nextInt();
//		System.out.println("Miasto");
//		String city = skaner.next();
		String name = "Robert";
		String surname = "Benko";
		int number = 1234444;
		String city = "Krakow";
		
	
	String star = "*";
	int i;
	int licznik = 0;
	int stars;
	String empty = "";
	String oneSpace = " ";
	String empty1;

// ŁĄCZENIE STOPKI
	
	String upperLine = star + name + oneSpace + surname + oneSpace;
	String underline = star + number + oneSpace + city + oneSpace;
	int underlineLength = underline.length();
	int upperLineLength = upperLine.length();
	int lengthDiff = underlineLength - upperLineLength;
	
// PĘTLA 1 - WYPISUJE GÓRNE GWIAZDKI
	
	for(i=0; i<=underlineLength; i++) {
		empty = empty + star;
		}
	
	//for(i=0; )
	
// ZAWARTOŚĆ	
	System.out.println(empty);
	System.out.println(upperLine + star);
	System.out.print(underline + star);
	System.out.println();
	System.out.println(empty);
	
	}
	
}