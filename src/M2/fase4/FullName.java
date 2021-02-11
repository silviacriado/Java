package M2.fase4;


import java.util.ArrayList;
import java.util.List;

public class FullName {
    public static void main(String[] args) {
        String surname = "Criado";
        char[] charSurname = surname.toCharArray();
        List<Character> listSurname = new ArrayList<>();
        for (char cSurname : charSurname) {
            listSurname.add(cSurname);
        }
        String name = "Silvia";
        char[] charName = name.toCharArray();
        List<Character> listName = new ArrayList<>();
        for (char cName : charName) {
            listName.add(cName);
        }
        System.out.println("FullName: " + listName + " " + listSurname);
    }
}