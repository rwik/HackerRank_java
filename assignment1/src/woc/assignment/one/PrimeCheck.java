package woc.assignment.one;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1 = scObj.nextInt();
        checkPrime(num1);

    }

    private static void checkPrime(int num1) {
        if(num1 == 0 || num1 == 1 ) {
            System.out.println("Not Prime");
            return;
        }
        for(int i = 2;i<=(num1/2);i++){
            if(num1%i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
