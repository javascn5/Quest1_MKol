package com.sda.Day11;

public class Palindrom {

    public boolean palindrom(String string){

        for (int i = 0; i < string.length()/2; i++){
            if (string.charAt(i) != string.charAt(string.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
