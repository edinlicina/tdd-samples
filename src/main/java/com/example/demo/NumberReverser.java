package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class NumberReverser {

    public int reverse(Integer integer){
        if(integer == null){
            throw new IllegalArgumentException();
        }

        var value = integer.toString();
        List<Integer> intergerList = new ArrayList<>();

        for(int index = 0; index < value.length() ; index++){
            var numberCharacter = value.charAt(index);
            int number = Integer.parseInt(String.valueOf(numberCharacter));
            intergerList.add(number);
        }

        int sum = 0;
        int calculationOperator = 1;
        for(int index = 0; index < intergerList.size(); index++){
            var valueAtIndex = intergerList.get(index);
            sum = sum + valueAtIndex * calculationOperator; //first round
            calculationOperator = calculationOperator * 10;
        }
        return sum;
    }
}
