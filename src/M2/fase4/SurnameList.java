package M2.fase4;

import java.util.ArrayList;

public class SurnameList {
    public static void main(String[] args) {
        ArrayList<Character> surnameArray = new ArrayList<>();
        surnameArray.add('C');
        surnameArray.add('r');
        surnameArray.add('i');
        surnameArray.add('a');
        surnameArray.add('d');
        surnameArray.add('o');

        // Arraylist nombre
        ArrayList<Character> nameComplete = new ArrayList<>();
        nameComplete.add('S');
        nameComplete.add('i');
        nameComplete.add('l');
        nameComplete.add('v');
        nameComplete.add('i');
        nameComplete.add('a');

        ArrayList<String> fullName = new ArrayList<>();
        fullName.add(String.valueOf(nameComplete));
        fullName.add(String.valueOf(surnameArray));
        System.out.println("Fullname: " + fullName);
    }
}


