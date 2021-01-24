package M1.fase2;

public class anyTrapas {
    public static void main(String[] args){
        int year = 1948;
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                System.out.println(year +  " es año bisiesto");
            else
                System.out.println(year +  " no es año bisiesto");
    }
}
