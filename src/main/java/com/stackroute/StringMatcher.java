package com.stackroute;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {
    public String matching(String inputString,String givenString){
        StringBuffer stringBuffer=new StringBuffer();
        Pattern pattern=Pattern.compile(givenString);
        Matcher matcher=pattern.matcher(inputString);
        while (matcher.find()){
            stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
        }
        return stringBuffer.toString().trim();
    }

}
