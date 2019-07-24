package com.stackroute;
import java.util.Arrays;

public class AlphabeticalOrder {
    public String[] sortWordsInParagraph(String paragraph){
        if(paragraph==null){
            return null;
        }
        String []result=paragraph.split("[\\s,]+");
        Arrays.sort(result);
        return result;
    }
}
