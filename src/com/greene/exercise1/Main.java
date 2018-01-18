package com.greene.exercise1;
// Blaine Greene II 1/18/2018 Exercise 1
public class Main {

    public static void main(String[] args) {
        String cityName = "Columbus";
        int zipCode = 43215;
        float sumHightemps = 0;
        int highTemps[] = {32, 35, 37, 40, 45};
	    for (int i = 0; i<5; i++)
        {
             sumHightemps = sumHightemps + highTemps[i];
        }
        float averageHightemps = sumHightemps / 5;
        System.out.println(cityName);
        System.out.println(zipCode);
        System.out.println(averageHightemps);
    }
}
