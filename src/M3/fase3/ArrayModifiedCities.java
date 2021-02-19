package M3.fase3;

public class ArrayModifiedCities {
    public static void main(String[] args) {

        String cities = "Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander";
        char charToReplace = 'a';
        int count = 4;
        for (int i = 0; i < cities.length(); i++) {
            char ch = cities.charAt(i);
            if (ch == charToReplace) {
                cities = cities.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
            }
        }
        System.out.print(cities);
    }
}
