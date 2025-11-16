package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTests {

    @Test
    public void shouldReturnFalseIfInputIsNull() {
        var palindromeChecker = new PalindromeChecker();
        var isPalindrome = palindromeChecker.check(null);
        Assertions.assertFalse(isPalindrome);
    }

    @Test
    public void shouldThrowAnErrorIfInputIsEmpty() {
        var palindromeChecker = new PalindromeChecker();
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> palindromeChecker.check("")
        );
    }

    @Test
    public void shouldReturnTrueIfInputIsPalindrome() {
        var palindromeChecker = new PalindromeChecker();
        var isPalindrome = palindromeChecker.check("maoam");
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    public void shouldReturnFalseIfInputIsNotPalindrome(){
        var palindromeChecker = new PalindromeChecker();
        var isPalindrome = palindromeChecker.check("mama");
        Assertions.assertFalse(isPalindrome);
    }

    @Test
    public void shouldReturnTrueIfInputIsPalindromeIgnoreCase(){
        var palindromeChecker = new PalindromeChecker();
        var isPalindrome = palindromeChecker.check("Maoam");
        Assertions.assertTrue(isPalindrome);
    }
}
