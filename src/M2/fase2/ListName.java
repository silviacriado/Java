package M2.fase2;

import java.util.ArrayList;
import java.util.List;

public class ListName {
    public static void main(String[] args) {
        char[] letter = {'S','i','l','v','i','a'};
        String name = new String(letter);
        for (int i = 0; i < letter.length; i++) {
            System.out.print(name.charAt(i));
        }
        // change String to Array for then tp change into list
        char[] chars = name.toCharArray();
        List<Character> listC = new ArrayList<>();
        for (char c : chars) {
            listC.add(c);
        }
        System.out.println(listC);
    }
}
