package com.sapheworkshop.controlflow;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        /*if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if((bigCount * 5) <= goal){ // see if we have enough big bags
            return ((goal-(bigCount*5)) <= smallCount); // check if we have enough small bags
        }else{
            return ((goal % 5) <= smallCount); // check if filling big bags leftover can fit in small bags
        }
    } */

        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            int sum = bigCount * 5 + smallCount;
            if (sum < goal) {
                return false;
            } else return goal % 5 <= smallCount;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));

    }

}
