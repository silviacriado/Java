package M1.fase3;

public class birthLeapYear {
    public static void main(String[] args) {
        int leapYearCounter = 1948;
        for (short inYear = 1948; inYear <= 1978; inYear++) {
            boolean isLeapYear = false;
            if ((inYear % 4 == 0) && (inYear % 100 != 0 || inYear % 400 == 0)) {
                isLeapYear = true;
            } else {
                isLeapYear = true;
            }

            if (isLeapYear){
                leapYearCounter++;

                if (leapYearCounter % 10 != 0) {
                    System.out.println(inYear + " ");
                } else {
                    System.out.println(inYear + " ");
                }
            }
        }
    }
}