package com.sapheworkshop.controlflow;

public class LargestPrime {

    public static int getLargestPrime(int number){
        if(number > 1){
            /*for(int i = 2; i < number; i++){
                if(number % i== 0){
                    number /= i;
                    i--;
                }
            }
            return number;*/
            for(int i = number-1; i >= 2; i--){
                if(number % i == 0){
                    number = i;
                }
            }
            return number;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(5));
        System.out.println(getLargestPrime(-1));
    }


}
