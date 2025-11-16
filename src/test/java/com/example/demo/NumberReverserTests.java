package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberReverserTests {

    @Test
    public void shouldExceptionIfInputIsNull(){
        var numberReverser = new NumberReverser();
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> numberReverser.reverse(null)
        );
    }

    @Test
    public void shouldReverseNumber(){
        var numberReverser = new NumberReverser();
        var reversedNumber = numberReverser.reverse(123);
        Assertions.assertEquals(321, reversedNumber);
    }
}
