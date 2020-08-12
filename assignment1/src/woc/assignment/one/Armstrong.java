package woc.assignment.one;
import java.util.Scanner;

public class Armstrong {
    public static boolean checkArmstrong(int param){
        int armNumber = 0;
        int digit = 0;
        int copyNum = param;
        do{
            digit = copyNum % 10;
            armNumber = armNumber + ( digit*digit*digit );
            copyNum /= 10;
        }while (copyNum !=0);
        if(armNumber == param)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num1 = scObj.nextInt();
        if(checkArmstrong(num1)){
            System.out.println("It is Armstrong");
        }else{
            System.out.println("It's not Armstrong");
        }
    }
}
