package M4.fase1;

import java.util.ArrayList;

public class CurrencyEur {
    public static void main(String[] args) {
        ArrayList<Integer> eur = new ArrayList<>();
        eur.add(5);
        eur.add(10);
        eur.add(20);
        eur.add(50);
        eur.add(100);
        eur.add(200);
        eur.add(500);

        for (int i : eur) {
            System.out.println(i);
        }
    }
}
