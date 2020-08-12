package woc.assignment.one;
import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1 = scObj.nextInt();
        System.out.print("Enter Num2 : ");
        int num2 = scObj.nextInt();
        System.out.print("Result : "+(num1+num2));

    }
}
