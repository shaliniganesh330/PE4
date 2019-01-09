package com.PE4;

public class ReplacingCharactersInTheString {
    public String replacingcharacters(String inputstring){
        if(inputstring.length()!=0)
        {
          inputstring=inputstring.toLowerCase();

                    inputstring = inputstring.replace("d","f");
                 inputstring = inputstring.replace("l","t");
            return inputstring;

            }
        return null;
        }

}
