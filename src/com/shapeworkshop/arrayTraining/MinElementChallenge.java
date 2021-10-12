package com.shapeworkshop.arrayTraining;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter count:");
        int count = sc.nextInt();
        int[] passedNumbers = readIntegers(count);
        int minimum = findMin(passedNumbers);
        System.out.println("Minimum value of the array " + Arrays.toString(passedNumbers) + " is " + minimum);

    }

    public static int[] readIntegers(int count){
        int[] enteredIntegers = new int[count];
        System.out.println("Please enter " + count + " numbers.\r");
        for (int i = 0; i<enteredIntegers.length; i++){
            enteredIntegers[i] = sc.nextInt();
        }
        return enteredIntegers;
    }

    public static int findMin(int[] array){
        int minValue = Integer.MAX_VALUE; // to prevent default 0 being as minimum
//        for(int i = 0; i< array.length-1; i++) {
//            for (int j = 1; j < array.length; j++) {
//                if (array[i] < array[j]) {
//                    minValue = array[i];
//                } else if (array[j] < array[i]) {
//                    minValue = array[j];
//                }
//            }
//        }
        for(int i =0; i<array.length; i++){
            int value = array[i];
            if(value < minValue){
                minValue = value;
            }
        }


        return  minValue;
    }

}
