package benko.com;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		//
		Scanner skaner = new Scanner(System.in);
		
		System.out.println("Podaj liczbe do sprawdzenia: ");
		int a = skaner.nextInt();
		//
		int[] tablica = new int[a];

		for (int i = 1; i < a/2+1; i++) 
			if(a % i == 0)
				tablica[i] = i;
					
		
//Wypisywanie na ekran	
		System.out.println();
		System.out.println("dzielniki liczby "+a+ " to: ");

		for (int i = 0; i < a/2+1; i++)
			if (tablica[i] != 0)
			System.out.println(tablica[i]);
		
	}

}