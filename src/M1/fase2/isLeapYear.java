package M1.fase2;

public class isLeapYear {
    public static void main(String[] args) {

        // Sabent que l’any 1948 es un any de traspàs:
        // Creeu una constant amb el valor de l’any (1948)

        final int year;
        year = 1952;

        // Creeu una variable que guardi cada quan hi ha un any de traspàs

        int leapYear = (year + 4);
            if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println((year + 4));
        }
    }
}



