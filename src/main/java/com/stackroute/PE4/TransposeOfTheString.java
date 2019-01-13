/* Write a program to transpose the given string.*/
package com.stackroute.PE4;

public class TransposeOfTheString {
/*method to transpose the string*/
    public static String transpose(String input) {
        String[] arr = input.split(" ");
        String str = "";
        for (String s : arr) {
            str += reverseString(s);
            str = str + " ";
        }
        str = str.trim();
        return str;
    }
/*method to reverse the string*/
    public static String reverseString(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }
        return str;
    }
}
