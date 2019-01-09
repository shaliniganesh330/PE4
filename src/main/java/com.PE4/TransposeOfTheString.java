package com.PE4;
import java.util.Scanner;

public class TransposeOfTheString
{

    public static String transpose(String input)
    {
        String[] arr = input.split(" ");

        String str = "";
        for (String s : arr)
        {
            str += reverseString(s);
            str = str + " ";
        }
        str=str.trim();
        return str;
    }

    public static String reverseString(String s)
    {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            str += s.charAt(i);
        }
        return str;
    }
}












//        public static void main(String[] args)
//        {
//            Scanner sc=new Scanner(System.in);
//            String input=sc.nextLine();
////            System.out.println(transpose(input));

//    String reversed = str.replaceAll("(.*?)(/.*?)?(/.*?)?(/.*?)?(/.*?)?(/.*?)?(/.*?)?(/.*?)?(/.*?)?", "$9$8$7$6$5$4$3$2$1").replaceAll("^/", "");;
