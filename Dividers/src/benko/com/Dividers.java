package benko.com;

import java.util.Scanner;

public class Dividers {

	public static void main(String[] args) {
		double a=0;
		readNumber(a);
		int [] d = new int[(int) (readNumber(a)/2)];
		//checkDivider(b);
		System.out.println(findDividers(d));
		

		
	}
//wczytuje liczbę naturalną ze standardowego wejścia i zwraca ją
	
	public static double readNumber(double a) {
		
		//Scanner skaner = new Scanner(System.in);
		
		//System.out.println("podaj liczbe do sprawdzenia");
		//a = skaner.nextInt();
		a = 10;
		return a;
	}
	
//sprawdza, czy liczba a dzieli się przez liczbę b.
	
//	public static boolean checkDivider(boolean b) {
//				
//		double a = 0;
//		
//		double x = readNumber(a) % 2;
//		if( x == 0) {
//			b = true;
//		}
//		else {
//			b=false;
//		}
//										System.out.println(b);
//		
//		return b;
//	}
	
//dla zadanej liczby a przechodzi po wszystkich liczbach od 0 do x/2. Jeśli dana liczba jest dzielnikiem a, zapisuje ją w tablicy rezultatów. 
	
	public static int[] findDividers(int[] divider) {
		int dividers=0;
		double a = 10;
		//int i=0;
		int[] d = new int[(int) (readNumber(a)/2)];
		
		for(int i=0; i<readNumber(a)/2; i++) {
			if(readNumber(a) % 2 == 0) {
				int k= i;
				d[i]= i+i;
				System.out.println(k);
			}
				
		}
		
		
		return divider;
	}
	
// wypisuje wszystkie znalezione dzielniki.
	public static void printDividers() {
		
	}

}
