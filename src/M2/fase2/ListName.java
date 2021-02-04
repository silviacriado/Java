package M2.fase2;

import java.util.ArrayList;

public class ListName {
    public static void main(String[] args) {
        char[] c = {'S', 'i', 'l', 'v', 'i', 'a'};
        ArrayList <Character> list = new ArrayList<Character>();
        list.add('S');
        list.add('i');
        list.add('l');
        list.add('v');
        list.add('i');
        list.add('a');
        for (int i = 0; i < c.length; i++){
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') ||
                (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')) {
            System.out.println("VOCAL");
        } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println("CONSONANTE");
        else
            System.out.println("");
            i++;
        }
    }
}