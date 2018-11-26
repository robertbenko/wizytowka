package benko.com;

import java.util.Scanner;

public class Dividers {


	public static void main(String[] args) {
		printDivider();
		
	}
	
//wczytuje liczbę naturalną ze standardowego wejścia i zwraca ją
	
	public static int readNumber(int a) {
		
		Scanner skaner = new Scanner(System.in);
		
		System.out.println("Podaj liczbe do sprawdzenia: ");
		a = skaner.nextInt();
		
		return a;
	}
	
	
//sprawdza, czy liczba a dzieli się przez liczbę b
	
	static int[] checkDivider(int[] b) {

		int a = 0;
		int[] tab = new int[readNumber(a)];
		
		for (int i = 1; i < readNumber(a)/2+1; i++) 
			if(readNumber(a) % i == 0)
				tab[i] = i;
		
		System.out.println(b);
	return b;
	}
	
// wypisuje wszystkie znalezione dzielniki
	
	static void printDivider() {
		System.out.println(checkDivider(null));
	}
	
	
}
	

