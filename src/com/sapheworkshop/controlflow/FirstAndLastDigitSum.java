package com.sapheworkshop.controlflow;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int lastDigit = number % 10; // finding last digit
        while(number >= 10){
            number /= 10; // finding first digit
        }
        int firstDigit = number;
        //System.out.println(lastDigit);
        //System.out.println(firstDigit);

        return lastDigit + firstDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(10));

    }
}
