package M2.fase1;

public class CharName {
    public static void main(String[] args) {
        char[] cName = {'S','i','l','v','i','a'};
        String name = new String(cName);
        //loop to store each character in the array to print
        for (int i = 0; i < cName.length; i++) {
            System.out.print(name.charAt(i));
        }
    }
}
