/* Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.*/
package com.stackroute.PE4;

public class SortingTheWordsInText {
    /*method to sort the string array*/
    public String[] sorting(String[] str) {
        String temp;
        int n = str.length;
        if (str.length != 0) {
            for (int i = 0; i < str.length; i++) {
                for (int j = i + 1; j < str.length; j++) {
                    if (str[i].compareTo(str[j]) > 0) {
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }
                }
            }
            return str;
        }
        return null;
    }
}
