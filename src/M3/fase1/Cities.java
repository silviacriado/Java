package M3.fase1;

import java.util.Arrays;
import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        /*
        Crea sis variables tipu string buides.
        Demana per consola que s’introdueixin els noms.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ciudad: ");

        scan.next();
        String[] city = {"Barcelona", "Cadiz", "Madrid", "Malaga", "Santander", "Valencia"};
        Arrays.sort(city);
        if (Arrays.equals(city, city)) {
            System.out.println(Arrays.toString(city));
        }
    }
}