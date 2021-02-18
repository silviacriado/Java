package M3.fase4;

public class CityLengthReverse {
    public static void main(String[] args) {
        String city1 = "Barcelona";
        String city2 = "Madrid";
        String city3 = "Valencia";
        String city4 = "Malaga";
        String city5 = "Cadiz";
        String city6 = "Santander";

        StringBuilder reverse1 = new StringBuilder();
        for (int i = city1.length() - 1; i >= 0; i--) {
            reverse1.append(city1.charAt(i));
        }
        System.out.println(city1 + "-" + reverse1);

        StringBuilder reverse2 = new StringBuilder();
        for (int i = city2.length() - 1; i >= 0; i--) {
            reverse2.append(city2.charAt(i));
        }
        System.out.println(city2 + "-" + reverse2);

        StringBuilder reverse3 = new StringBuilder();
        for (int i = city3.length() - 1; i >= 0; i--) {
            reverse3.append(city3.charAt(i));
        }
        System.out.println(city3 + "-" + reverse3);

        StringBuilder reverse4 = new StringBuilder();
        for (int i = city4.length() - 1; i >= 0; i--) {
            reverse4.append(city4.charAt(i));
        }
        System.out.println(city4 + "-" + reverse4);

        StringBuilder reverse5 = new StringBuilder();
        for (int i = city5.length() - 1; i >= 0; i--) {
            reverse5.append(city5.charAt(i));
        }
        System.out.println(city5 + "-" + reverse5);

        StringBuilder reverse6 = new StringBuilder();
        for (int i = city6.length() - 1; i >= 0; i--) {
            reverse6.append(city6.charAt(i));
        }
        System.out.println(city6 + "-" + reverse6);
    }
}
