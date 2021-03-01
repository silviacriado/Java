package M4.Nivel1;

import java.util.*;

public class Restaurant {
    public static void main(String[] args) {

        //FASE 1

        int[] euros = {5, 10, 20, 50, 100, 200, 500};

        for (int sum : euros) {
            System.out.println(sum);
        }

        ArrayList<String> menuDishes = new ArrayList<>();
        ArrayList<Integer> menuPrices = new ArrayList<>();


        //FASE 2 y FASE 3

        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("1-Ensalada mixta", 8);
        menu.put("2-Lasagna de verduras", 10);
        menu.put("3-Hamburguesa con patatas", 12);
        menu.put("4-Merluza al horno", 15);

        for (String menuList : menu.keySet()){
            menuDishes.add(menuList);
            menuPrices.add(menu.get(menuList));
        }
        System.out.println("Menú del día: ");

        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + ", precio: " + entry.getValue());
        }


        // Array para guardar el pedido y el pago

        ArrayList<Integer> order = new ArrayList<>();
        ArrayList<Integer> pay = new ArrayList<>();


        // Preguntar si quiere comer algo del menu
        // Recoger la información de pedido

        int menuOrder;
        System.out.println();
        System.out.println("¿Desea algo para comer?. Sí, escriba el número del plato. No, pulse 0.");

        do {

            Scanner input = new Scanner(System.in);
            menuOrder = input.nextInt();
            order.add(menuOrder);

            if (menuOrder > 0 && menuOrder <= menuDishes.size()) {
                System.out.println("Ha escogido " + menuDishes.get(menuOrder - 1) + " y cuesta " + menuPrices.get(menuOrder - 1) + " €.");
                System.out.println("¿Desea alguna otra cosa más?");
                pay.add(menuPrices.get(menuOrder - 1));
            } else {
                if (menuOrder == 0){
                    System.out.println("Pedido finalizado.");
                } else {
                    System.out.println("El plato no existe. Por favor elija otro plato");
                }
            }

        } while (menuOrder != 0);

        // Calculo del precio total del menú escogido.

        int sum = 0;
        for (Integer totalMenu : pay) {
            sum = sum + totalMenu;
        }
        System.out.println("El precio total de su pedido es de " + sum + " €.");
        System.out.println();
        System.out.println("Muchas gracias por su visita y buen provecho!");
    }
}