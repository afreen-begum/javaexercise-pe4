package com.stackroute;

public class TotalStringCount {
   public int charData(String inputString, char charInput) {
       return inputString.length()-inputString.replaceAll(String.valueOf(charInput),"").length();
   }
}
