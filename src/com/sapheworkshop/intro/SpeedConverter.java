package com.sapheworkshop.intro;

public class SpeedConverter {

    public static void main(String[] args) {

        printConversion(10.25);
        printConversion(-1);

    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        double milesPerHour = kilometersPerHour/1.609;
        long milesPerHourRounded = Math.round(milesPerHour);
        return milesPerHourRounded;
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
