package model;

import java.util.ArrayList;
import java.util.List;

public class Characters {

    private static final int WORD_LENGTH = 5;
    public static final String OUT_OF_WORD_LENGTH_ERR_MSG = "문자열의 길이가 5자가 아닙니다.(입력된 문자열의 길이는 %d입니다.)";

    private final List<Character> characters;

    public Characters(String inputString) {
        validate(inputString);
        this.characters = createCharacters(inputString);
    }

    private List<Character> createCharacters(String inputString) {
        List<Character> characterList = new ArrayList<>();
        String[] split = inputString.split("");
        for (int i = 0; i < WORD_LENGTH; i++) {
            characterList.add(new Character(split[i], i));
        }
        return characterList;
    }

    public List<Character> convertToList() {
        return characters;
    }

    private void validate(String value) {
        if (value.length() != WORD_LENGTH) {
            throw new IllegalArgumentException(String.format(OUT_OF_WORD_LENGTH_ERR_MSG, value.length()));
        }
    }

    public Results match(Characters answer) {
        ResultMatcher matcher = new ResultMatcher();

        for (Character input : characters) {
            matcher.match(input, answer);
        }

        return matcher.makeResults(answer);
    }
}
