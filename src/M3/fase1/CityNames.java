package M3.fase1;

import java.util.ArrayList;
import java.util.Scanner;

public class CityNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el nombre de estas ciudades: Barcelona, Madrid, Valencia, Malaga, Cadiz y Santader: ");

        ArrayList<String> city = new ArrayList<>(5);
        for (int i = 0; i < 6; i++) {
            System.out.println("Nombre de la ciudad: ");
            city.add(input.next());
        }
        for (String s : city) {
            System.out.println(s);
        }
    }
}