package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean checkPangram(String input){
        if(input == null){
            throw new IllegalArgumentException();
        }
        if (input.isEmpty()){
            throw new IllegalArgumentException();
        }
        if (input.length() < 26){
            return false;
        }

        var lowerCaseInput = input.toLowerCase();
        Set<Character> seenCharacters = new HashSet<>();
        for (int index = 0; index < lowerCaseInput.length(); index ++){
            var currentCharacter = lowerCaseInput.charAt(index);
            if (Character.isLetter(currentCharacter)){
                seenCharacters.add(currentCharacter);
            }
        }
        if (seenCharacters.size()<26){
            return false;
        }

        return true;
    }

}
