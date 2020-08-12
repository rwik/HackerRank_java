package woc.assignment.one;
import java.util.Scanner;


public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1 = scObj.nextInt();

        System.out.println("Factorial = "+factRec(num1));

    }
    static int factRec(int num){
        if (num <=1)
            return 1;
        else
            return num * factRec(num -1);
    }
}
