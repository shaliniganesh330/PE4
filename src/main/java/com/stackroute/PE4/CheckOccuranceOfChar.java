/*Write a java program to count the total number of occurrences of a given character in a string without
using any loop*/
package com.stackroute.PE4;

public class CheckOccuranceOfChar {
    /* method to find a occurance of character*/
    public int checkOccurenceofchar(String inputstring) {
        if (inputstring.length() != 0) {
            int inputstringlength = inputstring.length();
            int count = 0;
            int replacedstringlength = inputstring.replace("a", "").length();
            count = inputstringlength - replacedstringlength;
            return count;
        }
        return 0;
    }
}
