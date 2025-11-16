package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BiggestNumberDetectorTests {

    @Test
    public void throwExceptionIfListIsEmpty() {
        var biggestNumberDetector = new BiggestNumberDetector();
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> biggestNumberDetector.detectBiggestNumber(new ArrayList<>())
        );
    }
    @Test
    public void throwExceptionIfListIsNull(){
        var biggestNumberDetector = new BiggestNumberDetector();
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> biggestNumberDetector.detectBiggestNumber(null)
        );
    }
    @Test
    public void shouldReturnBiggestNumberIfItsTheFirst(){
        var biggestNumberDetector = new BiggestNumberDetector();
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(11);
        listOfNumbers.add(10);
        listOfNumbers.add(6);
        listOfNumbers.add(8);
        var biggestNumber = biggestNumberDetector.detectBiggestNumber(listOfNumbers);
        Assertions.assertEquals(11,biggestNumber);
    }

    @Test
    public void shouldReturnBiggestNumberIfItsTheLast(){
        var biggestNumberDetector = new BiggestNumberDetector();
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(17);
        listOfNumbers.add(6);
        listOfNumbers.add(12);
        listOfNumbers.add(19);
        var biggestNumber = biggestNumberDetector.detectBiggestNumber(listOfNumbers);
        Assertions.assertEquals(19,biggestNumber);
    }

    @Test
    public void shouldReturnBiggestNumberIfItsInTheMiddle(){
        var biggestNumberDetector = new BiggestNumberDetector();
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(101);
        listOfNumbers.add(2153);
        listOfNumbers.add(25);
        listOfNumbers.add(4);
        var biggestNumber = biggestNumberDetector.detectBiggestNumber(listOfNumbers);
        Assertions.assertEquals(2153, biggestNumber);

    }
}
