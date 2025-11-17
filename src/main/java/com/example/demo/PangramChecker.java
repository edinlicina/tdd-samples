package com.example.demo;

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

        return true;
    }
}
