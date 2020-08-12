package woc.assignment.one;

import java.util.Scanner;

public class SwapNumWithoutExtraSpace {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1 = scObj.nextInt();
        System.out.print("Enter Num2 : ");
        int num2 = scObj.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.print("Num1 : "+num1+" Num2 : "+num2);

    }
}
