package M4.fase1;

import java.util.Arrays;

public class Menu {
    public static void main(String[] args) {

        //Creamos la primera variable: billetes de 5-500€
        int[] currency = {5, 10, 20, 50, 100, 200, 500};
        System.out.println("Original Array:\n" + Arrays.toString(currency));
    }

    public static class MenuRestaurant {

        // this instance variable is visible for any child class.
        public String menu;

        // price  variable is visible in MenuRestaurant class only.
        private double price;

        // The menu variable is assigned in the constructor.
        public MenuRestaurant(String menuName) {
            menu = menuName;
        }

        // The price variable is assigned a value.
        public void setPrice(double menuPrice) {
            price = menuPrice;
        }

        // This method prints the employee details.
        public void printEmp() {
            System.out.println("menu  : " + menu);
            System.out.println("price :" + price);
        }

        public static void main(String[] args) {
            MenuRestaurant optionOne = new MenuRestaurant("Ensalada tibia de bacalao");
            optionOne.setPrice(10.00);
            optionOne.printEmp();
        }
    }
}