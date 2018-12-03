package benko.com;

import java.time.LocalDate;
import java.util.Scanner;

public class RandomDates {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int userEntry = scanner.nextInt();
		
		switch(userEntry) {
		case 1:
			loadUserDate();
			break;
			
		case 2:
			loadRandomDate();
			break;
			
		default:
			System.out.println("failure");
		}
		

	}

	public static LocalDate loadUserDate() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj dzień: ");
		int day = scanner.nextInt();
		System.out.println("Podaj miesiąc: ");
		int month = scanner.nextInt();
		System.out.println("Podaj rok: ");
		int year = scanner.nextInt();
		
		LocalDate date = LocalDate.of(year, month, day);
		
		System.out.println(date);
		
		return date;
	}
	
	public static LocalDate loadRandomDate() {
		
		return null;
	}
}
