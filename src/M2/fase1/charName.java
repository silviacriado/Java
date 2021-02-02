package M2.fase1;

public class charName {
    public static void main(String[] args) {
        char name[] = {'S','i','l','v','i','a'};
        String fullName = new String(name);
        for (int i = 0; i < name.length; i++) {
            System.out.print(fullName.charAt(i));
        }
    }
}
