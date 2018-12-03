package benko.com;

import java.util.Scanner;

public class Dividers {

    public static void main(String[] args) {
        int a = readNumber();
        String[] dividers = findDividers(a);
        printDividers(dividers);
    }

    private static int readNumber() {
        System.out.println("Proszę wpisz liczbę:");
        return new Scanner(System.in).nextInt();
    }

    private static String[] findDividers(int a) {
        String dividers = "";

        for (int d = 1; d <= a/2; d++) {
            if (checkDivider(a, d)) {
                dividers = dividers + d + ",";
            }
        }

        // należy wyciąć ostatni znak, bo to będzie przecinek
        dividers = dividers.substring(0, dividers.length() - 1);
        return dividers.split(",");
    }

    /**
     * Sprawdza czy liczba a dzieli się przez d
     *
     * @param a liczba zadana przez użytkownika
     * @param d kandydat na dzielnika
     * @return true, jeśli d dzieli a
     */
    private static boolean checkDivider(int a, int d) {
        return a % d == 0;
    }

    private static void printDividers(String[] dividers) {
        for (int i = 0; i < dividers.length; i++) {
            System.out.println(dividers[i]);
        }
    }
}
