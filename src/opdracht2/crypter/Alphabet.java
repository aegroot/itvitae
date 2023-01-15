package opdracht2.crypter;

import java.util.Arrays;
import java.util.List;

public class Alphabet {
    private final static List<String> upperAlphabets = Arrays.asList(
            "A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z");
    private final static List<String> lowerAlphabets = Arrays.asList(
            "a", "b", "c", "d", "e", "f", "g",
            "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u",
            "v", "w", "x", "y", "z");

    public static List<String> getLowerAlphabets() {
        return lowerAlphabets;
    }

    public static List<String> getUpperAlphabets() {
        return upperAlphabets;
    }
}
