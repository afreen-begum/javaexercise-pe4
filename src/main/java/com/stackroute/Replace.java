package com.stackroute;

public class Replace {
    public String replaceCharacters(String inputString){
        if(inputString==null){
            return null;
        }
        String result=inputString.replaceAll("d","f");
        return result.replaceAll("l","t");
    }
}
