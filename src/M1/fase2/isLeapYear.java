package M1.fase2;

public class isLeapYear {
    public static void main(String[] args) {
        final int year;
        year = 1978;

        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " es un año bisiesto");
        } else {
            System.out.println(year + " no es un año bisiesto");
        }
    }
}


