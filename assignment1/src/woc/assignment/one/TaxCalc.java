package woc.assignment.one;

import java.util.Scanner;

public class TaxCalc {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);

        System.out.print("Enter Income : ");
        float num1 = scObj.nextFloat();
        CalculateTax(num1);
    }

    private static void CalculateTax(float num1) {
        float taxableIncome = num1 - 50000;
        if(taxableIncome<=0){
            System.out.println("Tax = 0");

        }else if(taxableIncome>0 && taxableIncome <=10000){
            Double tax = taxableIncome*0.1;
            System.out.println("Tax = "+tax);

        }else if(taxableIncome>10000 && taxableIncome <=100000){
            Double tax = taxableIncome*0.2;
            System.out.println("Tax = "+tax);
        }else if(taxableIncome>100000){
            Double tax = taxableIncome*0.3;
            System.out.println("Tax = "+tax);

        }
    }
}
