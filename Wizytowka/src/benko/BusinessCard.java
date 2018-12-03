package benko;
import java.util.Scanner;

public class BusinessCard {
	
	public static void main(String[] args) {
	
// TIP WCZYTYWANIE DANYCH STANDARDOWE WEJŚCIE		
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
		String city = "Krakhhh";
		
	
		String star = "*";
		int i;
		int licznik = 0;
		int stars;
		String empty = "";
		String oneSpace = " ";
		String empty1= "";
		String spacesPlusStar = null;
		int test = 0;

// ŁĄCZENIE STOPKI
	
	String upperLine = star + name + oneSpace + surname;
	String underline = star + number + oneSpace + city + oneSpace;
	int underlineLength = underline.length();
	int upperLineLength = upperLine.length();
		
// TIP PĘTLA 1 - WYPISUJE GWIAZDKI, DODAJE GWIAZDKI DO PUSTEGO MIEJSCA
	
	for(i=0; i<=underlineLength; i++) {
		empty = empty + star;
		}
	
	int emptyLength = empty.length();
	int lengthDiff = emptyLength - upperLineLength;
	
	for(i=0; i<lengthDiff-1; i++) {
		empty1 = empty1 + oneSpace;
	}

// ZAWARTOŚĆ	
	System.out.println(empty);
	System.out.println(upperLine + empty1 + star);
	System.out.print(underline + star);
	System.out.println();
	System.out.println(empty);
	//System.out.println(oneSpace.length());
	
	}
	
}