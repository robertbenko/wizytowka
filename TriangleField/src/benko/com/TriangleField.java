package benko.com;

public class TriangleField {

	public static void main(String[] args) {
		int a = 5;
		int h = 3;
		double triangle;
		
		triangle = (double)a*h/2;
		
		System.out.println(triangle);
		
		if(triangle>7) {
			System.out.println("Duzy trojkąt");
		}
		else {
			System.out.println("Mały trójkąt");
		}

	}

}
