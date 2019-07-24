package com.stackroute;

public class SearchingAName {
    public boolean isHarryHere(String input){
        return input.matches("(?i).*Harry.*");
    }
}
