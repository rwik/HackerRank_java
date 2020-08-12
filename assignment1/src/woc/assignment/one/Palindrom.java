package woc.assignment.one;
import java.util.Scanner;
public class Palindrom {
    public static boolean checkPalindrom(int param){
        int revNum = 0;
        int digit = 0;
        int copyNum = param;
        do{
            digit = copyNum % 10;
            revNum = (revNum * 10 )+ digit;
            copyNum /= 10;
        }while (copyNum !=0);
        if(revNum == param)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num1 = scObj.nextInt();
        if(checkPalindrom(num1)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It's not palindrome");
        }
    }
}
