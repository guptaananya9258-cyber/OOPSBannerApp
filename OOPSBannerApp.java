import java.util.HashMap;
import java.util.Map;

class CharacterPattern {
    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));

        String word = "OOPS";
        int height = 7;

        for (int i = 0; i < height; i++) {

            for (char c : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(c);

                if (cp != null) {
                    System.out.print(cp.getPattern()[i] + "   ");
                }
            }

            System.out.println();
        }
    }
}