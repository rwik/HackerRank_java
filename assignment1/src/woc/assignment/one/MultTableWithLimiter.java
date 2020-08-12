package woc.assignment.one;
import java.util.Scanner;


public class MultTableWithLimiter {
    public static void printTable(int num1,int limiter){
        if(limiter<0) //how to do this using exception ?
        {
            System.out.println("Please enter positive numbers" );
            return;
        }
        for(int counter =1; counter <= limiter;counter++){
          System.out.println(num1+" X "+counter+" = "+(num1*counter) );
        }
    }

    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1 = scObj.nextInt();
        System.out.print("Enter Limiter : ");
        int limiter = scObj.nextInt();

        printTable(num1, limiter);

    }

}
