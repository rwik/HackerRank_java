package woc.assignment.one;
import java.util.Scanner;

public class WordRev {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter String : ");
        String  str = scObj.next();
        strRev(str);
    }
    public static void strRev(String param){
        char[] chArr = param.toCharArray();
        String rev = "";
        for(int i = chArr.length-1; i>=0 ;i--){
            rev += chArr[i];
        }
        System.out.println("Reversed = "+rev);
        //System.out.println("size = "+rev.length());

    }
}
