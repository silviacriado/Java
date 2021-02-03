package M2.fase2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListName {
    public static void main(String[] args) {
        char[] letter = {'S','i','l','v','i','a'};
        Stream<Character> myStreamOfCharacters = IntStream
                .range(0, letter.length)
                .mapToObj(i -> letter[i]);

        List<Character> myListOfCharacters = myStreamOfCharacters.collect(Collectors.toList());
        myListOfCharacters.forEach(System.out::println);

        
    }
}
