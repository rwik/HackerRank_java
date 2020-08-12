package woc.assignment.one;
import java.util.Scanner;


public class FactorialLoop {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1 = scObj.nextInt();
        int factorial =1;
        for(int i = 1; i<= num1; i++)
            factorial = factorial * i;
        System.out.println("Factorial = "+factorial);

    }
}
