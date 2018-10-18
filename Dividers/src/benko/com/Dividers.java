package benko.com;

import java.util.Scanner;

public class Dividers {

	public static void main(String[] args) {
		//double a=0;
		//readNumber(a);
		//int[] d = null;
		//int [] d = new int[(int) (readNumber(a)/2)];
		//checkDivider(b);
		//findDividers(d);
		printDividers();
	}
//wczytuje liczbę naturalną ze standardowego wejścia i zwraca ją
	
	public static double readNumber(double a) {
		
		Scanner skaner = new Scanner(System.in);
		
		//System.out.println("podaj liczbe do sprawdzenia");
		a = skaner.nextInt();
		//a = 20;
		return a;
	}
	
//sprawdza, czy liczba a dzieli się przez liczbę b.
	
//public static boolean checkDivider(boolean b) {
//	
//	return b;
//	}
	
//dla zadanej liczby a przechodzi po wszystkich liczbach od 0 do x/2. Jeśli dana liczba jest dzielnikiem a, zapisuje ją w tablicy rezultatów. 
	
	public static int[] findDividers(int[] divider) {
		
		double a = 0;
		for(int i=1; i<=readNumber(a)/2; i++) {
			if(readNumber(a) % i == 0) {
				int k= i;
				System.out.println(k);
			}
		}
		return divider;
	}
	
// wypisuje wszystkie znalezione dzielniki.
	public static void printDividers() {
		int[] divider;
		findDividers(divider);
		System.out.println(k);
	}

}
