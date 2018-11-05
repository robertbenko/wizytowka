package benko.com;

public class BubbleSort {

    public static void main(String[] args) {
    	printing();
    }
    
    static int[] sortNumbers(int[] b) {

        int[] numbers = new int[] { 4, 2, 0, 2, 10, 1, 9, 12, 3, 5 };
        int l = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp;
                    temp = numbers[j + 1];
                    //System.out.println(temp);
               
                    numbers[j + 1] = numbers[j];
                    //System.out.println(numbers[j+1]);
                    numbers[j] = temp;
                    //System.out.println(numbers[j]);
                }
            }
        }
        return b;
    }
        
    static int jakasLiczba(int a) {
    	a = 3;
    	return a;
    }
    
     static void printing() {
    	 
    	 int a = jakasLiczba(0);
         zwieksz(a);
         System.out.println(a);
         
         for (int i = 0; i < jakasLiczba(0); i++) {
             System.out.println(zwieksz(a));
          }
     }
     
     static int zwieksz(int liczba){
             liczba++;
             return liczba;
   
     }
 

}


