package com.PE4;

public class SortingTheWordsInText {
    public String[] sorting(String[] str){
        String temp;
        int n = str.length;
        if(str.length!=0)
        {
            for (int i = 0; i < str.length; i++) {
                for (int j = i + 1; j < str.length; j++) {
                    if (str[i].compareTo(str[j]) > 0) {
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                        //return str[i];
                    }
                }
            }
            return str;
        }return null;
    }
}
