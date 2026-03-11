import java.util.HashMap;

class CharacterPattern {
    String[] pattern;

    CharacterPattern(String[] pattern) {
        this.pattern = pattern;
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {

        HashMap<Character, CharacterPattern> patterns = new HashMap<>();

        patterns.put('O', new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patterns.put('P', new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patterns.put('S', new CharacterPattern(new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {

            for (char c : word.toCharArray()) {
                System.out.print(patterns.get(c).pattern[i] + "   ");
            }

            System.out.println();
        }
    }
}