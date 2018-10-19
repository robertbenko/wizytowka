package benko.com;

import java.util.Scanner;

public class Dividers {

	private static int[][] tablicas;

	public static void main(String[] args) {
		//int i=0;
		//Object[] tablica;
		//double a=0;
		//readNumber(a);
		//int[] d = null;
		//int [] d = new int[(int) (readNumber(a)/2)];
		//checkDivider(b);
		//findDividers(d);
		printDivider();
	}
//wczytuje liczbę naturalną ze standardowego wejścia i zwraca ją
	
	public static int readNumber(int a) {
		
		Scanner skaner = new Scanner(System.in);
		
		System.out.println("Podaj liczbe do sprawdzenia: ");
		a = skaner.nextInt();
		
		int[] tablica = new int[a];
		
		return a;
	}
	
//sprawdza, czy liczba a dzieli się przez liczbę 
	
	public static int[] checkDivider(int[] b) {

		int[] tablica = new int[readNumber(0)];
		int a=0;
		
		for (int i = 1; i < readNumber(a)/2+1; i++) 
			if(readNumber(a) % i == 0)
				tablica[i] = i;
		
	return b;
	}
	
// wypisuje wszystkie znalezione dzielniki
	
	public static void printDivider() {
		//tablicas = null;
		//int i = 0;
		System.out.println(checkDivider);
	}
	
	
}
	

