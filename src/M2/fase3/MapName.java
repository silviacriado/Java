package M2.fase3;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class MapArray {
    public static void main(String[] args) {
        char[] cName = {'S', 'i', 'l', 'v', 'i', 'a'};
        for (char c : cName) {
            System.out.println(c);
        }
        HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        //HashMap<Integer, String> map = new HashMap<>();
        map.put(1, String.valueOf(cName));
        TreeMap<Integer, String> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);
    }
}
