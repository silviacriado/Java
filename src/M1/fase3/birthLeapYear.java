package M1.fase3;

public class birthLeapYear {
    public static void main(String[] args) {

        /* Starting from 1948 create a bool to print the leap years until my birth year */

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
        /* Variable bool true if birth year is a leap; false if not */

        if ((birthYear % 4 == 0) && (birthYear % 100 != 0 || birthYear % 400 == 0)) {
            System.out.println(birthYear + " es un año bisiesto");
        } else {
            System.out.println(birthYear + " no es un año bisiesto");
        }
    }
}
