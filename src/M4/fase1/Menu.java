package M4.fase1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {
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
            System.out.println(ITcount.next() + " " + ITmenu.next() + " cuesta " + ITprice.next() + " €.");
        }

        // Creamos un Array para guardar los precios de los platos escogidos
        // Rellenamos el Array de pago de forma automática Bucle

        ArrayList<Integer> order = new ArrayList<>();
        ArrayList<Integer> pay = new ArrayList<>();

        int menuOrder;
        System.out.println();
        System.out.println("¿Desea algo para comer?, escriba el número del plato que desee escoger");
        System.out.println("Pulse 0, si no desea ningún plato y quiere finalizar su pedido");

        do {

            Scanner input = new Scanner(System.in);
            menuOrder = input.nextInt();
            order.add(menuOrder);

            if (menuOrder == 1) {
                System.out.println("Ha escogido ensalada mixta y cuesta " + prices[0] + " €.");
                System.out.println("¿Desea alguna otra cosa más?");
                pay.add(7);
            } else if (menuOrder == 2) {
                System.out.println("Has escogido lasagna de verduras y cuesta " + prices[1] + " €.");
                System.out.println("¿Desea alguna otra cosa más?");
                pay.add(8);
            } else if (menuOrder == 3) {
                System.out.println("Has escogido hamburguesa con patatas y cuesta " + prices[2] + " €.");
                System.out.println("¿Desea alguna otra cosa más?");
                pay.add(12);
            } else if (menuOrder == 4) {
                System.out.println("Has escogido lubina al horno y cuesta " + prices[3] + " €.");
                System.out.println("¿Desea alguna otra cosa más?");
                pay.add(15);
            } else System.out.println("Pedido completado.");
            System.out.println();

        } while (menuOrder != 0);

        // Calculo del precio total del menú escogido.
        int suma = 0;
        for (Integer totalMenu : pay) {
            suma = suma + totalMenu;
        }
        System.out.println("El precio total de su pedido es de " + suma + " €.");
        System.out.println();
        System.out.println("Muchas gracias por su visita y buen provecho!");
    }
}