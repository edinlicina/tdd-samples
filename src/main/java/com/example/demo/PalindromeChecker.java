package com.example.demo;


public class PalindromeChecker {

    public boolean check(String input) {
        if (input == null) {
            return false;
        }
        if (input.isEmpty()) {
            throw new IllegalArgumentException();
        }
        var lowerCaseInput = input.toLowerCase();
        for (int index = 0; index <= lowerCaseInput.length() / 2; index++) {
            var leftCharacter = lowerCaseInput.charAt(index);
            var rightCharacter = lowerCaseInput.charAt(lowerCaseInput.length() - 1 - index);
            if (leftCharacter != rightCharacter) {
                return false;
            }
        }

        return true;
    }
}
