package woc.assignment.one;

import java.util.Scanner;

public class WordPalin {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter String : ");
        String  str = scObj.next();
        if(strRev(str).equals(str)){
            System.out.print("Pallindrome ");
            return;
        }
        System.out.print("Not Pallindrome ");
    }
    public static String strRev(String param){
        char[] chArr = param.toCharArray();
        String rev = "";
        for(int i = chArr.length-1; i>=0 ;i--){
            rev += chArr[i];
        }
        return rev;

    }
}
