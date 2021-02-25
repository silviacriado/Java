package M4.fase1;

import java.util.Scanner;

class Menu {
    public static void main(String[] args) {

        int option;
        String order;
        int price = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Menu del dia: ");
        System.out.println("1. ensalada tibia de bacalao");
        System.out.println("2. crema de calabaza");
        System.out.println("3. hamburguesa con patatas");
        System.out.println("4. paella de marisco");

        System.out.println("Por favor elija uno de estos platos: ");

        option = input.nextInt();

        switch (option) {
            case 1:
                order = "Ensalada tibia de bacalao";
                price = 10;
                break;
            case 2:
                order = "Crema de calabaza";
                price = 8;
                break;
            case 3:
                order = "Hamburguesa con patatas";
                price = 12;
                break;
            case 4:
                order = "Paella de marisco";
                price = 15;
                break;
            default:
                order = "No has escogido ningún plato de la carta";
        }

        System.out.println("Has escogido " + order + " y cuesta " + price);

    }
}