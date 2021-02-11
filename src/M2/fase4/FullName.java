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
        System.out.println("FullName: " + listName.get(0) + listName.get(1) + listName.get(2) +
                listName.get(3) + listName.get(4) + listName.get(5) + " " + listSurname.get(0) +
                listSurname.get(1) + listSurname.get(2) +listSurname.get(3) + listSurname.get(4) +
                listSurname.get(5));
    }
}