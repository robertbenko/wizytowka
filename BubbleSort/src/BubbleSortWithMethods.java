public class BubbleSortWithMethods {

    public static void main(String[] args) {
        int[] numbers = new int[]{4, 2, 0, 2, 10, 1, 9, 12, 3, 5};
        int[]sortedNumbers = sort(numbers);
        printNumbers(sortedNumbers);
    }


    private static int[] sort(int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            if(isGeraterThan(numbers)){
                swapElements(numbers);
            }
        }
        return numbers;
    }

    private static void printNumbers(int[] sortedNumbers) {
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.println(sortedNumbers[i]);
        }
    }
    private static boolean isGeraterThan(int numbers[]) {
        boolean value = false;
        for (int i = 0; i< numbers.length-1; i++)
            if (numbers[i] > numbers[i + 1])
                swapElements(numbers);
        return value;
    }

    private static int[] swapElements(int[] numbers){
        for (int i = 0; i< numbers.length-1; i++){
                int temp;
                temp = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = temp;
            }
        final int[] swapedElements = numbers;
        return swapedElements;
        }


}
