package woc.assignment.one;
import java.util.Scanner;



public class MultTable {
    public static void printTable(int num1){
        for(int counter =1; counter <11;counter++){
          System.out.println(num1+" X "+counter+" = "+(num1*counter) );
        }
    }

    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1 = scObj.nextInt();

        printTable(num1);

    }

}
