package M1.fase4;

import java.text.ParseException;

public class personalDetails {
    public static void main(String[] args) throws ParseException {

        String[] fullName = {"Silvia ", "Criado ", "Sañudo"};
        System.out.print("Mi nombre es ");
        for (int i = 0; i < fullName.length; i++) {
            String name = fullName[i];
            System.out.print(name);
        }


    }
}



