package M1.fase4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class myPersonalDetails {
    public static void main(String[] args) {
        String fullName = ("Silvia" + " " + "Criado" + " " + "Sañudo");
        System.out.println("Mi nombre es " + fullName);

        Date birthDate = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("08/06/1978");
        System.out.println("Nací el: " + ft.format(birthDate));

        int year = 1978;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    System.out.println("Mi año de nacimiento es un año bisiesto");
                } else System.out.println("Mi año de nacimiento no es un año bisiesto");
    }
}
