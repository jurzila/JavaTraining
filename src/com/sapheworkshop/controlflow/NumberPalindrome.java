package com.sapheworkshop.controlflow;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse = 0;
        if(number < 0){
            number *= (-1);
        }
        int givenNumber = number;

        while(givenNumber > 0){
            int lastDigit = givenNumber % 10;
            reverse *= 10;
            reverse += lastDigit;
            givenNumber /= 10;
            //System.out.println(reverse);
            //System.out.println(givenNumber);
        }

        if(reverse == number){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }


}
