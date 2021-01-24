package M1.fase2;

import java.util.Scanner;

public class leapYear {

    int year;
    Scanner entrada = new Scanner(System.in);

    public void inYear() {
        // Calculo para determinar si el año es bisiesto
        System.out.print("Ingrese año a evaluar: ");
        year = entrada.nextInt();
    }

    public void process() {
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " es un año bisiesto");
        } else {
            System.out.println(year + " no es un año bisiesto");
        }
    }

    public static void main(String[] args) {
        leapYear fc = new leapYear();
        fc.inYear();
        fc.process();
    }
}

