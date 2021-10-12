package com.sapheworkshop.intro;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumb, double secondNumb){
        BigDecimal da = BigDecimal.valueOf(firstNumb).setScale(3, RoundingMode.DOWN);
        BigDecimal db = BigDecimal.valueOf(secondNumb).setScale(3, RoundingMode.DOWN);
        return da.equals(db);
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }


}
