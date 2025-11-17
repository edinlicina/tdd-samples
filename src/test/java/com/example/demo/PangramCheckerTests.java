package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PangramCheckerTests {

    @Test
    public void shouldThrowExceptionIfInputIsNull(){
        var pangramChecker = new PangramChecker();
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> pangramChecker.checkPangram(null)
        );
    }

    @Test
    public void shouldThrowExceptionIfInputIsEmpty(){
        var pangramChecker = new PangramChecker();
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> pangramChecker.checkPangram("")
        );
    }

    @Test
    public void shouldReturnFalseIfInputLessThanTwentySixCharacters(){
        var pangramChecker = new PangramChecker();
        var input = pangramChecker.checkPangram("Hallo Welt");
        Assertions.assertFalse(input);
    }

    @Test
    public void shouldReturnTrueIfInputIsTheAlphabet(){
        var pangramChecker = new PangramChecker();
        var input = pangramChecker.checkPangram("abcdefghijklmnopqrstuvwxyz");
        Assertions.assertTrue(input);
    }

    @Test
    public void shouldReturnTrueIfInputIsClassicPangram(){
        var pangramChecker = new PangramChecker();
        var input = pangramChecker.checkPangram("The quick brown fox jumps over the lazy dog");
        Assertions.assertTrue(input);
    }

    @Test
    public void shouldReturnFalseIfOneLetterIsMissing(){
        var pangramChecker = new PangramChecker();
        var input = pangramChecker.checkPangram("The quick brown fox jumps over the lay dog");
        Assertions.assertFalse(input);
    }
}
