package com.example.demo;

import java.util.List;

public class BiggestNumberDetector {

    public int detectBiggestNumber(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException();
        }

        if (numbers.isEmpty()) {
            throw new IllegalArgumentException();
        }

        int biggestValue = 0;
        for (int index = 0; index < numbers.size(); index++) {
            int valueAtIndex = numbers.get(index);
            if(valueAtIndex > biggestValue){
                biggestValue = valueAtIndex;
            }
        }
        return biggestValue;


    }
}
