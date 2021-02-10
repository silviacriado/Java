package M2.fase3;

public class nameHashMap {
    public static void main(String[] args) {
        char[] cName = {'S', 'i', 'l', 'v', 'i', 'a'};
        java.util.HashMap<Character, Integer> name = new java.util.HashMap<Character, Integer>();
        name.put('S', 0);
        name.put('i', 1);
        name.put('l', 2);
        name.put('v', 3);
        name.put('i', 4);
        name.put('a', 5);

        System.out.println(name);
    }
}
