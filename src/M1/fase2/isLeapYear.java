package M1.fase2;

public class isLeapYear {
    public static void main(String[] args) {

        /* l’any 1948 es un any de traspàs, creeu una constant amb el valor de l’any (1948) */
        final int year;
        year = 1948;
        
        /* Creeu una variable que guardi cada quan hi ha un any de traspàs */
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year);
            } else {
                System.out.println("No es un año bisiesto");
            }

        /* Calculo del siguiente año bisiesto a partir del valor del año de la constante year */
        int leapYear = year + 4;
        int nextleapYear = leapYear;
        System.out.println(leapYear + " próximo año bisiesto");

        // numero de años bisiestos entre 1948 y 1978

    }
}






