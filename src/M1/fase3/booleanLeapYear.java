package M1.fase3;

public class booleanLeapYear {
    public static void main(String[] args) {
        int year = 1948;
        boolean leapYear = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
        System.out.println(leapYear);
    }
}
