package com.sapheworkshop.controlflow;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            if((number%10)%2==0){ // checking if last digit is even
                sum += number%10;
            }
            number /= 10; // moving a digit up
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

}
