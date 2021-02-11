package M2.fase3;

import java.util.HashMap;

public class nameHashMap {
    public static void main(String[] args) {
        //Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen
        //char[] cName = {'S', 'i', 'l', 'v', 'i', 'a'};
        HashMap<Character, Integer> hashName = new HashMap<>();
        hashName.put('s', 1);
        hashName.put('i', 2);
        hashName.put('l', 1);
        hashName.put('v', 1);
        hashName.put('a', 1);

        System.out.println(hashName);
    }
}

