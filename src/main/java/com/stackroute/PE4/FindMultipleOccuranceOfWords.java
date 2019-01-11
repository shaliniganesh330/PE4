/*Write a program to find out the multiple occurrences of the given word in a string using Matcher methods.
 */
package com.stackroute.PE4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMultipleOccuranceOfWords {
    /*method to find multiple occurance of words*/
    public String findMultipleOccuranceOfWords(String inputString) {
        String result = "";
        if (inputString == null) {
            return "Null input is not expected";
        }
        inputString = inputString.toLowerCase();
        Pattern pattern1 = Pattern.compile("se");
        Matcher matcher1 = pattern1.matcher(inputString);
        while (matcher1.find()) {
            result += "Found at: ";
            result += matcher1.start();
            result += "-";
            result += matcher1.end();
        }
        return result;
    }
}