package com.PE4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMultipleOccuranceOfWords {
    public String findmultipleoccuranceofwords(String inputString)
    {
        String result = "";
        if (inputString == null)
        {
            return "Null input is not expected";
        }
        inputString = inputString.toLowerCase();
        Pattern pattern1 = Pattern.compile("se");
        Matcher matcher1 = pattern1.matcher(inputString);
        while (matcher1.find())
        {
            result+="Found at: ";
            result+=matcher1.start();
            result+="-";
            result+=matcher1.end();
        }

        return result;
    }
}