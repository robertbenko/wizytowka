package benko.com;

import java.util.*;

public class Average {
	
	

	public static void main(String[] args) {
	
		Scanner skaner = new Scanner(System.in);
		
		System.out.println("Podaj ilosc ocen: ");
		
		int n = skaner.nextInt();
		int[] marks = new int[n];
		
		System.out.println("Podaj " + n + " ocen: ");
		
		for(int i=0; i<marks.length; i++) {
			marks[i]=skaner.nextInt();
			
			//System.out.println(marks[i]);
		}
		System.out.println("obliczona średnia to: ");
		
// TIP ODNIESIENIE DO INNEJ METODY 
		
		System.out.println(average(marks));
		maxScore(marks); //odniesienie w sposób samego zapisu bez instrukcji, drukowanie zdefinowane jest w samej metodzie
		//double c  = Average.average(marks);
		

	}
	
	public static double average(int[] marks) {
	    int sum = 0;
	    double average;

	    for(int i=0; i<marks.length; i++) {
	        sum = sum + marks[i];
	        
	    }
	    
	    average = sum/(double)marks.length;
	    
	    //System.out.println(average);

	    return average;
	}
	
	public static int maxScore(int[] marks) {
		int m = marks[0];
		
		for(int i=0; i<marks.length; i++) {
			if (m < marks[i]) {
				m = marks[i];
			}
		}
		System.out.println("Maksymalna wartość to :" + m);
		
		return m;
	}

}
