package M1.fase3;

public class birthYear {
    public static void main(String[] args) {

        // Partint de l’any 1948 heu de fer un bucle for i mostrar
        // els anys de traspàs arriba al vostre any de naixement

        int leapYearCounter = 1948;
        int birthYear = 1978;
        for (short inYear = 1948; inYear <= 1978; inYear++) {
            boolean isLeapYear = false;

            if ((inYear % 4 == 0) && (inYear % 100 != 0 || inYear % 400 == 0)) {
                isLeapYear = true;

                leapYearCounter++;

                if (leapYearCounter % 10 != 0) {
                    System.out.println(inYear + " ");
                } else {
                    System.out.println(inYear + " ");
                }
            }
        }
        // Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és

        if ((birthYear % 4 == 0) && (birthYear % 100 != 0 || birthYear % 400 == 0)) {
            System.out.println(birthYear + " es un año bisiesto");
        } else {
            System.out.println(birthYear + " no es un año bisiesto");
        }
    }
}
