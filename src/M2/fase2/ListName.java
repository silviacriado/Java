package M2.fase2;

import java.util.ArrayList;

public class ListName {
    public static void main(String[] args) {
        char[] cName = {'S', 'i', 'l', 'v', 'i', 'a'};
        // Covert char Array into String Array to change it to List
        ArrayList<Character> listComplete = new ArrayList<>();
        for (char c : cName) {
            listComplete.add(c);
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') ||
                    (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')) {
                System.out.println("VOCAL");
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                System.out.println("CONSONANTE");
            } else
                System.out.println("");{
            }
        }
    }
}
