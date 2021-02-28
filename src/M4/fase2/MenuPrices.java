package M4.fase2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MenuPrices {
    public static void main(String[] args) {

        //Variable billetes de 5-500€:

        int fiveEur = 5;
        int tenEur = 10;
        int twentyEur = 20;
        int fiftyEur = 50;
        int hundredEur = 100;
        int twoHundredEur = 200;
        int fiveHundredEur = 500;


        //Array del menu y lo rellenamos con los platos que tendra el menu:
        String[] dishes = {"Ensalada mixta", "Lasagna de verduras", "Hamburguesa con patatas", "Lubina al horno"};

        ArrayList<String> menu = new ArrayList<>();
        Collections.addAll(menu, dishes);

        //Array de los precios y lo rellenamos con los precios de los platos que tendra el menu
        int[] prices = {7, 8, 12, 15};

        ArrayList<Integer> dishPrice = new ArrayList<>();
        for (int menuPrice : prices) {
            dishPrice.add(menuPrice);
        }

        // Creo Iterator para mostrar en pantalla los platos ordenados por numero, con su precio.

        int[] count = {1, 2, 3, 4};
        ArrayList<Integer> dishCount = new ArrayList<>();
        for (int menuCount : count) {
            dishCount.add(menuCount);
        }

        Iterator<Integer> ITcount = dishCount.iterator();
        Iterator<String> ITmenu = menu.iterator();
        Iterator<Integer> ITprice = dishPrice.iterator();

        while (ITmenu.hasNext()) {
            System.out.println(ITcount.next() + " " + ITmenu.next() + ", su precio es de " + ITprice.next() + " €.");
        }
    }
}
