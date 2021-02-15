package M3.fase2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayCity {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();

        city.add("Barcelona");
        city.add("Madrid");
        city.add("Valencia");
        city.add("Malaga");
        city.add("Cadiz");
        city.add("Santander");

        Collections.sort(city);
        for (String s : city) {
            System.out.println(s);
        }
    }
}