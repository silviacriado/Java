package M2.fase1;

public class CharName {
    public static void main(String[] args) {
        char[] letter = {'S','i','l','v','i','a'};
        String name = new String(letter);
        for (int i = 0; i < letter.length; i++) {
            System.out.print(name.charAt(i));
        }
    }
}
