package com.PE4;

public class CheckOccuranceOfChar {
    public int checkoccurenceofchar(String inputstring){
        if(inputstring.length()!= 0)
        {
            int inputstringlength = inputstring.length();
            int count = 0;
            int replacedstringlength = inputstring.replace("a", "").length();
            count = inputstringlength - replacedstringlength;
            return count;
        }return 0;
    }
}
