package com.stackroute;

public class TransposeString {
    public String transpose(String input){
        if(input==null){
            return null;
        }
        StringBuffer output=new StringBuffer("");

        for(String string:input.split(" ")){
            StringBuffer value=new StringBuffer(string);
            value.reverse();
            output.append(value).append(" ");
        }

        return output.substring(0,output.length()-1);

    }

}
