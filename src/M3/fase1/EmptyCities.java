package M3.fase1;

import java.util.Scanner;

public class EmptyCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe el nombre de la ciudad: ");

        String city1 = input.next();
        String city2 = input.next();
        String city3 = input.next();
        String city4 = input.next();
        String city5 = input.next();
        String city6 = input.next();

        System.out.print(city1 + " " + city2 + " " + city3 + " " + city4 + " " + city5 + " " + city6);
        input.close();
    }
}
