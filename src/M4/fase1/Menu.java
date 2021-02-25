package M4.fase1;

import java.util.Scanner;

class Menu {
    public static void main(String[] args) {

        int option;
        String order;
        int price = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Menu del dia: ");
        System.out.println("1. Ensalada tibia de bacalao");
        System.out.println("2. Crema de calabaza");
        System.out.println("3. Hamburguesa con patatas");
        System.out.println("4. Paella de marisco");

        System.out.println("Por favor elija uno de estos platos: ");

        option = input.nextInt();

        switch (option) {
            case 1 -> {
                order = "ensalada tibia de bacalao";
                price = 10;
            }
            case 2 -> {
                order = "crema de calabaza";
                price = 8;
            }
            case 3 -> {
                order = "hamburguesa con patatas";
                price = 12;
            }
            case 4 -> {
                order = "paella de marisco";
                price = 15;
            }
            default -> order = "No has escogido ningún plato de la carta";
        }

        System.out.println("Has escogido " + order + " y cuesta " + price);

    }
}