package M1.fase2;

import java.util.GregorianCalendar;

public class leapYear {
    public static void main(String[] args) {

        final int year = 1948;
        System.out.println(year);

        GregorianCalendar calendar = new GregorianCalendar();

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
            System.out.println("El año es bisiesto");
        else
            System.out.println("El año no es bisiesto");

        int leapYearCounter = 1948;

        for (short inYear = 1948; inYear <= 1978; inYear++) {
            boolean isLeapYear = false;

            if (inYear % 4 == 0) {
                if (inYear % 100 == 0) {
                    if (inYear % 400 == 0) {
                        isLeapYear = true;
                    }
                } else {
                    isLeapYear = true;
                }
            }

            if (isLeapYear) {
                leapYearCounter++;

                if (leapYearCounter % 10 != 0) {
                    System.out.print(inYear + " ");
                }
                else {
                    System.out.println(inYear + " ");
                }
            }
        }
    }
}
