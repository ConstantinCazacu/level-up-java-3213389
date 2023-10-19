package com.linkedin.javacodechallenges;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static double calculateAverageChangeInvested(List<Double> purchases) {
        {if (purchases.isEmpty())
        {return 0;}}
List<Double> purchasesRest = new ArrayList<>();
double sum = 0;
    {for (Double doubleValue : purchases){
        int integerValue = (int)Math.ceil(doubleValue);
        double purchasesRestDouble = integerValue - doubleValue;
    purchasesRest.add(purchasesRestDouble);
    
    sum += purchasesRestDouble;}}{

    return sum/purchasesRest.size() ;}}


    public static void main(String[] args) {
        List<Double> purchases = List.of(12.38, 38.29, 5.27, 3.21);
        System.out.println(calculateAverageChangeInvested(purchases));
    }
}
