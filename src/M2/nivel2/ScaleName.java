package M2.nivel2;

import java.util.ArrayList;
import java.util.List;

public class ScaleName {
    public static void main(String[] args) {
        char[] cName = {'S', 'i', 'l', 'v', 'i', 'a'};
        List<Character> listC = new ArrayList<>();
        for (char c : cName) {
            listC.add(c);
            System.out.println(listC);
        }
    }
}
