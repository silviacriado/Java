package M1.fase2;

import java.util.Scanner;

public class isLeapYear {
    public static void main(String[] args) {

        /* l’any 1948 es un any de traspàs,
        creeu una constant amb el valor de l’any (1948)
        creeu una variable que guardi cada quan hi ha un any de traspàs */

        final int year = 1948;
        int birthYear = 1978;

        int leapYear;

        System.out.println("Escribe el año: ");
        Scanner sc = new Scanner(System.in);
        leapYear = sc.nextInt();

        if (true) {
            System.out.println("Es año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }

        // Años bisiestos entre 1948 y 1978

        int countLeap = 0;
        if (year < birthYear) {
            for (int i = year; i < birthYear; i++) {
                int result = i % 4;
                if (result == 0) {
                    countLeap++;
                    System.out.println( + i);
                }
            }
            System.out.println("Total de años bisiestos entre 1948 y 1978 : "
                    + countLeap);
        }
    }
}







