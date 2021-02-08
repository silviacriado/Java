package M2.fase3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class MapName {
    public static void main(String[] args) {
        char[] cName = {'S', 'i', 'l', 'v', 'i', 'a'};
        ArrayList<Character> nameArray = new ArrayList<>();
        nameArray.add('S');
        nameArray.add('i');
        nameArray.add('l');
        nameArray.add('v');
        nameArray.add('i');
        nameArray.add('a');
        System.out.println(nameArray);

        //Creamos map del nombre
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, String.valueOf('S'));
        map.put(2, String.valueOf('i'));
        map.put(3, String.valueOf('l'));
        map.put(4, String.valueOf('v'));
        map.put(5, String.valueOf('i'));
        map.put(6, String.valueOf('a'));
        TreeMap<Integer, String> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);
    }
}
