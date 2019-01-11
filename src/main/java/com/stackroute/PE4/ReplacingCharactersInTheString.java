/*Write a program to replace all d with f and all l with t in the given String */
package com.stackroute.PE4;

public class ReplacingCharactersInTheString {
    /*method to replace the characters*/
    public String replacingCharacters(String inputstring) {
        if (inputstring.length() != 0) {
            inputstring = inputstring.toLowerCase();

            inputstring = inputstring.replace("d", "f");
            inputstring = inputstring.replace("l", "t");
            return inputstring;
        }
        return null;
    }

}
