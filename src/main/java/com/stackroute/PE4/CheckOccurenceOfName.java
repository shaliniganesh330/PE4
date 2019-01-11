/*Write a program with the implementation of Regular Expression to find the presence of the name Harry in a string.
 Input: This is Harry.
 Output: Is Harry here ? true
*/
package com.stackroute.PE4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckOccurenceOfName {
    /* method to find a particular word in the string*/
    public String findHarryInGivenString(String inputString) {
        if (inputString == null) {
            return "Null input is not expected";
        }
        inputString = inputString.toUpperCase();
        Pattern pattern1 = Pattern.compile("HARRY");
        Matcher matcher1 = pattern1.matcher(inputString);

        while (matcher1.find()) {
            return "Is Harry here ? true";
        }
        return "Is Harry here ? false";
    }
}