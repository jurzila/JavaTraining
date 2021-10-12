package com.sapheworkshop.controlflow;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        double sum = 0;
        double average = 0;
        int count = 0;

        while(true){
            boolean hasInt = sc.hasNextInt();
            if(hasInt){
                number = sc.nextInt();
                sum += number;
                count++;
            }else{
                break;
            }
        }
        sc.nextLine();
        average = sum/count;

        System.out.println("SUM = " + Math.round(sum) + " AVG = " + Math.round(average));

    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

}
